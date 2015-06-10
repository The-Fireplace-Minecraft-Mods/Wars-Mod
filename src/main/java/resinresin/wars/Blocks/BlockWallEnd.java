package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class BlockWallEnd extends Block {

	public BlockWallEnd() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader wallEnd = new resinresinLoader("wallEnd.resinresin");


	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {

		wallEnd.generate(world, pos.getX() - 7, pos.getY() - 1, pos.getZ() - 6, false);
		wallEnd.generate(world, pos.getX() - 7, pos.getY() - 1, pos.getZ() - 6, false);

		world.setBlockState(new BlockPos(pos.getX() + 0, pos.getY() - 0, pos.getZ() - 0), Blocks./*insert block here*/.getDefaultState(), 2);//I left an error here so you can fill in the block that is supposed to generate
		return false;

	}

}
