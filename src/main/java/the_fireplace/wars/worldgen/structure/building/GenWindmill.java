package the_fireplace.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenWindmill {

	public GenWindmill(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader windmill = new ResinresinLoader("windmill.resinresin");

		windmill.generate(player.world, i - 6, j - 1, k - 8, false);
		windmill.generate(player.world, i - 6, j - 1, k - 8, false);

		WarsMod.generateBlock(player.world, i, j, k, Blocks.AIR);
	}

}
