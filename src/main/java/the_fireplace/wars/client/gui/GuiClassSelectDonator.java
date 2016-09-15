package the_fireplace.wars.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketClassSelected;

import java.awt.*;
import java.net.URL;

public class GuiClassSelectDonator extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/classSelectionDonator.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String talkTo = I18n.format("classselect.survival");
	public String info = I18n.format("classselect.donations");

	public GuiClassSelectDonator(EntityPlayer player) {

	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
			this.mc.thePlayer.closeScreen();
		}
	}

	public final int xSizeOfTexture = 250;
	public final int ySizeOfTexture = 165;

	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		this.mc.renderEngine.bindTexture(textureLocation);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;
		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

		drawString(fontRendererObj, talkTo, posX + 40, posY + 148, colorsHex[colorIndex]);

		drawString(fontRendererObj, info, posX + 25, posY + 30, 0x6A5ACD);

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
		buttonList.add(new GuiButton(1, posX + 15, posY + 90, 70, 12, I18n.format("class.chaoswarrior")));
		buttonList.add(new GuiButton(2, posX + 100, posY + 90, 52, 12, I18n.format("class.enderknight")));
		buttonList.add(new GuiButton(3, posX + 173, posY + 90, 52, 12, I18n.format("class.ninja")));

		buttonList.add(new GuiButton(4, posX + 195, posY + 3, 50, 20, I18n.format("classselect.donate")));

	}

    public static void drawEntityOnScreen(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, EntityLivingBase p_147046_5_)
    {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_147046_0_, (float)p_147046_1_, 50.0F);
        GlStateManager.scale((float) -p_147046_2_, (float)p_147046_2_, (float)p_147046_2_);
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
		rendermanager.doRenderEntity(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
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



	@Override
    protected void actionPerformed(GuiButton guibutton) {
		boolean flag = false;
		switch (guibutton.id) {
		case 1:
			if (WarsMod.getDonators().contains(this.mc.thePlayer.getName())) {
				colorIndex = 2;
				talkTo = I18n.format("classselect.selected", I18n.format("class.chaoswarrior"));
				flag = true;
			} else {
				colorIndex = 0;
				talkTo = I18n.format("classselect.needtodonate");
			}

			break;
		case 2:
			if (WarsMod.getDonators().contains(this.mc.thePlayer.getName())) {
				colorIndex = 3;
				talkTo = I18n.format("classselect.selected", I18n.format("class.enderknight"));
				flag = true;
			} else {
				colorIndex = 0;
				talkTo = I18n.format("classselect.needtodonate");
			}

			break;
		case 3:
			if (WarsMod.getDonators().contains(this.mc.thePlayer.getName())) {
				colorIndex = 1;
				talkTo = I18n.format("classselect.selected", I18n.format("class.ninja"));
				flag = true;
			} else {
				colorIndex = 0;
				talkTo = I18n.format("classselect.needtodonate");
			}

			break;

		case 4:

			try {
				Desktop.getDesktop().browse(new URL("http://resinresin.buycraft.net/category/766985").toURI());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if(guibutton.id > 0 && guibutton.id < 4 && flag){
			PacketDispatcher.sendToServer(new PacketClassSelected(guibutton.id, true));
		}
	}
}