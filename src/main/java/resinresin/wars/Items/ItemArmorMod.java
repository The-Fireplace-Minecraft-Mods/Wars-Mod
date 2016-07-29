package resinresin.wars.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import resinresin.wars.registry.WarsItems;

public class ItemArmorMod extends ItemArmor implements ISpecialArmor {


	public ItemArmorMod(ArmorMaterial material, int renderIndex, int type) {
		super(material, 0, type);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

		if (stack.getItem() == WarsItems.scoutHelm || stack.getItem() == WarsItems.scoutPlate) {
			return "warsmod:armor/warsmod_scout_1.png";
		}
		if (stack.getItem() == WarsItems.scoutLegs) {
			return "warsmod:armor/warsmod_scout_2.png";
		}

		if (stack.getItem() == WarsItems.knightHelm || stack.getItem() == WarsItems.knightPlate) {
			return "warsmod:armor/warsmod_knight_1.png";
		}
		if (stack.getItem() == WarsItems.knightLegs) {
			return "warsmod:armor/warsmod_knight_2.png";
		}

		if (stack.getItem() == WarsItems.healerHelm || stack.getItem() == WarsItems.healerPlate) {
			return "warsmod:armor/warsmod_healer_1.png";
		}
		if (stack.getItem() == WarsItems.healerLegs) {
			return "warsmod:armor/warsmod_healer_2.png";
		}

		if (stack.getItem() == WarsItems.guardHelm || stack.getItem() == WarsItems.guardPlate) {
			return "warsmod:armor/warsmod_guard_1.png";
		}
		if (stack.getItem() == WarsItems.guardLegs) {
			return "warsmod:armor/warsmod_guard_2.png";
		}

		if (stack.getItem() == WarsItems.techHelm || stack.getItem() == WarsItems.techPlate) {
			return "warsmod:armor/warsmod_tech_1.png";
		}
		if (stack.getItem() == WarsItems.techLegs) {
			return "warsmod:armor/warsmod_tech_2.png";
		}

		if (stack.getItem() == WarsItems.archerHelm || stack.getItem() == WarsItems.archerPlate) {
			return "warsmod:armor/warsmod_archer_1.png";
		}
		if (stack.getItem() == WarsItems.archerLegs) {
			return "warsmod:armor/warsmod_archer_2.png";
		}

		if (stack.getItem() == WarsItems.chaosHelm || stack.getItem() == WarsItems.chaosPlate) {
			return "warsmod:armor/warsmod_chaos_1.png";
		}
		if (stack.getItem() == WarsItems.chaosLegs) {
			return "warsmod:armor/warsmod_chaos_2.png";
		}

		if (stack.getItem() == WarsItems.blueBoots) {
			return "warsmod:armor/warsmod_blue_1.png";
		}
		if (stack.getItem() == WarsItems.greenBoots) {
			return "warsmod:armor/warsmod_green_1.png";
		}
		if (stack.getItem() == WarsItems.yellowBoots) {
			return "warsmod:armor/warsmod_yellow_1.png";
		}
		if (stack.getItem() == WarsItems.redBoots) {
			return "warsmod:armor/warsmod_red_1.png";
		}
		if (stack.getItem() == WarsItems.chaosBoots) {
			return "warsmod:armor/warsmod_chaosb_1.png";
		}

		return "";

	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase entity, ItemStack armor, DamageSource source, double damage, int slot) {
		if (getArmorMaterial() == WarsItems.scoutArmor) {
			return new ArmorProperties(0, 0, 0);
		} else if (getArmorMaterial() == WarsItems.archerArmor) {
			if (entity instanceof EntityPlayer && fullEquiped((EntityPlayer) entity, getArmorMaterial()) && slot == 0) {
				return new ArmorProperties(0, 1, (int) (damage / 2) * 25);
			} else {
				return new ArmorProperties(0, 0, 0);
			}

		} else if (getArmorMaterial() == WarsItems.guardArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (getArmorMaterial() == WarsItems.knightArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (getArmorMaterial() == WarsItems.healerArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (getArmorMaterial() == WarsItems.bootsArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (getArmorMaterial() == WarsItems.techArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (getArmorMaterial() == WarsItems.chaosArmor) {
			return new ArmorProperties(0, 0, 0);
		}

		return null;
	}

	public static boolean fullEquiped(EntityPlayer player, ArmorMaterial material) {
		return (player != null && player.inventory != null && material != null && player.inventory.getStackInSlot(39) != null && (player.inventory.getStackInSlot(39).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(39).getItem()).getArmorMaterial() == material && player.inventory.getStackInSlot(37) != null
				&& (player.inventory.getStackInSlot(37).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(37).getItem()).getArmorMaterial() == material && player.inventory.getStackInSlot(38) != null && (player.inventory.getStackInSlot(38).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(38).getItem()).getArmorMaterial() == material);

	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		if (fullEquiped(player, this.getArmorMaterial()) && slot == 0) {
			return 20;
		} else {
			return 0;
		}
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
	}
}