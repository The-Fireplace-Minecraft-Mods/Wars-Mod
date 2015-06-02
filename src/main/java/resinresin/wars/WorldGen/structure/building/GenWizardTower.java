package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenWizardTower {

	public GenWizardTower(EntityPlayer player, int i, int j, int k) {
		resinresinLoader wizardTower = new resinresinLoader("wizardTower.resinresin");

		WarsMod.generateBlock(player.worldObj, i + 2, j + 1, k + 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 1, k - 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 7, k + 0, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 7, k + 0, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i - 3, j + 2, k - 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 3, j + 2, k + 1, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 1, j + 2, k - 3, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 2, k - 3, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 3, j + 2, k - 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 2, k + 1, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 4, j + 2, k - 1, Blocks.torch);
		WarsMod.generateBlock(player.worldObj, i + 4, j + 2, k + 1, Blocks.torch);

		WarsMod.generateBlock(player.worldObj, i + 1, j + 2, k + 3, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 2, k + 3, Blocks.stone);
		// break
		WarsMod.generateBlock(player.worldObj, i - 2, j + 7, k - 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 2, j + 7, k + 1, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 1, j + 7, k - 2, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 7, k - 2, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 2, j + 7, k - 1, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i + 2, j + 7, k + 1, Blocks.stone);

		WarsMod.generateBlock(player.worldObj, i + 3, j + 7, k - 1, Blocks.torch);
		WarsMod.generateBlock(player.worldObj, i + 3, j + 7, k + 1, Blocks.torch);

		WarsMod.generateBlock(player.worldObj, i + 1, j + 7, k + 2, Blocks.stone);
		WarsMod.generateBlock(player.worldObj, i - 1, j + 7, k + 2, Blocks.stone);
		wizardTower.generate(player.worldObj, i - 4, j - 1, k - 4, false);

		WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.air);
	}

}
