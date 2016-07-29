package the_fireplace.wars.network;

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

    public PacketTeams() { }

    public PacketTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
        this.redPlayers = redPlayers;
        this.greenPlayers = greenPlayers;
        this.bluePlayers = bluePlayers;
        this.yellowPlayers = yellowPlayers;
        
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        redPlayers = ByteBufUtils.readVarInt(buf, redPlayers); // this class is very useful in general for writing more complex objects
        greenPlayers = ByteBufUtils.readVarInt(buf, greenPlayers);
        bluePlayers = ByteBufUtils.readVarInt(buf, bluePlayers);
        yellowPlayers = ByteBufUtils.readVarInt(buf, yellowPlayers);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, redPlayers, 128);
        ByteBufUtils.writeVarInt(buf, greenPlayers, 128);
        ByteBufUtils.writeVarInt(buf, bluePlayers, 128);
        ByteBufUtils.writeVarInt(buf, yellowPlayers, 128);
    }

    public static class Handler extends AbstractClientMessageHandler<PacketTeams> {
        
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketTeams message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.redPlayers, player.getDisplayName()));
			
            WarsMod.proxy.handleTeams(message.redPlayers, message.greenPlayers, message.bluePlayers, message.yellowPlayers);

            return null; // no response in this case
        }
    }
}
