package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsItems;

import java.util.Random;

public class BlockPresentBox extends Block {

	public BlockPresentBox() {
		super(Material.IRON);
		this.setTickRandomly(true);
		setCreativeTab(WarsMod.tabWarsBlocks);
		setSoundType(SoundType.STONE);
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (!world.isRemote) {
			
			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			WarsMod.generateBlock(world, i, j + 1, k, Blocks.CHEST);
			TileEntityChest chest2 = new TileEntityChest();

			
			BlockPos chestPos = new BlockPos(i, j + 1, k);
			
			world.setTileEntity(chestPos, chest2);

			Random random = new Random();

			for (int slot = 0; slot < 1; slot++) {

				int num = random.nextInt(30);

				if (num == 1) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.CHICKEN));
				}
				if (num == 2) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.magicPotato));
				}

				if (num == 3) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.BEEF));
				}

				if (num == 4) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.ENDER_PEARL));
				}
				if (num == 5) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.BEEF));
				}
				if (num == 6) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.battleBurger));
				}
				if (num == 7) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.longBannana));
				}
				if (num == 8) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.workWaffel));
				}
				if (num == 9) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.shadowFlesh));
				}
				if (num == 10) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.warCheese));
				}
				if (num == 11) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.FISH));
				}
				if (num == 12) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.MELON));
				}
				if (num == 13) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.ROTTEN_FLESH));
				}
				if (num == 14) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.PORKCHOP));
				}
				if (num == 15) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.SPIDER_EYE));
				}
				if (num == 16) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.COOKIE));
				}
				if (num == 17) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.antidote));
				}

				WarsMod.generateBlock(world, i, j + 1, k, Blocks.STONE);
				WarsMod.generateBlock(world, i, j + 1, k, Blocks.AIR);
			}
        }
	}
}
