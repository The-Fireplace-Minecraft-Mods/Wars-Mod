package resinresin.wars.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class GuiSpleefSelect extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/spleefBuildings.png");
	private static final ResourceLocation textureLocation2 = new ResourceLocation("warsmod:gui/infoBox.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String title = "Spleef Select";

	public String info = "Welcome to the spleef selection. Select a range of wonderful places to play that game that which we call spleef!";

	public String sizeHeight = "";
	public String sizeArea = "";

	public BlockPos blockPos;

	public GuiSpleefSelect(EntityPlayer player, TileEntity tile) {
		// the container is instantiated and passed to the superclass for
		// handling
		blockPos = tile.getPos();
	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == mc.gameSettings.keyBindInventory.getKeyCode()) {
			mc.thePlayer.closeScreen();
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

	int guiLeft = (width - xSize) / 2;
	int guiTop = (height - ySize) / 2;

	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		mc.renderEngine.bindTexture(textureLocation);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int posX = (width - xSizeOfTexture) / 2;
		int posY = (height - ySizeOfTexture) / 2;
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

		mc.renderEngine.bindTexture(textureLocation2);
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

		int posX = (width - xSizeOfTexture) / 2;
		int posY = (height - ySizeOfTexture) / 2;
		// id, x, y, width, height, text
		buttonList.add(new GuiButton(1, posX + 23, posY + 59, 52, 20, "Generate"));
		buttonList.add(new GuiButton(2, posX + 99, posY + 59, 52, 20, "Generate"));
		buttonList.add(new GuiButton(3, posX + 172, posY + 59, 52, 20, "Generate"));

		buttonList.add(new GuiButton(4, posX + 23, posY + 126, 52, 20, "Generate"));
		buttonList.add(new GuiButton(5, posX + 99, posY + 126, 52, 20, "Generate"));
		buttonList.add(new GuiButton(6, posX + 172, posY + 126, 52, 20, "Generate"));

		buttonList.add(new GuiButton(7, posX + 63, posY + 22, 12, 12, "i"));
		buttonList.add(new GuiButton(8, posX + 138, posY + 22, 12, 12, "i"));
		buttonList.add(new GuiButton(9, posX + 212, posY + 22, 12, 12, "i"));

		buttonList.add(new GuiButton(10, posX + 63, posY + 89, 12, 12, "i"));
		buttonList.add(new GuiButton(11, posX + 138, posY + 89, 12, 12, "i"));
		buttonList.add(new GuiButton(12, posX + 212, posY + 89, 12, 12, "i"));

	}

	@Override
	protected void actionPerformed(GuiButton guibutton) {
		// id is the id you give your button
		//		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		//		out.writeByte(guibutton.id);
		//
		//		out.writeInt(x);
		//
		//		out.writeInt(y);
		//
		//		out.writeInt(z);
		//
		//		PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 12, out.toByteArray()));

		switch (guibutton.id) {
		case 1:
			mc.thePlayer.closeScreen();
			break;
		case 2:
			mc.thePlayer.closeScreen();
			break;
		case 3:
			mc.thePlayer.closeScreen();
			break;
		case 4:
			mc.thePlayer.closeScreen();
			break;
		case 5:
			mc.thePlayer.closeScreen();
			break;
		case 6:
			mc.thePlayer.closeScreen();
			break;

		case 7:
			title = "Miners [small]";
			info = "The spleef of the deep miners of Minetargok. This is their only source of amusment between 6-18 million year mining trips.";
			sizeArea = "Area: " + "18x18";
			sizeHeight = "Height: " + "9";
			break;
		case 8:
			title = "\u00a72Natural [small]";
			info = "The people of the forest love to play this sceneic spleef arena!";
			sizeArea = "Area: " + "18x18";
			sizeHeight = "Height: " + "9";
			break;
		case 9:
			title = "\u00a74Nether [small]";
			info = "From the pits of hell demons bet on players playing spleef. The prize: you don't have to stay in the fiery pit of death for more than a million years.";
			sizeArea = "Area: " + "18x18";
			sizeHeight = "Height: " + "9";
			break;
		case 10:
			title = "Miners [medium]";
			info = "The spleef of the deep miners of Minetargok. This is their only source of amusment between 6-18 million year mining trips.";
			sizeArea = "Area: " + "22x22";
			sizeHeight = "Height: " + "20";
			break;
		case 11:
			title = "\u00a72Natural [medium]";
			info = "The people of the forest love to play this sceneic spleef arena!";
			sizeArea = "Area: " + "22x22";
			sizeHeight = "Height: " + "20";
			break;
		case 12:
			title = "\u00a74Nether [medium]";
			info = "From the pits of hell demons bet on players playing spleef. The prize: you don't have to stay in the fiery pit of death for more than a million years.";
			sizeArea = "Area: " + "22x22";
			sizeHeight = "Height: " + "20";
			break;
		default:
			break;
		}

		// Packet code here
		PacketDispatcher.sendPacketToServer(packet); //send packet
	}

}
