package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.CommonEvents;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.init.WarsItems;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketOpenTeamSelect;

import static the_fireplace.wars.CommonEvents.*;

public class TeamSelected {
	
	//this class handles what happens depending on what team the player selects
	@SuppressWarnings("unchecked")
	public TeamSelected(EntityPlayer player, int teamSelected) {
		if (player instanceof EntityPlayerMP) {
			WarsSavedData savedData = WarsSavedData.get(player.worldObj);

			CommonEvents.recalcTeams();

			switch (teamSelected) {
			case 1:
				if (redPlayers > greenPlayers || redPlayers > yellowPlayers || redPlayers > bluePlayers) {
					player.addChatMessage(new ChatComponentText("Team appears to be full. Please try again."));
					PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP)player);
				} else {

					player.addChatMessage(new ChatComponentText("\u00a74\u00a7lRed Team Selected!"));

					int redBaseX = savedData.teamRed.baseX;
					int redBaseY = savedData.teamRed.baseY;
					int redBaseZ = savedData.teamRed.baseZ;

					ItemStack itemstack2 = new ItemStack(WarsItems.redBoots, 1);
					player.inventory.armorInventory[0] = itemstack2;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
					player.setPositionAndUpdate(redBaseX + 0.5, redBaseY, redBaseZ + 0.5);

				}
				break;
			case 2:
				if (greenPlayers > redPlayers || greenPlayers > yellowPlayers || greenPlayers > bluePlayers) {
					player.addChatMessage(new ChatComponentText("Team appears to be full. Please try again."));
					PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP)player);
				} else {
					player.addChatMessage(new ChatComponentText("\u00a72\u00a7lGreen Team Selected!"));

					int greenBaseX = savedData.teamGreen.baseX;
					int greenBaseY = savedData.teamGreen.baseY;
					int greenBaseZ = savedData.teamGreen.baseZ;

					ItemStack itemstack = new ItemStack(WarsItems.greenBoots, 1);
					player.inventory.armorInventory[0] = itemstack;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
					player.setPositionAndUpdate(greenBaseX + 0.5, greenBaseY, greenBaseZ + 0.5);
				}
				break;
			case 3:
				if (bluePlayers > greenPlayers || bluePlayers > yellowPlayers || bluePlayers > redPlayers) {
					player.addChatMessage(new ChatComponentText("Team appears to be full. Please try again."));
					PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP)player);
				} else {

					player.addChatMessage(new ChatComponentText("\u00a79\u00a7lBlue Team Selected!"));

					int blueBaseX = savedData.teamBlue.baseX;
					int blueBaseY = savedData.teamBlue.baseY;
					int blueBaseZ = savedData.teamBlue.baseZ;

					ItemStack itemstack4 = new ItemStack(WarsItems.blueBoots, 1);
					player.inventory.armorInventory[0] = itemstack4;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
					player.setPositionAndUpdate(blueBaseX + 0.5, blueBaseY, blueBaseZ + 0.5);

				}
				break;
			case 4:
				if (yellowPlayers > greenPlayers || yellowPlayers > redPlayers || yellowPlayers > bluePlayers) {
					player.addChatMessage(new ChatComponentText("Team appears to be full. Please try again."));
					PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP)player);
				} else {

					player.addChatMessage(new ChatComponentText("\u00a76\u00a7lYellow Team Selected!"));

					int yellowBaseX = savedData.teamYellow.baseX;
					int yellowBaseY = savedData.teamYellow.baseY;
					int yellowBaseZ = savedData.teamYellow.baseZ;

					ItemStack itemstack5 = new ItemStack(WarsItems.yellowBoots, 1);
					player.inventory.armorInventory[0] = itemstack5;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
					player.setPositionAndUpdate(yellowBaseX + 0.5, yellowBaseY, yellowBaseZ + 0.5);
				}
			}
		}
	}
}