package the_fireplace.wars.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.StructureSpawning;

public class PacketSpawnStructure implements IMessage {
    
    private int button;
    private int x;
    private int y;
    private int z;
    private int type;

    private String separator = "n";

    public PacketSpawnStructure() { }

    public PacketSpawnStructure(int button, int x, int y, int z, int type) {
        this.button = button;
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        String basic = ByteBufUtils.readUTF8String(buf);
        String[] values = basic.split(separator);

        button = Integer.parseInt(values[0]);
        x = Integer.parseInt(values[1]);
        y = Integer.parseInt(values[2]);
        z = Integer.parseInt(values[3]);
        type = Integer.parseInt(values[4]);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        String string = String.valueOf(button)+separator+String.valueOf(x)+separator+String.valueOf(y)+separator+String.valueOf(z)+separator+String.valueOf(type);

        ByteBufUtils.writeUTF8String(buf, string);
    }

    public static class Handler extends AbstractServerMessageHandler<PacketSpawnStructure> {
        
        @Override
        public IMessage handleServerMessage(EntityPlayer player, PacketSpawnStructure message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.x, player.getDisplayName().getUnformattedText()));

            System.out.println("this got called (packet recieved)");
			new StructureSpawning(player, message.type, message.button, message.x, message.y, message.z);
            
            return null; // no response in this case
        }
    }
}
