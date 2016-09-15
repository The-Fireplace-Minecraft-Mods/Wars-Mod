package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;

public class ItemKnightSword extends Item {

	private float weaponDamage;

	public ItemKnightSword() {
		super();
		this.setCreativeTab(WarsMod.tabWarsClasses);
		this.setMaxStackSize(1);
		this.setMaxDamage(300);
		this.weaponDamage = 4F;
		setFull3D();
	}

	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		par2EntityLiving.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 15 * 20, 6));
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, IBlockState par2Block) {
		return par2Block.getBlock() != WarsBlocks.sumBlock ? 0.9F : 15F;
	}

    @Override
    @SuppressWarnings("unchecked")
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