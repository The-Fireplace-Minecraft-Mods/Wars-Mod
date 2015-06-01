package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockBounce extends Block {

	public BlockBounce() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		entity.motionY += 2.0;

	}

}
