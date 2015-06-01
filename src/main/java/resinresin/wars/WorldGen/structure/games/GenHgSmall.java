package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenHgSmall {

	public GenHgSmall(EntityPlayer player, int i, int j, int k) {
		resinresinLoader hgS = new resinresinLoader("hgS.resinresin");

		player.worldObj.setBlock(i + 8, j - 1, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j - 1, k + 8, 0, 2, 2);
		player.worldObj.setBlock(i - 8, j - 1, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j - 1, k - 8, 0, 2, 2);
		player.worldObj.setBlock(i + 8, j - 2, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j - 2, k + 8, 0, 2, 2);
		player.worldObj.setBlock(i - 8, j - 2, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j - 2, k - 8, 0, 2, 2);

		player.worldObj.setBlock(i + 6, j - 2, k + 6, 0, 2, 2);
		player.worldObj.setBlock(i + 6, j - 2, k - 6, 0, 2, 2);
		player.worldObj.setBlock(i - 6, j - 2, k + 6, 0, 2, 2);
		player.worldObj.setBlock(i - 6, j - 2, k - 6, 0, 2, 2);
		player.worldObj.setBlock(i + 6, j - 1, k + 6, 0, 2, 2);
		player.worldObj.setBlock(i + 6, j - 1, k - 6, 0, 2, 2);
		player.worldObj.setBlock(i - 6, j - 1, k + 6, 0, 2, 2);
		player.worldObj.setBlock(i - 6, j - 1, k - 6, 0, 2, 2);

		player.worldObj.setBlock(i + 7, j - 1, k - 5, 0, 2, 2);
		player.worldObj.setBlock(i - 7, j - 1, k - 5, 0, 2, 2);
		player.worldObj.setBlock(i + 7, j - 2, k - 5, 0, 2, 2);
		player.worldObj.setBlock(i - 7, j - 2, k - 5, 0, 2, 2);

		player.worldObj.setBlock(i + 0, j - 0, k - 0, 0, 2, 2);

		hgS.generate(player.worldObj, i - 9, j - 3, k - 9, false);
		player.worldObj.setBlock(i + 8, j - 4, k + 0, WarsBlocks.hgTele1.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 4, k + 8, WarsBlocks.hgTele2.blockID, 2, 2);
		player.worldObj.setBlock(i - 8, j - 4, k + 0, WarsBlocks.hgTele3.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 4, k - 8, WarsBlocks.hgTele4.blockID, 2, 2);
		player.worldObj.setBlock(i + 6, j - 4, k + 6, WarsBlocks.hgTele5.blockID, 2, 2);
		player.worldObj.setBlock(i + 6, j - 4, k - 6, WarsBlocks.hgTele6.blockID, 2, 2);
		player.worldObj.setBlock(i - 6, j - 4, k + 6, WarsBlocks.hgTele7.blockID, 2, 2);
		player.worldObj.setBlock(i - 6, j - 4, k - 6, WarsBlocks.hgTele8.blockID, 2, 2);

		player.worldObj.setBlock(i + 6, j + 15, k + 0, WarsBlocks.hgTele1.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j + 15, k + 6, WarsBlocks.hgTele2.blockID, 2, 2);
		player.worldObj.setBlock(i - 6, j + 15, k + 0, WarsBlocks.hgTele3.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j + 15, k - 6, WarsBlocks.hgTele4.blockID, 2, 2);
		player.worldObj.setBlock(i + 4, j + 15, k + 4, WarsBlocks.hgTele5.blockID, 2, 2);
		player.worldObj.setBlock(i + 4, j + 15, k - 4, WarsBlocks.hgTele6.blockID, 2, 2);
		player.worldObj.setBlock(i - 4, j + 15, k + 4, WarsBlocks.hgTele7.blockID, 2, 2);
		player.worldObj.setBlock(i - 4, j + 15, k - 4, WarsBlocks.hgTele8.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j + 15, k - 0, WarsBlocks.hgTeleMain.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 1, k + 7, WarsBlocks.hgLv1start.blockID, 2, 2);
	}

}
