package the_fireplace.wars.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TileEntityTeleporter extends TileEntity {
	
	
	public int getDistanceTo(int x, int y, int z) {
		int xDist = x - pos.getX();
		int yDist = y - pos.getY();
		int zDist = z - pos.getZ();
		return (int) Math.sqrt(xDist * xDist + yDist * yDist + zDist * zDist);
	}
	
	
}
