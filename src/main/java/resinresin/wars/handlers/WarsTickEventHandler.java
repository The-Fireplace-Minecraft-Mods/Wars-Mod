package resinresin.wars.handlers;

import java.util.Random;

import resinresin.wars.Items.ItemArmorMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class WarsTickEventHandler {
	
	
	
	@SubscribeEvent
	public void TickEvent(TickEvent event) {
		
		
		if (type.contains(PLAYER)) {
			EntityPlayer player = (EntityPlayer) tickData[0];
			if (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.knightArmor)) {
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10 * 1, 0));
			} else if (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.scoutArmor)) {

				ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.15F, 6);
				player.fallDistance = 0;
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 10 * 1, 1));

			} else if (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.specArmor)) {

				player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 10 * 1, 10));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 10 * 1, 100));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10 * 1, 10));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 10 * 1, 10));

			} else if (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.chaosArmor)) {

				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10 * 1, 0));

			}
			if ((ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.archerArmor)) || (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.techArmor)) || (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.chaosArmor)) || (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.knightArmor)) || (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.healerArmor))
					|| (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.guardArmor)) || (ItemArmorMod.fullEquiped(player, resinresin.wars.registry.WarsItems.scoutArmor))) {
				ItemStack var9 = player.inventory.armorItemInSlot(0);
				if (!(var9 != null)) {
					Random random = new Random();
					player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10 * 1, 10));
					player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 10 * 1, 100));
					player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 10 * 1, 10));

					int num = random.nextInt(50);

					if (num == 1) {
						player.addChatMessage("\u00a73WEAR TEAM BOOTS TO USE CLASS!");

					}

				}

			}

		}

		if (type.contains(TickType.PLAYER)) {
			EntityPlayer player = (EntityPlayer) tickData[0];
			int killstreakBefore = (player.getEntityData().getInteger("warsmod_killstreak"));

			if (killstreakBefore > 1) {
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10 * 1, 0));

			}
			if (killstreakBefore > 3) {
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 10 * 1, 0));

			}
			if (killstreakBefore > 7) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 20 * 15, 0));

			}
			if (killstreakBefore > 11) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10 * 1, 0));

			}
			if (killstreakBefore > 19) {
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10 * 1, 1));

			}
			if (killstreakBefore > 29) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10 * 1, 1));

			}
			if (killstreakBefore > 2) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 10 * 1, 0));

			}

		}
		
		
	}
	
}
