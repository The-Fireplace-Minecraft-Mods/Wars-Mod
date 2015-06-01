package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenArcherTower {

	public GenArcherTower(EntityPlayer player, int i, int j, int k) {
		resinresinLoader archerTower = new resinresinLoader("archerTower.resinresin");

		archerTower.generate(player.worldObj, i + -5, j - 2, k + -5, false);
	}

}
