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

    public static class Handler extends AbstractServerMessageHandler<PacketSpawnStructure> {
        
        @Override
        public IMessage handleServerMessage(EntityPlayer player, PacketSpawnStructure message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.x, player.getDisplayName()));

            System.out.println("this got called (packet recieved)");
			new StructureSpawning(player, message.type, message.button, message.x, message.y, message.z);
            
            return null; // no response in this case
        }
    }
}
