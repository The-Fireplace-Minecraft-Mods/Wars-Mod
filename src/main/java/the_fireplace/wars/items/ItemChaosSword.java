package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

public class ItemChaosSword extends Item {

	private float weaponDamage;

	public ItemChaosSword() {
		super();
		setCreativeTab(WarsMod.tabWarsClasses);
		setMaxStackSize(1);
		weaponDamage = 3F;
		setFull3D();
	}

	int cooldown = 0;

	@Override
	public void onUpdate(ItemStack par1ItemStak, World par2World, Entity par3Entity, int par4, boolean par5) {
		cooldown--;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote) {
			if (cooldown <= 0) {
				if (WarsMod.getDonators().contains(player.getName())) {
					if (player instanceof EntityPlayerMP && ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor)) {
						Vec3d look = player.getLookVec();
						EntityWitherSkull skull = new EntityWitherSkull(world, player, 1, 1, 1);
						skull.setPosition(player.posX + look.xCoord * 1, player.posY + look.yCoord * 2, player.posZ + look.zCoord * 1);
						skull.accelerationX = look.xCoord * 0.1;
						skull.accelerationY = look.yCoord * 0.1;
						skull.accelerationZ = look.zCoord * 0.1;
						world.spawnEntityInWorld(skull);
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
	}

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
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
		}

		return multimap;
	}
}
