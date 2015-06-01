package resinresin.wars.WorldGen.structure.spleef;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenMinersSpleefMedium {

	public GenMinersSpleefMedium(EntityPlayer player, int i, int j, int k) {
		resinresinLoader mSpleefM = new resinresinLoader("mSpleefM.resinresin");

		Warsmod.generateBlock(player.worldObj, i + 0, j + 2, k + 10, Blocks.stone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 2, k + 10, Blocks.stone);
		Warsmod.generateBlock(player.worldObj, i + 10, j + 1, k - 2, Blocks.stone);

		mSpleefM.generate(player.worldObj, i + -12, j - 2, k + -12, false);

		// 1
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 0, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 0, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		Warsmod.generateBlock(player.worldObj, i - 0, j + 0, k + 0, WarsBlocks.mSpleefM);
	}

}
