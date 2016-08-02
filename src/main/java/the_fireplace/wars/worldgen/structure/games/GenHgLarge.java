package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class GenHgLarge {

	public GenHgLarge(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader hgL = new ResinresinLoader("hgL.resinresin");

		hgL.generate(player.worldObj, i - 21, j - 6, k - 22, false);

		//TODO find a better way of making these blocks
//		// main
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 27, k + 0, WarsBlocks.hgTelebM);
//		// sides
//		WarsMod.generateBlock(player.worldObj, i + 9, j + 27, k + 0, WarsBlocks.hgTeleb1);
//		WarsMod.generateBlock(player.worldObj, i - 9, j + 27, k + 0, WarsBlocks.hgTeleb2);
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 27, k + 9, WarsBlocks.hgTeleb3);
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 27, k - 9, WarsBlocks.hgTeleb4);
//		// right/left of side
//		WarsMod.generateBlock(player.worldObj, i + 9, j + 27, k + 2, WarsBlocks.hgTeleb5);
//		WarsMod.generateBlock(player.worldObj, i + 9, j + 27, k - 2, WarsBlocks.hgTeleb6);
//		WarsMod.generateBlock(player.worldObj, i - 9, j + 27, k + 2, WarsBlocks.hgTeleb7);
//		WarsMod.generateBlock(player.worldObj, i - 9, j + 27, k - 2, WarsBlocks.hgTeleb8);
//		WarsMod.generateBlock(player.worldObj, i + 2, j + 27, k + 9, WarsBlocks.hgTeleb9);
//		WarsMod.generateBlock(player.worldObj, i - 2, j + 27, k + 9, WarsBlocks.hgTeleb10);
//		WarsMod.generateBlock(player.worldObj, i + 2, j + 27, k - 9, WarsBlocks.hgTeleb11);
//		WarsMod.generateBlock(player.worldObj, i - 2, j + 27, k - 9, WarsBlocks.hgTeleb12);
//		// corner
//		WarsMod.generateBlock(player.worldObj, i + 6, j + 27, k + 6, WarsBlocks.hgTeleb13);
//		WarsMod.generateBlock(player.worldObj, i + 6, j + 27, k - 6, WarsBlocks.hgTeleb14);
//		WarsMod.generateBlock(player.worldObj, i - 6, j + 27, k + 6, WarsBlocks.hgTeleb15);
//		WarsMod.generateBlock(player.worldObj, i - 6, j + 27, k - 6, WarsBlocks.hgTeleb16);
//		// off centre
//		WarsMod.generateBlock(player.worldObj, i + 8, j + 27, k + 4, WarsBlocks.hgTeleb17);
//		WarsMod.generateBlock(player.worldObj, i - 8, j + 27, k + 4, WarsBlocks.hgTeleb18);
//		WarsMod.generateBlock(player.worldObj, i + 4, j + 27, k + 8, WarsBlocks.hgTeleb19);
//		WarsMod.generateBlock(player.worldObj, i + 4, j + 27, k - 8, WarsBlocks.hgTeleb20);
//		WarsMod.generateBlock(player.worldObj, i + 8, j + 27, k - 4, WarsBlocks.hgTeleb21);
//		WarsMod.generateBlock(player.worldObj, i - 8, j + 27, k - 4, WarsBlocks.hgTeleb22);
//		WarsMod.generateBlock(player.worldObj, i - 4, j + 27, k + 8, WarsBlocks.hgTeleb23);
//		WarsMod.generateBlock(player.worldObj, i - 4, j + 27, k - 8, WarsBlocks.hgTeleb24);
//
//		WarsMod.generateBlock(player.worldObj, i - 7, j + 27, k + 5, Blocks.glass);
//
//		WarsMod.generateBlock(player.worldObj, i + 20, j - 2, k + 0, WarsBlocks.hgTeleb1);
//		WarsMod.generateBlock(player.worldObj, i - 20, j - 2, k + 0, WarsBlocks.hgTeleb2);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 2, k + 20, WarsBlocks.hgTeleb3);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 2, k - 20, WarsBlocks.hgTeleb4);
//		// right/left of side
//		WarsMod.generateBlock(player.worldObj, i + 19, j - 2, k + 5, WarsBlocks.hgTeleb5);
//		WarsMod.generateBlock(player.worldObj, i + 19, j - 2, k - 5, WarsBlocks.hgTeleb6);
//		WarsMod.generateBlock(player.worldObj, i - 19, j - 2, k + 5, WarsBlocks.hgTeleb7);
//		WarsMod.generateBlock(player.worldObj, i - 19, j - 2, k - 5, WarsBlocks.hgTeleb8);
//		WarsMod.generateBlock(player.worldObj, i + 5, j - 2, k + 19, WarsBlocks.hgTeleb9);
//		WarsMod.generateBlock(player.worldObj, i - 5, j - 2, k + 19, WarsBlocks.hgTeleb10);
//		WarsMod.generateBlock(player.worldObj, i + 5, j - 2, k - 19, WarsBlocks.hgTeleb11);
//		WarsMod.generateBlock(player.worldObj, i - 5, j - 2, k - 19, WarsBlocks.hgTeleb12);
//		// corner
//		WarsMod.generateBlock(player.worldObj, i + 14, j - 2, k + 14, WarsBlocks.hgTeleb13);
//		WarsMod.generateBlock(player.worldObj, i + 14, j - 2, k - 14, WarsBlocks.hgTeleb14);
//		WarsMod.generateBlock(player.worldObj, i - 14, j - 2, k + 14, WarsBlocks.hgTeleb15);
//		WarsMod.generateBlock(player.worldObj, i - 14, j - 2, k - 14, WarsBlocks.hgTeleb16);
//		// off centre
//		WarsMod.generateBlock(player.worldObj, i + 17, j - 2, k + 10, WarsBlocks.hgTeleb17);
//		WarsMod.generateBlock(player.worldObj, i - 17, j - 2, k + 10, WarsBlocks.hgTeleb18);
//		WarsMod.generateBlock(player.worldObj, i + 10, j - 2, k + 17, WarsBlocks.hgTeleb19);
//		WarsMod.generateBlock(player.worldObj, i + 10, j - 2, k - 17, WarsBlocks.hgTeleb20);
//		WarsMod.generateBlock(player.worldObj, i + 17, j - 2, k - 10, WarsBlocks.hgTeleb21);
//		WarsMod.generateBlock(player.worldObj, i - 17, j - 2, k - 10, WarsBlocks.hgTeleb22);
//		WarsMod.generateBlock(player.worldObj, i - 10, j - 2, k + 17, WarsBlocks.hgTeleb23);
//		WarsMod.generateBlock(player.worldObj, i - 10, j - 2, k - 17, WarsBlocks.hgTeleb24);

		WarsMod.generateBlock(player.worldObj, i + 19, j - 0, k + 0, WarsBlocks.hgLv2start);

		WarsMod.generateBlock(player.worldObj, i + 1, j + 0, k + 0, Blocks.air);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 0, k + 0, Blocks.air);
		WarsMod.generateBlock(player.worldObj, i + 0, j + 0, k + 1, Blocks.air);
		WarsMod.generateBlock(player.worldObj, i + 0, j + 0, k - 1, Blocks.air);
	}

}
