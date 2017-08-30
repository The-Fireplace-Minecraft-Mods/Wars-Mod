package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;

import java.util.Random;

public class BlockSummoner extends Block {

	public BlockSummoner() {
		super(Material.IRON);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public void onBlockDestroyedByPlayer(World par1World, BlockPos pos, IBlockState state) {
		if (!par1World.isRemote) {
			Random random = new Random();
			
			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			int num = random.nextInt(7);

			if (num == 1) {
				EntityLightningBolt entityLightningBolt = new EntityLightningBolt(par1World, 1, 1, 1, false);
				entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entityLightningBolt);
			}
			if (num == 2) {
				EntityCreeper entityCreeper = new EntityCreeper(par1World);
				entityCreeper.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entityCreeper);
			}
			if (num == 3) {
				EntitySnowman entitySnowman = new EntitySnowman(par1World);
				entitySnowman.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entitySnowman);
			}
			if (num == 4) {
				EntityXPOrb entityXPOrb = new EntityXPOrb(par1World, 1, 1, 1, num);
				entityXPOrb.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entityXPOrb);

			}
			if (num == 5) {
				EntityWolf entityWolf = new EntityWolf(par1World);
				entityWolf.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entityWolf);
			}
			if (num == 6) {
				EntitySheep entitySheep = new EntitySheep(par1World);
				entitySheep.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entitySheep);
			}
			if (num == 7) {
				EntityLightningBolt entityLightningBolt = new EntityLightningBolt(par1World, 1, 1, 1, false);
				entityLightningBolt.setLocationAndAngles((double) i + 0.5D, j, (double) k + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntity(entityLightningBolt);
			}
        }
	}
}