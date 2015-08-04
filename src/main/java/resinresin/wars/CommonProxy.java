package resinresin.wars;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class CommonProxy {

	public void registerRenderInformation() {
		System.out.println("RegisterRenderInfo called");
	}

	public void handleKillData(int totalKills, int killStreak) {
	}

	public void handleTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {

	}

	public void closeOpenGui() {
	}

	public void totalKills(EntityPlayer player) {

		NBTTagCompound playerNbt = player.getEntityData();
		if (!playerNbt.hasKey(EntityPlayer.PERSISTED_NBT_TAG)) {
			playerNbt.setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());
		}
		//NBTTagCompound persisted = playerNbt.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		//What was the point of storing that?
	}

	public void redTeamBase(EntityPlayer player) {

	}

}