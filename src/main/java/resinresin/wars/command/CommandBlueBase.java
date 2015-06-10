package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import resinresin.wars.data.WarsSavedData;

public class CommandBlueBase extends CommandBase {

	@Override
	public String getCommandName() {
		return "setBlueBase"; // Name of the command e.g "/Test", "/Command"
	}

	public int getRequiBluePermissionLevel() {
		return 4;
	}


	@Override
	public void processCommand(ICommandSender var1, String[] var2) {

		EntityPlayer player1 = (EntityPlayer) var1;
		WarsSavedData savedData = WarsSavedData.get(player1.worldObj);

		if (var1 instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) var1;

			savedData.teamBlue.baseX = (int) player.posX;
			savedData.teamBlue.baseY = (int) player.posY;
			savedData.teamBlue.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Blue Team Base Set To: " + savedData.teamBlue.baseX + " " + savedData.teamBlue.baseY + " " + savedData.teamBlue.baseZ));

		}

	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}


	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}