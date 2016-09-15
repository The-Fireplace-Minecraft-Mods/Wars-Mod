package the_fireplace.wars.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.network.packets.*;

/**
 * @author coolAlias
 * @author The_Fireplace
 */
public class PacketDispatcher {
    private static byte packetId = 0;

    private static final SimpleNetworkWrapper dispatcher = NetworkRegistry.INSTANCE.newSimpleChannel(WarsMod.MODID);

    public static final void registerPackets() {
        PacketDispatcher.registerMessage(PacketSpawnStructure.Handler.class, PacketSpawnStructure.class, Side.SERVER);
        PacketDispatcher.registerMessage(PacketTeamSelected.Handler.class, PacketTeamSelected.class, Side.SERVER);
        PacketDispatcher.registerMessage(PacketClassSelected.Handler.class, PacketClassSelected.class, Side.SERVER);
        PacketDispatcher.registerMessage(PacketKills.Handler.class, PacketKills.class, Side.CLIENT);
        PacketDispatcher.registerMessage(PacketTeams.Handler.class, PacketTeams.class, Side.CLIENT);
        PacketDispatcher.registerMessage(PacketOpenTeamSelect.Handler.class, PacketOpenTeamSelect.class, Side.CLIENT);
    }

    private static final void registerMessage(Class handlerClass, Class messageClass, Side targetSide) {
        PacketDispatcher.dispatcher.registerMessage(handlerClass, messageClass, packetId++, targetSide);
    }

    //Wrapper methods
    public static final void sendTo(IMessage message, EntityPlayerMP player) {
        PacketDispatcher.dispatcher.sendTo(message, player);
    }

    public static final void sendToAllAround(IMessage message, NetworkRegistry.TargetPoint point) {
        PacketDispatcher.dispatcher.sendToAllAround(message, point);
    }

    public static final void sendToAllAround(IMessage message, int dimension, double x, double y, double z, double range) {
        PacketDispatcher.dispatcher.sendToAllAround(message, new NetworkRegistry.TargetPoint(dimension, x, y, z, range));
    }

    public static final void sendToAllAround(IMessage message, EntityPlayer player, double range) {
        PacketDispatcher.dispatcher.sendToAllAround(message, new NetworkRegistry.TargetPoint(player.worldObj.provider.getDimension(), player.posX, player.posY, player.posZ, range));
    }

    public static final void sendToDimension(IMessage message, int dimensionId) {
        PacketDispatcher.dispatcher.sendToDimension(message, dimensionId);
    }

    public static final void sendToServer(IMessage message) {
        PacketDispatcher.dispatcher.sendToServer(message);
    }
}