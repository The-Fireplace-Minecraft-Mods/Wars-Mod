package resinresin.wars.WorldGen.structure.basic;

import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

public class GenGlassDome {
	resinresinLoader hunDome = new resinresinLoader("hunDome.resinresin");

	public GenGlassDome(EntityPlayer player, int i, int j, int k) {
		hunDome.generate(player.worldObj, i + -110, j - 80, k + -110, false);
		warsmod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.air);

	}

}
