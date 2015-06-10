package resinresin.wars.packet;

import resinresin.wars.Warsmod;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketKills implements IMessage {
    
    private int killStreak;
    private int totalKills;

    public PacketKills() { }

    public PacketKills(int killStreak, int totalKills) {
        this.killStreak = killStreak;
        this.totalKills = totalKills;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        killStreak = ByteBufUtils.readVarInt(buf, killStreak); // this class is very useful in general for writing more complex objects
        totalKills = ByteBufUtils.readVarInt(buf, totalKills);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, killStreak, 128);
        ByteBufUtils.writeVarInt(buf, totalKills, 128);
    }

    public static class Handler implements IMessageHandler<PacketKills, IMessage> {
        
        @Override
        public IMessage onMessage(PacketKills message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.killStreak, ctx.getServerHandler().playerEntity.getDisplayName()));
			
            Warsmod.proxy.handleKillData(message.totalKills, message.killStreak);
            
            
            return null; // no response in this case
            
            
        }
    }
}
