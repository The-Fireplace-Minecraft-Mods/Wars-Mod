package the_fireplace.wars.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketSpawnStructure;

public class GuiSetupSelection extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/setupBuildings.png");
	private static final ResourceLocation textureLocation2 = new ResourceLocation("warsmod:gui/infoBox.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String title = I18n.format("setupselect.title");

	public String info = I18n.format("setupselect.info");

	public String sizeHeight = "";
	public String sizeArea = "";

	public BlockPos blockPos;
	
	public GuiSetupSelection(EntityPlayer player, BlockPos pos) {
		blockPos = pos;
	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
			this.mc.thePlayer.closeScreen();
		}
	}

	public final int xSizeOfTexture = 250;
	public final int ySizeOfTexture = 165;

	public final int xSizeOfTexture2 = 100;
	public final int ySizeOfTexture2 = 256;

	public final int xSizeOfTexture3 = 256;
	public final int ySizeOfTexture3 = 256;

	/** The X size of the inventory window in pixels. */
	protected int xSize = 176;

	/** The Y size of the inventory window in pixels. */
	protected int ySize = 166;

	int guiLeft = (this.width - this.xSize) / 2;
	int guiTop = (this.height - this.ySize) / 2;

	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		this.mc.renderEngine.bindTexture(textureLocation);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

		this.mc.renderEngine.bindTexture(textureLocation2);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(posX + 250, posY + 15, 0, 0, xSizeOfTexture2, ySizeOfTexture2);

		drawString(fontRendererObj, title, posX + 252, posY + 20, 0x6A5ACD);

		drawString(fontRendererObj, sizeHeight, posX + 254, posY + 130, 0xFF6600);
		drawString(fontRendererObj, sizeArea, posX + 254, posY + 140, 0xFF6600);

		fontRendererObj.drawSplitString(info, posX + 252, posY + 30, 80, 7);

		super.drawScreen(x, y, f);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();
		// make buttons

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		// id, x, y, width, height, text
		buttonList.add(new GuiButton(1, posX + 23, posY + 59, 52, 20, I18n.format("generate")));
		buttonList.add(new GuiButton(2, posX + 99, posY + 59, 52, 20, I18n.format("generate")));
		buttonList.add(new GuiButton(3, posX + 172, posY + 59, 52, 20, I18n.format("generate")));

		buttonList.add(new GuiButton(4, posX + 23, posY + 126, 52, 20, I18n.format("generate")));
		buttonList.add(new GuiButton(5, posX + 99, posY + 126, 52, 20, I18n.format("generate")));
		buttonList.add(new GuiButton(6, posX + 172, posY + 126, 52, 20, I18n.format("generate")));

		buttonList.add(new GuiButton(7, posX + 63, posY + 22, 12, 12, "i"));
		buttonList.add(new GuiButton(8, posX + 138, posY + 22, 12, 12, "i"));
		buttonList.add(new GuiButton(9, posX + 212, posY + 22, 12, 12, "i"));

		buttonList.add(new GuiButton(10, posX + 63, posY + 89, 12, 12, "i"));
		buttonList.add(new GuiButton(11, posX + 138, posY + 89, 12, 12, "i"));
		buttonList.add(new GuiButton(12, posX + 212, posY + 89, 12, 12, "i"));

	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		switch (guibutton.id) {
		case 1:
			this.mc.thePlayer.closeScreen();
			break;
		case 2:
			this.mc.thePlayer.closeScreen();
			break;
		case 3:
			this.mc.thePlayer.closeScreen();
			break;
		case 4:
			this.mc.thePlayer.closeScreen();
			break;
		case 5:
			this.mc.thePlayer.closeScreen();
			break;
		case 6:
			this.mc.thePlayer.closeScreen();
			break;

		case 7:
			title = I18n.format("setupselect.redcastle.title");
			info = I18n.format("setupselect.redcastle.info");
			sizeArea = I18n.format("sizeArea") + "23x23";
			sizeHeight = I18n.format("sizeHeight") + "26";
			break;
		case 8:
			title = I18n.format("setupselect.bluecastle.title");
			info = I18n.format("setupselect.bluecastle.info");
			sizeArea = I18n.format("sizeArea") + "23x23";
			sizeHeight = I18n.format("sizeHeight") + "26";
			break;
		case 9:
			title = I18n.format("setupselect.greencastle.title");
			info = I18n.format("setupselect.greencastle.info");
			sizeArea = I18n.format("sizeArea") + "23x23";
			sizeHeight = I18n.format("sizeHeight") + "26";
			break;
		case 10:
			title = I18n.format("setupselect.yellowcastle.title");
			info = I18n.format("setupselect.yellowcastle.info");
			sizeArea = I18n.format("sizeArea") + "23x23";
			sizeHeight = I18n.format("sizeHeight") + "26";
			break;
		case 11:
			title = I18n.format("setupselect.dome.title");
			info = I18n.format("setupselect.dome.info");
			sizeArea = "";
			sizeHeight = "";
			break;
		case 12:
			title = I18n.format("setupselect.controltower.title");
			info = I18n.format("setupselect.controltower.info");
			sizeArea = I18n.format("sizeArea") + "3x3";
			sizeHeight = "";
			break;
		}

		// Packet code here
		if(guibutton.id > 0 && guibutton.id < 7){
			PacketDispatcher.sendToServer(new PacketSpawnStructure(guibutton.id, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 1));
		}
	}

}