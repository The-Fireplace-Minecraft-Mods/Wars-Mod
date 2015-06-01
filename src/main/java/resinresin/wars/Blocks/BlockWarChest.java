package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockWarChest extends Block {

	public BlockWarChest() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		warsmod.generateBlock(world, i + 0, j + 0, k + 0, Blocks.chest);
		TileEntityChest chest2 = new TileEntityChest();

		world.setBlockTileEntity(i + 0, j + 0, k + 0, chest2);

		Random random = new Random();

		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {

			int num = random.nextInt(100);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Blocks.torch));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.magicPotato));

			}

			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.beef));

			}

			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_apple));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.apple));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.battleBurger));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.longBannana));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.workWaffel));

			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.shadowFlesh));

			}
			if (num == 12) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.warCheese));

			}

		}
		return false;
	}

}
