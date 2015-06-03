package resinresin.wars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.handlers.GuiHandler;
import resinresin.wars.handlers.WarsEventHandler;
import resinresin.wars.handlers.WarsPlayerEventHandler;
import resinresin.wars.handlers.WarsTickEventHandler;
import resinresin.wars.registry.CraftingRecipes;
import resinresin.wars.registry.WarsBlocks;
import resinresin.wars.registry.WarsDungeonChests;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.registry.WarsTileEntities;
import resinresin.wars.tabs.WarsBlocksTab;
import resinresin.wars.tabs.WarsClassesTab;
import resinresin.wars.tabs.WarsItemsTab;

@Mod(modid = "warsmod", name = "Wars Mod", version = "7")
public class Warsmod {

	public static CommonProxy proxy;

	public static Warsmod instance;
	public static Configuration conf;

	@SuppressWarnings("rawtypes")
	public static List donators;

	public static CreativeTabs tabWarsBlocks = new WarsBlocksTab("tabWarsItems");
	public static CreativeTabs tabWarsItems = new WarsItemsTab("tabWarsBlocks");
	public static CreativeTabs tabWarsClasses = new WarsClassesTab("tabWarsClasses");

	public static WarsWorldGenerator worldGen;

	public boolean doBiomes;
	public static boolean doSand;

	@SuppressWarnings("unchecked")
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		ModMetadata metadata = evt.getModMetadata();

		// Create Config
		conf = new Configuration(evt.getSuggestedConfigurationFile());
		conf.load();

		doSand = conf.get(Configuration.CATEGORY_GENERAL, "Generate Sink Sand", true).getBoolean(true);

		// Donation Handling
		donators = new ArrayList<String>();
		try {
			URL targetURL = new URL("https://dl.dropbox.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@EventHandler
	public void InitiateModWars(FMLInitializationEvent initEvent) {

		// Add Blocks
		WarsBlocks.createBlocks();
		// Add Items
		WarsItems.createItems();

		// Register Recipes
		CraftingRecipes.registerRecipes();
		// Dungeon Chest Item Hooks
		WarsDungeonChests.doDungeonChestHooks();

		// Add TileEntities
		WarsTileEntities.createTileEntities();

		// Register Event Handlers
		WarsEventHandler mainhandler = new WarsEventHandler();
		WarsPlayerEventHandler playerhandler = new WarsPlayerEventHandler();
		WarsTickEventHandler tickhandler = new WarsTickEventHandler();
		MinecraftForge.EVENT_BUS.register(mainhandler);
		MinecraftForge.EVENT_BUS.register(playerhandler);
		MinecraftForge.EVENT_BUS.register(tickhandler);
		MinecraftForge.EVENT_BUS.register(this);

		// Register World Generator
		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);

		// Register Gui Handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		// Register PTNT Entity (here still as there is only one)
		int entityIdPTNT = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT);
		EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT, Warsmod.instance, 16, 1, false);

		proxy.registerRenderInformation();
		conf.save();
	}

	// Used to help with 1.8 update (replaces setBlock)
	public static void generateBlock(World par1World, int i, int j, int k, Block block) {

		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, block.getDefaultState());

	}
	
	// Used to help with 1.8 update (replaces setBlock)
	public static void generateBlockWithMeta(World par1World, int i, int j, int k, IBlockState state) {

		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, state);

	}

}
