package resinresin.wars.WorldGen.structure.building;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenWizardTower {

	public GenWizardTower(EntityPlayer player, int i, int j, int k) {
		resinresinLoader wizardTower = new resinresinLoader("wizardTower.resinresin");

		player.worldObj.setBlock(i + 2, j + 1, k + 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 1, k - 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 7, k + 0, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 7, k + 0, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i - 3, j + 2, k - 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 3, j + 2, k + 1, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 1, j + 2, k - 3, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 1, j + 2, k - 3, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 3, j + 2, k - 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i + 3, j + 2, k + 1, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 4, j + 2, k - 1, Block.torchWood.blockID, 2, 2);
		player.worldObj.setBlock(i + 4, j + 2, k + 1, Block.torchWood.blockID, 2, 2);

		player.worldObj.setBlock(i + 1, j + 2, k + 3, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 1, j + 2, k + 3, Block.stone.blockID, 2, 2);
		// break
		player.worldObj.setBlock(i - 2, j + 7, k - 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 2, j + 7, k + 1, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 1, j + 7, k - 2, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 1, j + 7, k - 2, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 2, j + 7, k - 1, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i + 2, j + 7, k + 1, Block.stone.blockID, 2, 2);

		player.worldObj.setBlock(i + 3, j + 7, k - 1, Block.torchWood.blockID, 2, 2);
		player.worldObj.setBlock(i + 3, j + 7, k + 1, Block.torchWood.blockID, 2, 2);

		player.worldObj.setBlock(i + 1, j + 7, k + 2, Block.stone.blockID, 2, 2);
		player.worldObj.setBlock(i - 1, j + 7, k + 2, Block.stone.blockID, 2, 2);
		wizardTower.generate(player.worldObj, i - 4, j - 1, k - 4, false);

		player.worldObj.setBlock(i + 0, j - 0, k + 0, 0, 2, 2);
	}

}
