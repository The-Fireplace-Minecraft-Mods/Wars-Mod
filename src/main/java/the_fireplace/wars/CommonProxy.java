package the_fireplace.wars;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CommonProxy {

	public void registerRenderInformation() {
		System.out.println("RegisterRenderInfo called");
	}

	public void handleKillData(EntityPlayer player, int totalKills, int killStreak, int deaths) {
		player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", totalKills);
		player.getEntityData().setInteger("warsmod_killstreak", killStreak);
		player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_deaths", deaths);
	}

	public void handleTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
	}

	public void genTag(EntityPlayer player) {

		NBTTagCompound playerNbt = player.getEntityData();
		if (!playerNbt.hasKey(EntityPlayer.PERSISTED_NBT_TAG)) {
			playerNbt.setTag(EntityPlayer.PERSISTED_NBT_TAG, new NBTTagCompound());
		}
	}

    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return ctx.getServerHandler().playerEntity;
    }
}