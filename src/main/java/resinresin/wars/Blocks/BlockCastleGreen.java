package resinresin.wars.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.tileentities.TileEntityBasicStructures;

public class BlockCastleGreen extends BlockContainer {

	public BlockCastleGreen() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader castleFloor = new resinresinLoader("castleFloor.resinresin");
	resinresinLoader castleBase = new resinresinLoader("castleBase.resinresin");
	resinresinLoader castleCor = new resinresinLoader("castleCor.resinresin");
	resinresinLoader castleStorage = new resinresinLoader("castleStorage.resinresin");
	resinresinLoader castleTop = new resinresinLoader("castleTop.resinresin");

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(warsmod.instance, 4, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBasicStructures();
	}

}
