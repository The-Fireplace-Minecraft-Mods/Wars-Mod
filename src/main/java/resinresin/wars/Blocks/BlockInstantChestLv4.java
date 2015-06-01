package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockInstantChestLv4 extends Block {

	public BlockInstantChestLv4() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		warsmod.generateBlock(world, i + 0, j + 0, k + 0, Blocks.chest);
		TileEntityChest chest2 = new TileEntityChest();

		world.setTileEntity(pos, chest2);

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
