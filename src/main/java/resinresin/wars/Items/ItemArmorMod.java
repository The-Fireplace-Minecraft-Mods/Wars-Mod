package resinresin.wars.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import resinresin.wars.registry.WarsItems;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class ItemArmorMod extends ItemArmor implements ISpecialArmor {

	public ArmorMaterial material;

	public ItemArmorMod(ArmorMaterial armormaterial, int type, int texture) {
		super(armormaterial, 0, type);
		material = armormaterial;

	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int Slot, int Layer) {

		if (itemstack.itemID == WarsItems.scoutHelm.itemID || itemstack.itemID == WarsItems.scoutPlate.itemID) {
			return "warsmod:armor/warsmod_scout_1.png";
		}
		if (itemstack.itemID == WarsItems.scoutLegs.itemID) {
			return "warsmod:armor/warsmod_scout_2.png";
		}

		if (itemstack.itemID == WarsItems.knightHelm.itemID || itemstack.itemID == WarsItems.knightPlate.itemID) {
			return "warsmod:armor/warsmod_knight_1.png";
		}
		if (itemstack.itemID == WarsItems.knightLegs.itemID) {
			return "warsmod:armor/warsmod_knight_2.png";
		}

		if (itemstack.itemID == WarsItems.healerHelm.itemID || itemstack.itemID == WarsItems.healerPlate.itemID) {
			return "warsmod:armor/warsmod_healer_1.png";
		}
		if (itemstack.itemID == WarsItems.healerLegs.itemID) {
			return "warsmod:armor/warsmod_healer_2.png";
		}

		if (itemstack.itemID == WarsItems.guardHelm.itemID || itemstack.itemID == WarsItems.guardPlate.itemID) {
			return "warsmod:armor/warsmod_guard_1.png";
		}
		if (itemstack.itemID == WarsItems.guardLegs.itemID) {
			return "warsmod:armor/warsmod_guard_2.png";
		}

		if (itemstack.itemID == WarsItems.techHelm.itemID || itemstack.itemID == WarsItems.techPlate.itemID) {
			return "warsmod:armor/warsmod_tech_1.png";
		}
		if (itemstack.itemID == WarsItems.techLegs.itemID) {
			return "warsmod:armor/warsmod_tech_2.png";
		}

		if (itemstack.itemID == WarsItems.archerHelm.itemID || itemstack.itemID == WarsItems.archerPlate.itemID) {
			return "warsmod:armor/warsmod_archer_1.png";
		}
		if (itemstack.itemID == WarsItems.archerLegs.itemID) {
			return "warsmod:armor/warsmod_archer_2.png";
		}

		if (itemstack.itemID == WarsItems.chaosHelm.itemID || itemstack.itemID == WarsItems.chaosPlate.itemID) {
			return "warsmod:armor/warsmod_chaos_1.png";
		}
		if (itemstack.itemID == WarsItems.chaosLegs.itemID) {
			return "warsmod:armor/warsmod_chaos_2.png";
		}

		if (itemstack.itemID == WarsItems.blueBoots.itemID) {
			return "warsmod:armor/warsmod_blue_1.png";
		}
		if (itemstack.itemID == WarsItems.greenBoots.itemID) {
			return "warsmod:armor/warsmod_green_1.png";
		}
		if (itemstack.itemID == WarsItems.yellowBoots.itemID) {
			return "warsmod:armor/warsmod_yellow_1.png";
		}
		if (itemstack.itemID == WarsItems.redBoots.itemID) {
			return "warsmod:armor/warsmod_red_1.png";
		}
		if (itemstack.itemID == WarsItems.chaosBoots.itemID) {
			return "warsmod:armor/warsmod_chaosb_1.png";
		}

		return "";

	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase entity, ItemStack armor, DamageSource source, double damage, int slot) {
		if (material == WarsItems.scoutArmor) {
			return new ArmorProperties(0, 0, 0);
		} else if (material == WarsItems.archerArmor) {
			if (entity instanceof EntityPlayer && fullEquiped((EntityPlayer) entity, material) && slot == 0) {
				return new ArmorProperties(0, 1, (int) (damage / 2) * 25);
			} else {
				return new ArmorProperties(0, 0, 0);
			}

		} else if (material == WarsItems.guardArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (material == WarsItems.knightArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (material == WarsItems.healerArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (material == WarsItems.bootsArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (material == WarsItems.techArmor) {
			return new ArmorProperties(0, 0, 0);

		} else if (material == WarsItems.chaosArmor) {
			return new ArmorProperties(0, 0, 0);
		}

		return null;
	}

	public static boolean fullEquiped(EntityPlayer player, ArmorMaterial material) {
		return (player != null && player.inventory != null && material != null && player.inventory.getStackInSlot(39) != null && (player.inventory.getStackInSlot(39).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(39).getItem()).material == material && player.inventory.getStackInSlot(37) != null
				&& (player.inventory.getStackInSlot(37).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(37).getItem()).material == material && player.inventory.getStackInSlot(38) != null && (player.inventory.getStackInSlot(38).getItem()) instanceof ItemArmorMod && ((ItemArmorMod) player.inventory.getStackInSlot(38).getItem()).material == material);

	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		if (fullEquiped(player, material) && slot == 0) {
			return 20;
		} else {
			return 0;
		}
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
	}
}