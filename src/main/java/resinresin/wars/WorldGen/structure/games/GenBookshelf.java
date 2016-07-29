package resinresin.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.worldgen.ResinresinLoader;

public class GenBookshelf {

	public GenBookshelf(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader bookParkour = new ResinresinLoader("bookPak.resinresin");

		bookParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);
		bookParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);

	}

}
