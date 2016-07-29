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
import the_fireplace.wars.registry.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

import java.util.Random;

public class BlockMazeStart extends Block {

	public BlockMazeStart() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);

	}

	Random random = new Random();
	//What is the point of this? It is never called.
	//int num = random.nextInt(8);

	ResinresinLoader mazeRace = new ResinresinLoader("mazeRace.resinresin");


	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();

		mazeRace.generate(world, i - 21, j - 8, k - 19, true);
		WarsMod.generateBlock(world, i + 0, j - 0, k + 0, WarsBlocks.mazeReset);

		Random random = new Random();

		//num = random.nextInt(8);

		WarsMod.generateBlock(world, i - 8, j - 5, k + 4, Blocks.glass);
		return false;

	}

}