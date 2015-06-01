package resinresin.wars.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.tileentities.TileEntityGameStructures;

public class BlockSelectorGames extends BlockContainer {

	public BlockSelectorGames() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(warsmod.instance, 7, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGameStructures();
	}

	// resinresinLoader chestParkour = new
	// resinresinLoader("chestParkour.resinresin");
	// public boolean onBlockActivated(World par1World, int i, int j, int k,
	// EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float
	// par9)
	// {
	//
	//
	// chestParkour.generate(par1World, i - 7, j - 0, k - 7, true);
	// chestParkour.generate(par1World, i - 7, j - 0, k - 7, true);
	// return blockConstructorCalled;
	//
	//
	// }

}
