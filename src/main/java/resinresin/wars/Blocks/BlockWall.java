package resinresin.wars.Blocks;

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
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockWall extends BlockStairs {

	public BlockWall(IBlockState state) {
		super(state);

		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	resinresinLoader wallNS = new resinresinLoader("wall0.resinresin");
	resinresinLoader wallWE = new resinresinLoader("wall90.resinresin");

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

		return false;

	}

	@SideOnly(Side.CLIENT)
	public static Icon iconMain;

}
