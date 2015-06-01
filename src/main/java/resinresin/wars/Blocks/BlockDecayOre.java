package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockDecayOre extends Block {

	public BlockDecayOre() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

    @Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
		return WarsItems.decayGem;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;

	}

}