package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsItems;

import java.util.Random;

public class BlockNaturalOre extends Block {

	public BlockNaturalOre() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

    @Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
    	return WarsItems.naturalGem;
	}
}