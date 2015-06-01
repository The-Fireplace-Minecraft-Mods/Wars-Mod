package resinresin.wars.WorldGen.structure.games;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenMazerace {

	public GenMazerace(EntityPlayer player, int i, int j, int k) {
		resinresinLoader mazeRace = new resinresinLoader("mazeRace.resinresin");

		mazeRace.generate(player.worldObj, i - 21, j - 4, k - 19, true);
		player.worldObj.setBlock(i + 0, j - 0, k + 0, 0, 2, 2);
		player.worldObj.setBlock(i + 0, j + 4, k + 0, WarsBlocks.mazeStart.blockID, 2, 2);
		player.worldObj.setBlock(i + 0, j - 0, k + 0, Block.woodSingleSlab.blockID, 2, 2);
		player.worldObj.setBlock(i - 8, j - 1, k + 4, Block.glass.blockID, 2, 2);
	}

}
