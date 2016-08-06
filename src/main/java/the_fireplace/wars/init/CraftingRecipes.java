package the_fireplace.wars.init;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class CraftingRecipes {

	private CraftingRecipes() {
	}

	public static void registerRecipes() {

		GameRegistry.addRecipe(new ItemStack(WarsItems.blueBoots, 1), "   ", "@ @", "@ @", Character.valueOf('@'), WarsItems.waterGem);
		GameRegistry.addRecipe(new ItemStack(WarsItems.redBoots, 1), "   ", "@ @", "@ @", Character.valueOf('@'), WarsItems.fireGem);
		GameRegistry.addRecipe(new ItemStack(WarsItems.greenBoots, 1), "   ", "@ @", "@ @", Character.valueOf('@'), WarsItems.naturalGem);
		GameRegistry.addRecipe(new ItemStack(WarsItems.yellowBoots, 1), "   ", "@ @", "@ @", Character.valueOf('@'), WarsItems.decayGem);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.longBannana, 10), WarsItems.ancientGem, Items.carrot);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.workWaffel, 1), Items.bread, Items.porkchop);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.shadowFlesh, 10), Items.rotten_flesh, Items.ender_pearl);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.warCheese, 3), Items.milk_bucket, WarsItems.dagger);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.battleBurger, 1), Items.bread, Items.porkchop);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.workWaffel, 1), Items.potato, Items.sugar);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.magicPotato, 3), Items.potato, WarsItems.ancientGem);
		GameRegistry.addRecipe(new ItemStack(WarsItems.wizardStaff, 1), " % ", " # ", " # ", Character.valueOf('#'), Items.stick, Character.valueOf('@'), Items.diamond, Character.valueOf('%'), new ItemStack(WarsItems.ancientGem, 1, -1));
		GameRegistry.addRecipe(new ItemStack(WarsItems.guardSword, 1), " @ ", " % ", " # ", Character.valueOf('#'), Items.stick, Character.valueOf('@'), Items.iron_ingot, Character.valueOf('%'), new ItemStack(WarsItems.ancientGem, 1, -1));
		GameRegistry.addRecipe(new ItemStack(WarsItems.knightSword, 1), " @ ", " % ", " # ", Character.valueOf('#'), Items.stick, Character.valueOf('@'), Items.diamond, Character.valueOf('%'), new ItemStack(WarsItems.ancientGem, 1, -1));
		GameRegistry.addRecipe(new ItemStack(WarsItems.scoutBlade, 1), " @ ", " % ", " # ", Character.valueOf('#'), Items.stick, Character.valueOf('@'), Items.ender_pearl, Character.valueOf('%'), new ItemStack(WarsItems.ancientGem, 1, -1));
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.sinkSand, 1), "#@#", "@%@", "#@#", Character.valueOf('#'), Blocks.sand, Character.valueOf('@'), Blocks.web, Character.valueOf('%'), WarsItems.ancientGem);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.badBlock, 1), "#@#", "@%@", "#@#", Character.valueOf('#'), Blocks.stone, Character.valueOf('@'), Items.spider_eye, Character.valueOf('%'), WarsItems.ancientEmblem);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsBlocks.spleefStone, 16), Blocks.stone, Blocks.snow);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.ancientBlock, 1), "%%%", "%%%", "%%%", Character.valueOf('%'), WarsItems.ancientEmblem);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.teleporterBlock4), "RIR", "IEI", "RIR", 'I', WarsItems.ancientGem, 'E', WarsBlocks.teleporterBlock3, 'R', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.teleporterBlock3), "RIR", "IEI", "RIR", 'I', WarsItems.ancientGem, 'E', WarsBlocks.teleporterBlock2, 'R', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.teleporterBlock2), "RIR", "IEI", "RIR", 'I', WarsItems.ancientGem, 'E', WarsBlocks.teleporterBlock, 'R', Items.diamond);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.teleporterBlock), "RIR", "IEI", "RIR", 'I', WarsItems.ancientGem, 'E', Items.ender_pearl, 'R', Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsBlocks.deadDirt, 1), Blocks.dirt);
		GameRegistry.addRecipe(new ItemStack(WarsBlocks.bounceBlockLow, 1), "#@#", "@%@", "#@#", Character.valueOf('#'), Blocks.stone, Character.valueOf('@'), Items.redstone, Character.valueOf('%'), WarsItems.ancientGem);
		GameRegistry.addRecipe(new ItemStack(WarsItems.ancientEmblem, 2), "@%@", "%#%", "@%@", Character.valueOf('#'), WarsItems.ancientGem, Character.valueOf('@'), Items.diamond, Character.valueOf('%'), Items.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(WarsItems.ancientEmblem, 9), WarsBlocks.ancientBlock);
		
	}
}