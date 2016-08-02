package the_fireplace.wars.blocks;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.init.WarsItems;

public class BlockYellowPlate extends BlockPressurePlate {

	public BlockYellowPlate(Material material, Sensitivity sens) {
		super(material, sens);

	}

	@SuppressWarnings("rawtypes")
	private void setStateIfMobInteractsWithPlate(World world, BlockPos pos, IBlockState state, int oldRedstoneStrength) {

		int j = this.computeRedstoneStrength(world, pos);
		boolean flag = oldRedstoneStrength > 0;
		boolean flag1 = j > 0;

		List var8 = null;
		float var7 = 0.125F;

		BlockPos posMin = new BlockPos(pos.getX() + var7, pos.getY(), pos.getZ() + var7);
		BlockPos posMax = new BlockPos(pos.getX() + 1 - var7, pos.getY() + 0.25D, pos.getZ() + 1 - var7);

		AxisAlignedBB boundingBox = new AxisAlignedBB(posMin, posMax);
		var8 = world.getEntitiesWithinAABB(EntityPlayer.class, boundingBox);

		if (oldRedstoneStrength != j) {
			if (!var8.isEmpty()) {
				Iterator var9 = var8.iterator();

				while (var9.hasNext()) {
					EntityPlayer var10 = (EntityPlayer) var9.next();

					if (!var10.doesEntityNotTriggerPressurePlate()) {

						ItemStack boots = var10.inventory.armorItemInSlot(0);
						if (boots != null && boots.getItem() == WarsItems.yellowBoots) {

							state = this.setRedstoneStrength(state, j);
							world.setBlockState(pos, state, 2);
							this.updateNeighbors(world, pos);
							world.markBlockRangeForRenderUpdate(pos, pos);

						}
					}
				}
			}

		}

		if (!flag1 && flag) {
			world.playSoundEffect((double) pos.getX() + 0.5D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D, "random.click", 0.3F, 0.5F);
		} else if (flag1 && !flag) {
			world.playSoundEffect((double) pos.getX() + 0.5D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D, "random.click", 0.3F, 0.6F);
		}

		if (flag1) {
			world.scheduleUpdate(pos, this, this.tickRate(world));
		}
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entityIn) {
		if (!world.isRemote) {

			int i = this.getRedstoneStrength(state);
			if (i == 0) {
				this.setStateIfMobInteractsWithPlate(world, pos, state, i);
			}

		}
	}

}