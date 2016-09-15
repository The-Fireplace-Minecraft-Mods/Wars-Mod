package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockMinersSpleefMedium extends Block {

	public BlockMinersSpleefMedium() {
		super(Material.IRON);
		setSoundType(SoundType.STONE);
	}

	ResinresinLoader mSpleefM = new ResinresinLoader("mSpleefM.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		WarsMod.generateBlock(world, i, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(world, i + 1, j + 2, k + 10, Blocks.STONE);
		WarsMod.generateBlock(world, i + 10, j + 1, k - 2, Blocks.STONE);

		mSpleefM.generate(world, i + -12, j - 2, k + -12, false);

		// 1
		WarsMod.generateBlock(world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k - 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i - 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i - 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i - 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i - 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i - 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i - 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 1, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 4, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 5, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 7, j + 10, k + 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 6, j + 10, k + 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 2, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 2, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k + 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 3, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 3, j + 10, k + 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 9, j + 10, k + 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 4, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i - 5, j + 10, k + 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i - 8, j + 10, k + 5, WarsBlocks.spleefStone);

		// 1
		WarsMod.generateBlock(world, i, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 1, WarsBlocks.spleefStone);
		// 2
		WarsMod.generateBlock(world, i + 2, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 1, WarsBlocks.spleefStone);
		// 3
		WarsMod.generateBlock(world, i + 3, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 2, WarsBlocks.spleefStone);
		// 4
		WarsMod.generateBlock(world, i + 4, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 3, WarsBlocks.spleefStone);
		// 5
		WarsMod.generateBlock(world, i + 5, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 4, WarsBlocks.spleefStone);
		// 6
		WarsMod.generateBlock(world, i + 6, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 5, WarsBlocks.spleefStone);
		// 7
		WarsMod.generateBlock(world, i + 7, j + 10, k, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 1, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 1, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 4, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 4, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 5, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 5, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 7, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 7, j + 10, k - 6, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 6, j + 10, k - 6, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 2, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 2, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 2, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k - 2, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 3, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 3, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 3, j + 10, k - 9, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 9, j + 10, k - 3, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 4, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 4, WarsBlocks.spleefStone);

		WarsMod.generateBlock(world, i + 5, j + 10, k - 8, WarsBlocks.spleefStone);
		WarsMod.generateBlock(world, i + 8, j + 10, k - 5, WarsBlocks.spleefStone);

		return false;
	}
}
