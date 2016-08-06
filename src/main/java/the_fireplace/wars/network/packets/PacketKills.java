package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.WarsMod;

public class PacketKills implements IMessage {
    
    private int killStreak;
    private int totalKills;
    private int deaths;

    private String separator = "n";

    public PacketKills() { }

    public PacketKills(int killStreak, int totalKills, int deaths) {
        this.killStreak = killStreak;
        this.totalKills = totalKills;
        this.deaths = deaths;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        String basic = ByteBufUtils.readUTF8String(buf);
        String[] values = basic.split(separator);

        killStreak = Integer.parseInt(values[0]);
        totalKills = Integer.parseInt(values[1]);
        deaths = Integer.parseInt(values[2]);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        String string = String.valueOf(killStreak)+separator+
                String.valueOf(totalKills)+separator+
                String.valueOf(deaths);

        ByteBufUtils.writeUTF8String(buf, string);
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
