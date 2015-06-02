package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet;
import resinresin.wars.WarsMod;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class CommandTotalKills extends CommandBase {

	@Override
	public String getCommandName() {
		return "unlockall"; // Name of the command e.g "/Test", "/Command"
	}

    @Override
    public int compareTo(Object o) {
        return 0;
    }


	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		EntityPlayer player = (EntityPlayer) var1;

		player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", 400);

		int warsmod_totalKill = ((EntityPlayer) var1).getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

		warsmod_totalKill = 1000;

		((EntityPlayer) var1).getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", warsmod_totalKill);

		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeInt(warsmod_totalKill);
		Packet packet = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 3, out.toByteArray());
		PacketDispatcher.sendPacketToPlayer(packet, (Player) player);

	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		// TODO Auto-generated method stub
		return null;
	}

}