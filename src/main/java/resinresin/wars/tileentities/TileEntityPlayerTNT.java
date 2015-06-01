package resinresin.wars.tileentities;

import net.minecraft.tileentity.TileEntity;
import resinresin.wars.entities.EntityPTNTPrimed;

public class TileEntityPlayerTNT extends TileEntity {

	private static final int TICKS_IN_5_SECONDS = 45; // figure that out

	public int tickCount = 0;

	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
			tickCount++;

			if (tickCount == TICKS_IN_5_SECONDS) {
				if (!worldObj.isRemote) {

					EntityPTNTPrimed var6 = new EntityPTNTPrimed(worldObj, (double) ((float) xCoord + 0.5F), (double) ((float) yCoord + 0.5F), (double) ((float) zCoord + 0.5F));
					worldObj.spawnEntityInWorld(var6);
					worldObj.playSoundAtEntity(var6, "random.fuse", 1.0F, 1.0F);
					worldObj.setBlock(xCoord, yCoord, zCoord, 0, 2, 2);
				}
			}

		}
	}
}
