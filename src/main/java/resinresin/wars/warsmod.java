package resinresin.wars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.StatCollector;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import resinresin.wars.WorldGen.BiomeGenExtremeBattlefield;
import resinresin.wars.WorldGen.BiomeGenWasteland;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.config.ConfigValues;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.events.FMLEvents;
import resinresin.wars.events.ForgeEvents;
import resinresin.wars.handlers.GuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.handlers.GuiHandler;
import resinresin.wars.handlers.WarsEventHandler;
import resinresin.wars.handlers.WarsPlayerEventHandler;
import resinresin.wars.handlers.WarsTickEventHandler;
import resinresin.wars.packet.PacketClassSelected;
import resinresin.wars.packet.PacketKills;
import resinresin.wars.packet.PacketOpenTeamSelect;
import resinresin.wars.packet.PacketSpawnStructure;
import resinresin.wars.packet.PacketTeamSelected;
import resinresin.wars.packet.PacketTeams;
import resinresin.wars.registry.CraftingRecipes;
import resinresin.wars.registry.WarsBlocks;
import resinresin.wars.registry.WarsDungeonChests;
import resinresin.wars.registry.WarsItems;
import resinresin.wars.registry.WarsTileEntities;
import resinresin.wars.tabs.WarsBlocksTab;
import resinresin.wars.tabs.WarsClassesTab;
import resinresin.wars.tabs.WarsItemsTab;
/**
 * @author resinresin
 * @author The_Fireplace
 */
@Mod(modid = WarsMod.MODID, name = WarsMod.MODNAME, version = WarsMod.VERSION, acceptedMinecraftVersions="1.8", guiFactory="resinresin.wars.config.WarsModGuiFactory")
public class WarsMod {
	@Instance(WarsMod.MODID)
	public static WarsMod instance;

	public static final String MODID = "warsmod";
	public static final String MODNAME = "Wars Mod";
	public static final String VERSION = "2.0.0.1";

	@SidedProxy(clientSide = "resinresin.wars.client.ClientProxy", serverSide = "resinresin.wars.CommonProxy")
	public static CommonProxy proxy;
	public static SimpleNetworkWrapper network;

	public static List donators;
	public static final CreativeTabs tabWarsBlocks = new WarsBlocksTab("tabWarsItems");
	public static final CreativeTabs tabWarsItems = new WarsItemsTab("tabWarsBlocks");
	public static final CreativeTabs tabWarsClasses = new WarsClassesTab("tabWarsClasses");

	public static Configuration config;
	public static Property DOBIOMES_PROPERTY;
	public static Property DOSAND_PROPERTY;

	public void syncConfig(){
		ConfigValues.DOBIOMES = DOBIOMES_PROPERTY.getBoolean();
		ConfigValues.DOSAND = DOSAND_PROPERTY.getBoolean();
		if(config.hasChanged()){
			config.save();
		}
	}

	public static WarsWorldGenerator worldGen;
	public static BiomeGenBase waste;
	public static BiomeGenBase EXbattlefield;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		DOBIOMES_PROPERTY = config.get(Configuration.CATEGORY_GENERAL, ConfigValues.DOBIOMES_NAME, ConfigValues.DOBIOMES_DEFAULT);
		DOBIOMES_PROPERTY.comment=StatCollector.translateToLocal("cfg.doBiomes");
		DOSAND_PROPERTY = config.get(Configuration.CATEGORY_GENERAL, ConfigValues.DOSAND_NAME, ConfigValues.DOSAND_DEFAULT);
		DOSAND_PROPERTY.comment=StatCollector.translateToLocal("cfg.doSand");
		syncConfig();
		WarsBlocks.createBlocks();
		WarsItems.createItems();
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel("WarsChannel");
		
		network.registerMessage(PacketSpawnStructure.Handler.class, PacketSpawnStructure.class, 0, Side.SERVER);
		network.registerMessage(PacketTeamSelected.Handler.class, PacketTeamSelected.class, 1, Side.SERVER);
		network.registerMessage(PacketClassSelected.Handler.class, PacketClassSelected.class, 2, Side.SERVER);
		
		
	    network.registerMessage(PacketKills.Handler.class, PacketKills.class, 3, Side.CLIENT);
	    network.registerMessage(PacketTeams.Handler.class, PacketTeams.class, 4, Side.CLIENT);
	    network.registerMessage(PacketOpenTeamSelect.Handler.class, PacketOpenTeamSelect.class, 5, Side.CLIENT);

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
		// Register Recipes
		CraftingRecipes.registerRecipes();
		// Dungeon Chest Item Hooks
		WarsDungeonChests.doDungeonChestHooks();

		// Add TileEntities
		WarsTileEntities.createTileEntities();

		FMLCommonHandler.instance().bus().register(new FMLEvents());
		MinecraftForge.EVENT_BUS.register(new ForgeEvents());
		MinecraftForge.EVENT_BUS.register(new WarsEventHandler());
		MinecraftForge.EVENT_BUS.register(new WarsPlayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new WarsTickEventHandler());

		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

		worldGen = new WarsWorldGenerator();
		if (ConfigValues.DOBIOMES) {
			waste = (new BiomeGenWasteland(25));
			EXbattlefield = (new BiomeGenExtremeBattlefield(26));

			GameRegistry.addBiome(waste);
			GameRegistry.addBiome(EXbattlefield);
		}
		// Register PTNT Entity (here still as there is only one)
		//int entityIdPTNT = EntityRegistry.findGlobalUniqueEntityId();
		//EntityRegistry.registerGlobalEntityID(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT);
		//EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT, Warsmod.instance, 16, 1, false);
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
