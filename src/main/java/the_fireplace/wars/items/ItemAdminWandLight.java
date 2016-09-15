package the_fireplace.wars.items;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.WarsMod;

public class ItemAdminWandLight extends Item {

	public ItemAdminWandLight() {
		super();
		this.setCreativeTab(WarsMod.tabWarsItems);

	}

	@Override
    @SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@Override
    @SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	@Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (!world.isRemote) {
			Vec3 look = entityplayer.getLookVec();
			EntityLightningBolt bolt = new EntityLightningBolt(world, 1, 1, 1);
			bolt.setPosition(entityplayer.posX + look.xCoord * 0, entityplayer.posY + look.yCoord * 0, entityplayer.posZ + look.zCoord * 0);
			bolt.lastTickPosX = look.xCoord * 0.1;
			bolt.lastTickPosY = look.yCoord * 0.1;
			bolt.lastTickPosZ = look.zCoord * 0.1;
			world.spawnEntityInWorld(bolt);

		}

		return itemstack;
	}

}
