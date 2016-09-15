package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;
import the_fireplace.wars.data.WarsSavedData;

public class CommandSetBase extends CommandBase {

	@Override
	public String getCommandName() {
		return "setBase";
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 4;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;
			WarsSavedData savedData = WarsSavedData.get(player.worldObj);

			if(args.length > 0){
				if(args[0].toLowerCase().equals("red")) {
					savedData.teamRed.baseX = (int) player.posX;
					savedData.teamRed.baseY = (int) player.posY;
					savedData.teamRed.baseZ = (int) player.posZ;
				}else if(args[0].toLowerCase().equals("green")) {
					savedData.teamGreen.baseX = (int) player.posX;
					savedData.teamGreen.baseY = (int) player.posY;
					savedData.teamGreen.baseZ = (int) player.posZ;
				}else if(args[0].toLowerCase().equals("blue")) {
					savedData.teamBlue.baseX = (int) player.posX;
					savedData.teamBlue.baseY = (int) player.posY;
					savedData.teamBlue.baseZ = (int) player.posZ;
				}else if(args[0].toLowerCase().equals("yellow")) {
					savedData.teamYellow.baseX = (int) player.posX;
					savedData.teamYellow.baseY = (int) player.posY;
					savedData.teamYellow.baseZ = (int) player.posZ;
				}else if(args[0].toLowerCase().equals("chaos")) {
					savedData.teamChaos.baseX = (int) player.posX;
					savedData.teamChaos.baseY = (int) player.posY;
					savedData.teamChaos.baseZ = (int) player.posZ;
				}else
					throw new WrongUsageException(getCommandUsage(sender));
			}else
				throw new WrongUsageException(getCommandUsage(sender));
			savedData.markDirty();
			player.addChatMessage(new TextComponentTranslation("command.setbase."+args[0].toLowerCase(), (int)player.posX, (int)player.posY, (int)player.posZ));
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/setBase <team>";
	}
}