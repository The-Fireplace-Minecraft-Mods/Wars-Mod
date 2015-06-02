package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenHgSmall {

	public GenHgSmall(EntityPlayer player, int i, int j, int k) {
		resinresinLoader hgS = new resinresinLoader("hgS.resinresin");

		//TODO find a better way of making these blocks
//		Warsmod.generateBlock(player.worldObj, i + 8, j - 1, k + 0, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 1, k + 8, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 8, j - 1, k + 0, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 1, k - 8, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 8, j - 2, k + 0, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 2, k + 8, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 8, j - 2, k + 0, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 2, k - 8, Blocks.air);
//
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 2, k + 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 2, k - 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 2, k + 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 2, k - 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 1, k + 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 1, k - 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 1, k + 6, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 1, k - 6, Blocks.air);
//
//		Warsmod.generateBlock(player.worldObj, i + 7, j - 1, k - 5, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 7, j - 1, k - 5, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i + 7, j - 2, k - 5, Blocks.air);
//		Warsmod.generateBlock(player.worldObj, i - 7, j - 2, k - 5, Blocks.air);
//
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 0, k - 0, Blocks.air);
//
		hgS.generate(player.worldObj, i - 9, j - 3, k - 9, false);
//		Warsmod.generateBlock(player.worldObj, i + 8, j - 4, k + 0, WarsBlocks.hgTele1);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 4, k + 8, WarsBlocks.hgTele2);
//		Warsmod.generateBlock(player.worldObj, i - 8, j - 4, k + 0, WarsBlocks.hgTele3);
//		Warsmod.generateBlock(player.worldObj, i + 0, j - 4, k - 8, WarsBlocks.hgTele4);
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 4, k + 6, WarsBlocks.hgTele5);
//		Warsmod.generateBlock(player.worldObj, i + 6, j - 4, k - 6, WarsBlocks.hgTele6);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 4, k + 6, WarsBlocks.hgTele7);
//		Warsmod.generateBlock(player.worldObj, i - 6, j - 4, k - 6, WarsBlocks.hgTele8);
//
//		Warsmod.generateBlock(player.worldObj, i + 6, j + 15, k + 0, WarsBlocks.hgTele1);
//		Warsmod.generateBlock(player.worldObj, i + 0, j + 15, k + 6, WarsBlocks.hgTele2);
//		Warsmod.generateBlock(player.worldObj, i - 6, j + 15, k + 0, WarsBlocks.hgTele3);
//		Warsmod.generateBlock(player.worldObj, i + 0, j + 15, k - 6, WarsBlocks.hgTele4);
//		Warsmod.generateBlock(player.worldObj, i + 4, j + 15, k + 4, WarsBlocks.hgTele5);
//		Warsmod.generateBlock(player.worldObj, i + 4, j + 15, k - 4, WarsBlocks.hgTele6);
//		Warsmod.generateBlock(player.worldObj, i - 4, j + 15, k + 4, WarsBlocks.hgTele7);
//		Warsmod.generateBlock(player.worldObj, i - 4, j + 15, k - 4, WarsBlocks.hgTele8);
//		Warsmod.generateBlock(player.worldObj, i + 0, j + 15, k - 0, WarsBlocks.hgTeleMain);
		Warsmod.generateBlock(player.worldObj, i + 0, j - 1, k + 7, WarsBlocks.hgLv1start);
	}

}
