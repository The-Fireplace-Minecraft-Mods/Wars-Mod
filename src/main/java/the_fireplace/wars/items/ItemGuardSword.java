package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;

public class ItemGuardSword extends Item implements Undroppable {

	private float weaponDamage;

	public ItemGuardSword() {
		super();
		this.setCreativeTab(WarsMod.tabWarsClasses);
		this.setMaxStackSize(1);
		this.weaponDamage = 3F;
		setFull3D();
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
		return par2Block.getBlock() != WarsBlocks.sumBlock ? 0.9F : 15F;
	}

    @SuppressWarnings("unchecked")
	@Override
	public Multimap getAttributeModifiers(EntityEquipmentSlot equipmentSlot, ItemStack stack)
	{
		Multimap multimap = super.getAttributeModifiers(equipmentSlot, stack);

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
		{
			multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.weaponDamage, 0));
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
		}

		return multimap;
	}

}
