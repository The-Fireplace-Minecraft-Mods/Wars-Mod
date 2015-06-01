package resinresin.wars.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.tileentities.TileEntityTeleporter;

public class BlockTeleporter extends Block {

	public BlockTeleporter() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int x = pos.getX();
		int y = pos.getX();
		int z = pos.getX();
		
		if (!world.isRemote) {
			int distance = -1;
			TileEntity foundTileEntity = null;
			TileEntity thisTileEntity = world.getTileEntity(pos);
			for (TileEntity tileEntity : (List<TileEntity>) world.loadedTileEntityList) {
				if (tileEntity != thisTileEntity && world.getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == block) {
					int thisDistance = ((TileEntityTeleporter) tileEntity).getDistanceTo(x, y, z);
					if (thisDistance <= 50000 && (distance < 0 || distance > thisDistance)) {
						foundTileEntity = tileEntity;
						distance = thisDistance;
					}
				}
			}
			if (foundTileEntity != null) {
				world.playSoundAtEntity(player, "mob.endermen.portal", 1, 1);
				player.setPositionAndUpdate(foundTileEntity.xCoord + 0.5, foundTileEntity.yCoord + 1.2, foundTileEntity.zCoord + 0.5);
				player.attackEntityFrom(DamageSource.fall, 3);
				world.playSoundAtEntity(player, "mob.endermen.portal", 1, 1);
			}
		}
		return true;
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityTeleporter();
	}

}