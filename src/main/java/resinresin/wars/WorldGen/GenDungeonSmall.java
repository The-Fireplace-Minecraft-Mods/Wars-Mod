package resinresin.wars.WorldGen;

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
import resinresin.wars.WarsMod;
import resinresin.wars.registry.WarsItems;

public class GenDungeonSmall extends WorldGenerator {
	public GenDungeonSmall() {
	}

	ResinresinLoader dungS = new ResinresinLoader("dungS.resinresin");

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

		dungS.generate(world, i + 0, j - 55, k + 0, true);

		WarsMod.generateBlock(world, i + 3, j - 53, k + 3, Blocks.mob_spawner);
		BlockPos spawnerPos = new BlockPos(i + 3, j - 53, k + 3);
		TileEntityMobSpawner var19 = (TileEntityMobSpawner) world.getTileEntity(spawnerPos);
		if (var19 != null) {
			var19.getSpawnerBaseLogic().setEntityName("Blaze");
		}

		WarsMod.generateBlock(world, i + 3, j - 52, k + 3, Blocks.chest);
		TileEntityChest chest2 = new TileEntityChest();
		BlockPos chestPos = new BlockPos(i + 3, j - 52, k + 3);
		world.setTileEntity(chestPos, chest2);

		Random random = new Random();
		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {
			int num = random.nextInt(80);

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