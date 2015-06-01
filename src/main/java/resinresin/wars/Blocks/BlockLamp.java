package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockLamp extends Block {

	public BlockLamp() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader lamp = new resinresinLoader("lamp.resinresin");

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		lamp.generate(par1World, i - 1, j - 0, k - 1, false);
		return false;

	}

}
