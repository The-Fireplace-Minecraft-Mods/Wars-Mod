package the_fireplace.wars.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;
import the_fireplace.wars.WarsMod;

public class ItemMassMeal extends Item {
	public ItemMassMeal() {
		super();
		setCreativeTab(WarsMod.tabWarsItems);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {

		if (!player.canPlayerEdit(pos, side, stack)) {
			return EnumActionResult.FAIL;
		} else {
			IBlockState state;
			int i;
			int x;

			state = world.getBlockState(pos);

			BonemealEvent event = new BonemealEvent(player, world, pos, state);

			if (MinecraftForge.EVENT_BUS.post(event)) {
				return EnumActionResult.FAIL;
			}

			if (state == Blocks.GRASS.getDefaultState()) {
				if (!world.isRemote) {
					--stack.stackSize;
					label133:

						for (i = 0; i < 128; ++i) {
							x = pos.getX();
							int y = pos.getY() + 1;
							int z = pos.getZ();

							for (int j = 0; j < i / 16; ++j) {
								x += itemRand.nextInt(15) - 5;
								y += (itemRand.nextInt(15) - 5) * itemRand.nextInt(15) / 10;
								z += itemRand.nextInt(15) - 5;

								BlockPos positionGrass2 = new BlockPos(x, y - 1, z);

								if (world.getBlockState(positionGrass2).getBlock() != Blocks.GRASS || world.isBlockNormalCube(pos, true)) {
									continue label133;
								}
							}

							BlockPos positionGrass = new BlockPos(x, y, z);

							if (world.getBlockState(positionGrass) == Blocks.AIR.getDefaultState()) {
								if (itemRand.nextInt(3) != 0) {
									if (Blocks.TALLGRASS.canBlockStay(world, positionGrass, Blocks.TALLGRASS.getDefaultState() )) {
										WarsMod.generateBlock(world, x, y, z, Blocks.TALLGRASS);
									}
								}
							}
							return EnumActionResult.SUCCESS;
						}
				}
			}
		}
		return EnumActionResult.PASS;

	}

}
