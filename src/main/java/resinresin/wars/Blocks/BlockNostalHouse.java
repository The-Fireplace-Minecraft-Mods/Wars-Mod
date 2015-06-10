package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WorldGen.ResinresinLoader;

public class BlockNostalHouse extends Block {

	public BlockNostalHouse() {
		super(Material.iron);
	}

	ResinresinLoader nosHouse = new ResinresinLoader("nostalHouse.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		nosHouse.generate(world, i - 7, j - 0, k - 7, false);
		return false;

	}

}
