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

		case 1:
			
			//Packet is received from the player to tell server which class they selected on the class selection GUI
			int classSelected = in.readUnsignedByte();
			new ClassSelected(player, classSelected);
			break;

		case 4:
			//Packet is received when player chooses Donator class. Should be combined with the other class select packet
			new DonatorClassSelected(player);

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
