package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenKnightHut {

	public GenKnightHut(EntityPlayer player, int i, int j, int k) {
		resinresinLoader knightHut = new resinresinLoader("knightHut.resinresin");

		WarsMod.generateBlock(player.worldObj, i + 2, j + 1, k + 2, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 1, k + 2, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 1, k - 4, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 1, k - 4, Blocks.stone);
		knightHut.generate(player.worldObj, i + -5, j - 1, k + -5, false);
	}

}
