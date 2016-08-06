package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

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
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (player instanceof EntityPlayerMP && !ItemArmorMod.fullEquiped(player, WarsItems.knightArmor)) {
			player.addChatMessage(new ChatComponentText("\u00a74DONT CHEAT! \u00a72Wear The Knight Armour (which you must put on in survival)"));
			stack.stackSize = 0;

		}
		return false;
	}

	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {

		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.confusion.id, 15 * 20, 6));
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return par2Block != WarsBlocks.sumBlock ? 0.9F : 15F;
	}

	@Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.BLOCK;
	}

	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}

	@Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}

    @Override
    @SuppressWarnings("unchecked")
	public Multimap getAttributeModifiers(ItemStack stack)
    {
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }
}