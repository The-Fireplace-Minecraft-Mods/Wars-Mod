package resinresin.wars.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.tileentities.TileEntityBuildingStructures;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class BlockSelectorBuildings extends BlockContainer {

	public BlockSelectorBuildings() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
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
		player.openGui(WarsMod.instance, 6, world, x, y, z);
		return true;
	}

	@Override
	public boolean hasTileEntity() {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityBuildingStructures();
	}

	/* resinresinLoader guardHut = new resinresinLoader("guardHut.resinresin");
	 public boolean onBlockActivated(World par1World, int i, int j, int k,
	 EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float
	 par9)
	 {


	 guardHut.generate(par1World, i - 2, j - 4, k - 2, true);
	 return blockConstructorCalled;


	}*/
}
