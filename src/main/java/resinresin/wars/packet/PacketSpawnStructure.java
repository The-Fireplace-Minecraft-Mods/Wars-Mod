package resinresin.wars.packet;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import resinresin.wars.handlers.StructureSpawning;

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
        button = ByteBufUtils.readVarInt(buf, button); // this class is very useful in general for writing more complex objects
        x = ByteBufUtils.readVarInt(buf, x);
        y = ByteBufUtils.readVarInt(buf, y);
        z = ByteBufUtils.readVarInt(buf, z);
        type = ByteBufUtils.readVarInt(buf, type);

    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf, button, 128);
        ByteBufUtils.writeVarInt(buf, x, 128);
        ByteBufUtils.writeVarInt(buf, y, 128);
        ByteBufUtils.writeVarInt(buf, z, 128);
        ByteBufUtils.writeVarInt(buf, type, 128);
        
    }

    public static class Handler implements IMessageHandler<PacketSpawnStructure, IMessage> {
        
        @Override
        public IMessage onMessage(PacketSpawnStructure message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.x, ctx.getServerHandler().playerEntity.getDisplayName()));
			
       
			new StructureSpawning(ctx.getServerHandler().playerEntity, message.type, message.button, message.x, message.y, message.z);
            
            return null; // no response in this case
            
            
        }
    }
}
