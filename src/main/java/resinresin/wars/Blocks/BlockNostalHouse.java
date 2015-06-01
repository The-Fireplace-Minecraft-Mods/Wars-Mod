package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockNostalHouse extends Block {

	public BlockNostalHouse() {
		super(Material.iron);
	}

	resinresinLoader nosHouse = new resinresinLoader("nostalHouse.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		nosHouse.generate(par1World, i - 7, j - 0, k - 7, false);
		return blockConstructorCalled;

	}

}
