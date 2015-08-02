package resinresin.wars.Items;

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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;
import resinresin.wars.registry.WarsBlocks;

import com.google.common.collect.Multimap;

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
    public float func_82803_g()
    {
        return this.weaponDamage;
    }
    
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (player instanceof EntityPlayerMP && !ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.knightArmor)) {
			player.addChatMessage(new ChatComponentText("\u00a74DONT CHEAT! \u00a72Wear The Knight Armour (which you must put on in survival)"));
			stack.stackSize = 0;

		}
		return false;
	}

	/**
	 * Current implementations of this method in child classes do not use the
	 * entry argument beside ev. They just raise the damage on the stack.
	 */
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {

		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.confusion.id, 15 * 20, 6));
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return par2Block != WarsBlocks.sumBlock ? 0.9F : 15F;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.BLOCK;
	}

	@SideOnly(Side.CLIENT)
	// Makes it render nicely
	public boolean isFull3D() {
		return true;
	}

	// The max use time of the action
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }
}