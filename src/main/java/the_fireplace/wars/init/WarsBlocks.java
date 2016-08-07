package the_fireplace.wars.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.blocks.*;
import the_fireplace.wars.blocks.unseen.*;
import the_fireplace.wars.items.ItemPTNTBlock;

public class WarsBlocks {
	public static Block castleSelector;
	public static Block controlRed;
	public static Block controlGreen;
	public static Block controlBlue;
	public static Block controlYellow;
	public static Block mazeReset;
	public static Block mazeStart;
	//public static Block chestPak;
	public static Block hill;
	public static Block cottage;
	public static Block gamesSelector;
	public static Block nSpleefS;
	public static Block nSpleefM;
	public static Block pSpleefS;
	public static Block pSpleefM;
	public static Block mSpleefS;
	public static Block mSpleefM;
	public static Block spleefSelector;
	public static Block ancientOre;
	public static Block deadDirt;
	public static Block ancientBlock;
	public static Block presentBox;
	public static Block spleefStone;
	public static Block sinkSand;
	public static Block fireOre;
	public static Block waterOre;
	public static Block decayOre;
	public static Block naturalOre;
	public static Block bounceBlock;
	public static Block boostBlock;
	public static Block sumBlock;
	public static Block bounceBlockLow;
	public static Block badBlock;
	public static Block buildingSelector;
	public static Block insChest1;
	public static Block insChest2;
	public static Block insChest3;
	public static Block insChest4;
	public static Block warChest;
	public static Block hgLv1start;
	public static Block hgLv1reset;
	public static Block hgLv2start;
	public static Block hgLv2reset;
	public static Block teleporterBlock4;
	public static Block teleporterBlock3;
	public static Block teleporterBlock2;
	public static Block teleporterBlock;
	public static Block playerTNT;
	public static Block wall;
	public static Block corner;
	public static Block lamp;
	//public static Block nostalHouse;
	public static Block roadPiece;
	public static Block tower;
	public static Block wallEnd;
	public static Block greenPlate;
	public static Block redPlate;
	public static Block bluePlate;
	public static Block yellowPlate;
	//public static Block warsTeleBlock;
	public static Block classSelect;
	public static Block classSelectDonator;

