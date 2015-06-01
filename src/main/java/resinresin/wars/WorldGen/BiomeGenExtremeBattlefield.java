package resinresin.wars.WorldGen;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import resinresin.wars.registry.WarsBlocks;

public class BiomeGenExtremeBattlefield extends BiomeGenBase {
	public BiomeGenExtremeBattlefield(int par1) {
		super(par1);
		setBiomeName("EXbattlefield");
		setColor(54705435);
		spawnableCreatureList.clear();
		topBlock = Blocks.grass.getDefaultState();
		fillerBlock = WarsBlocks.deadDirt.getDefaultState();
		rainfall = 0.0F;
		temperature = 9.9F;
		// this.setMinMaxHeight(0.2F, 1.3F)
		this.minHeight = -5.0F;/* 0.2F; */
		this.maxHeight = -9.9F;

	}

}