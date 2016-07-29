package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.PacketKills;

public class CommandTotalKills extends CommandBase {

	@Override
	public String getName() {
		return "unlockall"; // Name of the command e.g "/Test", "/Command"
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
		EntityPlayer player = (EntityPlayer) sender;

		player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", 400);

		int warsmod_totalKill = ((EntityPlayer) sender).getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

		warsmod_totalKill = 1000;

		((EntityPlayer) sender).getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", warsmod_totalKill);

		PacketDispatcher.sendTo(new PacketKills(warsmod_totalKill, warsmod_totalKill), (EntityPlayerMP) sender);
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}