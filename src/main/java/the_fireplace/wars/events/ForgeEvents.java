package the_fireplace.wars.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import the_fireplace.wars.init.WarsItems;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketKills;

public class ForgeEvents {

	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent evt) {
		if (evt.entity instanceof EntityPlayer && evt.source instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.source;
			if (source.getEntity() instanceof EntityPlayer) {
				EntityPlayer attacker = (EntityPlayer) source.getEntity();
				EntityPlayer damagee = (EntityPlayer) evt.entity;

				ItemStack attackerBoots = attacker.inventory.armorItemInSlot(0);
				ItemStack damageeBoots = damagee.inventory.armorItemInSlot(0);
				if (attackerBoots != null && damageeBoots != null && attackerBoots == damageeBoots) {
					Item id = damageeBoots.getItem();
					if (id == WarsItems.redBoots || id == WarsItems.greenBoots || id == WarsItems.blueBoots || id == WarsItems.yellowBoots) {
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

				if (lostkills > 1) {

					EntityPlayerMP player = (EntityPlayerMP) evt.entity;

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Died With" + " \u00a75" + " " + lostkills + " \u00a73" + "Kills"));
				}

				switch (lostkills) {
				case 2:
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lDouble Kill! \u00a72Unlocked Protection"));
					break;
				case 3: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lTriple Kill! \u00a72Unlocked Water Breathing"));
					break;
				}
				case 4: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lMultiKill! \u00a72Unlocked Jump Boost"));
					break;
				}
				case 5: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lLike A Boss!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Now Has" + " \u00a75" + "5" + " \u00a73" + "Kills"));
					break;
				}
				case 8: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lRunning Riot! \u00a72Unlocked Night Vision"));
					break;
				}
				case 10: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lUnBeatable!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "10" + " \u00a73" + "Kills"));
					break;
				}
				case 12: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lKilltacular! \u00a72Unlocked Damage Boost"));
					break;
				}
				case 15: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lMass Murder!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "15" + " \u00a73" + "Kills"));
					break;
				}
				case 20: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lWar Crimes! \u00a72Unlocked Protection Lv2"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "20" + " \u00a73" + "Kills"));
					break;
				}
				case 25: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lExtinctionist!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "25" + " \u00a73" + "Kills"));
					break;
				}
				case 30: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lGenocide! \u00a72Unlocked Mega Damage Booster"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "30" + " \u00a73" + "Kills"));
					break;
				}
				case 35: {
					source.getEntity().addChatMessage(new ChatComponentText("\u00a75\u00a7lPlanet Crusher!"));
					EntityPlayerMP player = (EntityPlayerMP) source.getEntity();

					MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(player.getName() + " " + "\u00a73Has" + " \u00a75" + "35" + " \u00a73" + "Kills And Is Off The Scale Now OMG"));
					break;
				}
				default:
					break;
				}

				warsmod_totalKill = source.getEntity().getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

				int totalKills = source.getEntity().getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
				warsmod_totalKill = source.getEntity().getEntityData().getInteger("warsmod_killstreak");

				PacketDispatcher.sendTo(new PacketKills(totalKills, warsmod_totalKill), (EntityPlayerMP) source.getEntity());
			}
		}
	}
}
