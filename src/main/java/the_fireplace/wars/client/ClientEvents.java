package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

public class ClientEvents extends Gui  {

	private final Minecraft mc = FMLClientHandler.instance().getClient();
	public static ResourceLocation texture = new ResourceLocation("warsmod:gui/killcounter.png");
	public static final int KEYID = 0;
	private static final String[] desc = {"key.killcounter.desc"};
	private static final int[] keyValues = {Keyboard.KEY_B};
	private final KeyBinding[] keys;

	public ClientEvents(){
		keys = new KeyBinding[desc.length];
		for(int i = 0; i < desc.length; ++i){
			keys[i] = new KeyBinding(desc[i], keyValues[i], "key.warsmod.category");
			ClientRegistry.registerKeyBinding(keys[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event){
		if(keys[KEYID].isPressed()){
			ClientProxy.guiVisible = !ClientProxy.guiVisible;
		}
	}

	@SubscribeEvent
	public void onClientTick(TickEvent.RenderTickEvent event) {
		if (mc.theWorld != null && mc.currentScreen == null) {
			if (ClientProxy.guiVisible && (!Minecraft.getMinecraft().isSingleplayer() || Minecraft.getMinecraft().getIntegratedServer().getPublic())) {
				mc.entityRenderer.setupOverlayRendering();
				Minecraft mc = FMLClientHandler.instance().getClient();
				mc.renderEngine.bindTexture(texture);
				drawTexturedModalRect(5, 5, 0, 0, 160, 32);

				mc.fontRendererObj.drawString(String.valueOf(ClientProxy.killStreak), 137, 17, 0x000000);
				mc.fontRendererObj.drawString(String.valueOf("Press "+Keyboard.getKeyName(keys[KEYID].getKeyCode())+" To Toggle Gui Off"), 10, 39, 0x000000);
			}
		}
	}
}
