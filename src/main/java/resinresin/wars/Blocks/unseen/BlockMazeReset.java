package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockMazeReset extends Block {

	public BlockMazeReset() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader mazeRace = new resinresinLoader("mazeRace.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		mazeRace.generate(par1World, i - 21, j - 8, k - 19, true);
		warsmod.generateBlock(par1World, i + 0, j - 0, k + 0, WarsBlocks.mazeStart);
		warsmod.generateBlock(par1World, i + 0, j - 4, k + 0, Blocks.wooden_slab);
		warsmod.generateBlock(par1World, i - 8, j - 5, k + 4, Blocks.glass);
		return false;

	}

}