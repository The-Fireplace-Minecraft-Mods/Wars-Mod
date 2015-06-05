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
import resinresin.wars.Warsmod;

public class BlockInstantChestLv3 extends Block {

	public BlockInstantChestLv3() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		Warsmod.generateBlock(world, i + 0, j + 0, k + 0, Blocks.chest);
		TileEntityChest chest2 = new TileEntityChest();

		world.setTileEntity(pos, chest2);

		Random random = new Random();

		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {

			int num = random.nextInt(275);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_helmet));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_chestplate));

			}

			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_leggings));

			}

			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_boots));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.apple));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.porkchop));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.experience_bottle));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.diamond));

			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_ingot));

			}
			if (num == 12) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));

			}
			if (num == 13) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));

			}
			if (num == 14) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_leggings));

			}
			if (num == 15) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_chestplate));

			}
			if (num == 16) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_helmet));

			}
			if (num == 17) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stone_sword));

			}
			if (num == 18) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));

			}
			if (num == 19) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_apple));

			}
			if (num == 20) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));

			}
			if (num == 21) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_axe));

			}
			if (num == 22) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.emerald));

			}
			if (num == 23) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stick));

			}
			if (num == 24) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

			}
			if (num == 25) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.flint_and_steel));

			}
			if (num == 26) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.shears));

			}
			if (num == 27) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.fishing_rod));

			}
			if (num == 28) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.compass));

			}
			if (num == 29) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.clock));

			}
			if (num == 30) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chicken));

			}
			if (num == 31) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));

			}
			if (num == 32) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));

			}
			if (num == 33) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_boots));

			}
			if (num == 34) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));

			}

		}
		return false;
	}

}
