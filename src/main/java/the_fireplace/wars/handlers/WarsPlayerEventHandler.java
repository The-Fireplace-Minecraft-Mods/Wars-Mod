package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketKills;
import the_fireplace.wars.network.packets.PacketOpenTeamSelect;
import the_fireplace.wars.network.packets.PacketTeams;
import the_fireplace.wars.registry.WarsItems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class WarsPlayerEventHandler {

	public static int redPlayers = 0;
	public static int greenPlayers = 0;
	public static int bluePlayers = 0;
	public static int yellowPlayers = 0;

	public static int killStreak;
	public static int totalKills;

	@SubscribeEvent
	public void PlayerLoggedInEvent(PlayerLoggedInEvent event) {

		try {
			URL targetURL = new URL("https://dl.dropbox.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				// toLowerCase().
				WarsMod.donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (event.player instanceof EntityPlayerMP) {

			for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

				Item playerBoots = playerMP.inventory.getStackInSlot(36).getItem();// playerMP.inventory.armorItemInSlot(0);

				if (playerBoots != null) {

					if (playerBoots == WarsItems.redBoots) {
						redPlayers++;
					}
					if (playerBoots == WarsItems.blueBoots) {
						bluePlayers++;
					}
					if (playerBoots == WarsItems.greenBoots) {
						greenPlayers++;
					}
					if (playerBoots == WarsItems.yellowBoots) {
						yellowPlayers++;
					}
				}

			}

			WarsMod.proxy.totalKills(event.player);

			totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
			killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");

			PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak), (EntityPlayerMP) event.player);

			PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

			System.out.println("Ok so this worked");

			WarsSavedData savedWarsData = WarsSavedData.get(event.player.worldObj);
			ItemStack playerBoots = event.player.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);
			if (playerBoots == null) {
				if (!savedWarsData.editMode.editModeToggle) {
					event.player.openGui(WarsMod.instance, 3, event.player.worldObj, 0, 0, 0);

					PacketDispatcher.sendTo(new PacketOpenTeamSelect(1), (EntityPlayerMP) event.player);
				}
			}

		}

	}

	@SuppressWarnings("unchecked")
	public static final List<EntityPlayerMP> getAll() {
		return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	}

	@SubscribeEvent
	public void PlayerRespawnEvent(PlayerRespawnEvent event) {

		System.out.println("Ok so this worked");


		for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

			Item playerBoots = playerMP.inventory.getStackInSlot(36).getItem();// playerMP.inventory.armorItemInSlot(0);

			if (playerBoots != null) {

				if (playerBoots == WarsItems.redBoots) {
					redPlayers++;
				}
				if (playerBoots == WarsItems.blueBoots) {
					bluePlayers++;
				}
				if (playerBoots == WarsItems.greenBoots) {
					greenPlayers++;
				}
				if (playerBoots == WarsItems.yellowBoots) {
					yellowPlayers++;
				}
			}

		}

		totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
		killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");

		PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak), (EntityPlayerMP) event.player);

		PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

		WarsSavedData savedWarsData = WarsSavedData.get(event.player.worldObj);
		if (!savedWarsData.editMode.editModeToggle) {
			event.player.openGui(WarsMod.instance, 3, event.player.worldObj, 0, 0, 0);

			PacketDispatcher.sendTo(new PacketOpenTeamSelect(1), (EntityPlayerMP) event.player);
		}

	}

	@SuppressWarnings("unchecked")
	public static void sendPlayerPackets(EntityPlayer player) {

		redPlayers = 0;
		greenPlayers = 0;
		bluePlayers = 0;
		yellowPlayers = 0;

		for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

			Item playerBoots = playerMP.inventory.getStackInSlot(36).getItem();// playerMP.inventory.armorItemInSlot(0);

			if (playerBoots != null) {

				if (playerBoots == WarsItems.redBoots) {
					redPlayers++;
				}
				if (playerBoots == WarsItems.blueBoots) {
					bluePlayers++;
				}
				if (playerBoots == WarsItems.greenBoots) {
					greenPlayers++;
				}
				if (playerBoots == WarsItems.yellowBoots) {
					yellowPlayers++;
				}
			}

		}

		PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) player);
	}

}
