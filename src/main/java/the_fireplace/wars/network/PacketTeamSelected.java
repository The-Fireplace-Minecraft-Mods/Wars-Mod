package the_fireplace.wars.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.TeamSelected;

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

    public static class Handler extends AbstractServerMessageHandler<PacketTeamSelected> {
        
        @Override
        public IMessage handleServerMessage(EntityPlayer player, PacketTeamSelected message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.teamSelected, player.getDisplayName()));
			
            new TeamSelected(player, message.teamSelected);
            
            return null; // no response in this case
        }
    }
}
