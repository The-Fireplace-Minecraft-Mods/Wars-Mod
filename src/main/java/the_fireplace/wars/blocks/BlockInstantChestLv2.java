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

public class BlockInstantChestLv2 extends Block {

	public BlockInstantChestLv2() {
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

					int num = random.nextInt(275);

					if (num == 1) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLDEN_HELMET));
					}
					if (num == 2) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLDEN_CHESTPLATE));
					}

					if (num == 5) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLDEN_LEGGINGS));
					}

					if (num == 6) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLDEN_BOOTS));
					}
					if (num == 7) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.APPLE));
					}
					if (num == 8) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHICKEN));
					}
					if (num == 9) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.BREAD));
					}
					if (num == 10) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.FISH));
					}
					if (num == 11) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.IRON_INGOT));
					}
					if (num == 12) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHAINMAIL_BOOTS));
					}
					if (num == 13) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHAINMAIL_BOOTS));
					}
					if (num == 14) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHAINMAIL_LEGGINGS));
					}
					if (num == 15) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
					}
					if (num == 16) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.CHAINMAIL_HELMET));
					}
					if (num == 17) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.STICK));
					}
					if (num == 18) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.GOLD_INGOT));
					}
					if (num == 19) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.BOWL));
					}
					if (num == 20) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.WOODEN_SWORD));
					}
					if (num == 21) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.STONE_AXE));
					}
					if (num == 22) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.FLINT_AND_STEEL));
					}
					if (num == 23) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.SHEARS));
					}
					if (num == 24) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.BOW));
					}
					if (num == 25) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.ARROW, 2));
					}
					if (num == 26) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.FISHING_ROD));
					}

					if (num == 31) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.LEATHER_HELMET));
					}
					if (num == 32) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.LEATHER_CHESTPLATE));
					}
					if (num == 33) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.LEATHER_BOOTS));
					}
					if (num == 34) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.LEATHER_LEGGINGS));
					}
				}
			}
		}
		return true;
	}
}
