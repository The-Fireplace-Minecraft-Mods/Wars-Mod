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

public class BlockTower extends Block {

	public BlockTower() {
		super(Material.iron);
		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	resinresinLoader Tower = new resinresinLoader("tower.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		
		Tower.generate(world, i - 4, j - 1, k - 4, false);
		Tower.generate(world, i - 4, j - 1, k - 4, false);

		Warsmod.generateBlock(world, i + 0, j - 0, k - 0, Blocks.air);
		
		return false;

	}

}