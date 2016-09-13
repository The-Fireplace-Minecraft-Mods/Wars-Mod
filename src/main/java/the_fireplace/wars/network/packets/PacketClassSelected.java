package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.ClassSelected;
import the_fireplace.wars.handlers.DonatorClassSelected;

public class PacketClassSelected implements IMessage {

	private int classSelected;
	private boolean donator;

	public PacketClassSelected() {
	}

	public PacketClassSelected(int classSelected, boolean donator) {
		this.classSelected = classSelected;
		this.donator = donator;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		classSelected = buf.readInt();
		donator = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(classSelected);
		buf.writeBoolean(donator);
	}

	public static class Handler extends AbstractServerMessageHandler<PacketClassSelected> {

		@Override
		public IMessage handleServerMessage(EntityPlayer player, PacketClassSelected message, MessageContext ctx) {
			System.out.println(String.format("Received %s from %s", message.classSelected, player.getDisplayName().getUnformattedText()));

			if (!message.donator) {
				new ClassSelected(player, message.classSelected);
			} else {
				new DonatorClassSelected(player, message.classSelected);
			}

			return null; // no response in this case
		}
	}
}
