package resinresin.wars.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler extends Gui implements ITickHandler {

	private final Minecraft mc = FMLClientHandler.instance().getClient();
	public static ResourceLocation texture = new ResourceLocation("warsmod:gui/killcounter.png");

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

		if (type.contains(TickType.RENDER) && mc.theWorld != null && (mc.currentScreen == null)) {
			if (ClientProxy.wkh.guiVisible && (!Minecraft.getMinecraft().isSingleplayer() || Minecraft.getMinecraft().getIntegratedServer().getPublic())) {
				mc.entityRenderer.setupOverlayRendering();
				Minecraft mc = FMLClientHandler.instance().getClient();
				mc.renderEngine.bindTexture(texture);
				drawTexturedModalRect(5, 5, 0, 0, 160, 32);

				mc.fontRenderer.drawString(String.valueOf(ClientProxy.killstreak), 137, 17, 0x000000);
				mc.fontRenderer.drawString(String.valueOf("Press B To Toggle Gui Off"), 10, 39, 0x000000);

			}
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.RENDER);
	}

	@Override
	public String getLabel() {
		return "WarsModClientTick";
	}
}
