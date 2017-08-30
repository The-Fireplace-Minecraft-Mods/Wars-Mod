package the_fireplace.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenKnightHut {

	public GenKnightHut(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader knightHut = new ResinresinLoader("knightHut.resinresin");

		WarsMod.generateBlock(player.world, i + 2, j + 1, k + 2, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 2, j + 1, k + 2, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 2, j + 1, k - 4, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 2, j + 1, k - 4, Blocks.STONE);
		knightHut.generate(player.world, i + -5, j - 1, k + -5, false);
	}

}
