package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockTower extends Block {

	public BlockTower() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader Tower = new resinresinLoader("tower.resinresin");

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		Tower.generate(par1World, i - 4, j - 1, k - 4, false);
		Tower.generate(par1World, i - 4, j - 1, k - 4, false);

		par1World.setBlock(i + 0, j - 0, k - 0, 0, 2, 2);
		return blockConstructorCalled;

	}

}