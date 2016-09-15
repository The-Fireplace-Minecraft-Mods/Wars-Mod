package the_fireplace.wars.worldgen;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WarsWorldGenerator implements IWorldGenerator {


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.getDimensionId()) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		default:
			break;
		}
	}


	public void generateSurface(World world, Random random, int blockX, int blockZ) {
		BlockPos position = new BlockPos(blockX, 0, blockZ);

		BiomeGenBase biomegenbase = world.getBiomeGenForCoords(position);

		if (biomegenbase instanceof BiomeGenPlains || biomegenbase instanceof BiomeGenForest) {
			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				BlockPos largePos = new BlockPos(RandPosX, RandPosY, RandPosZ);
				new GenDungeonLarge().generate(world, random, largePos);
			}

			for (int k = 0; k < 25; k++) {
				int RandPosX = blockX + random.nextInt(16);
				int RandPosY = random.nextInt(128);
				int RandPosZ = blockZ + random.nextInt(16);
				BlockPos smallPos = new BlockPos(RandPosX, RandPosY, RandPosZ);
				new GenDungeonSmall().generate(world, random, smallPos);
			}
		}
	}
}