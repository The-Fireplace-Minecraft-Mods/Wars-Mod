package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenWindmill {

	public GenWindmill(EntityPlayer player, int i, int j, int k) {
		resinresinLoader windmill = new resinresinLoader("windmill.resinresin");

		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);
		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);

		warsmod.generateBlock(player.worldObj, i + 0, j - 0, k - 0, Blocks.air);
	}

}
