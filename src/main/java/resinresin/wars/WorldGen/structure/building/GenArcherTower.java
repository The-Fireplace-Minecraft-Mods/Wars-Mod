package resinresin.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.worldgen.ResinresinLoader;

public class GenArcherTower {

	public GenArcherTower(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader archerTower = new ResinresinLoader("archerTower.resinresin");

		archerTower.generate(player.worldObj, i + -5, j - 2, k + -5, false);
	}

}
