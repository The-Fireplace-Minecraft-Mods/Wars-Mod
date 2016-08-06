package the_fireplace.wars.client;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class WarsKeyEventHandler {

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (ClientProxy.toggleHUD.isPressed()) {
			ClientProxy.guiVisible = !ClientProxy.guiVisible;
			System.out.print("Killstreak Hud Toggled");
		}
	}
}
