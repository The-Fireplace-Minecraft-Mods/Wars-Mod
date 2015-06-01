package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockPresentBox extends Block {

	public BlockPresentBox() {
		super(Material.iron);
		this.setTickRandomly(true);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public void updateTick(World par1World, int i, int j, int k, Random par5Random) {
		if (!par1World.isRemote) {

			par1World.setBlock(i + 0, j + 1, k + 0, Block.chest.blockID, 2, 2);
			TileEntityChest chest2 = new TileEntityChest();

			par1World.setBlockTileEntity(i + 0, j + 1, k + 0, chest2);

			Random random = new Random();

			for (int slot = 0; slot < 1; slot++) {

				int num = random.nextInt(30);

				if (num == 1) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.chicken));

				}
				if (num == 2) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.magicPotato));

				}

				if (num == 3) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.beef));

				}

				if (num == 4) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.ender_pearl));

				}
				if (num == 5) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.beef));

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
					chest2.setInventorySlotContents(slot, new ItemStack(Items.fish));

				}
				if (num == 12) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.melon));

				}
				if (num == 13) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.rotten_flesh));

				}
				if (num == 14) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.porkchop));

				}
				if (num == 15) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.spider_eye));

				}
				if (num == 16) {
					chest2.setInventorySlotContents(slot, new ItemStack(Items.cookie));

				}
				if (num == 17) {
					chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.antidote));

				}

				par1World.setBlock(i + 0, j + 1, k + 0, Block.stone.blockID, 2, 2);
				par1World.setBlock(i + 0, j + 1, k + 0, 0, 2, 2);

			}
			return;
		}

	}
}
