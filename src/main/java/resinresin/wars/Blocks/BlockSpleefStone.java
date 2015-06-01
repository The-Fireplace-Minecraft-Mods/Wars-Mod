package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockSpleefStone extends Block {

	public BlockSpleefStone() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		warsmod.generateBlock(par1World, i + 0, j - 0, k + 0, Blocks.air);
		par1World.playSoundAtEntity(par5EntityPlayer, "step.cloth", 1, 1);

		return false;

	}

}
