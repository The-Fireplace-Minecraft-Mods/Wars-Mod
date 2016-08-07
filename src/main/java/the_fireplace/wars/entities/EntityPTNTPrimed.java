package the_fireplace.wars.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.List;

public class EntityPTNTPrimed extends Entity {
	/** How long the fuse is */
	public int fuse;

	public EntityPTNTPrimed(World par1World) {
		super(par1World);
		fuse = 50;
		preventEntitySpawning = true;
		setSize(0.98F, 0.98F);
		posY = height / 2.0F;
	}

	public EntityPTNTPrimed(World par1World, double par2, double par4, double par6, EntityLivingBase placer) {
		this(par1World);
		setPosition(par2, par4, par6);
		float var8 = (float) (Math.random() * Math.PI * 2.0D);
		motionX = -((float) Math.sin(var8)) * 0.02F;
		motionY = 0.20000000298023224D;
		motionZ = -((float) Math.cos(var8)) * 0.02F;
		fuse = 50;
		prevPosX = par2;
		prevPosY = par4;
		prevPosZ = par6;
	}

	@Override
	protected void entityInit() {
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they
	 * walk on. used for spiders and wolves to prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	/**
	 * Returns true if other Entities should be prevented from moving through
	 * this Entity.
	 */
	@Override
	public boolean canBeCollidedWith() {
		return !isDead;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate() {
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		motionY -= 0.03999999910593033D;
		moveEntity(motionX, motionY, motionZ);
		motionX *= 0.9800000190734863D;
		motionY *= 0.9800000190734863D;
		motionZ *= 0.9800000190734863D;

		if (onGround) {
			motionX *= 0.699999988079071D;
			motionZ *= 0.699999988079071D;
			motionY *= -0.5D;
		}

		if (fuse-- <= 0) {
			worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, posX, posY, posZ, 1.0D, 0.0D, 0.0D);
			worldObj.playSoundEffect(posX, posY, posZ, "random.explode", 4.0F, (1.0F + (worldObj.rand.nextFloat() - worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

			setDead();

			if (!worldObj.isRemote) {

				explode();

			}
		} else {
			worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, posX, posY + 0.5D, posZ, 0.0D, 0.0D, 0.0D);

		}
	}

	@SuppressWarnings("unchecked")
	private void explode() {

		List<EntityLiving> nearbyEntities = worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.fromBounds(posX - 5, posY - 5, posZ - 5, posX + 5, posY + 5, posZ + 5));
		for (EntityLiving living : nearbyEntities) {
			living.attackEntityFrom(DamageSource.setExplosionSource(null), 10);
		}

	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		par1NBTTagCompound.setByte("Fuse", (byte) fuse);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		fuse = par1NBTTagCompound.getByte("Fuse");
	}
}
