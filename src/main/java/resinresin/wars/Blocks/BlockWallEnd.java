package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockWallEnd extends Block {

	public BlockWallEnd() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	resinresinLoader wallEnd = new resinresinLoader("wallEnd.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		
		wallEnd.generate(world, i - 7, j - 1, k - 6, false);
		wallEnd.generate(world, i - 7, j - 1, k - 6, false);

		Warsmod.generateBlock(world, i + 0, j - 0, k - 0, Blocks.air);
		
		return false;

	}

}
