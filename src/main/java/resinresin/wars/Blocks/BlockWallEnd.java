package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockWallEnd extends Block {

	public BlockWallEnd() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	resinresinLoader wallEnd = new resinresinLoader("wallEnd.resinresin");

	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		wallEnd.generate(par1World, i - 7, j - 1, k - 6, false);
		wallEnd.generate(par1World, i - 7, j - 1, k - 6, false);

		par1World.setBlock(i + 0, j - 0, k - 0, 0, 2, 2);
		return false;

	}

}
