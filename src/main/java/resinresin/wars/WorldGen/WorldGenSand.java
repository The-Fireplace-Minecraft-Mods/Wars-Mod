package resinresin.wars.WorldGen;

import java.util.Random;

import resinresin.wars.Warsmod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSand extends WorldGenerator {
	/** The block ID of the ore to be placed using this generator. */
	private int minableBlockId;

	/** The number of blocks to generate. */
	private int numberOfBlocks;

	public WorldGenSand(int par1, int par2) {
		minableBlockId = par1;
		numberOfBlocks = par2;
	}
	
	
    @Override 
	public boolean generate(World world, Random rand, BlockPos pos) {
    	
    	
		int x = pos.getX();
		int y = pos.getX();
		int z = pos.getX();
    	
    	
		float f = rand.nextFloat() * (float) Math.PI;
		double d = (float) (x + 8) + (MathHelper.sin(f) * (float) numberOfBlocks) / 8F;
		double d1 = (float) (x + 8) - (MathHelper.sin(f) * (float) numberOfBlocks) / 8F;
		double d2 = (float) (z + 8) + (MathHelper.cos(f) * (float) numberOfBlocks) / 8F;
		double d3 = (float) (z + 8) - (MathHelper.cos(f) * (float) numberOfBlocks) / 8F;
		double d4 = (y + rand.nextInt(3)) - 2;
		double d5 = (y + rand.nextInt(3)) - 2;

		for (int i = 0; i <= numberOfBlocks; i++) {
			double d6 = d + ((d1 - d) * (double) i) / (double) numberOfBlocks;
			double d7 = d4 + ((d5 - d4) * (double) i) / (double) numberOfBlocks;
			double d8 = d2 + ((d3 - d2) * (double) i) / (double) numberOfBlocks;
			double d9 = (rand.nextDouble() * (double) numberOfBlocks) / 16D;
			double d10 = (double) (MathHelper.sin(((float) i * (float) Math.PI) / (float) numberOfBlocks) + 1.0F) * d9 + 1.0D;
			double d11 = (double) (MathHelper.sin(((float) i * (float) Math.PI) / (float) numberOfBlocks) + 1.0F) * d9 + 1.0D;
			int j = MathHelper.floor_double(d6 - d10 / 2D);
			int k = MathHelper.floor_double(d7 - d11 / 2D);
			int l = MathHelper.floor_double(d8 - d10 / 2D);
			int i1 = MathHelper.floor_double(d6 + d10 / 2D);
			int j1 = MathHelper.floor_double(d7 + d11 / 2D);
			int k1 = MathHelper.floor_double(d8 + d10 / 2D);

			for (int l1 = j; l1 <= i1; l1++) {
				double d12 = (((double) l1 + 0.5D) - d6) / (d10 / 2D);

				if (d12 * d12 >= 1.0D) {
					continue;
				}

				for (int i2 = k; i2 <= j1; i2++) {
					double d13 = (((double) i2 + 0.5D) - d7) / (d11 / 2D);

					if (d12 * d12 + d13 * d13 >= 1.0D) {
						continue;
					}

					for (int j2 = l; j2 <= k1; j2++) {
						double d14 = (((double) j2 + 0.5D) - d8) / (d10 / 2D);

						if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.getBlockId(l1, i2, j2) == Blocks.sand) {
							Warsmod.generateBlock(world, l1, i2, j2, minableBlockId);
						}
					}
				}
			}
		}

		return true;
	}
}