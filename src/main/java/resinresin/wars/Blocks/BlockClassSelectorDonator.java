package resinresin.wars.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.tileentities.TileEntityClassSelectDonator;

public class BlockClassSelectorDonator extends BlockContainer {

	public BlockClassSelectorDonator() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(warsmod.instance, 2, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityClassSelectDonator();
	}

}