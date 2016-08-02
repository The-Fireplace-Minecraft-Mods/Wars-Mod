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

    private String separator = "n";

    public PacketKills() { }

    public PacketKills(int killStreak, int totalKills) {
        this.killStreak = killStreak;
        this.totalKills = totalKills;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        String basic = ByteBufUtils.readUTF8String(buf);
        String[] values = basic.split(separator);

        killStreak = Integer.parseInt(values[0]);
        totalKills = Integer.parseInt(values[1]);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        String string = String.valueOf(killStreak)+separator+
                String.valueOf(totalKills);

        ByteBufUtils.writeUTF8String(buf, string);
    }

    public static class Handler extends AbstractClientMessageHandler<PacketKills> {
        
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketKills message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.killStreak, player.getDisplayName().getUnformattedText()));
			
            WarsMod.proxy.handleKillData(message.totalKills, message.killStreak);

            return null; // no response in this case
        }
    }
}
