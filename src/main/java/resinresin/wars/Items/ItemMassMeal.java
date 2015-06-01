package resinresin.wars.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;
import resinresin.wars.Warsmod;

public class ItemMassMeal extends Item {
	public ItemMassMeal() {
		super();
		this.setCreativeTab(Warsmod.tabWarsItems);

	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		} else {
			int var11;
			int var12;
			int var13;

			var11 = par3World.getBlockId(par4, par5, par6);

			BonemealEvent event = new BonemealEvent(par2EntityPlayer, par3World, var11, par4, par5, par6);
			if (MinecraftForge.EVENT_BUS.post(event)) {
				return false;
			}

			if (event.getResult() == Result.ALLOW) {
				if (!par3World.isRemote) {
					par1ItemStack.stackSize--;
				}
				return true;
			}

			if (var11 == Block.grass.blockID) {
				if (!par3World.isRemote) {
					--par1ItemStack.stackSize;
					label133:

					for (var12 = 0; var12 < 128; ++var12) {
						var13 = par4;
						int var14 = par5 + 1;
						int var15 = par6;

						for (int var16 = 0; var16 < var12 / 16; ++var16) {
							var13 += itemRand.nextInt(15) - 5;
							var14 += (itemRand.nextInt(15) - 5) * itemRand.nextInt(15) / 10;
							var15 += itemRand.nextInt(15) - 5;

							if (par3World.getBlockId(var13, var14 - 1, var15) != Block.grass.blockID || par3World.isBlockNormalCube(var13, var14, var15)) {
								continue label133;
							}
						}

						if (par3World.getBlockId(var13, var14, var15) == 0) {
							if (itemRand.nextInt(3) != 0) {
								if (Block.tallGrass.canBlockStay(par3World, var13, var14, var15)) {
									par3World.setBlock(var13, var14, var15, Block.tallGrass.blockID, 1, 2);
								}
							} else {
								ForgeHooks.plantGrass(par3World, var13, var14, var15);
							}
						}
					}
				}

				return true;
			}
		}

		return true;
	}

}
