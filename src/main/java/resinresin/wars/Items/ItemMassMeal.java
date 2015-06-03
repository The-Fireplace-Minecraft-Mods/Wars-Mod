package resinresin.wars.Items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;
import resinresin.wars.Warsmod;

public class ItemMassMeal extends Item {
	public ItemMassMeal() {
		super();
		this.setCreativeTab(Warsmod.tabWarsItems);

	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {

		if (!player.canPlayerEdit(pos, side, stack)) {
			return false;
		}

		else {
			IBlockState var11;
			int var12;
			int var13;

			var11 = world.getBlockState(pos);

			BonemealEvent event = new BonemealEvent(player, world, pos, var11);

			if (MinecraftForge.EVENT_BUS.post(event))
				return false;

			if (var11 == Blocks.grass) {
				if (!world.isRemote) {
					--stack.stackSize;
					label133:

					for (var12 = 0; var12 < 128; ++var12) {
						var13 = pos.getX();
						int var14 = pos.getY() + 1;
						int var15 = pos.getZ();

						for (int var16 = 0; var16 < var12 / 16; ++var16) {
							var13 += itemRand.nextInt(15) - 5;
							var14 += (itemRand.nextInt(15) - 5) * itemRand.nextInt(15) / 10;
							var15 += itemRand.nextInt(15) - 5;

							BlockPos positionGrass2 = new BlockPos(var13, var14 - 1, var15);
							
							if (world.getBlockState(positionGrass2) != Blocks.grass || world.isBlockNormalCube(pos, true)) {
								continue label133;
							}
						}

						BlockPos positionGrass = new BlockPos(var13, var14, var15);
						
						if (world.getBlockState(positionGrass) == Blocks.air) {
							if (itemRand.nextInt(3) != 0) {
								if (Blocks.tallgrass.canBlockStay(world, positionGrass, Blocks.tallgrass.getDefaultState() )) {
									Warsmod.generateBlock(world, var13, var14, var15, Blocks.tallgrass);
								}
							} 
						}
					}
				}
			}
		}
		return false;

	}

}
