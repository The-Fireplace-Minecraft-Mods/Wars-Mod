package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.data.WarsSavedData;

public class CommandEditMode extends CommandBase {

	@Override
	public String getCommandName() {
		return "toggleEditMode";
	}

    @Override
	public int getRequiredPermissionLevel() {
		return 4;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;
			WarsSavedData savedData = WarsSavedData.get(player.worldObj);
			int a = savedData.teamRed.baseX;
			int b = savedData.teamRed.baseY;
			int c = savedData.teamRed.baseZ;

			int d = savedData.teamGreen.baseX;
			int e = savedData.teamGreen.baseY;
			int f = savedData.teamGreen.baseZ;

			int g = savedData.teamBlue.baseX;
			int h = savedData.teamBlue.baseY;
			int i = savedData.teamBlue.baseZ;

			int j = savedData.teamYellow.baseX;
			int k = savedData.teamYellow.baseY;
			int l = savedData.teamYellow.baseZ;

			if (a == 0 && b == 0 && c == 0) {
				player.addChatMessage(new ChatComponentText("Red Base Spawn Not Set!"));
			} else if (d == 0 && e == 0 && f == 0) {
				player.addChatMessage(new ChatComponentText("Green Base Spawn Not Set!"));
			} else if (g == 0 && h == 0 && i == 0) {
				player.addChatMessage(new ChatComponentText("Blue Base Spawn Not Set!"));
			} else if (j == 0 && k == 0 && l == 0) {
				player.addChatMessage(new ChatComponentText("Yellow Base Spawn Not Set!"));
			} else {
				savedData.editMode.editModeToggle = !savedData.editMode.editModeToggle;
				savedData.markDirty();
				player.addChatMessage(new ChatComponentText("Toggled edit mode to: " + savedData.editMode.editModeToggle));
			}
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/toggleEditMode";
	}
}