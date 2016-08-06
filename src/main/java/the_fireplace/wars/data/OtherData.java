package the_fireplace.wars.data;

import net.minecraft.nbt.NBTTagCompound;

public class OtherData {

	public boolean editModeToggle = true;

	public void readFromNBT(NBTTagCompound nbttagcompound) {
		editModeToggle = nbttagcompound.getBoolean("editModeToggle");
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setBoolean("editModeToggle", editModeToggle);

		return nbttagcompound;
	}
}