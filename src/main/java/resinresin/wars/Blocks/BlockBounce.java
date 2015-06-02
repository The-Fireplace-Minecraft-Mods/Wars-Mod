package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;

public class BlockBounce extends Block {

	public BlockBounce() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityLivingBase) {
			entity.motionY += 2.0;

		}
	}

}
