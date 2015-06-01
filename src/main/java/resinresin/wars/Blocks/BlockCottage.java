package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockCottage extends Block {

	public BlockCottage() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader cottage = new resinresinLoader("cottage.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		warsmod.generateBlock(par1World, i + 4, j + 2, k - 2, Blocks.stone);

		warsmod.generateBlock(par1World, i - 1, j + 2, k + 5, Blocks.stone);
		warsmod.generateBlock(par1World, i + 1, j + 2, k + 5, Blocks.stone);

		warsmod.generateBlock(par1World, i + 2, j + 7, k + 5, Blocks.stone);

		warsmod.generateBlock(par1World, i - 2, j + 7, k + 5, Blocks.stone);

		cottage.generate(par1World, i - 5, j - 1, k - 6, false);

		warsmod.generateBlock(par1World, i - 0, j + 0, k + 0, Blocks.air);

		return false;

	}
}
