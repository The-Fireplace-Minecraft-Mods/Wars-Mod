package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.init.WarsItems;

import java.util.Arrays;

public class DonatorClassSelected {

	public DonatorClassSelected(EntityPlayer player, int classSelected) {
		WarsSavedData savedData = WarsSavedData.get(player.worldObj);
		if (WarsMod.getDonators().contains(player.getName())) {
			int chaosSpawnX = savedData.teamChaos.baseX;
			int chaosSpawnY = savedData.teamChaos.baseY;
			int chaosSpawnZ = savedData.teamChaos.baseZ;
			switch(classSelected){
				case 1://Chaos Warrior
					Arrays.fill(player.inventory.mainInventory, null);

					ItemStack itemstack4 = new ItemStack(WarsItems.chaosHelm, 1);
					player.inventory.armorInventory[3] = itemstack4;
					ItemStack itemstack5 = new ItemStack(WarsItems.chaosPlate, 1);
					player.inventory.armorInventory[2] = itemstack5;
					ItemStack itemstack6 = new ItemStack(WarsItems.chaosLegs, 1);
					player.inventory.armorInventory[1] = itemstack6;
					ItemStack itemstack7 = new ItemStack(WarsItems.chaosSword, 1);
					player.inventory.setInventorySlotContents(0, itemstack7);

					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					ItemStack itemstack2 = new ItemStack(WarsItems.chaosBoots, 1);
					player.inventory.armorInventory[0] = itemstack2;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					player.setPositionAndUpdate(chaosSpawnX + 0.5, chaosSpawnY, chaosSpawnZ + 0.5);
					break;
				case 2://Ender Knight
					Arrays.fill(player.inventory.mainInventory, null);

					ItemStack itemstack8 = new ItemStack(WarsItems.chaosHelm, 1);
					player.inventory.armorInventory[3] = itemstack8;
					ItemStack itemstack9 = new ItemStack(WarsItems.chaosPlate, 1);
					player.inventory.armorInventory[2] = itemstack9;
					ItemStack itemstack10 = new ItemStack(WarsItems.chaosLegs, 1);
					player.inventory.armorInventory[1] = itemstack10;
					ItemStack itemstack11 = new ItemStack(WarsItems.enderWand, 1);
					player.inventory.setInventorySlotContents(0, itemstack11);

					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					ItemStack itemstack1 = new ItemStack(WarsItems.chaosBoots, 1);
					player.inventory.armorInventory[0] = itemstack1;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					player.setPositionAndUpdate(chaosSpawnX + 0.5, chaosSpawnY, chaosSpawnZ + 0.5);
					break;
				case 3://Ninja
					Arrays.fill(player.inventory.mainInventory, null);

					ItemStack itemstack12 = new ItemStack(WarsItems.chaosHelm, 1);
					player.inventory.armorInventory[3] = itemstack12;
					ItemStack itemstack13 = new ItemStack(WarsItems.chaosPlate, 1);
					player.inventory.armorInventory[2] = itemstack13;
					ItemStack itemstack14 = new ItemStack(WarsItems.chaosLegs, 1);
					player.inventory.armorInventory[1] = itemstack14;
					ItemStack itemstack15 = new ItemStack(WarsItems.chaosSword, 1);
					player.inventory.setInventorySlotContents(0, itemstack15);

					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					ItemStack itemstack3 = new ItemStack(WarsItems.chaosBoots, 1);
					player.inventory.armorInventory[0] = itemstack3;
					((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

					player.setPositionAndUpdate(chaosSpawnX + 0.5, chaosSpawnY, chaosSpawnZ + 0.5);
					break;
			}

		}
	}
}