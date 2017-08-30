package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenChestParkour {

	public GenChestParkour(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader chestParkour = new ResinresinLoader("chestParkour.resinresin");

		chestParkour.generate(player.world, i - 7, j, k - 7, true);
		chestParkour.generate(player.world, i - 7, j, k - 7, true);

	}

}
