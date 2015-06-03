package resinresin.wars.packet;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import resinresin.wars.Warsmod;

public class PacketOpenTeamSelect implements IMessage {
    
    private int openTeamSelect;

    public PacketOpenTeamSelect() { }

    public PacketOpenTeamSelect(int openTeamSelect) {
        this.openTeamSelect = openTeamSelect;
        
    }

    @Override
    public void fromBytes(ByteBuf buf) {
       openTeamSelect = ByteBufUtils.readVarInt(buf, openTeamSelect);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, openTeamSelect, 128);
        
    }

    public static class Handler implements IMessageHandler<PacketOpenTeamSelect, IMessage> {
        
        @Override
        public IMessage onMessage(PacketOpenTeamSelect message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.openTeamSelect, ctx.getServerHandler().playerEntity.getDisplayName()));
			
            ctx.getServerHandler().playerEntity.openGui(Warsmod.instance, 3, ctx.getServerHandler().playerEntity.worldObj, 0, 0, 0);
            
            return null; // no response in this case
            
            
        }
    }
}