	public static void createBlocks() {

		// Basic Blocks Used in worldgen
		deadDirt = new BlockDeadDirt().setUnlocalizedName("deadDirt").setHardness(0.5F).setStepSound(Block.soundTypeGrass);
		ancientOre = new BlockAncientOre().setHardness(3F).setUnlocalizedName("ancientOre").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		ancientBlock = new BlockAncientBlock().setHardness(5F).setUnlocalizedName("ancientBlock").setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		fireOre = new BlockFireOre().setHardness(3F).setUnlocalizedName("fireOre").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		waterOre = new BlockWaterOre().setHardness(3F).setUnlocalizedName("waterOre").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		decayOre = new BlockDecayOre().setHardness(3F).setUnlocalizedName("decayOre").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		naturalOre = new BlockNaturalOre().setHardness(3F).setUnlocalizedName("naturalOre").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		sinkSand = new BlockSinkSand().setUnlocalizedName("sinkSand").setBlockUnbreakable().setHardness(6.9F).setStepSound(Block.soundTypeStone);

		// Utility Blocks
		bounceBlockLow = new BlockBounceLow().setBlockUnbreakable().setUnlocalizedName("bounceBlockLow").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		bounceBlock = new BlockBounce().setBlockUnbreakable().setUnlocalizedName("bounceBlock").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		boostBlock = new BlockBooster().setBlockUnbreakable().setUnlocalizedName("boostBlock").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		sumBlock = new BlockSummoner().setUnlocalizedName("sumBlock").setHardness(0.5F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		badBlock = new BlockBadBlock().setUnlocalizedName("badBlock").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		presentBox = new BlockPresentBox().setHardness(5F).setUnlocalizedName("presentBox").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		spleefStone = new BlockSpleefStone().setHardness(5F).setUnlocalizedName("spleefStone").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		insChest1 = new BlockInstantChestLv1().setBlockUnbreakable().setUnlocalizedName("insChest1").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		insChest2 = new BlockInstantChestLv2().setUnlocalizedName("insChest2").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone);
		insChest3 = new BlockInstantChestLv3().setBlockUnbreakable().setUnlocalizedName("insChest3").setResistance(6000000F).setStepSound(Block.soundTypeStone);
		insChest4 = new BlockInstantChestLv4().setUnlocalizedName("insChest4").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone);
		warChest = new BlockWarChest().setBlockUnbreakable().setBlockUnbreakable().setUnlocalizedName("warChest").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		teleporterBlock = new BlockTeleporter().setHardness(5).setResistance(10).setStepSound(Block.soundTypeStone).setUnlocalizedName("teleporterBlock");
		teleporterBlock2 = new BlockTeleporter().setHardness(5).setResistance(10).setStepSound(Block.soundTypeStone).setUnlocalizedName("teleporterBlock2");
		teleporterBlock3 = new BlockTeleporter().setHardness(5).setResistance(10).setStepSound(Block.soundTypeStone).setUnlocalizedName("teleporterBlock3");
		teleporterBlock4 = new BlockTeleporter().setHardness(5).setResistance(10).setStepSound(Block.soundTypeStone).setUnlocalizedName("teleporterBlock4");
		// Selectors
		castleSelector = new BlockCastleSelector().setUnlocalizedName("castleSelector").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		spleefSelector = new BlockSelectorSpleef().setBlockUnbreakable().setUnlocalizedName("spleefSelector").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		buildingSelector = new BlockSelectorBuildings().setBlockUnbreakable().setUnlocalizedName("buildingSelector").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		gamesSelector = new BlockSelectorGames().setBlockUnbreakable().setUnlocalizedName("gamesSelector").setStepSound(Block.soundTypeStone);
		classSelect = new BlockSelectorBasic().setBlockUnbreakable().setUnlocalizedName("classSelector").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		classSelectDonator = new BlockClassSelectorDonator().setBlockUnbreakable().setUnlocalizedName("classSelectorDonator").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);

		// Class Blocks
		playerTNT = new BlockPlayerTNT().setHardness(0.2F).setUnlocalizedName("playerTNT").setResistance(1F).setStepSound(Block.soundTypeStone);

		// Individual Structure Blocks
		hill = new BlockHill().setUnlocalizedName("hill").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		cottage = new BlockCottage().setUnlocalizedName("cottage").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		//wall = new BlockWall(hill.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK)).setBlockUnbreakable().setUnlocalizedName("wall2").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		//corner = new BlockCorner(hill.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK)).setBlockUnbreakable().setUnlocalizedName("corner").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		lamp = new BlockLamp().setBlockUnbreakable().setUnlocalizedName("lamp").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		roadPiece = new BlockRoadPiece().setBlockUnbreakable().setUnlocalizedName("roadPiece").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		tower = new BlockTower().setBlockUnbreakable().setUnlocalizedName("tower").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		wallEnd = new BlockWallEnd().setBlockUnbreakable().setUnlocalizedName("wallEnd").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);

		// War Game Blocks
		redPlate = new BlockRedPlate(Material.rock, BlockPressurePlate.Sensitivity.MOBS).setUnlocalizedName("redPlate").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		bluePlate = new BlockBluePlate(Material.rock, BlockPressurePlate.Sensitivity.MOBS).setUnlocalizedName("bluePlate").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		greenPlate = new BlockGreenPlate(Material.rock, BlockPressurePlate.Sensitivity.MOBS).setUnlocalizedName("greenPlate").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		yellowPlate = new BlockYellowPlate(Material.rock, BlockPressurePlate.Sensitivity.MOBS).setUnlocalizedName("yellowPlate").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);

		// Game Blocks
		nSpleefS = new BlockNetherSpleefSmall().setBlockUnbreakable().setUnlocalizedName("spleefNetherSmall").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		nSpleefM = new BlockNetherSpleefMedium().setBlockUnbreakable().setUnlocalizedName("spleefNetherMedium").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		pSpleefS = new BlockNaturalSpleefSmall().setBlockUnbreakable().setUnlocalizedName("spleefNaturalSmall").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		pSpleefM = new BlockNaturalSpleefMedium().setBlockUnbreakable().setUnlocalizedName("spleefNaturalMedium").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		mSpleefS = new BlockMinersSpleefSmall().setBlockUnbreakable().setUnlocalizedName("spleefMinersSmall").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		mSpleefM = new BlockMinersSpleefMedium().setBlockUnbreakable().setUnlocalizedName("spleefMinersMedium").setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		mazeReset = new BlockMazeReset().setUnlocalizedName("resetMaze").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		mazeStart = new BlockMazeStart().setUnlocalizedName("startMaze").setBlockUnbreakable().setResistance(6000000F).setStepSound(Block.soundTypeStone).setLightLevel(0.9F);
		hgLv1start = new BlockHungerGamesLv1Start().setUnlocalizedName("startHgLv1").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		hgLv1reset = new BlockHungerGamesLv1Reset().setUnlocalizedName("resetHgLv1").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		hgLv2start = new BlockHungerGamesLv2Start().setUnlocalizedName("startHgLv1").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);
		hgLv2reset = new BlockHungerGamesLv2Reset().setUnlocalizedName("resetHgLv1").setBlockUnbreakable().setResistance(6000000F).setLightLevel(0.9F).setStepSound(Block.soundTypeStone);

		//Control Blocks
		controlBlue = new BlockCBlue().setUnlocalizedName("ControlBlue");
		controlYellow = new BlockCYellow().setUnlocalizedName("ControlYellow");
		controlGreen = new BlockCGreen().setUnlocalizedName("ControlGreen");
		controlRed = new BlockCRed().setUnlocalizedName("ControlRed");

		GameRegistry.registerBlock(buildingSelector, "buildingSelector");
		GameRegistry.registerBlock(spleefSelector, "spleefSelector");
		GameRegistry.registerBlock(castleSelector, "castleSelector");
		GameRegistry.registerBlock(ancientOre, "ancientOre");
		GameRegistry.registerBlock(boostBlock, "boostBlock");
		GameRegistry.registerBlock(bounceBlock, "bounceBlock");
		GameRegistry.registerBlock(sumBlock, "sumBlock");
		GameRegistry.registerBlock(insChest1, "insChest1");
		GameRegistry.registerBlock(insChest3, "insChest3");
		GameRegistry.registerBlock(warChest, "warChest");
		GameRegistry.registerBlock(gamesSelector, "gamesSelector");
		GameRegistry.registerBlock(hill, "hill");
		GameRegistry.registerBlock(hgLv1start, "hgLv1start");
		GameRegistry.registerBlock(insChest2, "insChest2");
		GameRegistry.registerBlock(insChest4, "insChest4");
		GameRegistry.registerBlock(bounceBlockLow, "bounceBlockLow");
		GameRegistry.registerBlock(deadDirt, "deadDirt");
		GameRegistry.registerBlock(cottage, "cottage");
		GameRegistry.registerBlock(teleporterBlock, "teleporterBlock");
		GameRegistry.registerBlock(teleporterBlock2, "teleporterBlock2");
		GameRegistry.registerBlock(teleporterBlock3, "teleporterBlock3");
		GameRegistry.registerBlock(teleporterBlock4, "teleporterBlock4");
		GameRegistry.registerBlock(ancientBlock, "ancientBlock");
		GameRegistry.registerBlock(presentBox, "presentBox");
		GameRegistry.registerBlock(spleefStone, "spleefStone");
		GameRegistry.registerBlock(badBlock, "badBlock");
		GameRegistry.registerBlock(sinkSand, "sinkSand");
		GameRegistry.registerBlock(fireOre, "fireOre");
		GameRegistry.registerBlock(waterOre, "waterOre");
		GameRegistry.registerBlock(decayOre, "decayOre");
		GameRegistry.registerBlock(naturalOre, "naturalOre");
		GameRegistry.registerBlock(classSelect, "classSelect");
		GameRegistry.registerBlock(classSelectDonator, "classSelectDonator");
		//GameRegistry.registerBlock(wall, "wallNS");
		//GameRegistry.registerBlock(corner, "corner1");
		GameRegistry.registerBlock(lamp, "lamp");
		GameRegistry.registerBlock(roadPiece, "roadPiece");
		GameRegistry.registerBlock(tower, "tower");
		GameRegistry.registerBlock(wallEnd, "wallEnd");
		GameRegistry.registerBlock(redPlate, "redPlate");
		GameRegistry.registerBlock(bluePlate, "bluePlate");
		GameRegistry.registerBlock(yellowPlate, "yellowPlate");
		GameRegistry.registerBlock(greenPlate, "greenPlate");
		GameRegistry.registerBlock(playerTNT, ItemPTNTBlock.class, "playerTNT");
		GameRegistry.registerBlock(controlBlue, "ControlBlue");
		GameRegistry.registerBlock(controlYellow, "ControlYellow");
		GameRegistry.registerBlock(controlRed, "ControlRed");
		GameRegistry.registerBlock(controlGreen, "ControlGreen");
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemRenders() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(deadDirt), 0, new ModelResourceLocation("warsmod:deadDirt", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ancientOre), 0, new ModelResourceLocation("warsmod:ancientOre", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ancientBlock), 0, new ModelResourceLocation("warsmod:ancientBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(fireOre), 0, new ModelResourceLocation("warsmod:fireOre", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(waterOre), 0, new ModelResourceLocation("warsmod:waterOre", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(decayOre), 0, new ModelResourceLocation("warsmod:decayOre", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(naturalOre), 0, new ModelResourceLocation("warsmod:naturalOre", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(sinkSand), 0, new ModelResourceLocation("warsmod:sinkSand", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(boostBlock), 0, new ModelResourceLocation("warsmod:boostBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(bounceBlock), 0, new ModelResourceLocation("warsmod:bounceBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(bounceBlockLow), 0, new ModelResourceLocation("warsmod:bounceBlockLow", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(sumBlock), 0, new ModelResourceLocation("warsmod:sumBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(badBlock), 0, new ModelResourceLocation("warsmod:badBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(presentBox), 0, new ModelResourceLocation("warsmod:presentBox", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(spleefStone), 0, new ModelResourceLocation("warsmod:spleefStone", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(insChest1), 0, new ModelResourceLocation("warsmod:insChest1", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(insChest2), 0, new ModelResourceLocation("warsmod:insChest2", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(insChest3), 0, new ModelResourceLocation("warsmod:insChest3", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(insChest4), 0, new ModelResourceLocation("warsmod:insChest4", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(warChest), 0, new ModelResourceLocation("warsmod:warChest", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(teleporterBlock), 0, new ModelResourceLocation("warsmod:teleporterBlock", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(teleporterBlock2), 0, new ModelResourceLocation("warsmod:teleporterBlock2", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(teleporterBlock3), 0, new ModelResourceLocation("warsmod:teleporterBlock3", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(teleporterBlock4), 0, new ModelResourceLocation("warsmod:teleporterBlock4", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(castleSelector), 0, new ModelResourceLocation("warsmod:castleSelector", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(spleefSelector), 0, new ModelResourceLocation("warsmod:spleefSelector", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(buildingSelector), 0, new ModelResourceLocation("warsmod:buildingSelector", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(gamesSelector), 0, new ModelResourceLocation("warsmod:gamesSelector", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(classSelect), 0, new ModelResourceLocation("warsmod:classSelect", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(classSelectDonator), 0, new ModelResourceLocation("warsmod:classSelectDonator", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(hill), 0, new ModelResourceLocation("warsmod:hill", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(cottage), 0, new ModelResourceLocation("warsmod:cottage", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(lamp), 0, new ModelResourceLocation("warsmod:lamp", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(roadPiece), 0, new ModelResourceLocation("warsmod:roadPiece", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(tower), 0, new ModelResourceLocation("warsmod:tower", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(wallEnd), 0, new ModelResourceLocation("warsmod:wallEnd", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(playerTNT), 0, new ModelResourceLocation("warsmod:playerTNT", "inventory"));
	}

}