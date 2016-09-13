package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.StructureSpawning;

public class PacketSpawnStructure implements IMessage {
    
    private int button;
    private int x;
    private int y;
    private int z;
    private int type;

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
        button = buf.readInt();
        x = buf.readInt();
        y = buf.readShort();
        z = buf.readInt();
        type = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(button);
        buf.writeInt(x);
        buf.writeShort(y);
        buf.writeInt(z);
        buf.writeInt(type);
    }

    public static class Handler extends AbstractServerMessageHandler<PacketSpawnStructure> {
        
        @Override
        public IMessage handleServerMessage(EntityPlayer player, PacketSpawnStructure message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", "Structure Packet with type "+message.type+" and button "+message.button+" at ("+message.x+", "+message.y+", "+message.z+")", player.getDisplayName().getUnformattedText()));

			new StructureSpawning(player, message.type, message.button, message.x, message.y, message.z);
            
            return null;
        }
    }
}
