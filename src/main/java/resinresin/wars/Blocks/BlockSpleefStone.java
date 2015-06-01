package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockSpleefStone extends Block {

	public BlockSpleefStone() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		
		warsmod.generateBlock(world, i + 0, j - 0, k + 0, Blocks.air);
		world.playSoundAtEntity(player, "step.cloth", 1, 1);

		return false;

	}

}
