package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.Warsmod;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.tileentities.TileEntityClassSelect;

public class BlockSelectorBasic extends BlockContainer {

	public BlockSelectorBasic() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	@Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
    	return WarsItems.ancientGem;
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;

	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int x = pos.getX();
		int y = pos.getX();
		int z = pos.getX();
		
		TileEntity tile_entity = world.getTileEntity(pos);
		if (tile_entity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(Warsmod.instance, 1, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityClassSelect();
	}

}