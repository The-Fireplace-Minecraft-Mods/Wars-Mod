package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.ResinresinLoader;

public class GenChestParkour {

	public GenChestParkour(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader chestParkour = new ResinresinLoader("chestParkour.resinresin");

		chestParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);
		chestParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);

	}

}
