package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.data.WarsSavedData;

public class CommandChaosSpawn extends CommandBase {

	@Override
	public String getCommandName() {
		return "setChaosSpawn"; // Name of the command e.g "/Test", "/Command"
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {

		EntityPlayer player1 = (EntityPlayer) var1;
		WarsSavedData savedData = WarsSavedData.get(player1.worldObj);

		if (var1 instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) var1;

			savedData.teamChaos.baseX = (int) player.posX;
			savedData.teamChaos.baseY = (int) player.posY;
			savedData.teamChaos.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage("Chaos Base Set To: " + savedData.teamChaos.baseX + " " + savedData.teamChaos.baseY + " " + savedData.teamChaos.baseZ);

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