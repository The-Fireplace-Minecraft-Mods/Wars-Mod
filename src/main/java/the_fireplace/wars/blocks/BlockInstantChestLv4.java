package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;

import java.util.Random;

public class BlockInstantChestLv4 extends Block {

	public BlockInstantChestLv4() {
		super(Material.IRON);
		setCreativeTab(WarsMod.tabWarsBlocks);
		setSoundType(SoundType.WOOD);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {
		if (!world.isRemote) {

			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			WarsMod.generateBlock(world, i, j, k, Blocks.CHEST);

			TileEntity chestTile = world.getTileEntity(pos);

			if (chestTile instanceof TileEntityChest) {

				Random random = new Random();

				for (int slot = 0; slot < 27; slot++) {

					int num = random.nextInt(99);

					if (num == 1) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.DIAMOND));
					}
					if (num == 2) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.IRON_INGOT));
					}

					if (num == 5) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLD_INGOT));
					}

					if (num == 6) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.BOW));
					}
					if (num == 7) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.ARROW, 3));
					}
					if (num == 8) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.DIAMOND_BOOTS));
					}
					if (num == 9) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.DIAMOND_HELMET));
					}

					if (num == 10) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.STICK));
					}

					if (num == 11) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLDEN_APPLE));
					}
					if (num == 12) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLD_INGOT));
					}
					if (num == 13) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLD_INGOT));
					}
					if (num == 14) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.DIAMOND));
					}
				}
			}
		}
		return true;
	}

}
