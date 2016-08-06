package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;

import java.util.Random;

public class BlockInstantChestLv1 extends Block {

	public BlockInstantChestLv1() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		if (!world.isRemote) {

			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			WarsMod.generateBlock(world, i, j, k, Blocks.chest);

			TileEntity chestTile = world.getTileEntity(pos);

			if (chestTile instanceof TileEntityChest) {

				Random random = new Random();

				for (int slot = 0; slot < 27; slot++) {

					int num = random.nextInt(160);

					if (num == 1) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));
					}
					if (num == 2) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));
					}

					if (num == 5) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));
					}

					if (num == 6) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_boots));
					}
					if (num == 7) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.apple));
					}
					if (num == 8) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.porkchop));
					}
					if (num == 9) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bone));
					}
					if (num == 10) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.book));
					}
					if (num == 11) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.feather));
					}
					if (num == 12) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.string));
					}
					if (num == 13) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bowl));
					}
					if (num == 14) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.arrow));
					}
					if (num == 15) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.coal));
					}
					if (num == 16) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bread));
					}
					if (num == 17) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Blocks.red_mushroom));
					}
					if (num == 18) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Blocks.torch));
					}
					if (num == 19) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.rotten_flesh));
					}
					if (num == 20) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.spider_eye));
					}
					if (num == 21) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.stick));
					}
					if (num == 22) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.fish));
					}
					if (num == 23) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chicken));
					}
					if (num == 24) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.porkchop));
					}
					if (num == 25) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.wooden_axe));
					}
					if (num == 26) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));
					}
					if (num == 27) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.flint));
					}

					if (num == 28) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));
					}
					if (num == 29) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));
					}

					if (num == 30) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));
					}

					if (num == 31) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_boots));
					}
				}
			}
		}

		return true;
	}
}
