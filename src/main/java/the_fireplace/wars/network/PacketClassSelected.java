package the_fireplace.wars.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.ClassSelected;
import the_fireplace.wars.handlers.DonatorClassSelected;

public class PacketClassSelected implements IMessage {

	private int classSelected;
	private int donator;

	public PacketClassSelected() {
	}

	public PacketClassSelected(int classSelected, int donator) {
		this.classSelected = classSelected;
		this.donator = donator;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		classSelected = ByteBufUtils.readVarInt(buf, classSelected);
		donator = ByteBufUtils.readVarInt(buf, donator);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeVarInt(buf, classSelected, 128);
		ByteBufUtils.writeVarInt(buf, donator, 128);
	}

	public static class Handler extends AbstractServerMessageHandler<PacketClassSelected> {

		@Override
		public IMessage handleServerMessage(EntityPlayer player, PacketClassSelected message, MessageContext ctx) {
			System.out.println(String.format("Received %s from %s", message.classSelected, player.getDisplayName()));

			if (message.donator == 1) {
				new ClassSelected(player, message.classSelected);
			} else {
				new DonatorClassSelected(player);
			}

			return null; // no response in this case
		}
	}
}
