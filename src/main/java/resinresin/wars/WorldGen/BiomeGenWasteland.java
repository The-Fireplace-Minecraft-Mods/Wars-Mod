package resinresin.wars.WorldGen;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import resinresin.wars.registry.WarsBlocks;

public class BiomeGenWasteland extends BiomeGenBase {
	public BiomeGenWasteland(int par1) {
		super(par1);
		setBiomeName("Wasteland of forgotten Wars");
		setColor(54705435);
		spawnableCreatureList.clear();
		topBlock = Blocks.grass.getDefaultState();
		fillerBlock = WarsBlocks.deadDirt.getDefaultState();
		rainfall = 0.0F;
		temperature = 9.9F;
		// this.setMinMaxHeight(0.2F, 1.3F)
		this.minHeight = 0.0F;/* 0.2F; */
		this.maxHeight = 0.0F;

	}

}