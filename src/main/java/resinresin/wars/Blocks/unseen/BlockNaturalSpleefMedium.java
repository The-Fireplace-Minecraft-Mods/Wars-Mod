package resinresin.wars.Blocks.unseen;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockNaturalSpleefMedium extends Block {

	public BlockNaturalSpleefMedium() {
		super(Material.iron);
	}

	resinresinLoader pSpleefM = new resinresinLoader("pSpleefM.resinresin");

	
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		
		BlockPos position1 = new BlockPos(i + 0, j + 2, k + 10);
		par1World.setBlockState(position1, Blocks.stone.getDefaultState());
		
		BlockPos position2 = new BlockPos(i + 1, j + 2, k + 10);
		par1World.setBlockState(position2, Blocks.stone.getDefaultState());
		
		BlockPos position3 = new BlockPos(i + 10, j + 1, k - 2);
		par1World.setBlockState(position3, Blocks.stone.getDefaultState());
		
		pSpleefM.generate(par1World, i + -14, j - 2, k + -13, false);

		// 1
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 0, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 0, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 0, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		warsmod.generateBlock(par1World, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		warsmod.generateBlock(par1World, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);
		
		return false;

	}

}