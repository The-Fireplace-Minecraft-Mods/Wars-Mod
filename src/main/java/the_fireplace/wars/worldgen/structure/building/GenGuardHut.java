package the_fireplace.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenGuardHut {

	public GenGuardHut(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader guardHut = new ResinresinLoader("guardHut.resinresin");

		guardHut.generate(player.world, i - 2, j - 4, k - 2, true);

	}

}
