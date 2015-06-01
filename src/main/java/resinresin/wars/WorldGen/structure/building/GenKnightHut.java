package resinresin.wars.WorldGen.structure.building;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenKnightHut {

	public GenKnightHut(EntityPlayer player, int i, int j, int k) {
		resinresinLoader knightHut = new resinresinLoader("knightHut.resinresin");

		player.worldObj.setBlock(i + 2, j + 1, k + 2, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 1, k + 2, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 1, k - 4, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 1, k - 4, Block.stone.blockID, 2, 2);
		knightHut.generate(player.worldObj, i + -5, j - 1, k + -5, false);
	}

}
