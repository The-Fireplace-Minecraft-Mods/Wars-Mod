package resinresin.wars.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.warsmod;
import resinresin.wars.client.ClientProxy;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiTeamSelect extends GuiScreen {

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String title = "\u00a79Choose Your Team!";
	public String info = "";
	public String howTo = "You can only join the team ";
	public String howTo2 = "with the least players in order for balance!";

	public String redText = "\u00a74Red " + "(" + ClientProxy.redPlayers + ")";
	public String greenText = "\u00a72Green " + "(" + ClientProxy.greenPlayers + ")";
	public String blueText = "\u00a79Blue " + "(" + ClientProxy.bluePlayers + ")";
	public String yellowText = "\u00a76Yellow " + "(" + ClientProxy.yellowPlayers + ")";

	public GuiTeamSelect(EntityPlayer player) {
		// the container is instanciated and passed to the superclass for
		// handling

	}

	protected void keyTyped(char par1, int par2) {
	}

	public final int xSizeOfTexture = 250;
	public final int ySizeOfTexture = 165;

	/** The X size of the inventory window in pixels. */
	protected int xSize = 176;

	/** The Y size of the inventory window in pixels. */
	protected int ySize = 166;

	int guiLeft = (this.width - this.xSize) / 2;
	int guiTop = (this.height - this.ySize) / 2;

	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;

		drawString(fontRenderer, title, posX + 20, posY + 30, colorsHex[colorIndex]);

		drawString(fontRenderer, info, posX + 20, posY + 100, colorsHex[colorIndex]);

		drawString(fontRenderer, howTo, posX + 20, posY + 75, colorsHex[colorIndex]);
		drawString(fontRenderer, howTo2, posX + 20, posY + 85, colorsHex[colorIndex]);

		int xCenter = width / 2;
		int yCenter = height / 2;
		int radius = 40;
		int xOff = 50;
		int yOff = 59;
		PieChartRendering.renderChart(radius, xCenter + xOff, yCenter + yOff, x, y, PieChartRendering.entries);

		super.drawScreen(x, y, f);
	}

	public void drawDefaultBackground() {
		this.drawWorldBackground(0);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();
		PieChartRendering.buildEntries();
		// make buttons

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		// id, x, y, width, height, text

		buttonList.add(new GuiButton(1, posX + 0, posY + 54, 52, 20, redText));
		buttonList.add(new GuiButton(2, posX + 60, posY + 54, 52, 20, greenText));
		buttonList.add(new GuiButton(3, posX + 120, posY + 54, 52, 20, blueText));
		buttonList.add(new GuiButton(4, posX + 180, posY + 54, 52, 20, yellowText));

		buttonList.add(new GuiButton(5, posX + 200, posY + 120, 52, 20, "Done"));
		buttonList.add(new GuiButton(6, posX + 200, posY + 100, 52, 20, "Refresh"));

	}

	protected void actionPerformed(GuiButton guibutton) {
		// id is the id you give your button
		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeByte(guibutton.id);
		PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 5, out.toByteArray()));

		switch (guibutton.id) {
		case 1:
			ByteArrayDataOutput out5 = ByteStreams.newDataOutput();
			out5.writeByte(1);
			PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 15, out5.toByteArray()));

			if (ClientProxy.redPlayers > ClientProxy.greenPlayers && ClientProxy.redPlayers > ClientProxy.yellowPlayers && ClientProxy.redPlayers > ClientProxy.bluePlayers) {

				info = "The Red Team Is Full!";

			} else {

				// this.mc.thePlayer.closeScreen();

			}

			break;
		case 2:
			ByteArrayDataOutput out2 = ByteStreams.newDataOutput();
			out2.writeByte(1);
			PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 15, out2.toByteArray()));

			if (ClientProxy.greenPlayers > ClientProxy.redPlayers && ClientProxy.greenPlayers > ClientProxy.yellowPlayers && ClientProxy.greenPlayers > ClientProxy.bluePlayers) {

				info = "The Green Team Is Full!";

			} else {

			}

			break;
		case 3:
			ByteArrayDataOutput out3 = ByteStreams.newDataOutput();
			out3.writeByte(3);
			PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 15, out3.toByteArray()));

			if (ClientProxy.bluePlayers > ClientProxy.redPlayers && ClientProxy.bluePlayers > ClientProxy.yellowPlayers && ClientProxy.bluePlayers > ClientProxy.greenPlayers) {

				info = "The Blue Team Is Full!";

			} else {

				// this.mc.thePlayer.closeScreen();

			}

			break;
		case 4:
			ByteArrayDataOutput out4 = ByteStreams.newDataOutput();
			out4.writeByte(1);
			PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 15, out4.toByteArray()));

			if (ClientProxy.yellowPlayers > ClientProxy.greenPlayers && ClientProxy.yellowPlayers > ClientProxy.redPlayers && ClientProxy.yellowPlayers > ClientProxy.bluePlayers) {

				info = "The Yellow Team Is Full!";

			} else {

				// this.mc.thePlayer.closeScreen();

			}
			break;
		case 5:

			this.mc.thePlayer.closeScreen();

			break;
		case 6:

			redText = "\u00a74Red " + "(" + ClientProxy.redPlayers + ")";
			greenText = "\u00a72Green " + "(" + ClientProxy.greenPlayers + ")";
			blueText = "\u00a79Blue " + "(" + ClientProxy.bluePlayers + ")";
			yellowText = "\u00a76Yellow " + "(" + ClientProxy.yellowPlayers + ")";

			ByteArrayDataOutput out1 = ByteStreams.newDataOutput();
			out1.writeByte(1);
			PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 15, out1.toByteArray()));

			this.buttonList.clear();
			this.initGui();
		}

		// Packet code here
		// PacketDispatcher.sendPacketToServer(packet); //send packet
	}

}