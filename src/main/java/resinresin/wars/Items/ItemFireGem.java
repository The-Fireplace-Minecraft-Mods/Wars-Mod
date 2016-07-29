package resinresin.wars.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;

public class ItemFireGem extends Item {
	public ItemFireGem() {
		super();
		this.setCreativeTab(WarsMod.tabWarsItems);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
