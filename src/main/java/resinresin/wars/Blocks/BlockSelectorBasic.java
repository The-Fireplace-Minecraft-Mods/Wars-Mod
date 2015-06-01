package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.tileentities.TileEntityClassSelect;

public class BlockSelectorBasic extends BlockContainer {

	public BlockSelectorBasic() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public int idDropped(int i, Random random, int j) {
		return WarsItems.ancientGem.itemID;
	}

	public int quantityDropped(Random random) {
		return 1;

	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(warsmod.instance, 1, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityClassSelect();
	}

}