package resinresin.wars.packet;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import resinresin.wars.handlers.ClassSelected;
import resinresin.wars.handlers.DonatorClassSelected;

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

	public static class Handler implements IMessageHandler<PacketClassSelected, IMessage> {

		@Override
		public IMessage onMessage(PacketClassSelected message, MessageContext ctx) {
			System.out.println(String.format("Received %s from %s", message.classSelected, ctx.getServerHandler().playerEntity.getDisplayName()));

			if (message.donator == 1) {

				new ClassSelected(ctx.getServerHandler().playerEntity, message.classSelected);

			}

			else {

				new DonatorClassSelected(ctx.getServerHandler().playerEntity);
			}

			return null; // no response in this case

		}
	}
}
