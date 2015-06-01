package resinresin.wars.WorldGen.structure.spleef;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenNetherSpleefMedium {

	public GenNetherSpleefMedium(EntityPlayer player, int i, int j, int k) {
		resinresinLoader nSpleefM = new resinresinLoader("nSpleefM.resinresin");

		warsmod.generateBlock(player.worldObj, i + 0, j + 2, k + 10, Block.stone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 2, k + 10, Block.stone);
		warsmod.generateBlock(player.worldObj, i + 10, j + 1, k - 2, Block.stone);
		nSpleefM.generate(player.worldObj, i + -12, j - 2, k + -13, false);

		// 1
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		warsmod.generateBlock(player.worldObj, i - 0, j + 0, k + 0, WarsBlocks.nSpleefM);
	}

}
