package resinresin.wars.WorldGen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import resinresin.wars.registry.WarsItems;

public class GenDungeonLarge extends WorldGenerator {
	public GenDungeonLarge() {
	}

	resinresinLoader dungL = new resinresinLoader("dungL.resinresin");

	public boolean generate(World world, Random rand, int i, int j, int k) {
		int bID = 2; /*
					 * 2 is the block id for grass, so the structure going to
					 * spawn on grass
					 */
		if (world.getBlockId(i, j, k) != bID || world.getBlockId(i, j + 1, k) != 0 || world.getBlockId(i + 7, j, k) != bID || world.getBlockId(i + 7, j, k + 7) != bID || world.getBlockId(i, j, k + 7) != bID || world.getBlockId(i + 7, j + 1, k) != 0 || world.getBlockId(i + 7, j + 1, k + 7) != 0 || world.getBlockId(i, j + 1, k + 7) != 0) {
			return false;
		}

		dungL.generate(world, i + 0, j - 40, k + 0, true);
		world.setBlock(i + 5, j - 40, k + 12, Block.mobSpawner.blockID, 2, 2);
		TileEntityMobSpawner var19 = (TileEntityMobSpawner) world.getBlockTileEntity(i + 5, j - 40, k + 12);
		if (var19 != null) {
			var19.getSpawnerLogic().setMobID(this.pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}
		world.setBlock(i + 19, j - 40, k + 12, Block.mobSpawner.blockID, 2, 2);
		TileEntityMobSpawner var20 = (TileEntityMobSpawner) world.getBlockTileEntity(i + 19, j - 40, k + 12);
		if (var20 != null) {
			var20.getSpawnerLogic().setMobID(this.pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}
		world.setBlock(i + 12, j - 40, k + 19, Block.mobSpawner.blockID, 2, 2);
		TileEntityMobSpawner var21 = (TileEntityMobSpawner) world.getBlockTileEntity(i + 12, j - 40, k + 19);
		if (var21 != null) {
			var21.getSpawnerLogic().setMobID(this.pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}
		world.setBlock(i + 12, j - 40, k + 5, Block.mobSpawner.blockID, 2, 2);
		TileEntityMobSpawner var22 = (TileEntityMobSpawner) world.getBlockTileEntity(i + 12, j - 40, k + 5);
		if (var22 != null) {
			var22.getSpawnerLogic().setMobID(this.pickMobSpawner(rand));
		} else {
			System.err.println("Failed to fetch mob spawner entity at (" + i + ", " + j + ", " + k + ")");
		}

		world.setBlock(i + 12, j - 37, k + 12, Block.chest.blockID, 2, 2);
		TileEntityChest chest2 = new TileEntityChest();
		world.setBlockTileEntity(i + 12, j - 37, k + 12, chest2);
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

	private String pickMobSpawner(Random par1Random) {
		int var2 = par1Random.nextInt(4);
		return var2 == 0 ? "Skeleton" : (var2 == 1 ? "Zombie" : (var2 == 2 ? "Blaze" : (var2 == 3 ? "Spider" : "")));
	}
}
