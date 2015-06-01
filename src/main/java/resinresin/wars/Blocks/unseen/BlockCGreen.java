package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockCGreen extends Block {

	public BlockCGreen() {
		super(Material.iron);
	}

	resinresinLoader controlGreen = new resinresinLoader("controlGreen.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		controlGreen.generate(par1World, i + -1, j - 0, k + -2, true);
		{
			warsmod.generateBlock(par1World, i + -1, j - 0, k + -1, WarsBlocks.controlYellow);
			warsmod.generateBlock(par1World, i + 1, j - 0, k + -1, WarsBlocks.controlBlue);
			warsmod.generateBlock(par1World, i + 0, j - 0, k + -2, WarsBlocks.controlRed);
			warsmod.generateBlock(par1World, i + 0, j - 0, k + 0, WarsBlocks.controlGreen);

		}
		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(par1World, maxX, maxX, maxX);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			par1World.spawnEntityInWorld(entityLightningBolt);

		}
		return false;

	}

}
