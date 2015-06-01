package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.data.WarsSavedData;

public class CommandEditMode extends CommandBase {

	@Override
	public String getCommandName() {
		return "toggleEditMode"; // Name of the command e.g "/Test", "/Command"
	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
	public void processCommand(ICommandSender var1, String[] var2) {

		EntityPlayer player1 = (EntityPlayer) var1;
		WarsSavedData savedData = WarsSavedData.get(player1.worldObj);

		if (var1 instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) var1;
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
				player.addChatMessage("Red Base Spawn Not Set!");

			} else if (d == 0 && e == 0 && f == 0) {
				player.addChatMessage("Green Base Spawn Not Set!");

			} else if (g == 0 && h == 0 && i == 0) {
				player.addChatMessage("Blue Base Spawn Not Set!");

			} else if (j == 0 && k == 0 && l == 0) {
				player.addChatMessage("Yellow Base Spawn Not Set!");

			}

			else {

				savedData.editMode.editModeToggle = !savedData.editMode.editModeToggle;
				savedData.markDirty();
				player.addChatMessage("Toggled edit mode to: " + savedData.editMode.editModeToggle);

			}

		}

	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}