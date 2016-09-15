package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import the_fireplace.wars.WarsMod;

public class BlockSelectorSpleef extends Block {

	public BlockSelectorSpleef() {
		super(Material.IRON);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {
		if (player.isSneaking())
			return false;
		FMLNetworkHandler.openGui(player, WarsMod.instance, 5, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
}