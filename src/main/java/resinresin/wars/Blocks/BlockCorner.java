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

public class BlockCorner extends BlockStairs {

	public BlockCorner() {
		super();

		setCreativeTab(Warsmod.tabWarsBlocks);

	}

	resinresinLoader corner1 = new resinresinLoader("corner0.resinresin");
	resinresinLoader corner2 = new resinresinLoader("corner90.resinresin");
	resinresinLoader corner3 = new resinresinLoader("corner180.resinresin");
	resinresinLoader corner4 = new resinresinLoader("corner370.resinresin");

	
	@Override
	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, BlockPos pos, int par5) {
		int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
		return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		
		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		if (this.isBlockStairsDirection(world, i, j, k, 1)) {

			corner1.generate(world, i - 7, j - 0, k - 7, true);
			corner1.generate(world, i - 7, j - 0, k - 7, true);
		}
		if (this.isBlockStairsDirection(world, i, j, k, 3)) {

			corner2.generate(world, i - 0, j - 0, k - 7, true);
			corner2.generate(world, i - 0, j - 0, k - 7, true);
		}
		if (this.isBlockStairsDirection(world, i, j, k, 0)) {

			corner3.generate(world, i - 0, j - 0, k - 0, true);
			corner3.generate(world, i - 0, j - 0, k - 0, true);
		}
		if (this.isBlockStairsDirection(world, i, j, k, 2)) {

			corner4.generate(world, i - 7, j - 0, k - 0, true);
			corner4.generate(world, i - 7, j - 0, k - 0, true);
		}

		return false;

	}

	@SideOnly(Side.CLIENT)
	public static Icon iconMain;



}
