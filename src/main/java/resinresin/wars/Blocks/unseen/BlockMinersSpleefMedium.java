package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockMinersSpleefMedium extends Block {

	public BlockMinersSpleefMedium() {
		super(Material.iron);
	}

	/**
	 * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
	 */

	resinresinLoader mSpleefM = new resinresinLoader("mSpleefM.resinresin");

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		warsmod.generateBlock(par1World, i + 0, j + 2, k + 10, Blocks.stone);
		warsmod.generateBlock(par1World, i + 1, j + 2, k + 10, Blocks.stone);
		warsmod.generateBlock(par1World, i + 10, j + 1, k - 2, Blocks.stone);

		mSpleefM.generate(par1World, i + -12, j - 2, k + -12, false);

		// 1
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		return false;

	}

}
