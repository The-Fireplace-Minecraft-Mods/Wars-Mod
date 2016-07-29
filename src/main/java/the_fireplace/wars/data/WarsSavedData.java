package the_fireplace.wars.data;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class WarsSavedData extends WorldSavedData {

	private static final String wars = "warsmod";

	public WarsSavedData() {
		super(wars);
	}

	public WarsSavedData(String wars) {
		super(wars);
	}

	public final Team teamRed = new Team();
	public final Team teamGreen = new Team();
	public final Team teamBlue = new Team();
	public final Team teamYellow = new Team();

	public final Team teamChaos = new Team();

	public final OtherData editMode = new OtherData();

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		teamRed.readFromNBT(nbttagcompound.getCompoundTag("teamRed"));
		teamBlue.readFromNBT(nbttagcompound.getCompoundTag("teamBlue"));
		teamGreen.readFromNBT(nbttagcompound.getCompoundTag("teamGreen"));
		teamYellow.readFromNBT(nbttagcompound.getCompoundTag("teamYellow"));

		teamChaos.readFromNBT(nbttagcompound.getCompoundTag("teamChaos"));
		editMode.readFromNBT(nbttagcompound.getCompoundTag("editMode"));
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setTag("teamRed", teamRed.writeToNBT(new NBTTagCompound()));
		nbttagcompound.setTag("teamBlue", teamBlue.writeToNBT(new NBTTagCompound()));
		nbttagcompound.setTag("teamGreen", teamGreen.writeToNBT(new NBTTagCompound()));
		nbttagcompound.setTag("teamYellow", teamYellow.writeToNBT(new NBTTagCompound()));

		nbttagcompound.setTag("teamChaos", teamChaos.writeToNBT(new NBTTagCompound()));

		nbttagcompound.setTag("editMode", editMode.writeToNBT(new NBTTagCompound()));

	}

	public static WarsSavedData get(World world) {
		WarsSavedData warsdata = (WarsSavedData) world.loadItemData(WarsSavedData.class, wars);
		if (warsdata == null) {
			warsdata = new WarsSavedData();
			world.setItemData(wars, warsdata);
		}
		return warsdata;
	}

}
