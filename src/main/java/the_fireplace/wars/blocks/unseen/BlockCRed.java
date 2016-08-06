package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class BlockCRed extends Block {

	public BlockCRed() {
		super(Material.iron);
	}

	ResinresinLoader controlRed = new ResinresinLoader("controlRed.resinresin");

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		controlRed.generate(world, i + -1, j, k, true);
		{
			WarsMod.generateBlock(world, i + -1, j, k + 1, WarsBlocks.controlYellow);
			WarsMod.generateBlock(world, i + 1, j, k + 1, WarsBlocks.controlBlue);
			WarsMod.generateBlock(world, i, j, k, WarsBlocks.controlRed);
			WarsMod.generateBlock(world, i, j, k + 2, WarsBlocks.controlGreen);
		}
		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(world, maxX, maxX, maxX);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			world.spawnEntityInWorld(entityLightningBolt);
		}
		return false;
	}
}