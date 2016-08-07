package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.WarsMod;

public class PacketTeams implements IMessage {
    
	private int redPlayers;
	private int greenPlayers;
	private int bluePlayers;
	private int yellowPlayers;

    private String separator = "n";

    public PacketTeams() { }

    public PacketTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
        this.redPlayers = redPlayers;
        this.greenPlayers = greenPlayers;
        this.bluePlayers = bluePlayers;
        this.yellowPlayers = yellowPlayers;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        String basic = ByteBufUtils.readUTF8String(buf);
        String[] values = basic.split(separator);

        redPlayers = Integer.parseInt(values[0]);
        greenPlayers = Integer.parseInt(values[1]);
        bluePlayers = Integer.parseInt(values[2]);
        yellowPlayers = Integer.parseInt(values[3]);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        String string = String.valueOf(redPlayers)+separator+
                        String.valueOf(greenPlayers)+separator+
                        String.valueOf(bluePlayers)+separator+
                        String.valueOf(yellowPlayers);

        ByteBufUtils.writeUTF8String(buf, string);
    }

    public static class Handler extends AbstractClientMessageHandler<PacketTeams> {
        
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketTeams message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", "Red: "+message.redPlayers+" Blue: "+message.bluePlayers+" Yellow: "+message.yellowPlayers+" Green: "+message.greenPlayers, player.getDisplayName().getUnformattedText()));
			
            WarsMod.proxy.handleTeams(message.redPlayers, message.greenPlayers, message.bluePlayers, message.yellowPlayers);

            return null;
        }
    }
}
