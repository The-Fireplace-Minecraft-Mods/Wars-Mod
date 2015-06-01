package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import resinresin.wars.Warsmod;
import resinresin.wars.registry.WarsItems;

public class BlockAncientOre extends Block {

	public BlockAncientOre() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

    @Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
		return WarsItems.ancientGem;
	}

    
    @Override
	public int quantityDropped(Random random) {
		return 1;

	}

}