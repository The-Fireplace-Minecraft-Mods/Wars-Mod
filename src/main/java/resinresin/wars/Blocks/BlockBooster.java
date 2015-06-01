package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import resinresin.wars.Warsmod;

public class BlockBooster extends Block {

	public BlockBooster() {
		super(Material.iron);
		slipperiness = 1.5F;
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

}