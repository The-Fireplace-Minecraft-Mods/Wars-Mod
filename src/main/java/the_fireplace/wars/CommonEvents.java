package the_fireplace.wars;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import the_fireplace.wars.data.WarsSavedData;
import the_fireplace.wars.init.WarsItems;
import the_fireplace.wars.items.ItemArmorMod;
import the_fireplace.wars.items.Undroppable;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.network.packets.PacketKills;
import the_fireplace.wars.network.packets.PacketOpenTeamSelect;
import the_fireplace.wars.network.packets.PacketTeams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonEvents {

	public static int redPlayers = 0;
	public static int greenPlayers = 0;
	public static int bluePlayers = 0;
	public static int yellowPlayers = 0;

	@SubscribeEvent
	public void onLivingAttack(LivingAttackEvent evt) {
		if (evt.getEntity() instanceof EntityPlayer && evt.getSource() instanceof EntityDamageSource) {
			EntityDamageSource source = (EntityDamageSource) evt.getSource();
			if (source.getEntity() instanceof EntityPlayer) {
				EntityPlayer attacker = (EntityPlayer) source.getEntity();
				EntityPlayer damagee = (EntityPlayer) evt.getEntity();

				ItemStack attackerBoots = attacker.inventory.armorItemInSlot(0);
				ItemStack damageeBoots = damagee.inventory.armorItemInSlot(0);
				if (attackerBoots != null && damageeBoots != null && attackerBoots == damageeBoots) {
					Item id = damageeBoots.getItem();
					if (id == WarsItems.redBoots || id == WarsItems.greenBoots || id == WarsItems.blueBoots || id == WarsItems.yellowBoots) {
						evt.setCanceled(true);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent evt) {
		if(!evt.getEntityLiving().world.isRemote)
		if (evt.getEntityLiving() instanceof EntityPlayer) {
			EntityPlayer deadPlayer = (EntityPlayer) evt.getEntityLiving();

			if(evt.getSource() instanceof EntityDamageSource) {
				Entity attacker = evt.getSource().getEntity();

				if (attacker instanceof EntityPlayerMP) {
					int attackerTotalKills = attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");

					attackerTotalKills++;

					attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_totalKill", attackerTotalKills);

					int attackerKillstreak = attacker.getEntityData().getInteger("warsmod_killstreak");
					int deadPlayerKillstreak = deadPlayer.getEntityData().getInteger("warsmod_killstreak");

					attackerKillstreak++;

					attacker.getEntityData().setInteger("warsmod_killstreak", attackerKillstreak);

					if (deadPlayerKillstreak > 1) {

						EntityPlayerMP player = (EntityPlayerMP) evt.getEntity();

						player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.death", player.getName(), deadPlayerKillstreak));
					}

					switch (attackerKillstreak) {
						case 2:
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							break;
						case 3: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 4: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 5: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 8: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 10: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 12: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							break;
						}
						case 15: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 20: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 25: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 30: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement", player.getName(), attackerKillstreak));
							break;
						}
						case 35: {
							attacker.sendMessage(new TextComponentTranslation("killstreak."+attackerKillstreak));
							EntityPlayerMP player = (EntityPlayerMP) attacker;

							player.world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("killstreak.announcement.offscale", player.getName(), attackerKillstreak));
							break;
						}
						default:
							break;
					}

					int attackerDeaths = attacker.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

					PacketDispatcher.sendTo(new PacketKills(attackerKillstreak, attackerTotalKills, attackerDeaths), (EntityPlayerMP) attacker);
				}
			}

			deadPlayer.getEntityData().setInteger("warsmod_killstreak", 0);
			int deadPlayerDeaths = deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");
			deadPlayerDeaths++;
			deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).setInteger("warsmod_deaths", deadPlayerDeaths);

			PacketDispatcher.sendTo(new PacketKills(0, deadPlayer.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill"), deadPlayerDeaths), (EntityPlayerMP)deadPlayer);

			for(ItemStack stack:deadPlayer.inventory.mainInventory)
				if(stack != null)
					if(stack.getItem() instanceof Undroppable)
						stack.stackSize=0;
			for(ItemStack stack:deadPlayer.inventory.armorInventory)
				if(stack != null)
					if(stack.getItem() instanceof Undroppable)
						stack.stackSize=0;
			for(ItemStack stack:deadPlayer.inventory.offHandInventory)
				if(stack != null)
					if(stack.getItem() instanceof Undroppable)
						stack.stackSize=0;
		}
	}

	@SubscribeEvent
	public void itemThrown(ItemTossEvent event){
		if(event.getEntityItem().getEntityItem().getItem() instanceof Undroppable)
			event.setCanceled(true);
	}

	@SubscribeEvent
	public void PlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.player instanceof EntityPlayerMP) {
			recalcTeams();

			WarsMod.proxy.genTag(event.player);

			int totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
			int killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");
			int deaths = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

			PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak, deaths), (EntityPlayerMP) event.player);

			PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

			WarsSavedData savedWarsData = WarsSavedData.get(event.player.world);
			ItemStack playerBoots = event.player.inventory.getStackInSlot(36);// playerMP.inventory.armorItemInSlot(0);
			if (playerBoots == null) {
				if (!savedWarsData.editMode.editModeToggle) {
					scheduleDelayedGui((EntityPlayerMP) event.player);
				}
			}
		}
	}

	private int timer = 0;
	private ArrayList<Object> scheduledPlayers = Lists.newArrayList();

	private void scheduleDelayedGui(EntityPlayerMP player){
		timer += 100;
		scheduledPlayers.add(player);
	}

	@SubscribeEvent
	public void onServerTick(TickEvent.ServerTickEvent event){
		if(timer > 0)
			timer--;
		if(timer % 100 == 1) {
			PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP) scheduledPlayers.get(0));
			scheduledPlayers.remove(0);
		}
	}

	public static final List<EntityPlayerMP> getAll() {
		return FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayers();
	}

	@SubscribeEvent
	public void PlayerRespawnEvent(PlayerEvent.PlayerRespawnEvent event) {
		recalcTeams();

		int totalKills = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_totalKill");
		int killStreak = event.player.getEntityData().getInteger("warsmod_killstreak");
		int deaths = event.player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG).getInteger("warsmod_deaths");

		PacketDispatcher.sendTo(new PacketKills(totalKills, killStreak, deaths), (EntityPlayerMP) event.player);

		PacketDispatcher.sendTo(new PacketTeams(redPlayers, greenPlayers, bluePlayers, yellowPlayers), (EntityPlayerMP) event.player);

		WarsSavedData savedWarsData = WarsSavedData.get(event.player.world);
		if (!savedWarsData.editMode.editModeToggle) {
			PacketDispatcher.sendTo(new PacketOpenTeamSelect(), (EntityPlayerMP) event.player);
		}

	}

	@SubscribeEvent
	public void tickEvent(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		if (ItemArmorMod.hasFullSuit(player, WarsItems.knightArmor)) {
			player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, 0));
		} else if (ItemArmorMod.hasFullSuit(player, WarsItems.scoutArmor)) {
			ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.15F, 6);
			player.fallDistance = 0;
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 1));
		} else if (ItemArmorMod.hasFullSuit(player, WarsItems.ninjaArmor)) {
			ObfuscationReflectionHelper.setPrivateValue(PlayerCapabilities.class, player.capabilities, 0.18F, 6);
			player.fallDistance = 0;
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 1));
			if(player.motionY < 0 && player.motionY > -0.5){
				player.motionY *= 1.5;
			}
		}

		else if (ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.enderArmor)) {

			player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, 0));

		}

		if (ItemArmorMod.hasFullSuit(player, WarsItems.archerArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.techArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.chaosArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.knightArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.healerArmor)
				|| ItemArmorMod.hasFullSuit(player, WarsItems.guardArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.scoutArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.enderArmor) || ItemArmorMod.hasFullSuit(player, WarsItems.ninjaArmor)) {
			ItemStack boots = player.inventory.armorItemInSlot(0);
			if (!(boots != null)) {
				Random random = new Random();
				player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 10, 10));
				player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 10, 100));
				player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 10, 10));

				int num = random.nextInt(50);

				if (num == 1) {
					player.sendMessage(new TextComponentTranslation("needteamboots"));
				}
			}
		}

		int killstreakBefore = player.getEntityData().getInteger("warsmod_killstreak");

		if (killstreakBefore > 1) {
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 0));

		}
		if (killstreakBefore > 3) {
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 10, 0));

		}
		if (killstreakBefore > 7) {
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20 * 15, 0));

		}
		if (killstreakBefore > 11) {
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 0));

		}
		if (killstreakBefore > 19) {
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 10, 1));

		}
		if (killstreakBefore > 29) {
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, 1));

		}
		if (killstreakBefore > 2) {
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 10, 0));
		}
	}

	public static void recalcTeams(){
		redPlayers = 0;
		bluePlayers = 0;
		greenPlayers = 0;
		yellowPlayers = 0;
		for (EntityPlayerMP playerMP : FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayers()) {

			if(playerMP.inventory.getStackInSlot(36) != null) {
				Item playerBoots = playerMP.inventory.getStackInSlot(36).getItem();// playerMP.inventory.armorItemInSlot(0);

				if (playerBoots != null) {
					if (playerBoots == WarsItems.redBoots) {
						redPlayers++;
					}
					if (playerBoots == WarsItems.blueBoots) {
						bluePlayers++;
					}
					if (playerBoots == WarsItems.greenBoots) {
						greenPlayers++;
					}
					if (playerBoots == WarsItems.yellowBoots) {
						yellowPlayers++;
					}
				}
			}
		}
	}
}
