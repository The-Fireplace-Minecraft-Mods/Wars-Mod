package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.handlers.ClassSelected;
import the_fireplace.wars.handlers.DonatorClassSelected;

public class PacketClassSelected implements IMessage {

	private int classSelected;
	private boolean donator;

	private String separator = "n";

	public PacketClassSelected() {
	}

	public PacketClassSelected(int classSelected, boolean donator) {
		this.classSelected = classSelected;
		this.donator = donator;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		String basic = ByteBufUtils.readUTF8String(buf);
		String[] values = basic.split(separator);

		classSelected = Integer.parseInt(values[0]);
		donator = Boolean.parseBoolean(values[1]);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		String string = String.valueOf(classSelected)+separator+
						String.valueOf(donator);

		ByteBufUtils.writeUTF8String(buf, string);
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
