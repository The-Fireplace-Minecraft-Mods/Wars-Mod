package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockNetherSpleefSmall extends Block {

	public BlockNetherSpleefSmall() {
		super(Material.iron);
	}

	/**
	 * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
	 */

	resinresinLoader nSpleef = new resinresinLoader("nSpleef.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		nSpleef.generate(par1World, i + -8, j - 0, k + -1, false);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 1, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 2, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 3, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 4, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 5, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 6, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 3, k + 17, WarsBlocks.spleefStone);

		// left

		warsmod.generateBlock(par1World, i - 1, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 2, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 3, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 4, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 5, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 3, k + 17, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 6, j + 3, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 10, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 11, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 12, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 13, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 14, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 15, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 16, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 3, k + 17, WarsBlocks.spleefStone);

		return false;

	}

}
