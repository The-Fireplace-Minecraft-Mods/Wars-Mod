package resinresin.wars.WorldGen.structure.basic;

import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

public class GenControlTower {

	resinresinLoader controlMain = new resinresinLoader("controlMain.resinresin");

	public GenControlTower(EntityPlayer player, int i, int j, int k) {
		controlMain.generate(player.worldObj, i + -1, j - 0, k + -1, true);
		{
			WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.planks);
			WarsMod.generateBlock(player.worldObj, i + -1, j - 0, k + 0, WarsBlocks.controlYellow);
			WarsMod.generateBlock(player.worldObj, i + 1, j - 0, k + 0, WarsBlocks.controlBlue);
			WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k + -1, WarsBlocks.controlRed);
			WarsMod.generateBlock(player.worldObj, i + 0, j - 0, k + 1, WarsBlocks.controlGreen);

		}

		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(player.worldObj, i, j, k);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			player.worldObj.spawnEntityInWorld(entityLightningBolt);

		}
	}

}
