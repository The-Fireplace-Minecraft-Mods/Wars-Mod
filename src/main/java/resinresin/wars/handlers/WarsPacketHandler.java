package resinresin.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.Warsmod;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

public class WarsPacketHandler implements ITinyPacketHandler {

	public int redPlayers = 0;
	public int greenPlayers = 0;
	public int bluePlayers = 0;
	public int yellowPlayers = 0;

	@Override
	public void handle(NetHandler handler, Packet131MapData mapData) {
		ByteArrayDataInput in = ByteStreams.newDataInput(mapData.itemData);
		EntityPlayer player = handler.getPlayer();

		switch (mapData.uniqueID) { 
		case 0:
			
			//Packet is used for current amount of kills a player has in this lifetime. it is sent to the player to render on the killstreak HUD
			int killstreak = in.readInt();
			Warsmod.proxy.handleKillstreak(killstreak);

			break;
		case 1:
			
			//Packet is received from the player to tell server which class they selected on the class selection GUI
			int classSelected = in.readUnsignedByte();
			new ClassSelected(player, classSelected);
			break;

		case 3:
			
			//The total number of kills is sent for rendering on the class selector as players need certain amounts of kills for each class
			//Should probably be sent in same packet as killstreak as a KillData packet or something.
			int warsmod_totalKill = in.readInt();
			Warsmod.proxy.handleTotalKill(warsmod_totalKill);

			break;
		case 4:
			//Packet is received when player chooses Donator class. Should be combined with the other class select packet
			new DonatorClassSelected(player);

			break;
		case 5:
			
			//Packet is received when player chooses a team in order to add them to a list of player in that team. 
			int teamSelected = in.readUnsignedByte();
			new TeamSelected(player, teamSelected, redPlayers, greenPlayers, bluePlayers, yellowPlayers);

			break;
		case 6:
			
			//Sends total number of red team player to client for rendering on pie chart showing number of player in each team
			redPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleRedPlayers(redPlayers);

			break;
		case 7:
			
			//Sends total number of green team player to client for rendering on pie chart showing number of player in each team
			greenPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleGreenPlayers(greenPlayers);

			break;
		case 8:
			
			//Sends total number of blue team player to client for rendering on pie chart showing number of player in each team
			bluePlayers = in.readUnsignedByte();
			Warsmod.proxy.handleBluePlayers(bluePlayers);

			break;
		case 9:
			
			//Sends total number of yellow team player to client for rendering on pie chart showing number of player in each team
			yellowPlayers = in.readUnsignedByte();
			Warsmod.proxy.handleYellowPlayers(yellowPlayers);

			break;
		case 10:
			
			//
			
			EntityPlayer player3 = handler.getPlayer();
			player3.openGui(Warsmod.instance, 3, player3.worldObj, 0, 0, 0);

			break;
		case 11:
			
			//Packet received from one of the structure spawn gui's
			int button = in.readUnsignedByte();
			int i = in.readInt();
			int j = in.readInt();
			int k = in.readInt();
			int type = 1;
			new StructureSpawning(player, type, button, i, j, k);

			break;
		case 12:
			
			//Packet received from one of the structure spawn gui's
			int button1 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 2;
			new StructureSpawning(player, type, button1, i, j, k);

			break;
		case 13:
			
			//Packet received from one of the structure spawn gui's
			int button2 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 3;
			new StructureSpawning(player, type, button2, i, j, k);

			break;
		case 14:
			
			//Packet received from one of the structure spawn gui's
			int button3 = in.readUnsignedByte();
			i = in.readInt();
			j = in.readInt();
			k = in.readInt();
			type = 4;
			new StructureSpawning(player, type, button3, i, j, k);

			break;
		case 15:
			
			//I think i used this so the client could request information, for example how many players on each team
			WarsPlayerEventHandler.sendPlayerPackets(player);

			break;
		case 16:
			
			//Close GUI packet
			Warsmod.proxy.closeOpenGui();

			break;
			
			
		}
		
	}

}
