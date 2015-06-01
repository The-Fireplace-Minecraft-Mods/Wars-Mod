package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenMazerace {

	public GenMazerace(EntityPlayer player, int i, int j, int k) {
		resinresinLoader mazeRace = new resinresinLoader("mazeRace.resinresin");

		mazeRace.generate(player.worldObj, i - 21, j - 4, k - 19, true);
		warsmod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.air);
		warsmod.generateBlock(player.worldObj, i + 0, j + 4, k + 0, WarsBlocks.mazeStart);
		warsmod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.wooden_slab);
		warsmod.generateBlock(player.worldObj, i - 8, j - 1, k + 4, Blocks.glass);
	}

}
