package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockRoadPiece extends Block {

	public BlockRoadPiece() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	resinresinLoader road = new resinresinLoader("roadPiece.resinresin");

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		par1World.setBlock(i + 0, j - 0, k + 0, 0, 2, 2);
		road.generate(par1World, i - 0, j - 1, k - 0, true);
		return blockConstructorCalled;

	}

}
