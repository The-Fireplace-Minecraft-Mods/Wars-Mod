package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockLamp extends Block {

	public BlockLamp() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader lamp = new ResinresinLoader("lamp.resinresin");
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		lamp.generate(world, i - 1, j, k - 1, false);
		return true;
	}
}
