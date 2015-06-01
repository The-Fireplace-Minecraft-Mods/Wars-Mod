package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandKillstreak extends CommandBase {

	@Override
	public String getCommandName() {
		return "mykills"; // Name of the command e.g "/Test", "/Command"
	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }


	@Override
	public void processCommand(ICommandSender var1, String[] var2) {

		if (var1 instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) var1;

			int killForPlayer = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

			player.addChatMessage("" + killForPlayer);

		}

	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}