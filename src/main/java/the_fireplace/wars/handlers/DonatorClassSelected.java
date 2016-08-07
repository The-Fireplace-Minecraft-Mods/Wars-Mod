package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.init.WarsItems;

import java.util.Arrays;

public class DonatorClassSelected {

	public DonatorClassSelected(EntityPlayer player) {
		WarsSavedData savedData = WarsSavedData.get(player.worldObj);
		if (WarsMod.getDonators().contains(player.getName())) {

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

			int chaosSpawnX = savedData.teamChaos.baseX;
			int chaosSpawnY = savedData.teamChaos.baseY;
			int chaosSpawnZ = savedData.teamChaos.baseZ;

			ItemStack itemstack2 = new ItemStack(WarsItems.chaosBoots, 1);
			player.inventory.armorInventory[0] = itemstack2;
			((EntityPlayerMP) player).sendContainerToPlayer(player.inventoryContainer);

			player.setPositionAndUpdate(chaosSpawnX + 0.5, chaosSpawnY, chaosSpawnZ + 0.5);

		}
	}
}