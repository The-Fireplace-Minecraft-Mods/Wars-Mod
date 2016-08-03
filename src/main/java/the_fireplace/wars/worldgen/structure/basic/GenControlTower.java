package the_fireplace.wars.worldgen.structure.basic;

import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

public class GenControlTower {

	ResinresinLoader controlMain = new ResinresinLoader("controlMain.resinresin");

	public GenControlTower(EntityPlayer player, int i, int j, int k) {
		controlMain.generate(player.worldObj, i + -1, j, k + -1, true);
		{
			WarsMod.generateBlock(player.worldObj, i, j, k, Blocks.planks);
			WarsMod.generateBlock(player.worldObj, i + -1, j, k, WarsBlocks.controlYellow);
			WarsMod.generateBlock(player.worldObj, i + 1, j, k, WarsBlocks.controlBlue);
			WarsMod.generateBlock(player.worldObj, i, j, k + -1, WarsBlocks.controlRed);
			WarsMod.generateBlock(player.worldObj, i, j, k + 1, WarsBlocks.controlGreen);
		}

		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(player.worldObj, i, j, k);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			player.worldObj.spawnEntityInWorld(entityLightningBolt);

		}
	}

}
