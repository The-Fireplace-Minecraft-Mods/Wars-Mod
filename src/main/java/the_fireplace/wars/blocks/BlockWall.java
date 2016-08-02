package the_fireplace.wars.blocks;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class BlockWall extends BlockStairs {

	public BlockWall(IBlockState state) {
		super(state);

		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader wallNS = new ResinresinLoader("wall0.resinresin");
	ResinresinLoader wallWE = new ResinresinLoader("wall90.resinresin");

	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, BlockPos pos, IBlockState par5) {
		Block i1 = par1IBlockAccess.getBlockState(pos).getBlock();
		return isBlockStairs(i1) && par1IBlockAccess.getBlockState(pos) == par5;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(2)) || this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(3))) {
			wallNS.generate(world, i - 2, j - 0, k - 4, true);
		}
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(0)) || this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(1))) {

			wallWE.generate(world, i - 4, j - 0, k - 2, true);
		}

		return true;

	}

	@SideOnly(Side.CLIENT)
	public static Icon iconMain;

}
