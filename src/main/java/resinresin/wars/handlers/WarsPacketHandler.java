package resinresin.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet131MapData;
import resinresin.wars.WarsPlayerTracker;
import resinresin.wars.Warsmod;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.ITinyPacketHandler;

public class WarsPacketHandler implements ITinyPacketHandler {

	public int redPlayers = 0;
	public int greenPlayers = 0;
	public int bluePlayers = 0;
	public int yellowPlayers = 0;

	@Override
	public void handle(NetHandler handler, Packet131MapData mapData) {
		ByteArrayDataInput in = ByteStreams.newDataInput(mapData.itemData);
		EntityPlayer player = handler.getPlayer();

		switch (mapData.uniqueID) { // this is your PACKET_ID from above
		case 0:
			int killstreak = in.readInt();
			Warsmod.proxy.handleKillstreak(killstreak);

			break;
		case 1:
			int classSelected = in.readUnsignedByte();
			new ClassSelected(player, classSelected);
			break;

		case 3:
			int warsmod_totalKill = in.readInt();
			Warsmod.proxy.handleTotalKill(warsmod_totalKill);

			break;
		case 4:
			new DonatorClassSelected(player);

			break;
		case 5:
			int teamSelected = in.readUnsignedByte();
			new TeamSelected(player, teamSelected, redPlayers, greenPlayers, bluePlayers, yellowPlayers);

			break;
		case 6:
			redPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleRedPlayers(redPlayers);

			break;
		case 7:
			greenPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleGreenPlayers(greenPlayers);

			break;
		case 8:
			bluePlayers = in.readUnsignedByte();
			Warsmod.proxy.handleBluePlayers(bluePlayers);

			break;
		case 9:
			yellowPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleYellowPlayers(yellowPlayers);

			break;
		case 10:
			EntityPlayer player3 = handler.getPlayer();
			player3.openGui(Warsmod.instance, 3, player3.worldObj, 0, 0, 0);

			break;
		case 11:
			int button = in.readUnsignedByte();
			int i = in.readInt();
			int j = in.readInt();
			int k = in.readInt();
			int type = 1;
			new StructureSpawning(player, type, button, i, j, k);

			break;
		case 12:
			int button1 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 2;
			new StructureSpawning(player, type, button1, i, j, k);

			break;
		case 13:
			int button2 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 3;
			new StructureSpawning(player, type, button2, i, j, k);

			break;
		case 14:
			int button3 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 4;
			new StructureSpawning(player, type, button3, i, j, k);

			break;
		case 15:
			WarsPlayerTracker.sendPlayerPackets(player);

			break;
		case 16:
			Warsmod.proxy.closeOpenGui();

			break;
			
			
		}
		
	}

}
