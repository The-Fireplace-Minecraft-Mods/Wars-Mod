package the_fireplace.wars.items;

import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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

public class ItemAdminWandWeb extends Item {
	public ItemAdminWandWeb() {
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
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, EnumHand hand) {
		if (!world.isRemote) {
			Vec3d look = entityplayer.getLookVec();
			EntityFallingBlock fallingBlock = new EntityFallingBlock(world, 1, 1, 1, Blocks.WEB.getDefaultState());
			fallingBlock.setPosition(entityplayer.posX + look.xCoord * 0, entityplayer.posY + look.yCoord * 0, entityplayer.posZ + look.zCoord * 0);
			fallingBlock.lastTickPosX = look.xCoord * 0.1;
			fallingBlock.lastTickPosY = look.yCoord * 0.1;
			fallingBlock.lastTickPosZ = look.zCoord * 0.1;
			fallingBlock.fallTime = 1;
			world.spawnEntity(fallingBlock);
		}
		return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	}

}
