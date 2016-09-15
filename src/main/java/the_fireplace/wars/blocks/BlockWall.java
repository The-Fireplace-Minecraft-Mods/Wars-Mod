package the_fireplace.wars.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockWall extends BlockStairs {

	public BlockWall(IBlockState state) {
		super(state);

		setCreativeTab(WarsMod.tabWarsBlocks);
		setSoundType(SoundType.STONE);
	}

	ResinresinLoader wallNS = new ResinresinLoader("wall0.resinresin");
	ResinresinLoader wallWE = new ResinresinLoader("wall90.resinresin");

	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, BlockPos pos, IBlockState par5) {
		IBlockState i1 = par1IBlockAccess.getBlockState(pos);
		return isBlockStairs(i1) && i1 == par5;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(2)) || this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(3))) {
			wallNS.generate(world, i - 2, j, k - 4, true);
		}
		if (this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(0)) || this.isBlockStairsDirection(world, pos, WarsBlocks.wall.getStateFromMeta(1))) {

			wallWE.generate(world, i - 4, j, k - 2, true);
		}

		return true;

	}
}
