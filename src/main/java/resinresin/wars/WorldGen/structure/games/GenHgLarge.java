package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenHgLarge {

	public GenHgLarge(EntityPlayer player, int i, int j, int k) {
		resinresinLoader hgL = new resinresinLoader("hgL.resinresin");

		hgL.generate(player.worldObj, i - 21, j - 6, k - 22, false);

		// main
		warsmod.generateBlock(player.worldObj, i + 0, j + 27, k + 0, WarsBlocks.hgTelebM);
		// sides
		warsmod.generateBlock(player.worldObj, i + 9, j + 27, k + 0, WarsBlocks.hgTeleb1);
		warsmod.generateBlock(player.worldObj, i - 9, j + 27, k + 0, WarsBlocks.hgTeleb2);
		warsmod.generateBlock(player.worldObj, i + 0, j + 27, k + 9, WarsBlocks.hgTeleb3);
		warsmod.generateBlock(player.worldObj, i + 0, j + 27, k - 9, WarsBlocks.hgTeleb4);
		// right/left of side
		warsmod.generateBlock(player.worldObj, i + 9, j + 27, k + 2, WarsBlocks.hgTeleb5);
		warsmod.generateBlock(player.worldObj, i + 9, j + 27, k - 2, WarsBlocks.hgTeleb6);
		warsmod.generateBlock(player.worldObj, i - 9, j + 27, k + 2, WarsBlocks.hgTeleb7);
		warsmod.generateBlock(player.worldObj, i - 9, j + 27, k - 2, WarsBlocks.hgTeleb8);
		warsmod.generateBlock(player.worldObj, i + 2, j + 27, k + 9, WarsBlocks.hgTeleb9);
		warsmod.generateBlock(player.worldObj, i - 2, j + 27, k + 9, WarsBlocks.hgTeleb10);
		warsmod.generateBlock(player.worldObj, i + 2, j + 27, k - 9, WarsBlocks.hgTeleb11);
		warsmod.generateBlock(player.worldObj, i - 2, j + 27, k - 9, WarsBlocks.hgTeleb12);
		// corner
		warsmod.generateBlock(player.worldObj, i + 6, j + 27, k + 6, WarsBlocks.hgTeleb13);
		warsmod.generateBlock(player.worldObj, i + 6, j + 27, k - 6, WarsBlocks.hgTeleb14);
		warsmod.generateBlock(player.worldObj, i - 6, j + 27, k + 6, WarsBlocks.hgTeleb15);
		warsmod.generateBlock(player.worldObj, i - 6, j + 27, k - 6, WarsBlocks.hgTeleb16);
		// off centre
		warsmod.generateBlock(player.worldObj, i + 8, j + 27, k + 4, WarsBlocks.hgTeleb17);
		warsmod.generateBlock(player.worldObj, i - 8, j + 27, k + 4, WarsBlocks.hgTeleb18);
		warsmod.generateBlock(player.worldObj, i + 4, j + 27, k + 8, WarsBlocks.hgTeleb19);
		warsmod.generateBlock(player.worldObj, i + 4, j + 27, k - 8, WarsBlocks.hgTeleb20);
		warsmod.generateBlock(player.worldObj, i + 8, j + 27, k - 4, WarsBlocks.hgTeleb21);
		warsmod.generateBlock(player.worldObj, i - 8, j + 27, k - 4, WarsBlocks.hgTeleb22);
		warsmod.generateBlock(player.worldObj, i - 4, j + 27, k + 8, WarsBlocks.hgTeleb23);
		warsmod.generateBlock(player.worldObj, i - 4, j + 27, k - 8, WarsBlocks.hgTeleb24);

		warsmod.generateBlock(player.worldObj, i - 7, j + 27, k + 5, Blocks.glass);

		warsmod.generateBlock(player.worldObj, i + 20, j - 2, k + 0, WarsBlocks.hgTeleb1);
		warsmod.generateBlock(player.worldObj, i - 20, j - 2, k + 0, WarsBlocks.hgTeleb2);
		warsmod.generateBlock(player.worldObj, i + 0, j - 2, k + 20, WarsBlocks.hgTeleb3);
		warsmod.generateBlock(player.worldObj, i + 0, j - 2, k - 20, WarsBlocks.hgTeleb4);
		// right/left of side
		warsmod.generateBlock(player.worldObj, i + 19, j - 2, k + 5, WarsBlocks.hgTeleb5);
		warsmod.generateBlock(player.worldObj, i + 19, j - 2, k - 5, WarsBlocks.hgTeleb6);
		warsmod.generateBlock(player.worldObj, i - 19, j - 2, k + 5, WarsBlocks.hgTeleb7);
		warsmod.generateBlock(player.worldObj, i - 19, j - 2, k - 5, WarsBlocks.hgTeleb8);
		warsmod.generateBlock(player.worldObj, i + 5, j - 2, k + 19, WarsBlocks.hgTeleb9);
		warsmod.generateBlock(player.worldObj, i - 5, j - 2, k + 19, WarsBlocks.hgTeleb10);
		warsmod.generateBlock(player.worldObj, i + 5, j - 2, k - 19, WarsBlocks.hgTeleb11);
		warsmod.generateBlock(player.worldObj, i - 5, j - 2, k - 19, WarsBlocks.hgTeleb12);
		// corner
		warsmod.generateBlock(player.worldObj, i + 14, j - 2, k + 14, WarsBlocks.hgTeleb13);
		warsmod.generateBlock(player.worldObj, i + 14, j - 2, k - 14, WarsBlocks.hgTeleb14);
		warsmod.generateBlock(player.worldObj, i - 14, j - 2, k + 14, WarsBlocks.hgTeleb15);
		warsmod.generateBlock(player.worldObj, i - 14, j - 2, k - 14, WarsBlocks.hgTeleb16);
		// off centre
		warsmod.generateBlock(player.worldObj, i + 17, j - 2, k + 10, WarsBlocks.hgTeleb17);
		warsmod.generateBlock(player.worldObj, i - 17, j - 2, k + 10, WarsBlocks.hgTeleb18);
		warsmod.generateBlock(player.worldObj, i + 10, j - 2, k + 17, WarsBlocks.hgTeleb19);
		warsmod.generateBlock(player.worldObj, i + 10, j - 2, k - 17, WarsBlocks.hgTeleb20);
		warsmod.generateBlock(player.worldObj, i + 17, j - 2, k - 10, WarsBlocks.hgTeleb21);
		warsmod.generateBlock(player.worldObj, i - 17, j - 2, k - 10, WarsBlocks.hgTeleb22);
		warsmod.generateBlock(player.worldObj, i - 10, j - 2, k + 17, WarsBlocks.hgTeleb23);
		warsmod.generateBlock(player.worldObj, i - 10, j - 2, k - 17, WarsBlocks.hgTeleb24);

		warsmod.generateBlock(player.worldObj, i + 19, j - 0, k + 0, WarsBlocks.hgLv2start);

		warsmod.generateBlock(player.worldObj, i + 1, j + 0, k + 0, Blocks.air);
		warsmod.generateBlock(player.worldObj, i - 1, j + 0, k + 0, Blocks.air);
		warsmod.generateBlock(player.worldObj, i + 0, j + 0, k + 1, Blocks.air);
		warsmod.generateBlock(player.worldObj, i + 0, j + 0, k - 1, Blocks.air);
	}

}
