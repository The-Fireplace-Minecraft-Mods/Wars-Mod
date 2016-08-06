package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import the_fireplace.wars.WarsMod;

public class BlockBooster extends Block {

	public BlockBooster() {
		super(Material.iron);
		slipperiness = 1.5F;
		setCreativeTab(WarsMod.tabWarsBlocks);
	}
}