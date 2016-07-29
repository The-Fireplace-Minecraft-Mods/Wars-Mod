package resinresin.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.worldgen.ResinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockMinersSpleefSmall extends Block {

	public BlockMinersSpleefSmall() {
		super(Material.iron);
	}

	ResinresinLoader mSpleefS = new ResinresinLoader("mSpleefS.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		mSpleefS.generate(world, i - 8, j - 0, k + 0, false);

		WarsMod.generateBlock(world, i + 0, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 0, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 1, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 6, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 3, k + 17, WarsBlocks.spleefStone);

		// left

		WarsMod.generateBlock(world, i - 1, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 3, k + 17, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 6, j + 3, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 10, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 11, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 12, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 13, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 14, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 15, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 16, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 3, k + 17, WarsBlocks.spleefStone);

		return false;

	}

}