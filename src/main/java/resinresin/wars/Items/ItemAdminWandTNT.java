package resinresin.wars.Items;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;

public class ItemAdminWandTNT extends Item {
	public ItemAdminWandTNT() {
		super();
		this.setCreativeTab(WarsMod.tabWarsItems);

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (!world.isRemote) {
			Vec3 look = entityplayer.getLookVec();
			EntityTNTPrimed fireball2 = new EntityTNTPrimed(world);
			fireball2.setPosition(entityplayer.posX + look.xCoord * 0, entityplayer.posY + look.yCoord * 0, entityplayer.posZ + look.zCoord * 0);
			fireball2.motionX = look.xCoord * 0.1;
			fireball2.motionY = look.yCoord * 0.1;
			fireball2.motionZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(fireball2);
		}
		return itemstack;
	}

}
