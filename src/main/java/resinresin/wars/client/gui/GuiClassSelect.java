package resinresin.wars.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import resinresin.wars.Warsmod;
import resinresin.wars.client.ClientProxy;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class GuiClassSelect extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/classSelection.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String talkTo = "Be In Survival When Using This GUI!";

	public GuiClassSelect(EntityPlayer player) {
		// the container is instanciated and passed to the superclass for
		// handling

	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
			this.mc.thePlayer.closeScreen();
		}
	}

	public final int xSizeOfTexture = 250;
	public final int ySizeOfTexture = 165;

	public final int xSizeOfTexture2 = 256;
	public final int ySizeOfTexture2 = 256;

	public final int xSizeOfTexture3 = 256;
	public final int ySizeOfTexture3 = 256;

	public final int xSizeOfTexture4 = 256;
	public final int ySizeOfTexture4 = 256;

	public final int xSizeOfTexture5 = 256;
	public final int ySizeOfTexture5 = 256;

	public final int xSizeOfTexture6 = 256;
	public final int ySizeOfTexture6 = 256;

	public final int xSizeOfTexture7 = 256;
	public final int ySizeOfTexture7 = 256;

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

		drawString(fontRendererObj, talkTo, posX + 40, posY + 148, colorsHex[colorIndex]);

		drawEntityOnScreen(posX + 10, posY + 60, 30, (float) (posX + 51) - this.xSizeOfTexture, (float) (posY + 75 - 50) - this.ySizeOfTexture, this.mc.thePlayer);

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
		buttonList.add(new GuiButton(1, posX + 24, posY + 54, 52, 12, "Guard"));
		buttonList.add(new GuiButton(2, posX + 100, posY + 54, 52, 12, "Knight"));
		buttonList.add(new GuiButton(3, posX + 173, posY + 54, 52, 12, "Healer"));

		buttonList.add(new GuiButton(4, posX + 24, posY + 121, 52, 12, "Scout"));
		buttonList.add(new GuiButton(5, posX + 100, posY + 121, 52, 12, "Archer"));
		buttonList.add(new GuiButton(6, posX + 173, posY + 121, 52, 12, "Technician"));

	}

    public static void drawEntityOnScreen(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, EntityLivingBase p_147046_5_)
    {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_147046_0_, (float)p_147046_1_, 50.0F);
        GlStateManager.scale((float)(-p_147046_2_), (float)p_147046_2_, (float)p_147046_2_);
        GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = p_147046_5_.renderYawOffset;
        float f3 = p_147046_5_.rotationYaw;
        float f4 = p_147046_5_.rotationPitch;
        float f5 = p_147046_5_.prevRotationYawHead;
        float f6 = p_147046_5_.rotationYawHead;
        GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(-((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        p_147046_5_.renderYawOffset = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 20.0F;
        p_147046_5_.rotationYaw = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 40.0F;
        p_147046_5_.rotationPitch = -((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F;
        p_147046_5_.rotationYawHead = p_147046_5_.rotationYaw;
        p_147046_5_.prevRotationYawHead = p_147046_5_.rotationYaw;
        GlStateManager.translate(0.0F, 0.0F, 0.0F);
        RenderManager rendermanager = Minecraft.getMinecraft().getRenderManager();
        rendermanager.setPlayerViewY(180.0F);
        rendermanager.setRenderShadow(false);
        rendermanager.renderEntityWithPosYaw(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        rendermanager.setRenderShadow(true);
        p_147046_5_.renderYawOffset = f2;
        p_147046_5_.rotationYaw = f3;
        p_147046_5_.rotationPitch = f4;
        p_147046_5_.prevRotationYawHead = f5;
        p_147046_5_.rotationYawHead = f6;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }

	protected void actionPerformed(GuiButton guibutton) {
		// id is the id you give your button
//		ByteArrayDataOutput out = ByteStreams.newDataOutput();
//		out.writeByte(guibutton.id);
//		PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(Warsmod.instance, (short) 1, out.toByteArray()));
     	int currentKills = ClientProxy.totalKills;

		switch (guibutton.id) {
		case 1:
			colorIndex = 2;
			talkTo = "Guard Selected";

			break;
		case 2:
			if (currentKills > 24) {
				colorIndex = 2;
				talkTo = "Knight Selected";

			} else {
				colorIndex = 0;
				talkTo = "Not Enough Kills!" + " (" + (25 - ClientProxy.totalKills) + " More Needed)";
			}
			break;
		case 3:
			if (currentKills > 49) {
				colorIndex = 2;
				talkTo = "Healer Selected";

			} else {
				colorIndex = 0;
				talkTo = "Not Enough Kills!" + " (" + (50 - ClientProxy.totalKills) + " More Needed)";
			}
			break;
		case 4:
			if (currentKills > 99) {
				colorIndex = 2;
				talkTo = "Scout Selected";

			} else {
				colorIndex = 0;
				talkTo = "Not Enough Kills!" + " (" + (100 - ClientProxy.totalKills) + " More Needed)";
			}
			break;
		case 5:
			if (currentKills > 199) {
				colorIndex = 2;
				talkTo = "Archer Selected";

			} else {
				colorIndex = 0;
				talkTo = "Not Enough Kills!" + " (" + (200 - ClientProxy.totalKills) + " More Needed)";
			}
			break;
		case 6:
			if (currentKills > 399) {
				colorIndex = 2;
				talkTo = "Technician Selected";

			} else {
				colorIndex = 0;
				talkTo = "Not Enough Kills!" + " (" + (400 - ClientProxy.totalKills) + " More Needed)";
			}
			break;
		}

		// Packet code here
		// PacketDispatcher.sendPacketToServer(packet); //send packet
	}

}