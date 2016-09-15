package the_fireplace.wars.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWorkWaffel extends ItemFood {
	public ItemWorkWaffel(int restoreAmount) {
		super(restoreAmount, false);
		this.setMaxStackSize(3);
	}

	@Override 
	public ItemStack onItemUseFinish(ItemStack itemStack, World world, EntityLivingBase entityPlayer) {
		if (entityPlayer instanceof EntityPlayer)
			((EntityPlayer)entityPlayer).getFoodStats().addStats(this, itemStack);
		world.playSound(null, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		itemStack.stackSize--;

		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 10 * 15, 6));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.WITHER, 10 * 20, 6));
		
		return itemStack;
	}

	@Override
    @SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}
}
