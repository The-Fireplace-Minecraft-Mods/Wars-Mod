package resinresin.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import resinresin.wars.WarsMod;
import resinresin.wars.registry.WarsItems;

import java.util.Random;

public class BlockFireOre extends Block {

	public BlockFireOre() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}
	
	
    @Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
		return WarsItems.fireGem;
	}

	
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

}