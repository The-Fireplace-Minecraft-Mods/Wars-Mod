package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockMazeReset extends Block {

	public BlockMazeReset() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader mazeRace = new resinresinLoader("mazeRace.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		mazeRace.generate(world, i - 21, j - 8, k - 19, true);
		WarsMod.generateBlock(world, i + 0, j - 0, k + 0, WarsBlocks.mazeStart);
		WarsMod.generateBlock(world, i + 0, j - 4, k + 0, Blocks.wooden_slab);
		WarsMod.generateBlock(world, i - 8, j - 5, k + 4, Blocks.glass);
		return false;

	}

}