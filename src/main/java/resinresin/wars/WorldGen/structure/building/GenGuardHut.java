package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenGuardHut {

	public GenGuardHut(EntityPlayer player, int i, int j, int k) {
		resinresinLoader guardHut = new resinresinLoader("guardHut.resinresin");

		guardHut.generate(player.worldObj, i - 2, j - 4, k - 2, true);

	}

}
