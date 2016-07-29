package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;

public class BlockSinkSand extends Block {

	public BlockSinkSand() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityLivingBase) {
			entity.setInWeb();

			if (entity.posY == pos.getY() - 1) {
				entity.attackEntityFrom(DamageSource.inWall, 1.0F);
			}
		}
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(World par1World, BlockPos pos , IBlockState state) {
		return null;
	}

}
