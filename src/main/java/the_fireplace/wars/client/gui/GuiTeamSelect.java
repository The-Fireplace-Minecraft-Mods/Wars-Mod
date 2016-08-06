package the_fireplace.wars.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import the_fireplace.wars.client.ClientProxy;

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

	}

	@Override
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

		drawString(fontRendererObj, title, posX + 20, posY + 30, colorsHex[colorIndex]);

		drawString(fontRendererObj, info, posX + 20, posY + 100, colorsHex[colorIndex]);

		drawString(fontRendererObj, howTo, posX + 20, posY + 75, colorsHex[colorIndex]);
		drawString(fontRendererObj, howTo2, posX + 20, posY + 85, colorsHex[colorIndex]);

		int xCenter = width / 2;
		int yCenter = height / 2;
		int radius = 40;
		int xOff = 50;
		int yOff = 59;
		PieChartRendering.renderChart(radius, xCenter + xOff, yCenter + yOff, x, y, PieChartRendering.entries);

		super.drawScreen(x, y, f);
	}

	@Override
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

		buttonList.add(new GuiButton(1, posX, posY + 54, 52, 20, redText));
		buttonList.add(new GuiButton(2, posX + 60, posY + 54, 52, 20, greenText));
		buttonList.add(new GuiButton(3, posX + 120, posY + 54, 52, 20, blueText));
		buttonList.add(new GuiButton(4, posX + 180, posY + 54, 52, 20, yellowText));

		buttonList.add(new GuiButton(5, posX + 200, posY + 120, 52, 20, "Done"));
		buttonList.add(new GuiButton(6, posX + 200, posY + 100, 52, 20, "Refresh"));

	}

	@Override
    protected void actionPerformed(GuiButton guibutton) {

		switch (guibutton.id) {
		case 1:

			if (ClientProxy.redPlayers > ClientProxy.greenPlayers && ClientProxy.redPlayers > ClientProxy.yellowPlayers && ClientProxy.redPlayers > ClientProxy.bluePlayers) {

				info = "The Red Team Is Full!";

			} else {

				// this.mc.thePlayer.closeScreen();

			}

			break;
		case 2:

			if (ClientProxy.greenPlayers > ClientProxy.redPlayers && ClientProxy.greenPlayers > ClientProxy.yellowPlayers && ClientProxy.greenPlayers > ClientProxy.bluePlayers) {

				info = "The Green Team Is Full!";

			} else {

			}

			break;
		case 3:

			if (ClientProxy.bluePlayers > ClientProxy.redPlayers && ClientProxy.bluePlayers > ClientProxy.yellowPlayers && ClientProxy.bluePlayers > ClientProxy.greenPlayers) {

				info = "The Blue Team Is Full!";

			} else {

				// this.mc.thePlayer.closeScreen();

			}

			break;
		case 4:

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

			this.buttonList.clear();
			this.initGui();
		}

	}

}