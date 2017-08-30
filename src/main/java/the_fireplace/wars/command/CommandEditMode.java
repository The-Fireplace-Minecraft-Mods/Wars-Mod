package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;
import the_fireplace.wars.data.WarsSavedData;

public class CommandEditMode extends CommandBase {

	@Override
	public String getName() {
		return "toggleEditMode";
	}

    @Override
	public int getRequiredPermissionLevel() {
		return 4;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
			WarsSavedData savedData = WarsSavedData.get(sender.getEntityWorld());
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

			int m = savedData.teamChaos.baseX;
			int n = savedData.teamChaos.baseY;
			int o = savedData.teamChaos.baseZ;

			boolean flag = false;

			if (a == 0 && b == 0 && c == 0) {
				sender.sendMessage(new TextComponentTranslation("command.edit.rednotset"));
				flag = true;
			}
			if (d == 0 && e == 0 && f == 0) {
				sender.sendMessage(new TextComponentTranslation("command.edit.greennotset"));
				flag = true;
			}
			if (g == 0 && h == 0 && i == 0) {
				sender.sendMessage(new TextComponentTranslation("command.edit.bluenotset"));
				flag = true;
			}
			if (j == 0 && k == 0 && l == 0) {
				sender.sendMessage(new TextComponentTranslation("command.edit.yellownotset"));
				flag = true;
			}
			if (m == 0 && n == 0 && o == 0) {
				sender.sendMessage(new TextComponentTranslation("command.edit.chaosnotset"));
				flag = true;
			}
			if(flag && savedData.editMode.editModeToggle){
				sender.sendMessage(new TextComponentTranslation("command.edit.setpoints"));
			}

			if(!flag || !savedData.editMode.editModeToggle){
				savedData.editMode.editModeToggle = !savedData.editMode.editModeToggle;
				savedData.markDirty();
				if(savedData.editMode.editModeToggle)
					sender.sendMessage(new TextComponentTranslation("command.edit.enabled"));
				else
					sender.sendMessage(new TextComponentTranslation("command.edit.disabled"));
			}
	}

	@Override
	public String getUsage(ICommandSender icommandsender) {
		return "/toggleEditMode";
	}
}