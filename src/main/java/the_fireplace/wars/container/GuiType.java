package the_fireplace.wars.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.WarsMod;

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

	@SideOnly(Side.SERVER)//Not supposed to use this
	public void open(EntityPlayer player, int x, int y, int z) {
		player.openGui(WarsMod.instance, ordinal(), player.worldObj, x, y, z);

	}

	public void open(EntityPlayer player, int entityId) {
		open(player, entityId, 0, 0);
	}
}