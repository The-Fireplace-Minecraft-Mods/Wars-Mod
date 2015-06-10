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

public class BlockHill extends Block {

	public BlockHill() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader hill = new resinresinLoader("hill.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		hill.generate(world, i - 10, j - 6, k - 10, false);
		return false;

	}

}
