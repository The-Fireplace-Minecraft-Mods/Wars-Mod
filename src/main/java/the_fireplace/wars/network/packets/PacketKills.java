package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.WarsMod;

public class PacketKills implements IMessage {
    
    private int killStreak;
    private int totalKills;
    private int deaths;

    public PacketKills() { }

    public PacketKills(int killStreak, int totalKills, int deaths) {
        this.killStreak = killStreak;
        this.totalKills = totalKills;
        this.deaths = deaths;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        killStreak = buf.readInt();
        totalKills = buf.readInt();
        deaths = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(killStreak);
        buf.writeInt(totalKills);
        buf.writeInt(deaths);
    }

    public static class Handler extends AbstractClientMessageHandler<PacketKills> {
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketKills message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.deaths, player.getDisplayName().getUnformattedText()));

            WarsMod.proxy.handleKillData(player, message.totalKills, message.killStreak, message.deaths);

            return null;
        }
    }
}
