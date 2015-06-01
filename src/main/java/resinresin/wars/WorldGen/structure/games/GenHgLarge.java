package resinresin.wars.WorldGen.structure.games;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenHgLarge {

	public GenHgLarge(EntityPlayer player, int i, int j, int k) {
		resinresinLoader hgL = new resinresinLoader("hgL.resinresin");

		hgL.generate(player.worldObj, i - 21, j - 6, k - 22, false);

		// main
		player.worldObj.setBlock(i + 0, j + 27, k + 0, WarsBlocks.hgTelebM.blockID, 2, 2);
		// sides
		player.worldObj.setBlock(i + 9, j + 27, k + 0, WarsBlocks.hgTeleb1.blockID, 2, 2);
		player.worldObj.setBlock(i - 9, j + 27, k + 0, WarsBlocks.hgTeleb2.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j + 27, k + 9, WarsBlocks.hgTeleb3.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j + 27, k - 9, WarsBlocks.hgTeleb4.blockID, 2, 2);
		// right/left of side
		player.worldObj.setBlock(i + 9, j + 27, k + 2, WarsBlocks.hgTeleb5.blockID, 2, 2);
		player.worldObj.setBlock(i + 9, j + 27, k - 2, WarsBlocks.hgTeleb6.blockID, 2, 2);
		player.worldObj.setBlock(i - 9, j + 27, k + 2, WarsBlocks.hgTeleb7.blockID, 2, 2);
		player.worldObj.setBlock(i - 9, j + 27, k - 2, WarsBlocks.hgTeleb8.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 27, k + 9, WarsBlocks.hgTeleb9.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 27, k + 9, WarsBlocks.hgTeleb10.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 27, k - 9, WarsBlocks.hgTeleb11.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 27, k - 9, WarsBlocks.hgTeleb12.blockID, 2, 2);
		// corner
		player.worldObj.setBlock(i + 6, j + 27, k + 6, WarsBlocks.hgTeleb13.blockID, 2, 2);
		player.worldObj.setBlock(i + 6, j + 27, k - 6, WarsBlocks.hgTeleb14.blockID, 2, 2);
		player.worldObj.setBlock(i - 6, j + 27, k + 6, WarsBlocks.hgTeleb15.blockID, 2, 2);
		player.worldObj.setBlock(i - 6, j + 27, k - 6, WarsBlocks.hgTeleb16.blockID, 2, 2);
		// off centre
		player.worldObj.setBlock(i + 8, j + 27, k + 4, WarsBlocks.hgTeleb17.blockID, 2, 2);
		player.worldObj.setBlock(i - 8, j + 27, k + 4, WarsBlocks.hgTeleb18.blockID, 2, 2);
		player.worldObj.setBlock(i + 4, j + 27, k + 8, WarsBlocks.hgTeleb19.blockID, 2, 2);
		player.worldObj.setBlock(i + 4, j + 27, k - 8, WarsBlocks.hgTeleb20.blockID, 2, 2);
		player.worldObj.setBlock(i + 8, j + 27, k - 4, WarsBlocks.hgTeleb21.blockID, 2, 2);
		player.worldObj.setBlock(i - 8, j + 27, k - 4, WarsBlocks.hgTeleb22.blockID, 2, 2);
		player.worldObj.setBlock(i - 4, j + 27, k + 8, WarsBlocks.hgTeleb23.blockID, 2, 2);
		player.worldObj.setBlock(i - 4, j + 27, k - 8, WarsBlocks.hgTeleb24.blockID, 2, 2);

		player.worldObj.setBlock(i - 7, j + 27, k + 5, Block.glass.blockID, 2, 2);

		player.worldObj.setBlock(i + 20, j - 2, k + 0, WarsBlocks.hgTeleb1.blockID, 2, 2);
		player.worldObj.setBlock(i - 20, j - 2, k + 0, WarsBlocks.hgTeleb2.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 2, k + 20, WarsBlocks.hgTeleb3.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 2, k - 20, WarsBlocks.hgTeleb4.blockID, 2, 2);
		// right/left of side
		player.worldObj.setBlock(i + 19, j - 2, k + 5, WarsBlocks.hgTeleb5.blockID, 2, 2);
		player.worldObj.setBlock(i + 19, j - 2, k - 5, WarsBlocks.hgTeleb6.blockID, 2, 2);
		player.worldObj.setBlock(i - 19, j - 2, k + 5, WarsBlocks.hgTeleb7.blockID, 2, 2);
		player.worldObj.setBlock(i - 19, j - 2, k - 5, WarsBlocks.hgTeleb8.blockID, 2, 2);
		player.worldObj.setBlock(i + 5, j - 2, k + 19, WarsBlocks.hgTeleb9.blockID, 2, 2);
		player.worldObj.setBlock(i - 5, j - 2, k + 19, WarsBlocks.hgTeleb10.blockID, 2, 2);
		player.worldObj.setBlock(i + 5, j - 2, k - 19, WarsBlocks.hgTeleb11.blockID, 2, 2);
		player.worldObj.setBlock(i - 5, j - 2, k - 19, WarsBlocks.hgTeleb12.blockID, 2, 2);
		// corner
		player.worldObj.setBlock(i + 14, j - 2, k + 14, WarsBlocks.hgTeleb13.blockID, 2, 2);
		player.worldObj.setBlock(i + 14, j - 2, k - 14, WarsBlocks.hgTeleb14.blockID, 2, 2);
		player.worldObj.setBlock(i - 14, j - 2, k + 14, WarsBlocks.hgTeleb15.blockID, 2, 2);
		player.worldObj.setBlock(i - 14, j - 2, k - 14, WarsBlocks.hgTeleb16.blockID, 2, 2);
		// off centre
		player.worldObj.setBlock(i + 17, j - 2, k + 10, WarsBlocks.hgTeleb17.blockID, 2, 2);
		player.worldObj.setBlock(i - 17, j - 2, k + 10, WarsBlocks.hgTeleb18.blockID, 2, 2);
		player.worldObj.setBlock(i + 10, j - 2, k + 17, WarsBlocks.hgTeleb19.blockID, 2, 2);
		player.worldObj.setBlock(i + 10, j - 2, k - 17, WarsBlocks.hgTeleb20.blockID, 2, 2);
		player.worldObj.setBlock(i + 17, j - 2, k - 10, WarsBlocks.hgTeleb21.blockID, 2, 2);
		player.worldObj.setBlock(i - 17, j - 2, k - 10, WarsBlocks.hgTeleb22.blockID, 2, 2);
		player.worldObj.setBlock(i - 10, j - 2, k + 17, WarsBlocks.hgTeleb23.blockID, 2, 2);
		player.worldObj.setBlock(i - 10, j - 2, k - 17, WarsBlocks.hgTeleb24.blockID, 2, 2);

		player.worldObj.setBlock(i + 19, j - 0, k + 0, WarsBlocks.hgLv2start.blockID, 2, 2);

		player.worldObj.setBlock(i + 1, j + 0, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i - 1, j + 0, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j + 0, k + 1, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j + 0, k - 1, 0, 2, 2);
	}

}
