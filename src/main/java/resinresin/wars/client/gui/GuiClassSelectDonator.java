package resinresin.wars.client.gui;

import java.awt.Desktop;
import java.net.URL;
import java.util.List;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import resinresin.wars.WarsMod;
import resinresin.wars.client.ClientProxy;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class GuiClassSelectDonator extends GuiScreen {

	private static final ResourceLocation textureLocation = new ResourceLocation("warsmod:gui/classSelectionDonator.png");

	public String[] colors = new String[] { "red", "blue", "green", "purple", "black" };
	public int[] colorsHex = new int[] { 0xFF0000, 0x0000FF, 0x006400, 0x6A5ACD, 0x000000 };
	public int colorIndex = 0;

	public String talkTo = "Be In Survival When Using This GUI!";
	public String info = "Donations Can Take Some Time To Process!!";

	public GuiClassSelectDonator(EntityPlayer player) {
		// the container is instanciated and passed to the superclass for
		// handling

	}

	@Override
	protected void keyTyped(char par1, int par2) {
		if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.keyCode) {
			this.mc.thePlayer.closeScreen();
		}
	}

	public final int xSizeOfTexture = 250;
	public final int ySizeOfTexture = 165;

	public final int xSizeOfTexture2 = 256;
	public final int ySizeOfTexture2 = 256;

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

		func_110423_a(posX + 10, posY + 60, 30, (float) (posX + 51) - this.xSizeOfTexture, (float) (posY + 75 - 50) - this.ySizeOfTexture, this.mc.thePlayer);

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
		buttonList.add(new GuiButton(1, posX + 15, posY + 90, 70, 12, "ChaosWarrior"));
		buttonList.add(new GuiButton(2, posX + 100, posY + 90, 52, 12, "EnderMan"));
		buttonList.add(new GuiButton(3, posX + 173, posY + 90, 52, 12, "General"));

		buttonList.add(new GuiButton(4, posX + 195, posY + 3, 50, 20, "Donate"));

	}

	public static void func_110423_a(int par0, int par1, int par2, float par3, float par4, EntityLivingBase par5EntityLivingBase) {
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par0, (float) par1, 50.0F);
		GL11.glScalef((float) (-par2), (float) par2, (float) par2);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		float f2 = par5EntityLivingBase.renderYawOffset;
		float f3 = par5EntityLivingBase.rotationYaw;
		float f4 = par5EntityLivingBase.rotationPitch;
		float f5 = par5EntityLivingBase.prevRotationYawHead;
		float f6 = par5EntityLivingBase.rotationYawHead;
		GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-((float) Math.atan((double) (par4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
		par5EntityLivingBase.renderYawOffset = (float) Math.atan((double) (par3 / 40.0F)) * 20.0F;
		par5EntityLivingBase.rotationYaw = (float) Math.atan((double) (par3 / 40.0F)) * 40.0F;
		par5EntityLivingBase.rotationPitch = -((float) Math.atan((double) (par4 / 40.0F))) * 20.0F;
		par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
		par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
		GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
		RenderManager.instance.playerViewY = 180.0F;
		RenderManager.instance.renderEntityWithPosYaw(par5EntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
		par5EntityLivingBase.renderYawOffset = f2;
		par5EntityLivingBase.rotationYaw = f3;
		par5EntityLivingBase.rotationPitch = f4;
		par5EntityLivingBase.prevRotationYawHead = f5;
		par5EntityLivingBase.rotationYawHead = f6;
		GL11.glPopMatrix();
		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}



	protected void actionPerformed(GuiButton guibutton) {
		// id is the id you give your button
		ByteArrayDataOutput out = ByteStreams.newDataOutput();
		out.writeByte(guibutton.id);
		PacketDispatcher.sendPacketToServer(PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 4, out.toByteArray()));
	
		switch (guibutton.id) {
		case 1:
			if (ClientProxy.donators.contains(this.mc.thePlayer.getName())) {
				colorIndex = 2;
				talkTo = "ChaosWarrior Selected";
			} else {

				colorIndex = 0;
				talkTo = "You Need To Donate For This! ( $5 )";

			}

			break;
		case 2:

			colorIndex = 1;
			talkTo = "Coming Soon!";

			break;
		case 3:

			colorIndex = 1;
			talkTo = "Coming Soon!";

			break;

		case 4:

			try {
				Desktop.getDesktop().browse(new URL("http://resinresin.buycraft.net/category/87818").toURI());
			} catch (Exception e) {
			}

		}

		// Packet code here
		// PacketDispatcher.sendPacketToServer(packet); //send packet
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {

		super.mouseClicked(mouseX, mouseY, mouseButton);

		for (GuiButton button : (List<GuiButton>) buttonList) {
			if (button.mousePressed(mc, mouseX, mouseY)) {
				mc.sndManager.playSoundFX("random.click", 1, 1);
				actionPerformed(button);
			}
		}
	}

}