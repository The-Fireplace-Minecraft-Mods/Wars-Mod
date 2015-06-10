package resinresin.wars.packet;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import resinresin.wars.handlers.TeamSelected;

public class PacketTeamSelected implements IMessage {
    
    private int teamSelected;

    public PacketTeamSelected() { }

    public PacketTeamSelected(int teamSelected, int totalKills) {
        this.teamSelected = teamSelected;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        teamSelected = ByteBufUtils.readVarInt(buf, teamSelected); // this class is very useful in general for writing more complex objects
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, teamSelected, 128);
    }

    public static class Handler implements IMessageHandler<PacketTeamSelected, IMessage> {
        
        @Override
        public IMessage onMessage(PacketTeamSelected message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.teamSelected, ctx.getServerHandler().playerEntity.getDisplayName()));
			
            new TeamSelected(ctx.getServerHandler().playerEntity, message.teamSelected);
            
            return null; // no response in this case
            
            
        }
    }
}
