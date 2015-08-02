package resinresin.wars;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler { 

	public void registerRenderInformation() {
		
		System.out.println("RegisterRenderInfo called");

		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	public void handleKillData(int totalKills, int killStreak) {
	}

	public void handleTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {

	}

	public void closeOpenGui() {
	}

	@SuppressWarnings("unused")
	public void totalKills(EntityPlayer player) {

		NBTTagCompound playerNbt = player.getEntityData();
		if (!playerNbt.hasKey(EntityPlayer.PERSISTED_NBT_TAG)) {
			playerNbt.setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());
		}
		NBTTagCompound persisted = playerNbt.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);

	}

	public void redTeamBase(EntityPlayer player) {

	}

}