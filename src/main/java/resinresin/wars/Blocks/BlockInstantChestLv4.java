package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockInstantChestLv4 extends Block {

	public BlockInstantChestLv4() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		world.setBlock(i + 0, j + 0, k + 0, Block.chest.blockID, 2, 2);
		TileEntityChest chest2 = new TileEntityChest();

		world.setBlockTileEntity(i + 0, j + 0, k + 0, chest2);

		Random random = new Random();

		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {

			int num = random.nextInt(99);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.diamond));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_ingot));

			}

			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

			}

			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bow));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.arrow, 3));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.diamond_boots));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.diamond_helmet));

			}

			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stick));

			}

			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_apple));

				if (num == 12) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

				}
				if (num == 13) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

				}
				if (num == 14) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.diamond));

				}

			}

		}
		return false;
	}

}
