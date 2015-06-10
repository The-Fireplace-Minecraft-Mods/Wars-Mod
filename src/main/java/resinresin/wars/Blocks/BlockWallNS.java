package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class BlockWallNS extends BlockStairs {

	public BlockWallNS(Block par2Block, int par3) {
		super(par2Block, par3);

		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader wallNS = new resinresinLoader("wall0.resinresin");
	resinresinLoader wallWE = new resinresinLoader("wall90.resinresin");

	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
		return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
	}

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		if (isBlockStairsDirection(par1World, i, j, k, 2) || isBlockStairsDirection(par1World, i, j, k, 3)) {
			wallNS.generate(par1World, i - 2, j - 0, k - 4, true);
		}
		if (isBlockStairsDirection(par1World, i, j, k, 0) || isBlockStairsDirection(par1World, i, j, k, 1)) {

			wallWE.generate(par1World, i - 4, j - 0, k - 2, true);
		}

		return blockConstructorCalled;
	}
}
