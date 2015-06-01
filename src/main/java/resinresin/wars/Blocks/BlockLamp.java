package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockLamp extends Block {

	public BlockLamp() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	resinresinLoader lamp = new resinresinLoader("lamp.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		lamp.generate(world, i - 1, j - 0, k - 1, false);
		return false;

	}

}
