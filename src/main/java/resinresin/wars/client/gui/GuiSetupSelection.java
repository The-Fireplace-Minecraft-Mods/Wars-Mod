package resinresin.wars.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import resinresin.wars.warsmod;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.PacketDispatcher;

public class GuiSetupSelection extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/setupBuildings.png");
	private static final ResourceLocation textureLocation2 = new ResourceLocation("warsmod:gui/infoBox.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String title = "Building Select";

	public String info = "Welcome to the war zone building select gui. Select basic warzone stuff here! The height is how far above ground it goes. (some may go below ground)";

	public String sizeHeight = "";
	public String sizeArea = "";

	public int x = 0;
	public int y = 0;
	public int z = 0;

	public GuiSetupSelection(EntityPlayer player, TileEntity tile) {
		// the container is instanciated and passed to the superclass for
		// handling
		this.x = tile.xCoord;
		this.y = tile.yCoord;
		this.z = tile.zCoord;

	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.keyCode) {
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

		drawString(fontRenderer, title, posX + 252, posY + 20, 0x6A5ACD);

		drawString(fontRenderer, sizeHeight, posX + 254, posY + 130, 0xFF6600);
		drawString(fontRenderer, sizeArea, posX + 254, posY + 140, 0xFF6600);

		fontRenderer.drawSplitString(info, posX + 252, posY + 30, 80, 7);

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

	protected void actionPerformed(GuiButton guibutton) {
		// id is the id you give your button
		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeByte(guibutton.id);

		out.writeInt(x);

		out.writeInt(y);

		out.writeInt(z);

		PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(warsmod.instance, (short) 11, out.toByteArray()));

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
			title = "\u00a74Red Castle";
			info = "The castle of the red team. The team of fire! They protect the great fire plains of the north!";
			sizeArea = "Area: " + "23x23";
			sizeHeight = "Height: " + "26";
			break;
		case 8:
			title = "\u00a71Blue Castle";
			info = "The castle of the blue team. The team of water! The people of the great ocean villages!";
			sizeArea = "Area: " + "23x23";
			sizeHeight = "Height: " + "26";
			break;
		case 9:
			title = "\u00a72Green Castle";
			info = "The castle of the red team. The team of nature! The men of the forest of argarac!";
			sizeArea = "Area: " + "23x23";
			sizeHeight = "Height: " + "26";
			break;
		case 10:
			title = "\u00a7eYellow Castle";
			info = "The castle of the red team. The team of decay! The lone people of the great plains of death!";
			sizeArea = "Area: " + "23x23";
			sizeHeight = "Height: " + "26";
			break;
		case 11:
			title = "Glass Dome";
			info = "Spawns a massive glass dome around the map! The dome has a radius of 50.";
			sizeArea = "";
			sizeHeight = "";
			break;
		case 12:
			title = "Control Tower";
			info = "A tower that changes colour when different teams right click their side. Can be used for minigames with friends, but does not have any game controlling functionality.";
			sizeArea = "Area: " + "3x3";
			sizeHeight = "";
			break;
		}

		// Packet code here
		// PacketDispatcher.sendPacketToServer(packet); //send packet
	}

}