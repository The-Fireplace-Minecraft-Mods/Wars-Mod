package resinresin.wars.handlers;

import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import resinresin.wars.WarsMod;
import resinresin.wars.data.WarsSavedData;
import resinresin.wars.registry.WarsItems;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class TeamSelected {

	
	
	public TeamSelected(EntityPlayer player, int teamSelected, int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
		WarsSavedData savedData = WarsSavedData.get(player.worldObj);
		
		switch (teamSelected) {
		case 1:

			if (redPlayers > greenPlayers || redPlayers > yellowPlayers || redPlayers > bluePlayers) {

			} else {

				player.addChatMessage("\u00a74\u00a7lRed Team Selected!");

				int redBaseX = savedData.teamRed.baseX;
				int redBaseY = savedData.teamRed.baseY;
				int redBaseZ = savedData.teamRed.baseZ;

				ItemStack itemstack2 = new ItemStack(WarsItems.redBoots, 1);
				player.inventory.armorInventory[0] = itemstack2;
				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
				// if (!player.worldObj.isRemote) {
				// player.addChatMessage("\u00a74Red Team Selected");
				// }
				player.setPositionAndUpdate(redBaseX + 0.5, redBaseY, redBaseZ + 0.5);
				
				ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
				out3.writeByte(0);
				Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 16, out3.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet3, (Player) player);
			}
			break;
		case 2:
			if (greenPlayers > redPlayers || greenPlayers > yellowPlayers || greenPlayers > bluePlayers) {

			} else {

				player.addChatMessage("\u00a72\u00a7lGreen Team Selected!");

				int greenBaseX = savedData.teamGreen.baseX;
				int greenBaseY = savedData.teamGreen.baseY;
				int greenBaseZ = savedData.teamGreen.baseZ;

				ItemStack itemstack = new ItemStack(WarsItems.greenBoots, 1);
				player.inventory.armorInventory[0] = itemstack;
				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
				// if (!player.worldObj.isRemote) {
				// player.addChatMessage("\u00a72Green Team Selected");
				// }
				player.setPositionAndUpdate(greenBaseX + 0.5, greenBaseY, greenBaseZ + 0.5);
			
				ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
				out3.writeByte(0);
				Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 16, out3.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet3, (Player) player);
			}
			break;
		case 3:
			if (bluePlayers > greenPlayers || bluePlayers > yellowPlayers || bluePlayers > redPlayers) {

			} else {

				player.addChatMessage("\u00a79\u00a7lBlue Team Selected!");

				int blueBaseX = savedData.teamBlue.baseX;
				int blueBaseY = savedData.teamBlue.baseY;
				int blueBaseZ = savedData.teamBlue.baseZ;

				ItemStack itemstack4 = new ItemStack(WarsItems.blueBoots, 1);
				player.inventory.armorInventory[0] = itemstack4;
				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

				player.setPositionAndUpdate(blueBaseX, blueBaseY, blueBaseZ);
				// if (!player.worldObj.isRemote) {
				// player.addChatMessage("\u00a79Blue Team Selected");
				// }

				player.setPositionAndUpdate(blueBaseX + 0.5, blueBaseY, blueBaseZ + 0.5);
				
				ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
				out3.writeByte(0);
				Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 16, out3.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet3, (Player) player);

			}
			break;
		case 4:
			if (yellowPlayers > greenPlayers || yellowPlayers > redPlayers || yellowPlayers > bluePlayers) {

			} else {

				player.addChatMessage("\u00a76\u00a7lYellow Team Selected!");

				int yellowBaseX = savedData.teamYellow.baseX;
				int yellowBaseY = savedData.teamYellow.baseY;
				int yellowBaseZ = savedData.teamYellow.baseZ;

				ItemStack itemstack5 = new ItemStack(WarsItems.yellowBoots, 1);
				player.inventory.armorInventory[0] = itemstack5;
				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

				// player.addChatMessage("\u00a76Yellow Team Selected");

				player.setPositionAndUpdate(yellowBaseX + 0.5, yellowBaseY, yellowBaseZ + 0.5);
				
				ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
				out3.writeByte(0);
				Packet packet3 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 16, out3.toByteArray());
				PacketDispatcher.sendPacketToPlayer(packet3, (Player) player);
			}
		}
		
	}
}