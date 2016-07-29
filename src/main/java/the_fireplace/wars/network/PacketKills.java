package the_fireplace.wars.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.WarsMod;

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

    public static class Handler extends AbstractClientMessageHandler<PacketKills> {
        
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketKills message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.killStreak, player.getDisplayName()));
			
            WarsMod.proxy.handleKillData(message.totalKills, message.killStreak);

            return null; // no response in this case
        }
    }
}
