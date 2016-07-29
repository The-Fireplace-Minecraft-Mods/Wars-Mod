package resinresin.wars.worldgen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.WarsMod;
import resinresin.wars.worldgen.ResinresinLoader;

public class GenWindmill {

	public GenWindmill(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader windmill = new ResinresinLoader("windmill.resinresin");

		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);
		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);

		WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k - 0, Blocks.air);
	}

}
