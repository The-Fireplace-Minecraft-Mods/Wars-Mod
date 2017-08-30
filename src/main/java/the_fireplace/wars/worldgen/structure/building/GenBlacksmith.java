package the_fireplace.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenBlacksmith {

	public GenBlacksmith(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader blacksmith = new ResinresinLoader("blacksmith.resinresin");

		blacksmith.generate(player.world, i - 7, j - 1, k - 7, false);
	}

}
