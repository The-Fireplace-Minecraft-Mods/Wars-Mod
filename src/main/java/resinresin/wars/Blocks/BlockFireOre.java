package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockFireOre extends Block {

	public BlockFireOre() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public int idDropped(int i, Random random, int j) {
		return WarsItems.fireGem.itemID;
	}

	public int quantityDropped(Random random) {
		return 1;

	}

}