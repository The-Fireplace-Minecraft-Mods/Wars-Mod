package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenHgLarge {

	public GenHgLarge(EntityPlayer player, int i, int j, int k) {
		resinresinLoader hgL = new resinresinLoader("hgL.resinresin");

		hgL.generate(player.worldObj, i - 21, j - 6, k - 22, false);

		// main
		Warsmod.generateBlock(player.worldObj, i + 0, j + 27, k + 0, WarsBlocks.hgTelebM);
		// sides
		Warsmod.generateBlock(player.worldObj, i + 9, j + 27, k + 0, WarsBlocks.hgTeleb1);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 27, k + 0, WarsBlocks.hgTeleb2);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 27, k + 9, WarsBlocks.hgTeleb3);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 27, k - 9, WarsBlocks.hgTeleb4);
		// right/left of side
		Warsmod.generateBlock(player.worldObj, i + 9, j + 27, k + 2, WarsBlocks.hgTeleb5);
		Warsmod.generateBlock(player.worldObj, i + 9, j + 27, k - 2, WarsBlocks.hgTeleb6);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 27, k + 2, WarsBlocks.hgTeleb7);
		Warsmod.generateBlock(player.worldObj, i - 9, j + 27, k - 2, WarsBlocks.hgTeleb8);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 27, k + 9, WarsBlocks.hgTeleb9);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 27, k + 9, WarsBlocks.hgTeleb10);
		Warsmod.generateBlock(player.worldObj, i + 2, j + 27, k - 9, WarsBlocks.hgTeleb11);
		Warsmod.generateBlock(player.worldObj, i - 2, j + 27, k - 9, WarsBlocks.hgTeleb12);
		// corner
		Warsmod.generateBlock(player.worldObj, i + 6, j + 27, k + 6, WarsBlocks.hgTeleb13);
		Warsmod.generateBlock(player.worldObj, i + 6, j + 27, k - 6, WarsBlocks.hgTeleb14);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 27, k + 6, WarsBlocks.hgTeleb15);
		Warsmod.generateBlock(player.worldObj, i - 6, j + 27, k - 6, WarsBlocks.hgTeleb16);
		// off centre
		Warsmod.generateBlock(player.worldObj, i + 8, j + 27, k + 4, WarsBlocks.hgTeleb17);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 27, k + 4, WarsBlocks.hgTeleb18);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 27, k + 8, WarsBlocks.hgTeleb19);
		Warsmod.generateBlock(player.worldObj, i + 4, j + 27, k - 8, WarsBlocks.hgTeleb20);
		Warsmod.generateBlock(player.worldObj, i + 8, j + 27, k - 4, WarsBlocks.hgTeleb21);
		Warsmod.generateBlock(player.worldObj, i - 8, j + 27, k - 4, WarsBlocks.hgTeleb22);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 27, k + 8, WarsBlocks.hgTeleb23);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 27, k - 8, WarsBlocks.hgTeleb24);

		Warsmod.generateBlock(player.worldObj, i - 7, j + 27, k + 5, Blocks.glass);

		Warsmod.generateBlock(player.worldObj, i + 20, j - 2, k + 0, WarsBlocks.hgTeleb1);
		Warsmod.generateBlock(player.worldObj, i - 20, j - 2, k + 0, WarsBlocks.hgTeleb2);
		Warsmod.generateBlock(player.worldObj, i + 0, j - 2, k + 20, WarsBlocks.hgTeleb3);
		Warsmod.generateBlock(player.worldObj, i + 0, j - 2, k - 20, WarsBlocks.hgTeleb4);
		// right/left of side
		Warsmod.generateBlock(player.worldObj, i + 19, j - 2, k + 5, WarsBlocks.hgTeleb5);
		Warsmod.generateBlock(player.worldObj, i + 19, j - 2, k - 5, WarsBlocks.hgTeleb6);
		Warsmod.generateBlock(player.worldObj, i - 19, j - 2, k + 5, WarsBlocks.hgTeleb7);
		Warsmod.generateBlock(player.worldObj, i - 19, j - 2, k - 5, WarsBlocks.hgTeleb8);
		Warsmod.generateBlock(player.worldObj, i + 5, j - 2, k + 19, WarsBlocks.hgTeleb9);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 2, k + 19, WarsBlocks.hgTeleb10);
		Warsmod.generateBlock(player.worldObj, i + 5, j - 2, k - 19, WarsBlocks.hgTeleb11);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 2, k - 19, WarsBlocks.hgTeleb12);
		// corner
		Warsmod.generateBlock(player.worldObj, i + 14, j - 2, k + 14, WarsBlocks.hgTeleb13);
		Warsmod.generateBlock(player.worldObj, i + 14, j - 2, k - 14, WarsBlocks.hgTeleb14);
		Warsmod.generateBlock(player.worldObj, i - 14, j - 2, k + 14, WarsBlocks.hgTeleb15);
		Warsmod.generateBlock(player.worldObj, i - 14, j - 2, k - 14, WarsBlocks.hgTeleb16);
		// off centre
		Warsmod.generateBlock(player.worldObj, i + 17, j - 2, k + 10, WarsBlocks.hgTeleb17);
		Warsmod.generateBlock(player.worldObj, i - 17, j - 2, k + 10, WarsBlocks.hgTeleb18);
		Warsmod.generateBlock(player.worldObj, i + 10, j - 2, k + 17, WarsBlocks.hgTeleb19);
		Warsmod.generateBlock(player.worldObj, i + 10, j - 2, k - 17, WarsBlocks.hgTeleb20);
		Warsmod.generateBlock(player.worldObj, i + 17, j - 2, k - 10, WarsBlocks.hgTeleb21);
		Warsmod.generateBlock(player.worldObj, i - 17, j - 2, k - 10, WarsBlocks.hgTeleb22);
		Warsmod.generateBlock(player.worldObj, i - 10, j - 2, k + 17, WarsBlocks.hgTeleb23);
		Warsmod.generateBlock(player.worldObj, i - 10, j - 2, k - 17, WarsBlocks.hgTeleb24);

		Warsmod.generateBlock(player.worldObj, i + 19, j - 0, k + 0, WarsBlocks.hgLv2start);

		Warsmod.generateBlock(player.worldObj, i + 1, j + 0, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j + 0, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 0, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i + 0, j + 0, k - 1, Blocks.air);
	}

}
