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
import resinresin.wars.WarsMod;

public class BlockInstantChestLv1 extends Block {

	public BlockInstantChestLv1() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		WarsMod.generateBlock(world, i + 0, j + 0, k + 0, Blocks.chest);
		TileEntityChest chest2 = new TileEntityChest();

		world.setTileEntity(pos, chest2);

		Random random = new Random();

		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {

			int num = random.nextInt(160);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));

			}

			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));

			}

			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_boots));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.apple));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.porkchop));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bone));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.book));

			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.feather));

			}
			if (num == 12) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.string));

			}
			if (num == 13) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bowl));

			}
			if (num == 14) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.arrow));

			}
			if (num == 15) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.coal));

			}
			if (num == 16) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bread));

			}
			if (num == 17) {
				chest2.setInventorySlotContents(slot, new ItemStack(Blocks.red_mushroom));

			}
			if (num == 18) {
				chest2.setInventorySlotContents(slot, new ItemStack(Blocks.torch));

			}
			if (num == 19) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.rotten_flesh));

			}
			if (num == 20) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.spider_eye));

			}
			if (num == 21) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stick));

			}
			if (num == 22) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.fish));

			}
			if (num == 23) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chicken));

			}
			if (num == 24) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.porkchop));

			}
			if (num == 25) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.wooden_axe));

			}
			if (num == 26) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));
			}
			if (num == 27) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.flint));
			}
			if (num == 28) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));
			}
			if (num == 29) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));
			}

			if (num == 30) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));
			}

			if (num == 31) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_boots));
			}
		}
		return false;
	}

}
