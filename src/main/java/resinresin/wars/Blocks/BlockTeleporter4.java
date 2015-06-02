package resinresin.wars.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.tileentities.TileEntityTeleporter;

public class BlockTeleporter4 extends Block {

	public BlockTeleporter4() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			int distance = -1;
			TileEntity foundTileEntity = null;
			TileEntity thisTileEntity = world.getTileEntity(pos);
			for (TileEntity tileEntity : (List<TileEntity>) world.loadedTileEntityList) {
				if (tileEntity != thisTileEntity && world.getBlockId(tileEntity.getPos().getX(), tileEntity.getPos().getX(), tileEntity.getPos().getX()) == blockID) {
					int thisDistance = ((TileEntityTeleporter) tileEntity).getDistanceTo(x, y, z);
					if (thisDistance <= 70000 && (distance < 0 || distance > thisDistance)) {
						foundTileEntity = tileEntity;
						distance = thisDistance;
					}
				}
			}
			if (foundTileEntity != null) {
				world.playSoundAtEntity(player, "mob.endermen.portal", 1, 1);
				player.setPositionAndUpdate(foundTileEntity.xCoord + 0.5, foundTileEntity.yCoord + 1.2, foundTileEntity.zCoord + 0.5);
				world.playSoundAtEntity(player, "mob.endermen.portal", 1, 1);
			}
		}
		return true;
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityTeleporter();
	}

}