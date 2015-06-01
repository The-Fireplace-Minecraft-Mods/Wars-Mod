package resinresin.wars.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.warsmod;

public class ItemAntidote extends Item {
	public ItemAntidote() {
		super();
		this.setCreativeTab(warsmod.tabWarsItems);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.EPIC;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {

		if (!world.isRemote) {
			entityplayer.curePotionEffects(new ItemStack(Items.milk_bucket));

			itemstack.stackSize = 0;
		}

		return itemstack;
	}

}
