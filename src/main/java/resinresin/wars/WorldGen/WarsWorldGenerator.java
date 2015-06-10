package resinresin.wars.WorldGen;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import resinresin.wars.config.ConfigValues;
import resinresin.wars.registry.WarsBlocks;

public class WarsWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.getDimensionId()) {

		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		}
	}

	public void generateSurface(World world, Random random, int blockX, int blockZ) {
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenerator(new BlockPos(blockX, 64, blockZ));

		if (biomegenbase instanceof BiomeGenExtremeBattlefield || biomegenbase instanceof BiomeGenWasteland) {
			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				(new GenDungeonLarge()).generate(world, random, new BlockPos(RandPosX, RandPosY, RandPosZ));
			}

			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				(new GenDungeonSmall()).generate(world, random, new BlockPos(RandPosX, RandPosY, RandPosZ));
			}
		}

		if (biomegenbase instanceof BiomeGenExtremeBattlefield || biomegenbase instanceof BiomeGenWasteland) {
			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(WarsBlocks.decayOre.getDefaultState(), 10)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));

			}
		}

		if (biomegenbase instanceof BiomeGenPlains) {

			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(WarsBlocks.naturalOre.getDefaultState(), 10)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));
			}
		}

		if (biomegenbase instanceof BiomeGenOcean) {

			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(WarsBlocks.waterOre.getDefaultState(), 10)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));
			}
		}

		if (ConfigValues.DOSAND) {
			if (biomegenbase instanceof BiomeGenDesert) {

				for (int i = 0; i < 100; i++) {
					int Xcoord = blockX + random.nextInt(16);
					int Ycoord = random.nextInt(90);
					int Zcoord = blockZ + random.nextInt(16);
					(new WorldGenSand(WarsBlocks.sinkSand, 10)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));
				}
			}
		}

		for (int i = 0; i < 7; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(40);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(WarsBlocks.ancientOre.getDefaultState(), 5)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));

		}

	}

	public void generateNether(World world, Random random, int blockX, int blockZ) {

		for (int i = 0; i < 7; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(100);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMineable(WarsBlocks.fireOre, 20)).generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));
		}

	}

}