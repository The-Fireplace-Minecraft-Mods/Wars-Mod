package the_fireplace.wars.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.init.WarsItems;

public final class WarsClassesTab extends CreativeTabs {
	public WarsClassesTab(String par2Str) {
		super(par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return WarsItems.knightSword;
	}
}