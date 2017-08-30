package the_fireplace.wars.worldgen.structure.basic;

import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

public class GenGlassDome {
	ResinresinLoader hunDome = new ResinresinLoader("hunDome.resinresin");

	public GenGlassDome(EntityPlayer player, int i, int j, int k) {
		hunDome.generate(player.world, i + -110, j - 80, k + -110, false);
		WarsMod.generateBlock(player.world, i, j, k, Blocks.AIR);

	}

}
