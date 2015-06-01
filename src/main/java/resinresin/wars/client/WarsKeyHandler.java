package resinresin.wars.client;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class WarsKeyHandler extends KeyHandler {
	public boolean guiVisible = true;

	public WarsKeyHandler() {

		super(new KeyBinding[] { new KeyBinding("wars.key.togglehud", Keyboard.KEY_B) }, new boolean[] { false });

	}

	@Override
	public String getLabel() {
		return "WarsKeyHandler";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		if (!tickEnd) {
			guiVisible = !guiVisible;
			System.out.print("Killstreak Hud Toggled");
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		// TODO Auto-generated method stub

	}

}
