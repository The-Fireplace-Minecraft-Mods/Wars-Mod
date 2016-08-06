package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockMazeStart extends Block {

	public BlockMazeStart() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader mazeRace = new ResinresinLoader("mazeRace.resinresin");

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		mazeRace.generate(world, i - 21, j - 8, k - 19, true);
		WarsMod.generateBlock(world, i, j, k, WarsBlocks.mazeReset);

		WarsMod.generateBlock(world, i - 8, j - 5, k + 4, Blocks.glass);
		return false;

	}

}