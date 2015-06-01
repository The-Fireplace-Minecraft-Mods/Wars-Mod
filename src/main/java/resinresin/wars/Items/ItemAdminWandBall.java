package resinresin.wars.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.warsmod;

public class ItemAdminWandBall extends Item {
	public ItemAdminWandBall() {
		super();
		this.setCreativeTab(warsmod.tabWarsItems);

	}

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (!world.isRemote) {
			Vec3 look = entityplayer.getLookVec();
			EntityLargeFireball fireball2 = new EntityLargeFireball(world, entityplayer, 1, 1, 1);
			fireball2.setPosition(entityplayer.posX + look.xCoord * 1, entityplayer.posY + look.yCoord * 1, entityplayer.posZ + look.zCoord * 1);
			fireball2.accelerationX = look.xCoord * 0.1;
			fireball2.accelerationY = look.yCoord * 0.1;
			fireball2.accelerationZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(fireball2);
		}
		return itemstack;
	}

}
