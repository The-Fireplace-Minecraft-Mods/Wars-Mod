package resinresin.wars.handlers;

import ibxm.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import resinresin.wars.WarsMod;
import resinresin.wars.data.WarsSavedData;
import resinresin.wars.registry.WarsItems;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class WarsPlayerEventHandler {
	
	
	public static int redPlayers;
	public static int greenPlayers;
	public static int bluePlayers;
	public static int yellowPlayers;
	
	
	@SubscribeEvent
	public void PlayerLoggedInEvent(PlayerLoggedInEvent event) {

		if (event.player instanceof EntityPlayerMP) {

			redPlayers = 0;
			greenPlayers = 0;
			bluePlayers = 0;
			yellowPlayers = 0;

			for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

				ItemStack playerBoots = playerMP.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);

				if (playerBoots != null) {
					int id = playerBoots.itemID;

					if (id == WarsItems.redBoots.itemID) {
						redPlayers++;
					}
					if (id == WarsItems.blueBoots.itemID) {
						bluePlayers++;
					}
					if (id == WarsItems.greenBoots.itemID) {
						greenPlayers++;
					}
					if (id == WarsItems.yellowBoots.itemID) {
						yellowPlayers++;
					}
				}

			}

			WarsMod.proxy.totalKills(event.player);

			ByteArrayDataOutput out = ByteStreams.newDataOutput();
			out.writeInt(event.player.getEntityData().getInteger("warsmod_killstreak"));
			Packet packet = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 0, out.toByteArray());
			PacketDispatcher.sendPacketToPlayer(packet, (Player) player);

			ByteArrayDataOutput out2 = ByteStreams.newDataOutput();
			int warsmod_totalKill = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

			out2.writeInt(warsmod_totalKill);
			Packet packet2 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 3, out2.toByteArray());
			PacketDispatcher.sendPacketToPlayer(packet2, (Player) event.player);

			player.openGui(WarsMod.instance, 3, event.player.worldObj, 0, 0, 0);

			WarsSavedData savedWarsData = WarsSavedData.get(event.player.worldObj);
			ItemStack playerBoots = event.player.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);
			if (playerBoots == null) {
				if (savedWarsData.editMode.editModeToggle == false) {

					ByteArrayDataOutput out7 = ByteStreams.newDataOutput();
					out7.writeByte(1);
					Packet packet7 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 10, out7.toByteArray());
					PacketDispatcher.sendPacketToPlayer(packet7, event.player);
				}
			}

			ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
			out3.writeByte(redPlayers);
			Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 6, out3.toByteArray());
			PacketDispatcher.sendPacketToAllPlayers(packet3);

			ByteArrayDataOutput out4 = ByteStreams.newDataOutput();
			out4.writeByte(greenPlayers);
			Packet packet4 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 7, out4.toByteArray());
			PacketDispatcher.sendPacketToAllPlayers(packet4);

			ByteArrayDataOutput out5 = ByteStreams.newDataOutput();
			out5.writeByte(bluePlayers);
			Packet packet5 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 8, out5.toByteArray());
			PacketDispatcher.sendPacketToAllPlayers(packet5);

			ByteArrayDataOutput out6 = ByteStreams.newDataOutput();
			out6.writeByte(yellowPlayers);
			Packet packet6 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 9, out6.toByteArray());
			PacketDispatcher.sendPacketToAllPlayers(packet6);

		}

	}

	@SuppressWarnings("unchecked")
	public static final List<EntityPlayerMP> getAll() {
		return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	}

	@SubscribeEvent
	public void PlayerRespawnEvent(PlayerRespawnEvent event) {

		redPlayers = 0;
		greenPlayers = 0;
		bluePlayers = 0;
		yellowPlayers = 0;

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

		for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

			ItemStack playerBoots = playerMP.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);

			if (playerBoots != null) {
				int id = playerBoots.itemID;

				if (id == WarsItems.redBoots.itemID) {
					redPlayers++;
				}
				if (id == WarsItems.blueBoots.itemID) {
					bluePlayers++;
				}
				if (id == WarsItems.greenBoots.itemID) {
					greenPlayers++;
				}
				if (id == WarsItems.yellowBoots.itemID) {
					yellowPlayers++;
				}
			}

		}

		player.getEntityData().setInteger("warsmod_killstreak", 0);

		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeInt(player.getEntityData().getInteger("warsmod_killstreak"));
		Packet packet = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 0, out.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet, (Player) player);

		ByteArrayDataOutput out2 = ByteStreams.newDataOutput();
		int warsmod_totalKill = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

		out2.writeInt(warsmod_totalKill);
		Packet packet2 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 3, out2.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet2, (Player) player);

		ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
		out3.writeByte(redPlayers);
		Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 6, out3.toByteArray());
		PacketDispatcher.sendPacketToAllPlayers(packet3);

		ByteArrayDataOutput out4 = ByteStreams.newDataOutput();
		out4.writeByte(greenPlayers);
		Packet packet4 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 7, out4.toByteArray());
		PacketDispatcher.sendPacketToAllPlayers(packet4);

		ByteArrayDataOutput out5 = ByteStreams.newDataOutput();
		out5.writeByte(bluePlayers);
		Packet packet5 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 8, out5.toByteArray());
		PacketDispatcher.sendPacketToAllPlayers(packet5);

		ByteArrayDataOutput out6 = ByteStreams.newDataOutput();
		out6.writeByte(yellowPlayers);
		Packet packet6 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 9, out6.toByteArray());
		PacketDispatcher.sendPacketToAllPlayers(packet6);

		WarsSavedData savedWarsData = WarsSavedData.get(player.worldObj);
		if (savedWarsData.editMode.editModeToggle == false) {

			ByteArrayDataOutput out7 = ByteStreams.newDataOutput();
			out7.writeByte(1);
			Packet packet7 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 10, out7.toByteArray());
			PacketDispatcher.sendPacketToPlayer(packet7, (Player) player);
		}

	}

	@SuppressWarnings("unchecked")
	public static void sendPlayerPackets(EntityPlayer player) {

		redPlayers = 0;
		greenPlayers = 0;
		bluePlayers = 0;
		yellowPlayers = 0;

		for (EntityPlayerMP playerMP : (List<EntityPlayerMP>) MinecraftServer.getServer().getConfigurationManager().playerEntityList) {

			ItemStack playerBoots = playerMP.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);

			if (playerBoots != null) {
				int id = playerBoots.itemID;

				if (id == WarsItems.redBoots.itemID) {
					redPlayers++;
				}
				if (id == WarsItems.blueBoots.itemID) {
					bluePlayers++;
				}
				if (id == WarsItems.greenBoots.itemID) {
					greenPlayers++;
				}
				if (id == WarsItems.yellowBoots.itemID) {
					yellowPlayers++;
				}
			}

		}

		ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
		out3.writeByte(redPlayers);
		Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 6, out3.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet3, (Player) player);

		ByteArrayDataOutput out4 = ByteStreams.newDataOutput();
		out4.writeByte(greenPlayers);
		Packet packet4 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 7, out4.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet4, (Player) player);

		ByteArrayDataOutput out5 = ByteStreams.newDataOutput();
		out5.writeByte(bluePlayers);
		Packet packet5 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 8, out5.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet5, (Player) player);

		ByteArrayDataOutput out6 = ByteStreams.newDataOutput();
		out6.writeByte(yellowPlayers);
		Packet packet6 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 9, out6.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet6, (Player) player);

	}

}
