package resinresin.wars.Blocks;

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

public class BlockCottage extends Block {

	public BlockCottage() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader cottage = new resinresinLoader("cottage.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		WarsMod.generateBlock(world, i + 4, j + 2, k - 2, Blocks.stone);

		WarsMod.generateBlock(world, i - 1, j + 2, k + 5, Blocks.stone);
		WarsMod.generateBlock(world, i + 1, j + 2, k + 5, Blocks.stone);

		WarsMod.generateBlock(world, i + 2, j + 7, k + 5, Blocks.stone);

		WarsMod.generateBlock(world, i - 2, j + 7, k + 5, Blocks.stone);

		cottage.generate(world, i - 5, j - 1, k - 6, false);

		WarsMod.generateBlock(world, i - 0, j + 0, k + 0, Blocks.air);

		return false;

	}
}
