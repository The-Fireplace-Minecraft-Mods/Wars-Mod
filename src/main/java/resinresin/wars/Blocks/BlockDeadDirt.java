package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import resinresin.wars.warsmod;

public class BlockDeadDirt extends Block {

	public BlockDeadDirt(int ID) {
		super(ID, Material.grass);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

}
