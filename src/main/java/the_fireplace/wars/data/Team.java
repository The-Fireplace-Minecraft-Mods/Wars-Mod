package the_fireplace.wars.data;

import net.minecraft.nbt.NBTTagCompound;

public class Team {

	public int baseX = 0;
	public int baseY = 0;
	public int baseZ = 0;

	public void readFromNBT(NBTTagCompound nbttagcompound) {
		// TODO Auto-generated method stub
		baseX = nbttagcompound.getInteger("baseX");
		baseY = nbttagcompound.getInteger("baseY");
		baseZ = nbttagcompound.getInteger("baseZ");
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setInteger("baseX", baseX);
		nbttagcompound.setInteger("baseY", baseY);
		nbttagcompound.setInteger("baseZ", baseZ);

		return nbttagcompound;

	}

}
