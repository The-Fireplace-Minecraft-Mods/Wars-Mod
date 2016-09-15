package the_fireplace.wars.worldgen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import the_fireplace.wars.WarsMod;

import java.util.Random;

public class GenDungeonSmall extends WorldGenerator {
	public GenDungeonSmall() {
	}

	ResinresinLoader dungS = new ResinresinLoader("dungS.resinresin");

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {

		Block grass = Blocks.GRASS;

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();

		BlockPos posCheck1 = new BlockPos(i, j + 1, k);
		BlockPos posCheck2 = new BlockPos(i + 7, j, k);
		BlockPos posCheck3 = new BlockPos(i + 7, j, k + 7);
		BlockPos posCheck4 = new BlockPos(i, j, k + 7);
		BlockPos posCheck5 = new BlockPos(i + 7, j + 1, k);
		BlockPos posCheck6 = new BlockPos(i + 7, j + 1, k + 7);
		BlockPos posCheck7 = new BlockPos(i, j + 1, k + 7);

		if (world.getBlockState(pos).getBlock() != grass || world.getBlockState(posCheck1).getBlock() != grass || world.getBlockState(posCheck2).getBlock() != grass || world.getBlockState(posCheck3).getBlock() != grass || world.getBlockState(posCheck4).getBlock() != grass || world.getBlockState(posCheck5).getBlock() != grass || world.getBlockState(posCheck6).getBlock() != grass || world.getBlockState(posCheck7).getBlock() != grass) {
			return false;
		}

		dungS.generate(world, i, j - 55, k, true);

		WarsMod.generateBlock(world, i + 3, j - 53, k + 3, Blocks.MOB_SPAWNER);
		BlockPos spawnerPos = new BlockPos(i + 3, j - 53, k + 3);
		TileEntityMobSpawner var19 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos);
		if (var19 != null) {
			var19.getSpawnerBaseLogic().setEntityName("Blaze");
		}

		WarsMod.generateBlock(world, i + 3, j - 52, k + 3, Blocks.CHEST);
		TileEntityChest chest2 = new TileEntityChest();
		BlockPos chestPos = new BlockPos(i + 3, j - 52, k + 3);
		world.setTileEntity(chestPos, chest2);

		Random random = new Random();
		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {
			int num = random.nextInt(80);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.IRON_INGOT));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.GOLD_INGOT));

			}

			if (num == 3) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.BONE));

			}

			if (num == 4) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.BOOK));

			}
			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.ROTTEN_FLESH));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.BREAD));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.EMERALD));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.SLIME_BALL));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.EXPERIENCE_BOTTLE));
			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.ENDER_PEARL));

			}
		}

		return true;
	}


}