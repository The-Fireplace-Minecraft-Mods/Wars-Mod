package resinresin.wars.entities;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPTNTPrimed extends Entity {
	/** How long the fuse is */
	public int fuse;

	public EntityPTNTPrimed(World par1World) {
		super(par1World);
		this.fuse = 50;
		this.preventEntitySpawning = true;
		this.setSize(0.98F, 0.98F);
		this.posY = this.height / 2.0F;
	}

	public EntityPTNTPrimed(World par1World, double par2, double par4, double par6) {
		this(par1World);
		this.setPosition(par2, par4, par6);
		float var8 = (float) (Math.random() * Math.PI * 2.0D);
		this.motionX = (double) (-((float) Math.sin((double) var8)) * 0.02F);
		this.motionY = 0.20000000298023224D;
		this.motionZ = (double) (-((float) Math.cos((double) var8)) * 0.02F);
		this.fuse = 50;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	protected void entityInit() {
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they
	 * walk on. used for spiders and wolves to prevent them from trampling crops
	 */
	protected boolean canTriggerWalking() {
		return false;
	}

	/**
	 * Returns true if other Entities should be prevented from moving through
	 * this Entity.
	 */
	public boolean canBeCollidedWith() {
		return !this.isDead;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate() {
		System.out.print("works2");
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		this.motionY -= 0.03999999910593033D;
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
		this.motionX *= 0.9800000190734863D;
		this.motionY *= 0.9800000190734863D;
		this.motionZ *= 0.9800000190734863D;

		if (this.onGround) {
			this.motionX *= 0.699999988079071D;
			this.motionZ *= 0.699999988079071D;
			this.motionY *= -0.5D;
		}

		if (this.fuse-- <= 0) {
			this.worldObj.spawnParticle("hugeexplosion", this.posX, this.posY, this.posZ, 1.0D, 0.0D, 0.0D, new int[0]);
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);

			this.setDead();

			if (!this.worldObj.isRemote) {

				this.explode();

			}
		} else {
			this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);

		}
	}

	@SuppressWarnings("unchecked")
	private void explode() {

		List<EntityLiving> nearbyEntities = worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getAABBPool().getAABB(posX - 5, posY - 5, posZ - 5, posX + 5, posY + 5, posZ + 5));
		for (EntityLiving living : nearbyEntities) {
			living.attackEntityFrom(DamageSource.setExplosionSource(null), 10);
		}

	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		par1NBTTagCompound.setByte("Fuse", (byte) this.fuse);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		this.fuse = par1NBTTagCompound.getByte("Fuse");
	}

	@SideOnly(Side.CLIENT)
	public float getShadowSize() {
		return 0.0F;
	}
}
