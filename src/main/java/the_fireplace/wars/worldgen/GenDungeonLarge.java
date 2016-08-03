package the_fireplace.wars.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsItems;

public class GenDungeonLarge extends WorldGenerator {
	public GenDungeonLarge() {
	}

	ResinresinLoader dungL = new ResinresinLoader("dungL.resinresin");

	private String pickMobSpawner(Random par1Random) {
		int var2 = par1Random.nextInt(4);
		return var2 == 0 ? "Skeleton" : (var2 == 1 ? "Zombie" : (var2 == 2 ? "Blaze" : (var2 == 3 ? "Spider" : "")));
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {

		Block grass = Blocks.grass;

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

		dungL.generate(world, i, j - 40, k, true);

		WarsMod.generateBlock(world, i + 5, j - 40, k + 12, Blocks.mob_spawner);
		BlockPos spawnerPos1 = new BlockPos(i + 5, j - 40, k + 12);
		TileEntityMobSpawner var19 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos1);
		if (var19 != null) {
			var19.getSpawnerBaseLogic().setEntityName(pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}

		WarsMod.generateBlock(world, i + 19, j - 40, k + 12, Blocks.mob_spawner);
		BlockPos spawnerPos2 = new BlockPos(i + 19, j - 40, k + 12);
		TileEntityMobSpawner var20 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos2);
		if (var20 != null) {
			var20.getSpawnerBaseLogic().setRandomEntity(null);
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}

		WarsMod.generateBlock(world, i + 12, j - 40, k + 19, Blocks.mob_spawner);
		BlockPos spawnerPos3 = new BlockPos(i + 12, j - 40, k + 19);
		TileEntityMobSpawner var21 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos3);
		if (var21 != null) {
			var21.getSpawnerBaseLogic().setEntityName(pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}

		WarsMod.generateBlock(world, i + 12, j - 40, k + 5, Blocks.mob_spawner);
		BlockPos spawnerPos4 = new BlockPos(i + 12, j - 40, k + 5);
		TileEntityMobSpawner var22 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos4);
		if (var22 != null) {
			var22.getSpawnerBaseLogic().setEntityName(pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}

		WarsMod.generateBlock(world, i + 12, j - 37, k + 12, Blocks.chest);
		BlockPos chestPos1 = new BlockPos(i + 12, j - 37, k + 12);
		TileEntityChest chest2 = new TileEntityChest();
		world.setTileEntity(chestPos1, chest2);
		Random random = new Random();
		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {
			int num = random.nextInt(60);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_ingot));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

			}

			if (num == 3) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bone));

			}

			if (num == 4) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.book));

			}
			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.rotten_flesh));

			}
			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(WarsItems.ancientGem));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bread));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.emerald));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.slime_ball));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.experience_bottle));
			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.ender_pearl));

			}
		}

		return true;
	}

}
