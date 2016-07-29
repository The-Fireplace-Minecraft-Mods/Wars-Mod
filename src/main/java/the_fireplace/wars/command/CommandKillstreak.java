package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandKillstreak extends CommandBase {

	@Override
	public String getName() {
		return "mykills"; // Name of the command e.g "/Test", "/Command"
	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
	public int getRequiredPermissionLevel() {
		return 4;
	}


	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {

		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;

			int killForPlayer = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

			player.addChatMessage(new ChatComponentText("" + killForPlayer));

		}

	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}