package resinresin.wars.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;

public class ItemDecayGem extends Item {
	public ItemDecayGem() {
		super();
		this.setCreativeTab(WarsMod.tabWarsItems);

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
