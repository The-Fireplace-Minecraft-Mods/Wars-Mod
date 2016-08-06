package the_fireplace.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import the_fireplace.wars.data.WarsSavedData;

public class CommandChaosSpawn extends CommandBase {

	@Override
	public String getName() {
		return "setChaosSpawn";
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

			savedData.teamChaos.baseX = (int) player.posX;
			savedData.teamChaos.baseY = (int) player.posY;
			savedData.teamChaos.baseZ = (int) player.posZ;
			savedData.markDirty();
			player.addChatMessage(new ChatComponentText("Chaos Base Set To: " + savedData.teamChaos.baseX + ", " + savedData.teamChaos.baseY + ", " + savedData.teamChaos.baseZ));
		}
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/setChaosSpawn";
	}
}