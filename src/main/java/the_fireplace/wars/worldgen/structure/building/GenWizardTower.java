package the_fireplace.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenWizardTower {

	public GenWizardTower(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader wizardTower = new ResinresinLoader("wizardTower.resinresin");

		WarsMod.generateBlock(player.world, i + 2, j + 1, k + 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 2, j + 1, k - 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 2, j + 7, k, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 2, j + 7, k, Blocks.STONE);

		WarsMod.generateBlock(player.world, i - 3, j + 2, k - 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 3, j + 2, k + 1, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 1, j + 2, k - 3, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 1, j + 2, k - 3, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 3, j + 2, k - 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 3, j + 2, k + 1, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 4, j + 2, k - 1, Blocks.TORCH);
		WarsMod.generateBlock(player.world, i + 4, j + 2, k + 1, Blocks.TORCH);

		WarsMod.generateBlock(player.world, i + 1, j + 2, k + 3, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 1, j + 2, k + 3, Blocks.STONE);
		// break
		WarsMod.generateBlock(player.world, i - 2, j + 7, k - 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 2, j + 7, k + 1, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 1, j + 7, k - 2, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 1, j + 7, k - 2, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 2, j + 7, k - 1, Blocks.STONE);
		WarsMod.generateBlock(player.world, i + 2, j + 7, k + 1, Blocks.STONE);

		WarsMod.generateBlock(player.world, i + 3, j + 7, k - 1, Blocks.TORCH);
		WarsMod.generateBlock(player.world, i + 3, j + 7, k + 1, Blocks.TORCH);

		WarsMod.generateBlock(player.world, i + 1, j + 7, k + 2, Blocks.STONE);
		WarsMod.generateBlock(player.world, i - 1, j + 7, k + 2, Blocks.STONE);
		wizardTower.generate(player.world, i - 4, j - 1, k - 4, false);

		WarsMod.generateBlock(player.world, i, j, k, Blocks.AIR);
	}

}
