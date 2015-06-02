package resinresin.wars.container;

import resinresin.wars.WarsMod;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public enum GuiType {
	GUIBUTTON;

	public static GuiType fromGuiId(int guiId) {
		if (guiId < 0 || guiId > values().length) {
			throw new IllegalArgumentException();
		} else {
			return values()[guiId];
		}
	}

	public void open(EntityPlayer player) {
		open(player, 0, 0, 0);
	}

	@SideOnly(Side.SERVER)
	public void open(EntityPlayer player, int x, int y, int z) {
		player.openGui(WarsMod.instance, ordinal(), player.worldObj, x, y, z);

	}

	public void open(EntityPlayer player, int entityId) {
		open(player, entityId, 0, 0);
	}
}