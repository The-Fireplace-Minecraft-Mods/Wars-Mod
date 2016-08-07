package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class CommandShowKills extends CommandBase {

	@Override
	public String getCommandName() {
		return "showkills";
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 4;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		EntityPlayer player = null;
		if(args.length <= 0)
			throw new WrongUsageException(getCommandUsage(sender));
		for (EntityPlayerMP playerMP : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
			if(playerMP.getDisplayNameString().equals(args[0])){
				player = playerMP;
				break;
			}
		}
		if(player == null){
			sender.addChatMessage(new ChatComponentTranslation("command.showkills.notfound", args[0]));
			return;
		}

		int killstreak = player.getEntityData().getInteger("warsmod_killstreak");
		int totalKills = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
		int deaths = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");
		float kdr;
		if(deaths > 0)
			kdr = totalKills / deaths;
		else
			kdr = totalKills;
		sender.addChatMessage(new ChatComponentTranslation("command.showkills.streak", player.getDisplayNameString(), killstreak));
		sender.addChatMessage(new ChatComponentTranslation("command.showkills.kdr", player.getDisplayNameString(), kdr, totalKills, deaths));
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/showkills <playername>";
	}
}