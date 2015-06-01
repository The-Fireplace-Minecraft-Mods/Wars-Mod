package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockHill extends Block {

	public BlockHill() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader hill = new resinresinLoader("hill.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		hill.generate(par1World, i - 10, j - 6, k - 10, false);
		return false;

	}

}
