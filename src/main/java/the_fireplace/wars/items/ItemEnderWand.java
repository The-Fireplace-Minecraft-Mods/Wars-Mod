package the_fireplace.wars.items;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

import java.util.Random;

/**
 * @author The_Fireplace
 */
public class ItemEnderWand extends Item {
    public ItemEnderWand() {
        super();
        this.setCreativeTab(WarsMod.tabWarsClasses);
        this.setMaxStackSize(1);
        this.setMaxDamage(300);
        setFull3D();
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (player instanceof EntityPlayerMP && !ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor)) {
            player.addChatMessage(new ChatComponentText("\u00a74DONT CHEAT! \u00a72Wear The Chaos Armor (which you must put on in survival)"));
            stack.stackSize = 0;
        }
        MovingObjectPosition result = player.rayTrace(20, 1F);
        int x = result.getBlockPos().getX();
        int y = result.getBlockPos().getY();
        int z = result.getBlockPos().getZ();
        if(!teleportTo(x, y, z, player)){
            if(player.posX > x)
                if(teleportTo(x+2, y, z, player))
                    return stack;
            if(player.posX < x)
                if(teleportTo(x-2, y, z, player))
                    return stack;
            if(player.posZ > z)
                if(teleportTo(x, y, z+2, player))
                    return stack;
            if(player.posZ < z)
                if(teleportTo(x, y, z-2, player))
                    return stack;
        }
        return stack;
    }

    @Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
        return par2Block != WarsBlocks.sumBlock ? 0.9F : 15F;
    }

    protected boolean teleportTo(double x, double y, double z, EntityPlayer player)
    {
        double d0 = player.posX;
        double d1 = player.posY;
        double d2 = player.posZ;
        player.posX = x;
        player.posY = y;
        player.posZ = z;
        boolean flag = false;
        BlockPos blockpos = new BlockPos(player.posX, player.posY, player.posZ);

        if (player.worldObj.isBlockLoaded(blockpos))
        {
            boolean flag1 = false;

            while (!flag1 && blockpos.getY() > 0)
            {
                BlockPos blockpos1 = blockpos.down();
                Block block = player.worldObj.getBlockState(blockpos1).getBlock();

                if (block.getMaterial().blocksMovement())
                {
                    flag1 = true;
                }
                else
                {
                    --player.posY;
                    blockpos = blockpos1;
                }
            }

            if (flag1)
            {
                player.setPositionAndUpdate(player.posX, player.posY, player.posZ);

                if (player.worldObj.getCollidingBoundingBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.isAnyLiquid(player.getEntityBoundingBox()))
                {
                    flag = true;
                }else{
                    player.setPositionAndUpdate(player.posX, player.posY+1, player.posZ);
                    if (player.worldObj.getCollidingBoundingBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.isAnyLiquid(player.getEntityBoundingBox()))
                    {
                        flag = true;
                    }else{
                        player.setPositionAndUpdate(player.posX, player.posY+2, player.posZ);
                        if (player.worldObj.getCollidingBoundingBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.isAnyLiquid(player.getEntityBoundingBox()))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }

        if (!flag)
        {
            player.setPosition(d0, d1, d2);
            return false;
        }
        else
        {
            int i = 128;

            for (int j = 0; j < i; ++j)
            {
                double d6 = (double)j / ((double)i - 1.0D);
                Random rand = new Random();
                float f = (rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (rand.nextFloat() - 0.5F) * 0.2F;
                double d3 = d0 + (player.posX - d0) * d6 + (rand.nextDouble() - 0.5D) * (double)player.width * 2.0D;
                double d4 = d1 + (player.posY - d1) * d6 + rand.nextDouble() * (double)player.height;
                double d5 = d2 + (player.posZ - d2) * d6 + (rand.nextDouble() - 0.5D) * (double)player.width * 2.0D;
                player.worldObj.spawnParticle(EnumParticleTypes.PORTAL, d3, d4, d5, (double)f, (double)f1, (double)f2, new int[0]);
            }

            player.worldObj.playSoundEffect(d0, d1, d2, "mob.endermen.portal", 1.0F, 1.0F);
            player.playSound("mob.endermen.portal", 1.0F, 1.0F);
            return true;
        }
    }
}
