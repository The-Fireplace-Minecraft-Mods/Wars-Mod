package the_fireplace.wars.worldgen;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import the_fireplace.wars.registry.WarsBlocks;

import java.util.Random;

public class WarsWorldGenerator implements IWorldGenerator {


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.getDimensionId()) {

		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		default:
			break;
		}
	}


	public void generateSurface(World world, Random random, int blockX, int blockZ) {


		BlockPos position = new BlockPos(blockX, blockZ, blockZ);

		BiomeGenBase biomegenbase = world.getBiomeGenForCoords(position);

		if (biomegenbase instanceof BiomeGenPlains || biomegenbase instanceof BiomeGenForest) {
			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				BlockPos largePos = new BlockPos(RandPosX, RandPosY, RandPosZ);
				(new GenDungeonLarge()).generate(world, random, largePos);
			}

			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				BlockPos smallPos = new BlockPos(RandPosX, RandPosY, RandPosZ);
				(new GenDungeonSmall()).generate(world, random, smallPos);
			}
		}

		if (biomegenbase instanceof BiomeGenPlains || biomegenbase instanceof BiomeGenForest) {
			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);

				BlockPos decayPos = new BlockPos(Xcoord, Ycoord, Zcoord);
				(new WorldGenMinable(WarsBlocks.decayOre.getDefaultState(), 10)).generate(world, random, decayPos);

			}
		}

		if (biomegenbase instanceof BiomeGenPlains) {

			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);

				BlockPos naturalPos = new BlockPos(Xcoord, Ycoord, Zcoord);

				(new WorldGenMinable(WarsBlocks.naturalOre.getDefaultState(), 10)).generate(world, random, naturalPos);
			}
		}

		if (biomegenbase instanceof BiomeGenOcean) {

			for (int i = 0; i < 7; i++) {
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(50);
				int Zcoord = blockZ + random.nextInt(16);

				BlockPos waterPos = new BlockPos(Xcoord, Ycoord, Zcoord);
				(new WorldGenMinable(WarsBlocks.waterOre.getDefaultState(), 10)).generate(world, random, waterPos);
			}
		}

		for (int i = 0; i < 7; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(40);
			int Zcoord = blockZ + random.nextInt(16);

			BlockPos ancientPos = new BlockPos(Xcoord, Ycoord, Zcoord);
			(new WorldGenMinable(WarsBlocks.ancientOre.getDefaultState(), 5)).generate(world, random, ancientPos);

		}

	}


	public void generateNether(World world, Random random, int blockX, int blockZ) {

		for (int i = 0; i < 7; i++) {
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(100);
			int Zcoord = blockZ + random.nextInt(16);

			BlockPos firePos = new BlockPos(Xcoord, Ycoord, Zcoord);
			(new WorldGenNetherMineable(WarsBlocks.fireOre.getDefaultState(), 20)).generate(world, random, firePos);
		}

	}

}