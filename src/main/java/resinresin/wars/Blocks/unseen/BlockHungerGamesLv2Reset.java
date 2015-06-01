package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class BlockHungerGamesLv2Reset extends Block {

	public BlockHungerGamesLv2Reset() {
		super(Material.iron);
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	resinresinLoader hgLTop = new resinresinLoader("hgLTop.resinresin");
	
	
	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		hgLTop.generate(par1World, i - 21, j + 1, k - 22, true);
		warsmod.generateBlock(par1World, i + 19, j + 1, k + 0, WarsBlocks.hgLv2start);
		// main
		warsmod.generateBlock(par1World, i + 0, j + 28, k + 0, WarsBlocks.hgTelebM);
		// sides
		warsmod.generateBlock(par1World, i + 9, j + 28, k + 0, WarsBlocks.hgTeleb1);
		warsmod.generateBlock(par1World, i - 9, j + 28, k + 0, WarsBlocks.hgTeleb2);
		warsmod.generateBlock(par1World, i + 0, j + 28, k + 9, WarsBlocks.hgTeleb3);
		warsmod.generateBlock(par1World, i + 0, j + 28, k - 9, WarsBlocks.hgTeleb4);
		// right/left of side
		warsmod.generateBlock(par1World, i + 9, j + 28, k + 2, WarsBlocks.hgTeleb5);
		warsmod.generateBlock(par1World, i + 9, j + 28, k - 2, WarsBlocks.hgTeleb6);
		warsmod.generateBlock(par1World, i - 9, j + 28, k + 2, WarsBlocks.hgTeleb7);
		warsmod.generateBlock(par1World, i - 9, j + 28, k - 2, WarsBlocks.hgTeleb8);
		warsmod.generateBlock(par1World, i + 2, j + 28, k + 9, WarsBlocks.hgTeleb9);
		warsmod.generateBlock(par1World, i - 2, j + 28, k + 9, WarsBlocks.hgTeleb10);
		warsmod.generateBlock(par1World, i + 2, j + 28, k - 9, WarsBlocks.hgTeleb11);
		warsmod.generateBlock(par1World, i - 2, j + 28, k - 9, WarsBlocks.hgTeleb12);
		// corner
		warsmod.generateBlock(par1World, i + 6, j + 28, k + 6, WarsBlocks.hgTeleb13);
		warsmod.generateBlock(par1World, i + 6, j + 28, k - 6, WarsBlocks.hgTeleb14);
		warsmod.generateBlock(par1World, i - 6, j + 28, k + 6, WarsBlocks.hgTeleb15);
		warsmod.generateBlock(par1World, i - 6, j + 28, k - 6, WarsBlocks.hgTeleb16);
		// off centre
		warsmod.generateBlock(par1World, i + 8, j + 28, k + 4, WarsBlocks.hgTeleb17);
		warsmod.generateBlock(par1World, i - 8, j + 28, k + 4, WarsBlocks.hgTeleb18);
		warsmod.generateBlock(par1World, i + 4, j + 28, k + 8, WarsBlocks.hgTeleb19);
		warsmod.generateBlock(par1World, i + 4, j + 28, k - 8, WarsBlocks.hgTeleb20);
		warsmod.generateBlock(par1World, i + 8, j + 28, k - 4, WarsBlocks.hgTeleb21);
		warsmod.generateBlock(par1World, i - 8, j + 28, k - 4, WarsBlocks.hgTeleb22);
		warsmod.generateBlock(par1World, i - 4, j + 28, k + 8, WarsBlocks.hgTeleb23);
		warsmod.generateBlock(par1World, i - 4, j + 28, k - 8, WarsBlocks.hgTeleb24);

		warsmod.generateBlock(par1World, i - 7, j + 28, k + 5, Blocks.glass);

		warsmod.generateBlock(par1World, i + 20, j - 1, k + 0, WarsBlocks.hgTeleb1);
		warsmod.generateBlock(par1World, i - 20, j - 1, k + 0, WarsBlocks.hgTeleb2);
		warsmod.generateBlock(par1World, i + 0, j - 1, k + 20, WarsBlocks.hgTeleb3);
		warsmod.generateBlock(par1World, i + 0, j - 1, k - 20, WarsBlocks.hgTeleb4);
		// right/left of side
		warsmod.generateBlock(par1World, i + 19, j - 1, k + 5, WarsBlocks.hgTeleb5);
		warsmod.generateBlock(par1World, i + 19, j - 1, k - 5, WarsBlocks.hgTeleb6);
		warsmod.generateBlock(par1World, i - 19, j - 1, k + 5, WarsBlocks.hgTeleb7);
		warsmod.generateBlock(par1World, i - 19, j - 1, k - 5, WarsBlocks.hgTeleb8);
		warsmod.generateBlock(par1World, i + 5, j - 1, k + 19, WarsBlocks.hgTeleb9);
		warsmod.generateBlock(par1World, i - 5, j - 1, k + 19, WarsBlocks.hgTeleb10);
		warsmod.generateBlock(par1World, i + 5, j - 1, k - 19, WarsBlocks.hgTeleb11);
		warsmod.generateBlock(par1World, i - 5, j - 1, k - 19, WarsBlocks.hgTeleb12);
		// corner
		warsmod.generateBlock(par1World, i + 14, j - 1, k + 14, WarsBlocks.hgTeleb13);
		warsmod.generateBlock(par1World, i + 14, j - 1, k - 14, WarsBlocks.hgTeleb14);
		warsmod.generateBlock(par1World, i - 14, j - 1, k + 14, WarsBlocks.hgTeleb15);
		warsmod.generateBlock(par1World, i - 14, j - 1, k - 14, WarsBlocks.hgTeleb16);
		// off centre
		warsmod.generateBlock(par1World, i + 17, j - 1, k + 10, WarsBlocks.hgTeleb17);
		warsmod.generateBlock(par1World, i - 17, j - 1, k + 10, WarsBlocks.hgTeleb18);
		warsmod.generateBlock(par1World, i + 10, j - 1, k + 17, WarsBlocks.hgTeleb19);
		warsmod.generateBlock(par1World, i + 10, j - 1, k - 17, WarsBlocks.hgTeleb20);
		warsmod.generateBlock(par1World, i + 17, j - 1, k - 10, WarsBlocks.hgTeleb21);
		warsmod.generateBlock(par1World, i - 17, j - 1, k - 10, WarsBlocks.hgTeleb22);
		warsmod.generateBlock(par1World, i - 10, j - 1, k + 17, WarsBlocks.hgTeleb23);
		warsmod.generateBlock(par1World, i - 10, j - 1, k - 17, WarsBlocks.hgTeleb24);

		warsmod.generateBlock(par1World, i + 1, j + 1, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 1, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j + 1, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j + 1, k - 1, Blocks.air);
		return false;

	}
}