package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

import java.util.Arrays;

public class ClassSelected {

	public ClassSelected(EntityPlayer player, int classSelected) {

		switch (classSelected) {

		case 1:

			Arrays.fill(player.inventory.mainInventory, null);

			ItemStack itemstack = new ItemStack(WarsItems.guardHelm, 1);
			player.inventory.armorInventory[3] = itemstack;
			ItemStack itemstack1 = new ItemStack(WarsItems.guardPlate, 1);
			player.inventory.armorInventory[2] = itemstack1;
			ItemStack itemstack2 = new ItemStack(WarsItems.guardLegs, 1);
			player.inventory.armorInventory[1] = itemstack2;
			ItemStack itemstack3 = new ItemStack(WarsItems.guardSword, 1);
			player.inventory.setInventorySlotContents(0, itemstack3);

			((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

			break;
		case 2:
			System.out.println(player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill"));

			if (player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill") > 24) {
				Arrays.fill(player.inventory.mainInventory, null);

				ItemStack itemstack4 = new ItemStack(WarsItems.knightHelm, 1);
				player.inventory.armorInventory[3] = itemstack4;
				ItemStack itemstack5 = new ItemStack(WarsItems.knightPlate, 1);
				player.inventory.armorInventory[2] = itemstack5;
				ItemStack itemstack6 = new ItemStack(WarsItems.knightLegs, 1);
				player.inventory.armorInventory[1] = itemstack6;
				ItemStack itemstack7 = new ItemStack(WarsItems.knightSword, 1);
				player.inventory.setInventorySlotContents(0, itemstack7);

				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
			}

			break;
		case 3:

			if (player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill") > 49) {

				Arrays.fill(player.inventory.mainInventory, null);

				ItemStack itemstack8 = new ItemStack(WarsItems.healerHelm, 1);
				player.inventory.armorInventory[3] = itemstack8;
				ItemStack itemstack9 = new ItemStack(WarsItems.healerPlate, 1);
				player.inventory.armorInventory[2] = itemstack9;
				ItemStack itemstack10 = new ItemStack(WarsItems.healerLegs, 1);
				player.inventory.armorInventory[1] = itemstack10;
				ItemStack itemstack11 = new ItemStack(WarsItems.wizardStaff, 1);
				player.inventory.setInventorySlotContents(0, itemstack11);
				ItemStack itemstack12 = new ItemStack(WarsItems.dagger, 1);
				player.inventory.setInventorySlotContents(1, itemstack12);

				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
			}

			break;
		case 4:

			if (player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill") > 99) {

				Arrays.fill(player.inventory.mainInventory, null);

				ItemStack itemstack13 = new ItemStack(WarsItems.scoutHelm, 1);
				player.inventory.armorInventory[3] = itemstack13;
				ItemStack itemstack14 = new ItemStack(WarsItems.scoutPlate, 1);
				player.inventory.armorInventory[2] = itemstack14;
				ItemStack itemstack15 = new ItemStack(WarsItems.scoutLegs, 1);
				player.inventory.armorInventory[1] = itemstack15;
				ItemStack itemstack16 = new ItemStack(WarsItems.scoutBlade, 1);
				player.inventory.setInventorySlotContents(0, itemstack16);
				ItemStack itemstack17 = new ItemStack(WarsItems.dagger, 1);
				player.inventory.setInventorySlotContents(1, itemstack17);

				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
			}

			break;
		case 5:
			if (player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill") > 199) {

				Arrays.fill(player.inventory.mainInventory, null);

				ItemStack itemstack18 = new ItemStack(WarsItems.archerHelm, 1);
				player.inventory.armorInventory[3] = itemstack18;
				ItemStack itemstack19 = new ItemStack(WarsItems.archerPlate, 1);
				player.inventory.armorInventory[2] = itemstack19;
				ItemStack itemstack20 = new ItemStack(WarsItems.archerLegs, 1);
				player.inventory.armorInventory[1] = itemstack20;
				ItemStack itemstack21 = new ItemStack(WarsItems.bowArcher, 1);
				player.inventory.setInventorySlotContents(0, itemstack21);
				ItemStack itemstack22 = new ItemStack(WarsItems.dagger, 1);
				player.inventory.setInventorySlotContents(1, itemstack22);
				ItemStack itemstack23 = new ItemStack(Items.arrow, 1);
				player.inventory.setInventorySlotContents(2, itemstack23);

				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);
			}

			break;
		case 6:

			if (player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill") > 399) {

				Arrays.fill(player.inventory.mainInventory, null);

				ItemStack itemstack24 = new ItemStack(WarsItems.techHelm, 1);
				player.inventory.armorInventory[3] = itemstack24;
				ItemStack itemstack25 = new ItemStack(WarsItems.techPlate, 1);
				player.inventory.armorInventory[2] = itemstack25;
				ItemStack itemstack26 = new ItemStack(WarsItems.techLegs, 1);
				player.inventory.armorInventory[1] = itemstack26;
				ItemStack itemstack27 = new ItemStack(WarsItems.techSpanner, 1);
				player.inventory.setInventorySlotContents(0, itemstack27);
				ItemStack itemstack28 = new ItemStack(WarsBlocks.playerTNT, 64);
				player.inventory.setInventorySlotContents(1, itemstack28);
				ItemStack itemstack29 = new ItemStack(WarsBlocks.playerTNT, 64);
				player.inventory.setInventorySlotContents(2, itemstack29);

				((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

			}
		default:
			break;
		}
	}
}
