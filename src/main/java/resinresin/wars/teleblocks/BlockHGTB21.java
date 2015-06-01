package resinresin.wars.teleblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resinresin.wars.tileentities.TileEntityTeleporter;

public class BlockHGTB21 extends Block {

	public BlockHGTB21() {
		super(Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9) {
		if (!world.isRemote) {
			int distance = -1;
			TileEntity foundTileEntity = null;
			TileEntity thisTileEntity = world.getBlockTileEntity(x, y, z);
			for (TileEntity tileEntity : (List<TileEntity>) world.loadedTileEntityList) {
				if (tileEntity != thisTileEntity && world.getBlockId(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == blockID) {
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
			world.setBlock(x + 0, y - 0, z + 0, Block.glowStone.blockID, 2, 2);
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