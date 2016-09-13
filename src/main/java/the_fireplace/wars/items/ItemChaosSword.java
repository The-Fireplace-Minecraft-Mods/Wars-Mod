package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.Vec3;
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
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		player.setItemInUse(stack, getMaxItemUseDuration(stack));

		if (!world.isRemote) {
			if (cooldown <= 0) {
				if (WarsMod.getDonators().contains(player.getName())) {

					if (player instanceof EntityPlayerMP && ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor)) {

						player.setItemInUse(stack, getMaxItemUseDuration(stack));

						Vec3 look = player.getLookVec();
						EntityWitherSkull fireball2 = new EntityWitherSkull(world, player, 1, 1, 1);
						fireball2.setPosition(player.posX + look.xCoord * 1, player.posY + look.yCoord * 2, player.posZ + look.zCoord * 1);
						fireball2.accelerationX = look.xCoord * 0.1;
						fireball2.accelerationY = look.yCoord * 0.1;
						fireball2.accelerationZ = look.zCoord * 0.1;
						world.spawnEntityInWorld(fireball2);
						cooldown = 40;
					}
				} else {
					player.addChatMessage(new ChatComponentTranslation("class.donatoronly"));
					return stack;
				}
			}
		}
		return stack;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {

		if (!WarsMod.getDonators().contains(player.getName())) {
			player.addChatMessage(new ChatComponentTranslation("class.donatoronly"));
			return false;
		}

		return false;
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
	@SuppressWarnings("unchecked")
	public Multimap getAttributeModifiers(ItemStack stack)
	{
		Multimap multimap = super.getAttributeModifiers(stack);
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", weaponDamage, 0));
		return multimap;
	}

}
