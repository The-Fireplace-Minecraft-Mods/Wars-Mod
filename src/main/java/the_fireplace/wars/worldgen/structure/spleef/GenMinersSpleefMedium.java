package the_fireplace.wars.worldgen.structure.spleef;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenMinersSpleefMedium {

	public GenMinersSpleefMedium(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader mSpleefM = new ResinresinLoader("mSpleefM.resinresin");

		WarsMod.generateBlock(player.worldObj, i, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(player.worldObj, i + 10, j + 1, k - 2, Blocks.STONE);

		mSpleefM.generate(player.worldObj, i + -12, j - 2, k + -12, false);

		// 1
		WarsMod.generateBlock(player.worldObj, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.worldObj, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.worldObj, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.worldObj, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.worldObj, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.worldObj, i, j, k, WarsBlocks.mSpleefM);
	}

}
