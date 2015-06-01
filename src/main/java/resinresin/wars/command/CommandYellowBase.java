package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.data.WarsSavedData;

public class CommandYellowBase extends CommandBase {

	@Override
	public String getCommandName() {
		return "setYellowBase"; // Name of the command e.g "/Test", "/Command"
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

			savedData.teamYellow.baseX = (int) player.posX;
			savedData.teamYellow.baseY = (int) player.posY;
			savedData.teamYellow.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage("Yellow Team Base Set To: " + savedData.teamYellow.baseX + " " + savedData.teamYellow.baseY + " " + savedData.teamYellow.baseZ);

		}

	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}