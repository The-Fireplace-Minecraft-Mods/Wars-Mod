package resinresin.wars.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;
import resinresin.wars.registry.WarsBlocks;

import com.google.common.collect.Multimap;

public class ItemGuardSword extends Item {

	private float weaponDamage;

	public ItemGuardSword() {
		super();
		setCreativeTab(WarsMod.tabWarsClasses);
		setMaxStackSize(1);
		setMaxDamage(300);
		weaponDamage = 3F;
		setFull3D();

	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (player instanceof EntityPlayerMP && !ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.guardArmor)) {
			player.addChatMessage(new ChatComponentText("\u00a74DONT CHEAT! \u00a72Wear The Guard Armour (which you must put on in survival)"));
			stack.stackSize = 0;

		}
		return false;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		player.setItemInUse(itemStack, getMaxItemUseDuration(itemStack));
		return itemStack;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return par2Block.blockID != WarsBlocks.sumBlock.blockID ? 0.9F : 15F;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
	}

	@Override
	@SideOnly(Side.CLIENT)
	// Makes it render nicely
	public boolean isFull3D() {
		return true;
	}

	// The max use time of the action
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}


	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)weaponDamage, 0));
		return multimap;
	}

}
