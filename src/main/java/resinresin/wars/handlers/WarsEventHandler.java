package resinresin.wars.handlers;

import ibxm.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import resinresin.wars.Warsmod;
import resinresin.wars.command.CommandBlueBase;
import resinresin.wars.command.CommandChaosSpawn;
import resinresin.wars.command.CommandEditMode;
import resinresin.wars.command.CommandGreenBase;
import resinresin.wars.command.CommandKillstreak;
import resinresin.wars.command.CommandRedBase;
import resinresin.wars.command.CommandTotalKills;
import resinresin.wars.command.CommandYellowBase;
import resinresin.wars.data.WarsSavedData;
import resinresin.wars.registry.WarsItems;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class WarsEventHandler {

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {

		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();

		ServerCommandManager serverCommand = ((ServerCommandManager) command);

		// Registering Commands
		serverCommand.registerCommand(new CommandKillstreak());
		serverCommand.registerCommand(new CommandTotalKills());
		serverCommand.registerCommand(new CommandRedBase());
		serverCommand.registerCommand(new CommandGreenBase());
		serverCommand.registerCommand(new CommandBlueBase());
		serverCommand.registerCommand(new CommandYellowBase());
		serverCommand.registerCommand(new CommandChaosSpawn());
		serverCommand.registerCommand(new CommandEditMode());
	}

	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent evt) {
		if (evt.entity instanceof EntityPlayer && evt.source instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.source;
			if (source.getEntity() instanceof EntityPlayer) {
				EntityPlayer attacker = (EntityPlayer) source.getEntity();
				EntityPlayer damagee = (EntityPlayer) evt.entity;

				ItemStack attackerBoots = attacker.inventory.armorItemInSlot(0);
				ItemStack damageeBoots = damagee.inventory.armorItemInSlot(0);
				if (attackerBoots != null && damageeBoots != null && attackerBoots.itemID == damageeBoots.itemID) {
					int id = damageeBoots.itemID;
					if (id == WarsItems.redBoots.itemID || id == WarsItems.greenBoots.itemID || id == WarsItems.blueBoots.itemID || id == WarsItems.yellowBoots.itemID) {
						evt.setCanceled(true);

					}

				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent evt) {

		if (evt.entity instanceof EntityPlayer && evt.source instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.source;

			if (source.getEntity() instanceof EntityPlayerMP) {

				int warsmod_totalKill = source.getEntity().getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

				warsmod_totalKill++;

				source.getEntity().getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", warsmod_totalKill);

				int killstreakBefore = source.getEntity().getEntityData().getInteger("warsmod_killstreak");
				int lostkills = evt.entity.getEntityData().getInteger("warsmod_killstreak");

				killstreakBefore++;

				source.getEntity().getEntityData().setInteger("warsmod_killstreak", killstreakBefore);

				ByteArrayDataOutput out = ByteStreams.newDataOutput();
				out.writeInt(killstreakBefore);

				if (lostkills > 1) {

					EntityPlayerMP player = (EntityPlayerMP) evt.entity;

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Died With" + " \u00a75" + " " + lostkills + " \u00a73" + "Kills"));
				}

				evt.entity.getEntityData().setInteger("warsmod_killstreak", 10);

				switch (lostkills) {
				case 2:
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lDouble Kill! \u00a72Unlocked Protection"));
					break;
				case 3: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lTriple Kill! \u00a72Unlocked Water Breathing"));
					break;
				}
				case 4: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lMultiKill! \u00a72Unlocked Jump Boost"));
					break;
				}
				case 5: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lLike A Boss!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Now Has" + " \u00a75" + "5" + " \u00a73" + "Kills"));
					break;
				}
				case 8: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lRunning Riot! \u00a72Unlocked Night Vision"));
					break;
				}
				case 10: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lUnBeatable!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "10" + " \u00a73" + "Kills"));
					break;
				}
				case 12: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lKilltacular! \u00a72Unlocked Damage Boost"));
					break;
				}
				case 15: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lMass Murder!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "15" + " \u00a73" + "Kills"));
					break;
				}
				case 20: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lWar Crimes! \u00a72Unlocked Protection Lv2"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "20" + " \u00a73" + "Kills"));
					break;
				}
				case 25: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lExtinctionist!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "25" + " \u00a73" + "Kills"));
					break;
				}
				case 30: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lGenocide! \u00a72Unlocked Mega Damage Booster"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "30" + " \u00a73" + "Kills"));
					break;
				}
				case 35: {
					((EntityPlayer) source.getEntity()).addChatMessage(new ChatComponentText("\u00a75\u00a7lPlanet Crusher!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "35" + " \u00a73" + "Kills And Is Off The Scale Now OMG"));
					break;
				}
				}

				Packet packet = PacketDispatcher.getTinyPacket(Warsmod.instance, (short) 0, out.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet, (Player) source.getEntity());

				warsmod_totalKill = source.getEntity().getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

				ByteArrayDataOutput out2 = ByteStreams.newDataOutput();

				out2.writeInt(warsmod_totalKill);

				Packet packet2 = PacketDispatcher.getTinyPacket(Warsmod.instance, (short) 3, out2.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet2, (Player) source.getEntity());

			}
		}
	}
}
