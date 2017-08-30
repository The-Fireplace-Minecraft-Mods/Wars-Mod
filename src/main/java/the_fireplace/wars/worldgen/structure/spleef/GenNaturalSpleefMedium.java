package the_fireplace.wars.worldgen.structure.spleef;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenNaturalSpleefMedium {

	public GenNaturalSpleefMedium(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader pSpleefM = new ResinresinLoader("pSpleefM.resinresin");

		WarsMod.generateBlock(player.world, i, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 1, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 10, j + 1, k - 2, Blocks.STONE);
		pSpleefM.generate(player.world, i + -14, j - 2, k + -13, false);

		// 1
		WarsMod.generateBlock(player.world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.world, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.world, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.world, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.world, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.world, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.world, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.world, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.world, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.world, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.world, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.world, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.world, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.world, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.world, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.world, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.world, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.world, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.world, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(player.world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(player.world, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(player.world, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(player.world, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(player.world, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(player.world, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(player.world, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(player.world, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		WarsMod.generateBlock(player.world, i, j, k, WarsBlocks.nSpleefM);

		WarsMod.generateBlock(player.world, i, j, k, WarsBlocks.pSpleefM);
	}

}
