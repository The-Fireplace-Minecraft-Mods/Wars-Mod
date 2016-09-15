package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenHgSmall {

	public GenHgSmall(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader hgS = new ResinresinLoader("hgS.resinresin");

		//TODO find a better way of making these blocks
//		WarsMod.generateBlock(player.worldObj, i + 8, j - 1, k + 0, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 1, k + 8, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 8, j - 1, k + 0, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 1, k - 8, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 8, j - 2, k + 0, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 2, k + 8, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 8, j - 2, k + 0, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 2, k - 8, Blocks.AIR);
//
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 2, k + 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 2, k - 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 2, k + 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 2, k - 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 1, k + 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 1, k - 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 1, k + 6, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 1, k - 6, Blocks.AIR);
//
//		WarsMod.generateBlock(player.worldObj, i + 7, j - 1, k - 5, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 7, j - 1, k - 5, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i + 7, j - 2, k - 5, Blocks.AIR);
//		WarsMod.generateBlock(player.worldObj, i - 7, j - 2, k - 5, Blocks.AIR);
//
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k - 0, Blocks.AIR);
//
		hgS.generate(player.worldObj, i - 9, j - 3, k - 9, false);
//		WarsMod.generateBlock(player.worldObj, i + 8, j - 4, k + 0, WarsBlocks.hgTele1);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 4, k + 8, WarsBlocks.hgTele2);
//		WarsMod.generateBlock(player.worldObj, i - 8, j - 4, k + 0, WarsBlocks.hgTele3);
//		WarsMod.generateBlock(player.worldObj, i + 0, j - 4, k - 8, WarsBlocks.hgTele4);
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 4, k + 6, WarsBlocks.hgTele5);
//		WarsMod.generateBlock(player.worldObj, i + 6, j - 4, k - 6, WarsBlocks.hgTele6);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 4, k + 6, WarsBlocks.hgTele7);
//		WarsMod.generateBlock(player.worldObj, i - 6, j - 4, k - 6, WarsBlocks.hgTele8);
//
//		WarsMod.generateBlock(player.worldObj, i + 6, j + 15, k + 0, WarsBlocks.hgTele1);
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 15, k + 6, WarsBlocks.hgTele2);
//		WarsMod.generateBlock(player.worldObj, i - 6, j + 15, k + 0, WarsBlocks.hgTele3);
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 15, k - 6, WarsBlocks.hgTele4);
//		WarsMod.generateBlock(player.worldObj, i + 4, j + 15, k + 4, WarsBlocks.hgTele5);
//		WarsMod.generateBlock(player.worldObj, i + 4, j + 15, k - 4, WarsBlocks.hgTele6);
//		WarsMod.generateBlock(player.worldObj, i - 4, j + 15, k + 4, WarsBlocks.hgTele7);
//		WarsMod.generateBlock(player.worldObj, i - 4, j + 15, k - 4, WarsBlocks.hgTele8);
//		WarsMod.generateBlock(player.worldObj, i + 0, j + 15, k - 0, WarsBlocks.hgTeleMain);
		WarsMod.generateBlock(player.worldObj, i, j - 1, k + 7, WarsBlocks.hgLv1start);
	}

}
