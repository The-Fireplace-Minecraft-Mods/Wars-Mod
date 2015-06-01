package resinresin.wars.registry;

import java.util.Arrays;

import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;


public abstract class WarsDungeonChests {

	public static void doDungeonChestHooks() {

		
		for (String category : Arrays.asList(ChestGenHooks.VILLAGE_BLACKSMITH, ChestGenHooks.MINESHAFT_CORRIDOR, ChestGenHooks.PYRAMID_DESERT_CHEST, ChestGenHooks.PYRAMID_JUNGLE_CHEST, ChestGenHooks.PYRAMID_JUNGLE_DISPENSER, ChestGenHooks.STRONGHOLD_CORRIDOR, ChestGenHooks.STRONGHOLD_LIBRARY, ChestGenHooks.STRONGHOLD_CROSSING, ChestGenHooks.BONUS_CHEST, ChestGenHooks.DUNGEON_CHEST)) {
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.ancientGem, 0, 1, 3, 6));
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.ancientEmblem, 0, 1, 3, 2));
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.fireGem, 0, 1, 3, 6));
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.waterGem, 0, 1, 3, 6));
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.decayGem, 0, 1, 3, 6));
			ChestGenHooks.addItem(category, new WeightedRandomChestContent(WarsItems.naturalGem, 0, 1, 3, 6));
		}
		
		
	}
}