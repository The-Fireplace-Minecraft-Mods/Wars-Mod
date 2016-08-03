package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenBookshelf {

	public GenBookshelf(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader bookParkour = new ResinresinLoader("bookPak.resinresin");

		bookParkour.generate(player.worldObj, i - 7, j, k - 7, true);
		bookParkour.generate(player.worldObj, i - 7, j, k - 7, true);

	}

}
