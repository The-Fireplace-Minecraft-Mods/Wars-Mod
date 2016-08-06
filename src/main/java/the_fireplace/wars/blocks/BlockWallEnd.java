package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockWallEnd extends Block {

	public BlockWallEnd() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader wallEnd = new ResinresinLoader("wallEnd.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		
		wallEnd.generate(world, i - 7, j - 1, k - 6, false);
		wallEnd.generate(world, i - 7, j - 1, k - 6, false);

		WarsMod.generateBlock(world, i, j, k, Blocks.air);
		
		return true;
	}
}
