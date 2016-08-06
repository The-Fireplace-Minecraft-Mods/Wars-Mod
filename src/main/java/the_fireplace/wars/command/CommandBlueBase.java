package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.data.WarsSavedData;

public class CommandBlueBase extends CommandBase {

	@Override
	public String getName() {
		return "setBlueBase"; // Name of the command e.g "/Test", "/Command"
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

			savedData.teamBlue.baseX = (int) player.posX;
			savedData.teamBlue.baseY = (int) player.posY;
			savedData.teamBlue.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Blue Team Base Set To: " + savedData.teamBlue.baseX + ", " + savedData.teamBlue.baseY + ", " + savedData.teamBlue.baseZ));
		}
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/setBlueBase";
	}
}