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
import the_fireplace.wars.registry.WarsItems;

import java.util.Random;

public class BlockWarChest extends Block {

	public BlockWarChest() {
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

					int num = random.nextInt(100);

					if (num == 1) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Blocks.torch));

					}
					if (num == 2) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.magicPotato));

					}

					if (num == 5) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.beef));

					}

					if (num == 6) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.golden_apple));

					}
					if (num == 7) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.apple));

					}
					if (num == 8) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.battleBurger));

					}
					if (num == 9) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.longBannana));

					}
					if (num == 10) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.workWaffel));

					}
					if (num == 11) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.shadowFlesh));

					}
					if (num == 12) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(WarsItems.warCheese));

					}

				}
			}
		}
		return true;
	}

}
