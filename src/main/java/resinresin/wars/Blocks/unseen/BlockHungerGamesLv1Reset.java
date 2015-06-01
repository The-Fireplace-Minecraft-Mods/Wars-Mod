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

public class BlockHungerGamesLv1Reset extends Block {

	public BlockHungerGamesLv1Reset() {
		super(Material.iron);
		setHardness(5F);
		setResistance(10F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	resinresinLoader hgS = new resinresinLoader("hgS.resinresin");

	@Override
	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		warsmod.generateBlock(par1World, i + 1, j + 1, k - 0, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 1, k - 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j + 1, k - 1, Blocks.air);
		warsmod.generateBlock(par1World, i - 0, j + 1, k + 1, Blocks.air);

		warsmod.generateBlock(par1World, i - 0, j + 1, k - 0, Blocks.air);
		warsmod.generateBlock(par1World, i - 0, j + 2, k - 0, Blocks.air);

		warsmod.generateBlock(par1World, i + 1, j + 3, k - 0, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 3, k - 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j + 3, k - 1, Blocks.air);
		warsmod.generateBlock(par1World, i - 0, j + 3, k + 1, Blocks.air);

		warsmod.generateBlock(par1World, i - 1, j + 3, k - 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 3, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 3, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 3, k - 1, Blocks.air);

		warsmod.generateBlock(par1World, i - 1, j + 2, k - 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 2, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 2, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 2, k - 1, Blocks.air);

		warsmod.generateBlock(par1World, i - 1, j + 1, k - 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 1, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i - 1, j + 1, k + 1, Blocks.air);
		warsmod.generateBlock(par1World, i + 1, j + 1, k - 1, Blocks.air);

		warsmod.generateBlock(par1World, i + 8, j - 0, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j - 0, k + 8, Blocks.air);
		warsmod.generateBlock(par1World, i - 8, j - 0, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j - 0, k - 8, Blocks.air);
		warsmod.generateBlock(par1World, i + 8, j - 1, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j - 1, k + 8, Blocks.air);
		warsmod.generateBlock(par1World, i - 8, j - 1, k + 0, Blocks.air);
		warsmod.generateBlock(par1World, i + 0, j - 1, k - 8, Blocks.air);

		warsmod.generateBlock(par1World, i + 6, j - 1, k + 6, Blocks.air);
		warsmod.generateBlock(par1World, i + 6, j - 1, k - 6, Blocks.air);
		warsmod.generateBlock(par1World, i - 6, j - 1, k + 6, Blocks.air);
		warsmod.generateBlock(par1World, i - 6, j - 1, k - 6, Blocks.air);
		warsmod.generateBlock(par1World, i + 6, j - 0, k + 6, Blocks.air);
		warsmod.generateBlock(par1World, i + 6, j - 0, k - 6, Blocks.air);
		warsmod.generateBlock(par1World, i - 6, j - 0, k + 6, Blocks.air);
		warsmod.generateBlock(par1World, i - 6, j - 0, k - 6, Blocks.air);

		warsmod.generateBlock(par1World, i + 7, j - 0, k - 5, Blocks.air);
		warsmod.generateBlock(par1World, i - 7, j - 0, k - 5, Blocks.air);
		warsmod.generateBlock(par1World, i + 7, j - 1, k - 5, Blocks.air);
		warsmod.generateBlock(par1World, i - 7, j - 1, k - 5, Blocks.air);

		warsmod.generateBlock(par1World, i + 0, j - 0, k - 0, Blocks.air);

		hgS.generate(par1World, i - 9, j - 2, k - 9, false);
		warsmod.generateBlock(par1World, i + 8, j - 3, k + 0, WarsBlocks.hgTele1);
		warsmod.generateBlock(par1World, i + 0, j - 3, k + 8, WarsBlocks.hgTele2);
		warsmod.generateBlock(par1World, i - 8, j - 3, k + 0, WarsBlocks.hgTele3);
		warsmod.generateBlock(par1World, i + 0, j - 3, k - 8, WarsBlocks.hgTele4);
		warsmod.generateBlock(par1World, i + 6, j - 3, k + 6, WarsBlocks.hgTele5);
		warsmod.generateBlock(par1World, i + 6, j - 3, k - 6, WarsBlocks.hgTele6);
		warsmod.generateBlock(par1World, i - 6, j - 3, k + 6, WarsBlocks.hgTele7);
		warsmod.generateBlock(par1World, i - 6, j - 3, k - 6, WarsBlocks.hgTele8);

		warsmod.generateBlock(par1World, i + 6, j + 16, k + 0, WarsBlocks.hgTele1);
		warsmod.generateBlock(par1World, i + 0, j + 16, k + 6, WarsBlocks.hgTele2);
		warsmod.generateBlock(par1World, i - 6, j + 16, k + 0, WarsBlocks.hgTele3);
		warsmod.generateBlock(par1World, i + 0, j + 16, k - 6, WarsBlocks.hgTele4);
		warsmod.generateBlock(par1World, i + 4, j + 16, k + 4, WarsBlocks.hgTele5);
		warsmod.generateBlock(par1World, i + 4, j + 16, k - 4, WarsBlocks.hgTele6);
		warsmod.generateBlock(par1World, i - 4, j + 16, k + 4, WarsBlocks.hgTele7);
		warsmod.generateBlock(par1World, i - 4, j + 16, k - 4, WarsBlocks.hgTele8);
		warsmod.generateBlock(par1World, i + 0, j + 16, k - 0, WarsBlocks.hgTeleMain);
		warsmod.generateBlock(par1World, i + 0, j - 0, k + 7, WarsBlocks.hgLv1start);
		return false;

	}
}