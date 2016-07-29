package resinresin.wars.items;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.WarsMod;
import resinresin.wars.registry.WarsBlocks;

import com.google.common.collect.Multimap;

public class ItemMeleeDagger extends Item {

	private float weaponDamage;

	public ItemMeleeDagger() {
		super();
		this.setCreativeTab(WarsMod.tabWarsClasses);
		this.setMaxStackSize(1);
		this.setMaxDamage(300);
		this.weaponDamage = 2F;
		setFull3D();

	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		return par2Block != WarsBlocks.sumBlock ? 0.9F : 15F;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.BLOCK;
	}

	@SideOnly(Side.CLIENT)
	// Makes it render nicely
	public boolean isFull3D() {
		return true;
	}

	// The max use time of the action
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }

}