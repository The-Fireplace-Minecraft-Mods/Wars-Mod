package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.ResinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockHungerGamesLv2Reset extends Block {

	public BlockHungerGamesLv2Reset() {
		super(Material.iron);
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	ResinresinLoader hgLTop = new ResinresinLoader("hgLTop.resinresin");
	
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		hgLTop.generate(world, i - 21, j + 1, k - 22, true);
		WarsMod.generateBlock(world, i + 19, j + 1, k + 0, WarsBlocks.hgLv2start);
		
		
		//TODO find a better way of making these blocks
//		// main
//		WarsMod.generateBlock(world, i + 0, j + 28, k + 0, WarsBlocks.hgTelebM);
//		// sides
//		WarsMod.generateBlock(world, i + 9, j + 28, k + 0, WarsBlocks.hgTeleb1);
//		WarsMod.generateBlock(world, i - 9, j + 28, k + 0, WarsBlocks.hgTeleb2);
//		WarsMod.generateBlock(world, i + 0, j + 28, k + 9, WarsBlocks.hgTeleb3);
//		WarsMod.generateBlock(world, i + 0, j + 28, k - 9, WarsBlocks.hgTeleb4);
//		// right/left of side
//		WarsMod.generateBlock(world, i + 9, j + 28, k + 2, WarsBlocks.hgTeleb5);
//		WarsMod.generateBlock(world, i + 9, j + 28, k - 2, WarsBlocks.hgTeleb6);
//		WarsMod.generateBlock(world, i - 9, j + 28, k + 2, WarsBlocks.hgTeleb7);
//		WarsMod.generateBlock(world, i - 9, j + 28, k - 2, WarsBlocks.hgTeleb8);
//		WarsMod.generateBlock(world, i + 2, j + 28, k + 9, WarsBlocks.hgTeleb9);
//		WarsMod.generateBlock(world, i - 2, j + 28, k + 9, WarsBlocks.hgTeleb10);
//		WarsMod.generateBlock(world, i + 2, j + 28, k - 9, WarsBlocks.hgTeleb11);
//		WarsMod.generateBlock(world, i - 2, j + 28, k - 9, WarsBlocks.hgTeleb12);
//		// corner
//		WarsMod.generateBlock(world, i + 6, j + 28, k + 6, WarsBlocks.hgTeleb13);
//		WarsMod.generateBlock(world, i + 6, j + 28, k - 6, WarsBlocks.hgTeleb14);
//		WarsMod.generateBlock(world, i - 6, j + 28, k + 6, WarsBlocks.hgTeleb15);
//		WarsMod.generateBlock(world, i - 6, j + 28, k - 6, WarsBlocks.hgTeleb16);
//		// off centre
//		WarsMod.generateBlock(world, i + 8, j + 28, k + 4, WarsBlocks.hgTeleb17);
//		WarsMod.generateBlock(world, i - 8, j + 28, k + 4, WarsBlocks.hgTeleb18);
//		WarsMod.generateBlock(world, i + 4, j + 28, k + 8, WarsBlocks.hgTeleb19);
//		WarsMod.generateBlock(world, i + 4, j + 28, k - 8, WarsBlocks.hgTeleb20);
//		WarsMod.generateBlock(world, i + 8, j + 28, k - 4, WarsBlocks.hgTeleb21);
//		WarsMod.generateBlock(world, i - 8, j + 28, k - 4, WarsBlocks.hgTeleb22);
//		WarsMod.generateBlock(world, i - 4, j + 28, k + 8, WarsBlocks.hgTeleb23);
//		WarsMod.generateBlock(world, i - 4, j + 28, k - 8, WarsBlocks.hgTeleb24);

		WarsMod.generateBlock(world, i - 7, j + 28, k + 5, Blocks.glass);

//		WarsMod.generateBlock(world, i + 20, j - 1, k + 0, WarsBlocks.hgTeleb1);
//		WarsMod.generateBlock(world, i - 20, j - 1, k + 0, WarsBlocks.hgTeleb2);
//		WarsMod.generateBlock(world, i + 0, j - 1, k + 20, WarsBlocks.hgTeleb3);
//		WarsMod.generateBlock(world, i + 0, j - 1, k - 20, WarsBlocks.hgTeleb4);
//		// right/left of side
//		WarsMod.generateBlock(world, i + 19, j - 1, k + 5, WarsBlocks.hgTeleb5);
//		WarsMod.generateBlock(world, i + 19, j - 1, k - 5, WarsBlocks.hgTeleb6);
//		WarsMod.generateBlock(world, i - 19, j - 1, k + 5, WarsBlocks.hgTeleb7);
//		WarsMod.generateBlock(world, i - 19, j - 1, k - 5, WarsBlocks.hgTeleb8);
//		WarsMod.generateBlock(world, i + 5, j - 1, k + 19, WarsBlocks.hgTeleb9);
//		WarsMod.generateBlock(world, i - 5, j - 1, k + 19, WarsBlocks.hgTeleb10);
//		WarsMod.generateBlock(world, i + 5, j - 1, k - 19, WarsBlocks.hgTeleb11);
//		WarsMod.generateBlock(world, i - 5, j - 1, k - 19, WarsBlocks.hgTeleb12);
//		// corner
//		WarsMod.generateBlock(world, i + 14, j - 1, k + 14, WarsBlocks.hgTeleb13);
//		WarsMod.generateBlock(world, i + 14, j - 1, k - 14, WarsBlocks.hgTeleb14);
//		WarsMod.generateBlock(world, i - 14, j - 1, k + 14, WarsBlocks.hgTeleb15);
//		WarsMod.generateBlock(world, i - 14, j - 1, k - 14, WarsBlocks.hgTeleb16);
//		// off centre
//		WarsMod.generateBlock(world, i + 17, j - 1, k + 10, WarsBlocks.hgTeleb17);
//		WarsMod.generateBlock(world, i - 17, j - 1, k + 10, WarsBlocks.hgTeleb18);
//		WarsMod.generateBlock(world, i + 10, j - 1, k + 17, WarsBlocks.hgTeleb19);
//		WarsMod.generateBlock(world, i + 10, j - 1, k - 17, WarsBlocks.hgTeleb20);
//		WarsMod.generateBlock(world, i + 17, j - 1, k - 10, WarsBlocks.hgTeleb21);
//		WarsMod.generateBlock(world, i - 17, j - 1, k - 10, WarsBlocks.hgTeleb22);
//		WarsMod.generateBlock(world, i - 10, j - 1, k + 17, WarsBlocks.hgTeleb23);
//		WarsMod.generateBlock(world, i - 10, j - 1, k - 17, WarsBlocks.hgTeleb24);

		WarsMod.generateBlock(world, i + 1, j + 1, k + 0, Blocks.air);
		WarsMod.generateBlock(world, i - 1, j + 1, k + 0, Blocks.air);
		WarsMod.generateBlock(world, i + 0, j + 1, k + 1, Blocks.air);
		WarsMod.generateBlock(world, i + 0, j + 1, k - 1, Blocks.air);
		return false;

	}
}