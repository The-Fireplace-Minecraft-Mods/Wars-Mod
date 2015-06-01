package resinresin.wars.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.registry.WarsItems;

public final class WarsItemsTab extends CreativeTabs {
	public WarsItemsTab(String par2Str) {
		super(par2Str);
	}


	public String getTranslatedTabLabel() {
		return "Wars Mod Items";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
	
		return WarsItems.ancientGem;
	}
}