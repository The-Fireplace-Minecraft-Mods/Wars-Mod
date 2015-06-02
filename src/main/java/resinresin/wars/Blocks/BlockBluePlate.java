package resinresin.wars.Blocks;

import java.util.Iterator;
import java.util.List;

import resinresin.wars.registry.WarsItems;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockBluePlate extends BlockPressurePlate {

	protected BlockBluePlate(Material material, Sensitivity sensitivity) {
		super(material, sensitivity);

	}

	@Override
	protected void updateState(World world, BlockPos pos, IBlockState state, int oldRedstoneStrength) {

		int j = this.computeRedstoneStrength(world, pos);
		boolean flag = oldRedstoneStrength > 0;
		boolean flag1 = j > 0;
		float var7 = 0.125F;

		if (oldRedstoneStrength != j) {
			@SuppressWarnings("rawtypes")
			List var8 = null;
			var8 = world.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getCollisionBoundingBox().getAABB((double) ((float) pos.getX() + var7), (double) pos.getY(), (double) ((float) pos.getZ() + var7), (double) ((float) (pos.getX() + 1) - var7), (double) pos.getY() + 0.25D, (double) ((float) (pos.getZ() + 1) - var7)));

			if (!var8.isEmpty()) {
				@SuppressWarnings("rawtypes")
				Iterator var9 = var8.iterator();

				while (var9.hasNext()) {
					EntityPlayer var10 = (EntityPlayer) var9.next();

					if (!var10.doesEntityNotTriggerPressurePlate()) {

						ItemStack boots = var10.inventory.armorItemInSlot(0);
						if (boots != null && boots.itemID == WarsItems.blueBoots.itemID) {

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

}