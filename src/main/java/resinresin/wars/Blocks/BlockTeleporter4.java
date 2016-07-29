package resinresin.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.tileentities.TileEntityTeleporter;

import java.util.List;

public class BlockTeleporter4 extends Block implements ITileEntityProvider {

	public BlockTeleporter4() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		if (!world.isRemote) {
			int distance = -1;
			TileEntity foundTileEntity = null;
			TileEntity thisTileEntity = world.getTileEntity(pos);
			for (TileEntity tileEntity : (List<TileEntity>) world.loadedTileEntityList) {
				BlockPos position = new BlockPos(tileEntity.getPos().getX(), tileEntity.getPos().getY(), tileEntity.getPos().getZ());
				if (tileEntity != thisTileEntity && world.getBlockState(position).getBlock() == state.getBlock()) {
					int thisDistance = ((TileEntityTeleporter) tileEntity).getDistanceTo(pos.getX(), pos.getY(), pos.getZ());
					if (thisDistance <= 55000 && (distance < 0 || distance > thisDistance)) {
						foundTileEntity = tileEntity;
						distance = thisDistance;
					}
				}
			}
			if (foundTileEntity != null) {
				world.playSoundAtEntity(player, "mob.endermen.portal", 1, 1);
				player.setPositionAndUpdate(foundTileEntity.getPos().getX() + 0.5, foundTileEntity.getPos().getY() + 1.2, foundTileEntity.getPos().getZ() + 0.5);
				player.attackEntityFrom(DamageSource.fall, 2);
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
	public TileEntity createNewTileEntity(World worldIn, int meta) {

		return new TileEntityTeleporter();
	}


}