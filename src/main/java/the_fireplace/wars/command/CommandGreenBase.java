package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.data.WarsSavedData;

public class CommandGreenBase extends CommandBase {

	@Override
	public String getName() {
		return "setGreenBase";
	}
	
	@Override
	public int getRequiredPermissionLevel() {
		return 4;
	}


	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;
			WarsSavedData savedData = WarsSavedData.get(player.worldObj);

			savedData.teamGreen.baseX = (int) player.posX;
			savedData.teamGreen.baseY = (int) player.posY;
			savedData.teamGreen.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Green Team Base Set To: " + savedData.teamGreen.baseX + ", " + savedData.teamGreen.baseY + ", " + savedData.teamGreen.baseZ));
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/setGreenBase";
	}
}