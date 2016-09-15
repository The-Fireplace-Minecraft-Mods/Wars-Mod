package the_fireplace.wars.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.WarsMod;

public class ItemAdminWandBall extends Item {
	public ItemAdminWandBall() {
		super();
		this.setCreativeTab(WarsMod.tabWarsItems);
	}

    @Override
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, EnumHand hand) {
		if (!world.isRemote) {
			Vec3d look = entityplayer.getLookVec();
			EntityLargeFireball fireball = new EntityLargeFireball(world, entityplayer, 1, 1, 1);
			fireball.setPosition(entityplayer.posX + look.xCoord * 1, entityplayer.posY + look.yCoord * 1, entityplayer.posZ + look.zCoord * 1);
			fireball.accelerationX = look.xCoord * 0.1;
			fireball.accelerationY = look.yCoord * 0.1;
			fireball.accelerationZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(fireball);
		}
		return new ActionResult(EnumActionResult.PASS, itemstack);
	}

}
