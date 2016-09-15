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

public class BlockHungerGamesLv1Reset extends Block {

	public BlockHungerGamesLv1Reset() {
		super(Material.IRON);
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(WarsMod.tabWarsBlocks);
		setSoundType(SoundType.STONE);
	}

	ResinresinLoader hgS = new ResinresinLoader("hgS.resinresin");

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		WarsMod.generateBlock(world, i + 1, j + 1, k, Blocks.AIR);
		WarsMod.generateBlock(world, i - 1, j + 1, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j + 1, k - 1, Blocks.AIR);
		WarsMod.generateBlock(world, i, j + 1, k + 1, Blocks.AIR);

		WarsMod.generateBlock(world, i, j + 1, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j + 2, k, Blocks.AIR);

		WarsMod.generateBlock(world, i + 1, j + 3, k, Blocks.AIR);
		WarsMod.generateBlock(world, i - 1, j + 3, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j + 3, k - 1, Blocks.AIR);
		WarsMod.generateBlock(world, i, j + 3, k + 1, Blocks.AIR);

		WarsMod.generateBlock(world, i - 1, j + 3, k - 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 3, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i - 1, j + 3, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 3, k - 1, Blocks.AIR);

		WarsMod.generateBlock(world, i - 1, j + 2, k - 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 2, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i - 1, j + 2, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 2, k - 1, Blocks.AIR);

		WarsMod.generateBlock(world, i - 1, j + 1, k - 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 1, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i - 1, j + 1, k + 1, Blocks.AIR);
		WarsMod.generateBlock(world, i + 1, j + 1, k - 1, Blocks.AIR);

		WarsMod.generateBlock(world, i + 8, j, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j, k + 8, Blocks.AIR);
		WarsMod.generateBlock(world, i - 8, j, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j, k - 8, Blocks.AIR);
		WarsMod.generateBlock(world, i + 8, j - 1, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j - 1, k + 8, Blocks.AIR);
		WarsMod.generateBlock(world, i - 8, j - 1, k, Blocks.AIR);
		WarsMod.generateBlock(world, i, j - 1, k - 8, Blocks.AIR);

		WarsMod.generateBlock(world, i + 6, j - 1, k + 6, Blocks.AIR);
		WarsMod.generateBlock(world, i + 6, j - 1, k - 6, Blocks.AIR);
		WarsMod.generateBlock(world, i - 6, j - 1, k + 6, Blocks.AIR);
		WarsMod.generateBlock(world, i - 6, j - 1, k - 6, Blocks.AIR);
		WarsMod.generateBlock(world, i + 6, j, k + 6, Blocks.AIR);
		WarsMod.generateBlock(world, i + 6, j, k - 6, Blocks.AIR);
		WarsMod.generateBlock(world, i - 6, j, k + 6, Blocks.AIR);
		WarsMod.generateBlock(world, i - 6, j, k - 6, Blocks.AIR);

		WarsMod.generateBlock(world, i + 7, j, k - 5, Blocks.AIR);
		WarsMod.generateBlock(world, i - 7, j, k - 5, Blocks.AIR);
		WarsMod.generateBlock(world, i + 7, j - 1, k - 5, Blocks.AIR);
		WarsMod.generateBlock(world, i - 7, j - 1, k - 5, Blocks.AIR);

		WarsMod.generateBlock(world, i, j, k, Blocks.AIR);

		hgS.generate(world, i - 9, j - 2, k - 9, false);
		
		//TODO find a better way of making these blocks
//		WarsMod.generateBlock(world, i + 8, j - 3, k + 0, WarsBlocks.hgTele1);
//		WarsMod.generateBlock(world, i + 0, j - 3, k + 8, WarsBlocks.hgTele2);
//		WarsMod.generateBlock(world, i - 8, j - 3, k + 0, WarsBlocks.hgTele3);
//		WarsMod.generateBlock(world, i + 0, j - 3, k - 8, WarsBlocks.hgTele4);
//		WarsMod.generateBlock(world, i + 6, j - 3, k + 6, WarsBlocks.hgTele5);
//		WarsMod.generateBlock(world, i + 6, j - 3, k - 6, WarsBlocks.hgTele6);
//		WarsMod.generateBlock(world, i - 6, j - 3, k + 6, WarsBlocks.hgTele7);
//		WarsMod.generateBlock(world, i - 6, j - 3, k - 6, WarsBlocks.hgTele8);
//
//		WarsMod.generateBlock(world, i + 6, j + 16, k + 0, WarsBlocks.hgTele1);
//		WarsMod.generateBlock(world, i + 0, j + 16, k + 6, WarsBlocks.hgTele2);
//		WarsMod.generateBlock(world, i - 6, j + 16, k + 0, WarsBlocks.hgTele3);
//		WarsMod.generateBlock(world, i + 0, j + 16, k - 6, WarsBlocks.hgTele4);
//		WarsMod.generateBlock(world, i + 4, j + 16, k + 4, WarsBlocks.hgTele5);
//		WarsMod.generateBlock(world, i + 4, j + 16, k - 4, WarsBlocks.hgTele6);
//		WarsMod.generateBlock(world, i - 4, j + 16, k + 4, WarsBlocks.hgTele7);
//		WarsMod.generateBlock(world, i - 4, j + 16, k - 4, WarsBlocks.hgTele8);
//		WarsMod.generateBlock(world, i + 0, j + 16, k - 0, WarsBlocks.hgTeleMain);
		WarsMod.generateBlock(world, i, j, k + 7, WarsBlocks.hgLv1start);
		return false;
	}
}