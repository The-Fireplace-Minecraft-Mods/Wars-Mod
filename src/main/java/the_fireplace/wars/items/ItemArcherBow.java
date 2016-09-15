package the_fireplace.wars.items;

import net.minecraft.item.ItemBow;
import the_fireplace.wars.WarsMod;

public class ItemArcherBow extends ItemBow {

	public ItemArcherBow() {
		super();
		setMaxStackSize(1);
		setCreativeTab(WarsMod.tabWarsClasses);
		setFull3D();
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based
	 * on material.
	 */
	@Override
	public int getItemEnchantability() {
		return 1;
	}
}