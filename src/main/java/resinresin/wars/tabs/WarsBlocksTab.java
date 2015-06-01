package resinresin.wars.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.registry.WarsBlocks;

public final class WarsBlocksTab extends CreativeTabs {
	public WarsBlocksTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	public String getTranslatedTabLabel() {
		return "Wars Mod Blocks";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(WarsBlocks.castleSelector);
	}

}