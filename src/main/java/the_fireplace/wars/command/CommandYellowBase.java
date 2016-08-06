package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.data.WarsSavedData;

public class CommandYellowBase extends CommandBase {

	@Override
	public String getName() {
		return "setYellowBase"; // Name of the command e.g "/Test", "/Command"
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
			WarsSavedData savedData = WarsSavedData.get(player.worldObj);

			savedData.teamYellow.baseX = (int) player.posX;
			savedData.teamYellow.baseY = (int) player.posY;
			savedData.teamYellow.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Yellow Team Base Set To: " + savedData.teamYellow.baseX + ", " + savedData.teamYellow.baseY + ", " + savedData.teamYellow.baseZ));
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/setYellowBase";
	}
}