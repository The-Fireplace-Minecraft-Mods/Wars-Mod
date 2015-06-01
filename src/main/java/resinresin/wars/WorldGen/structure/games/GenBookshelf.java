package resinresin.wars.WorldGen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenBookshelf {

	public GenBookshelf(EntityPlayer player, int i, int j, int k) {
		resinresinLoader bookParkour = new resinresinLoader("bookPak.resinresin");

		bookParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);
		bookParkour.generate(player.worldObj, i - 7, j - 0, k - 7, true);

	}

}
