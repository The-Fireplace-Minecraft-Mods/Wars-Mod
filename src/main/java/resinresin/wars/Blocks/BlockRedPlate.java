package resinresin.wars.Blocks;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import resinresin.wars.registry.WarsItems;

public class BlockRedPlate extends BlockPressurePlate {

	/** The mob type that can trigger this pressure plate. */
	@SuppressWarnings("unused")
	private static EnumMobType triggerMobType;

	@SuppressWarnings("static-access")
	public BlockRedPlate(int par1, String par2Str, Material par3Material, EnumMobType par4EnumMobType) {
		super(par1, par2Str, Material.iron, EnumMobType.players);
		this.triggerMobType = par4EnumMobType;
	}

	@SuppressWarnings("rawtypes")
	private void setStateIfMobInteractsWithPlate(World par1World, int par2, int par3, int par4) {

		boolean var5 = par1World.getBlockMetadata(par2, par3, par4) == 1;
		boolean var6 = false;
		float var7 = 0.125F;
		List var8 = null;
		var8 = par1World.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getAABBPool().getAABB((double) ((float) par2 + var7), (double) par3, (double) ((float) par4 + var7), (double) ((float) (par2 + 1) - var7), (double) par3 + 0.25D, (double) ((float) (par4 + 1) - var7)));

		if (!var8.isEmpty()) {
			Iterator var9 = var8.iterator();

			while (var9.hasNext()) {
				EntityPlayer var10 = (EntityPlayer) var9.next();

				if (!var10.doesEntityNotTriggerPressurePlate()) {

					ItemStack boots = var10.inventory.armorItemInSlot(0);
					if (boots != null && boots.itemID == WarsItems.redBoots.itemID) {

						var6 = true;
						break;

					}
				}
			}
		}

		if (var6 && !var5) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
			par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);
			par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
			par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
			par1World.playSoundEffect((double) par2 + 0.5D, (double) par3 + 0.1D, (double) par4 + 0.5D, "random.click", 0.3F, 0.6F);
		}

		if (!var6 && var5) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
			par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);
			par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
			par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
			par1World.playSoundEffect((double) par2 + 0.5D, (double) par3 + 0.1D, (double) par4 + 0.5D, "random.click", 0.3F, 0.5F);
		}

		if (var6) {
			par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
		}
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (!par1World.isRemote) {
			if (par1World.getBlockMetadata(par2, par3, par4) != 1) {
				this.setStateIfMobInteractsWithPlate(par1World, par2, par3, par4);
			}
		}
	}

}