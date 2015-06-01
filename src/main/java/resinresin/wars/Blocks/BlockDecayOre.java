package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockDecayOre extends Block {

	public BlockDecayOre() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	@Override
	public int idDropped(int i, Random random, int j) {
		return WarsItems.decayGem.itemID;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;

	}

}