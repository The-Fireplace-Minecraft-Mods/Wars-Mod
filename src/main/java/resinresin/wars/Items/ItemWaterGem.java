package resinresin.wars.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.warsmod;

public class ItemWaterGem extends Item {
	public ItemWaterGem() {
		super();
		this.setCreativeTab(warsmod.tabWarsItems);

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
