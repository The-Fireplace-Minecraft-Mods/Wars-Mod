package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import the_fireplace.wars.items.ItemArmorMod;
import the_fireplace.wars.init.WarsItems;

import java.util.Random;

public class WarsTickEventHandler {

	@SubscribeEvent
	public void tickEvent(TickEvent.PlayerTickEvent event) {

		EntityPlayer player = event.player;
		if (ItemArmorMod.fullEquiped(player, WarsItems.knightArmor)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 0));
		} else if (ItemArmorMod.fullEquiped(player, WarsItems.scoutArmor)) {

			ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.15F, 6);
			player.fallDistance = 0;
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 10, 1));

		}

		else if (ItemArmorMod.fullEquiped(player, WarsItems.chaosArmor)) {

			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 0));

		}

		if ((ItemArmorMod.fullEquiped(player, WarsItems.archerArmor)) || (ItemArmorMod.fullEquiped(player, WarsItems.techArmor)) || (ItemArmorMod.fullEquiped(player, WarsItems.chaosArmor)) || (ItemArmorMod.fullEquiped(player, WarsItems.knightArmor)) || (ItemArmorMod.fullEquiped(player, WarsItems.healerArmor))
				|| (ItemArmorMod.fullEquiped(player, WarsItems.guardArmor)) || (ItemArmorMod.fullEquiped(player, WarsItems.scoutArmor))) {
			ItemStack boots = player.inventory.armorItemInSlot(0);
			if (!(boots != null)) {
				Random random = new Random();
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10, 10));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 10, 100));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 10, 10));

				int num = random.nextInt(50);

				if (num == 1) {
					player.addChatMessage(new ChatComponentText("\u00a73WEAR TEAM BOOTS TO USE CLASS!"));

				}

			}

		}

		int killstreakBefore = (player.getEntityData().getInteger("warsmod_killstreak"));

		if (killstreakBefore > 1) {
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 0));

		}
		if (killstreakBefore > 3) {
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 10, 0));

		}
		if (killstreakBefore > 7) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 20 * 15, 0));

		}
		if (killstreakBefore > 11) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10, 0));

		}
		if (killstreakBefore > 19) {
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 1));

		}
		if (killstreakBefore > 29) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10, 1));

		}
		if (killstreakBefore > 2) {
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 10, 0));

		}

	}

}
