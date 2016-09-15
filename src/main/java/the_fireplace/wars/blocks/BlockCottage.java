package the_fireplace.wars.blocks;

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
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockCottage extends Block {

	public BlockCottage() {
		super(Material.IRON);
		setCreativeTab(WarsMod.tabWarsBlocks);
		setSoundType(SoundType.STONE);
	}

	ResinresinLoader cottage = new ResinresinLoader("cottage.resinresin");
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		WarsMod.generateBlock(world, i + 4, j + 2, k - 2, Blocks.STONE);

		WarsMod.generateBlock(world, i - 1, j + 2, k + 5, Blocks.STONE);
		WarsMod.generateBlock(world, i + 1, j + 2, k + 5, Blocks.STONE);

		WarsMod.generateBlock(world, i + 2, j + 7, k + 5, Blocks.STONE);

		WarsMod.generateBlock(world, i - 2, j + 7, k + 5, Blocks.STONE);

		cottage.generate(world, i - 5, j - 1, k - 6, false);

		WarsMod.generateBlock(world, i, j, k, Blocks.AIR);

		return true;
	}
}
