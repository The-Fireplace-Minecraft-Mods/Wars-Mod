package the_fireplace.wars.blocks;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.init.WarsItems;

import java.util.List;

public class BlockRedPlate extends BlockPressurePlate {

	public BlockRedPlate(Material material, Sensitivity sens) {
		super(material, sens);
	}

	private void setStateIfMobInteractsWithPlate(World world, BlockPos pos, IBlockState state, int oldRedstoneStrength) {

		int j = this.computeRedstoneStrength(world, pos);
		boolean flag = oldRedstoneStrength > 0;
		boolean flag1 = j > 0;

		List entities;
		float offset = 0.125F;

		BlockPos posMin = new BlockPos(pos.getX() + offset, pos.getY(), pos.getZ() + offset);
		BlockPos posMax = new BlockPos(pos.getX() + 1 - offset, pos.getY() + 0.25D, pos.getZ() + 1 - offset);

		AxisAlignedBB boundingBox = new AxisAlignedBB(posMin, posMax);
		entities = world.getEntitiesWithinAABB(EntityPlayer.class, boundingBox);

		if (oldRedstoneStrength != j) {
			if (!entities.isEmpty()) {

                for (Object entity : entities) {
                    EntityPlayer player = (EntityPlayer) entity;

                    if (!player.doesEntityNotTriggerPressurePlate()) {

                        ItemStack boots = player.inventory.armorItemInSlot(0);
                        if (boots != null && boots.getItem() == WarsItems.redBoots) {
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
			world.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F, false);
		} else if (flag1 && !flag) {
			world.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F, false);
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