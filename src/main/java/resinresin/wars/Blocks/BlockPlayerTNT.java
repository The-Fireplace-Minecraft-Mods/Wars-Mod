package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import resinresin.wars.Warsmod;
import resinresin.wars.Items.ItemArmorMod;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.tileentities.TileEntityPlayerTNT;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlayerTNT extends Block {

	@SideOnly(Side.CLIENT)
	private Icon blockTop;
	@SideOnly(Side.CLIENT)
	private Icon blockBase;

	public BlockPlayerTNT(int par1, int par2) {
		super(par1, Material.tnt);

		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityPlayerTNT();
	}

	/**
	 * Returns the block texture based on the side being looked at. Args: side
	 */
	public Icon getIcon(int par1, int par2) {
		return par1 == 0 ? this.blockBase : (par1 == 1 ? this.blockTop : this.blockIcon);
	}

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		super.onBlockAdded(par1World, par2, par3, par4);

		if (par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, 0, 2, 2);
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		if (par5 > 0 && Block.blocksList[par5].canProvidePower() && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, 0, 2, 2);
		}
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random) {
		return 0;
	}

	/**
	 * Called upon the block being destroyed by an explosion
	 */
	public void onBlockDestroyedByExplosion(World par1World, int par2, int par3, int par4) {
		if (!par1World.isRemote) {
			EntityPTNTPrimed var5 = new EntityPTNTPrimed(par1World, (double) ((float) par2 + 0.5F), (double) ((float) par3 + 0.5F), (double) ((float) par4 + 0.5F));
			var5.fuse = par1World.rand.nextInt(var5.fuse / 4) + var5.fuse / 8;
			par1World.spawnEntityInWorld(var5);
		}
	}

	/**
	 * Called right before the block is destroyed by a player. Args: world, x,
	 * y, z, metaData
	 */
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
		if (!par1World.isRemote) {
			if ((par5 & 1) == 1) {
				EntityPTNTPrimed var6 = new EntityPTNTPrimed(par1World, (double) ((float) par2 + 0.5F), (double) ((float) par3 + 0.5F), (double) ((float) par4 + 0.5F));
				par1World.spawnEntityInWorld(var6);
				par1World.playSoundAtEntity(var6, "random.fuse", 1.0F, 1.0F);
			}
		}
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == WarsItems.techSpanner.itemID) {
			if (par5EntityPlayer instanceof EntityPlayerMP && !ItemArmorMod.fullEquiped(par5EntityPlayer, resinresin.wars.registry.WarsItems.techArmor)) {
				return false;
			}
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, 0, 2, 2);
			return true;
		} else {
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the
	 * block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityArrow && !par1World.isRemote) {
			EntityArrow var6 = (EntityArrow) par5Entity;

			if (var6.isBurning()) {
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, 0, 2, 2);
			}
		}
	}

	/**
	 * Return whether this block can drop from an explosion.
	 */
	public boolean canDropFromExplosion(Explosion par1Explosion) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon("warsmod:PTNTFront");
		this.blockTop = par1IconRegister.registerIcon("warsmod:PTNTTop");
		this.blockBase = par1IconRegister.registerIcon("warsmod:PTNTBase");
	}

}
