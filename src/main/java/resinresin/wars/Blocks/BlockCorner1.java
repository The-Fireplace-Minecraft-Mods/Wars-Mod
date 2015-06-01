package resinresin.wars.Blocks;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockCorner1 extends BlockStairs {

	public BlockCorner1(Block par2Block, int par3) {
		super(par2Block, par3);

		setCreativeTab(warsmod.tabWarsBlocks);

	}

	resinresinLoader corner1 = new resinresinLoader("corner0.resinresin");
	resinresinLoader corner2 = new resinresinLoader("corner90.resinresin");
	resinresinLoader corner3 = new resinresinLoader("corner180.resinresin");
	resinresinLoader corner4 = new resinresinLoader("corner370.resinresin");

	
	@Override
	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
		return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
	}

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		if (this.isBlockStairsDirection(par1World, i, j, k, 1)) {

			corner1.generate(par1World, i - 7, j - 0, k - 7, true);
			corner1.generate(par1World, i - 7, j - 0, k - 7, true);
		}
		if (this.isBlockStairsDirection(par1World, i, j, k, 3)) {

			corner2.generate(par1World, i - 0, j - 0, k - 7, true);
			corner2.generate(par1World, i - 0, j - 0, k - 7, true);
		}
		if (this.isBlockStairsDirection(par1World, i, j, k, 0)) {

			corner3.generate(par1World, i - 0, j - 0, k - 0, true);
			corner3.generate(par1World, i - 0, j - 0, k - 0, true);
		}
		if (this.isBlockStairsDirection(par1World, i, j, k, 2)) {

			corner4.generate(par1World, i - 7, j - 0, k - 0, true);
			corner4.generate(par1World, i - 7, j - 0, k - 0, true);
		}

		return false;

	}

	@SideOnly(Side.CLIENT)
	public static Icon iconMain;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) {
		iconMain = icon.registerIcon("warsmod:Wall1");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {

		return iconMain;

	}

}
