package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;

public class BlockBadBlock extends Block {

	public BlockBadBlock() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 5));
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 100, 5));
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 100, 5));
		}
	}
}