package the_fireplace.wars.items;

import com.google.common.collect.Multimap;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

import java.util.Random;

/**
 * @author The_Fireplace
 */
public class ItemEnderSword extends Item {

    private float weaponDamage;

    public ItemEnderSword() {
        super();
        this.setCreativeTab(WarsMod.tabWarsClasses);
        this.setMaxStackSize(1);
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

                    if (player instanceof EntityPlayerMP && ItemArmorMod.hasFullSuit(player, WarsItems.enderArmor)) {
                        RayTraceResult result = player.rayTrace(20, 1F);
                        int x = result.getBlockPos().getX();
                        int y = result.getBlockPos().getY();
                        int z = result.getBlockPos().getZ();
                        if(!teleportTo(x, y, z, player) && !(world.getBlockState(result.getBlockPos()).getBlock() instanceof BlockGlass)){//BlockGlass check prevents potentially escaping the dome
                            if(player.posX > x)
                                if(teleportTo(x+2, y, z, player)) {
                                    cooldown = 80;
                                    return new ActionResult(EnumActionResult.SUCCESS, stack);
                                }
                            if(player.posX < x)
                                if(teleportTo(x-2, y, z, player)) {
                                    cooldown = 80;
                                    return new ActionResult(EnumActionResult.SUCCESS, stack);
                                }
                            if(player.posZ > z)
                                if(teleportTo(x, y, z+2, player)) {
                                    cooldown = 80;
                                    return new ActionResult(EnumActionResult.SUCCESS, stack);
                                }
                            if(player.posZ < z)
                                if(teleportTo(x, y, z-2, player)) {
                                    cooldown = 80;
                                    return new ActionResult(EnumActionResult.SUCCESS, stack);
                                }
                        }
                        cooldown = 80;
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
                IBlockState block = player.worldObj.getBlockState(blockpos1);

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

                if (player.worldObj.getCollisionBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.containsAnyLiquid(player.getEntityBoundingBox()))
                {
                    flag = true;
                }else{
                    player.setPositionAndUpdate(player.posX, player.posY+1, player.posZ);
                    if (player.worldObj.getCollisionBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.containsAnyLiquid(player.getEntityBoundingBox()))
                    {
                        flag = true;
                    }else{
                        player.setPositionAndUpdate(player.posX, player.posY+2, player.posZ);
                        if (player.worldObj.getCollisionBoxes(player, player.getEntityBoundingBox()).isEmpty() && !player.worldObj.containsAnyLiquid(player.getEntityBoundingBox()))
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
                player.worldObj.spawnParticle(EnumParticleTypes.PORTAL, d3, d4, d5, (double)f, (double)f1, (double)f2);
            }

            player.worldObj.playSound(null, new BlockPos(d0, d1, d2), SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            player.playSound(SoundEvents.ENTITY_ENDERMEN_TELEPORT, 1.0F, 1.0F);
            return true;
        }
    }
}
