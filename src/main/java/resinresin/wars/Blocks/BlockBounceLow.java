package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import resinresin.wars.Warsmod;

public class BlockBounceLow extends Block {

	public BlockBounceLow() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityLivingBase) {
		entity.motionY += 1.0;
		}
	}
}
