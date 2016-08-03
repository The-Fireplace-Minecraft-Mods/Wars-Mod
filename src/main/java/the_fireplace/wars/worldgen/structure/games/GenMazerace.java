package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class GenMazerace {

	public GenMazerace(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader mazeRace = new ResinresinLoader("mazeRace.resinresin");

		mazeRace.generate(player.worldObj, i - 21, j - 4, k - 19, true);
		WarsMod.generateBlock(player.worldObj, i, j, k, Blocks.air);
		WarsMod.generateBlock(player.worldObj, i, j + 4, k, WarsBlocks.mazeStart);
		WarsMod.generateBlock(player.worldObj, i, j, k, Blocks.wooden_slab);
		WarsMod.generateBlock(player.worldObj, i - 8, j - 1, k + 4, Blocks.glass);
	}

}
