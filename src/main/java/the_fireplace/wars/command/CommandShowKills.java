package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;

public class CommandShowKills extends CommandBase {

	@Override
	public String getName() {
		return "showkills";
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 4;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		EntityPlayer player = null;
		if(args.length <= 0)
			throw new WrongUsageException(getUsage(sender));
		for (EntityPlayerMP playerMP : server.getPlayerList().getPlayers()) {
			if(playerMP.getDisplayNameString().equals(args[0])){
				player = playerMP;
				break;
			}
		}
		if(player == null){
			sender.sendMessage(new TextComponentTranslation("command.showkills.notfound", args[0]));
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
		sender.sendMessage(new TextComponentTranslation("command.showkills.streak", player.getDisplayNameString(), killstreak));
		sender.sendMessage(new TextComponentTranslation("command.showkills.kdr", player.getDisplayNameString(), kdr, totalKills, deaths));
	}

	@Override
	public String getUsage(ICommandSender icommandsender) {
		return "/showkills <playername>";
	}
}