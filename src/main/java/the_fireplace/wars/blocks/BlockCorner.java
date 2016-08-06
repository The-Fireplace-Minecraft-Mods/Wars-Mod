package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockCorner extends BlockStairs {

	public BlockCorner(IBlockState state) {
		super(state);

		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader corner1 = new ResinresinLoader("corner0.resinresin");
	ResinresinLoader corner2 = new ResinresinLoader("corner90.resinresin");
	ResinresinLoader corner3 = new ResinresinLoader("corner180.resinresin");
	ResinresinLoader corner4 = new ResinresinLoader("corner370.resinresin");

	
	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, BlockPos pos, IBlockState par5) {
		Block i1 = par1IBlockAccess.getBlockState(pos).getBlock();
		return isBlockStairs(i1) && par1IBlockAccess.getBlockState(pos) == par5;
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.corner.getStateFromMeta(1))) {

			corner1.generate(world, i - 7, j, k - 7, true);
			corner1.generate(world, i - 7, j, k - 7, true);
		}
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.corner.getStateFromMeta(3))) {

			corner2.generate(world, i, j, k - 7, true);
			corner2.generate(world, i, j, k - 7, true);
		}
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.corner.getStateFromMeta(0))) {

			corner3.generate(world, i, j, k, true);
			corner3.generate(world, i, j, k, true);
		}
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.corner.getStateFromMeta(2))) {

			corner4.generate(world, i - 7, j, k, true);
			corner4.generate(world, i - 7, j, k, true);
		}

		return false;

	}
}
