package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientTickEventHandler extends Gui  {

	private final Minecraft mc = FMLClientHandler.instance().getClient();
	public static ResourceLocation texture = new ResourceLocation("warsmod:gui/killcounter.png");

	 //Called when the client ticks. 
	 @SubscribeEvent
	 public void onClientTick(TickEvent.RenderTickEvent event) {
		 if (mc.theWorld != null && mc.currentScreen == null) {
				if (ClientProxy.guiVisible && (!Minecraft.getMinecraft().isSingleplayer() || Minecraft.getMinecraft().getIntegratedServer().getPublic())) {
					mc.entityRenderer.setupOverlayRendering();
					Minecraft mc = FMLClientHandler.instance().getClient();
					mc.renderEngine.bindTexture(texture);
					drawTexturedModalRect(5, 5, 0, 0, 160, 32);

					mc.fontRendererObj.drawString(String.valueOf(ClientProxy.killStreak), 137, 17, 0x000000);
					mc.fontRendererObj.drawString(String.valueOf("Press B To Toggle Gui Off"), 10, 39, 0x000000);//TODO: Modifiable keybind
				}
			}
		 
	}
	


}
