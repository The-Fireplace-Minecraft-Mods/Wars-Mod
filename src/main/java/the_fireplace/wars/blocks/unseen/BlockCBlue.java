package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockCBlue extends Block {

	public BlockCBlue() {
		super(Material.IRON);
		setSoundType(SoundType.CLOTH);
	}

	ResinresinLoader controlBlue = new ResinresinLoader("controlBlue.resinresin");

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		controlBlue.generate(world, i + -2, j, k + -1, true);
		{
			WarsMod.generateBlock(world, i + -2, j, k, WarsBlocks.controlYellow);
			WarsMod.generateBlock(world, i, j, k, WarsBlocks.controlBlue);
			WarsMod.generateBlock(world, i + -1, j, k + -1, WarsBlocks.controlRed);
			WarsMod.generateBlock(world, i + -1, j, k + 1, WarsBlocks.controlGreen);

		}
		{
			EntityLightningBolt entityLightningBolt = new EntityLightningBolt(world, 1, 1, 1, true);
			entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
			world.spawnEntityInWorld(entityLightningBolt);
		}
		return false;

	}

}