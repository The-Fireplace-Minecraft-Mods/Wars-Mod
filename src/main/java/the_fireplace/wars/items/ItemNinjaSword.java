package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;

public class ItemNinjaSword extends Item {

	private float weaponDamage;

	public ItemNinjaSword() {
		super();
		setCreativeTab(WarsMod.tabWarsClasses);
		setMaxStackSize(1);
		weaponDamage = 3F;
		setFull3D();
	}

	/*int cooldown = 0;

	@Override
	public void onUpdate(ItemStack par1ItemStak, World par2World, Entity par3Entity, int par4, boolean par5) {
		cooldown--;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote) {
			if (cooldown <= 0) {
				if (WarsMod.getDonators().contains(player.getName())) {
					if (player instanceof EntityPlayerMP && ItemArmorMod.hasFullSuit(player, WarsItems.ninjaArmor)) {

						//TODO: Cool ninja powers
						cooldown = 40;
						return new ActionResult(EnumActionResult.SUCCESS, stack);
					}
				} else {
					player.addChatMessage(new TextComponentTranslation("class.donatoronly"));
					return new ActionResult(EnumActionResult.FAIL, stack);
				}
			}
		}
		return new ActionResult(EnumActionResult.PASS, stack);
	}*/

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (!WarsMod.getDonators().contains(player.getName())) {
			player.addChatMessage(new TextComponentTranslation("class.donatoronly"));
			return false;
		}

		return false;
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
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D/3, 0));
		}

		return multimap;
	}
}
