package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockBadBlock extends Block {

	public BlockBadBlock() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	
	@Override
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityLivingBase) {
			((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 5));
			((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 100, 5));
			((EntityLivingBase) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 100, 5));
		}
	}
}