package resinresin.wars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.server.MinecraftServer;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.command.CommandBlueBase;
import resinresin.wars.command.CommandChaosSpawn;
import resinresin.wars.command.CommandEditMode;
import resinresin.wars.command.CommandGreenBase;
import resinresin.wars.command.CommandKillstreak;
import resinresin.wars.command.CommandRedBase;
import resinresin.wars.command.CommandTotalKills;
import resinresin.wars.command.CommandYellowBase;
import resinresin.wars.config.ConfigValues;
import resinresin.wars.events.FMLEvents;
import resinresin.wars.events.ForgeEvents;
import resinresin.wars.handlers.GuiHandler;
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

@Mod(modid = WarsMod.MODID, name = WarsMod.MODNAME, version = WarsMod.VERSION, guiFactory="resinresin.wars.config.WarsModGuiFactory")
public class WarsMod {
	public static final String MODID = "warsmod";
	public static final String MODNAME = "Wars Mod";
	public static final String VERSION = "2.0.0.1";
	public static final String downloadUrl = "";//A goo.gl shortened version of the link to the thread. Will be used for the version checker.

	@SidedProxy(clientSide = "resinresin.wars.client.ClientProxy", serverSide = "resinresin.wars.CommonProxy")
	public static CommonProxy proxy;
	public static SimpleNetworkWrapper network;

	@Instance(MODID)
	public static WarsMod instance;

	public static Configuration config;
	public static Property DOSAND_PROPERTY;

	public static void syncConfig(){
		ConfigValues.DOSAND = DOSAND_PROPERTY.getBoolean();
		if(config.hasChanged())
			config.save();
	}

	@SuppressWarnings("rawtypes")
	public static List donators;

	public static CreativeTabs tabWarsBlocks = new WarsBlocksTab("tabWarsItems");
	public static CreativeTabs tabWarsItems = new WarsItemsTab("tabWarsBlocks");
	public static CreativeTabs tabWarsClasses = new WarsClassesTab("tabWarsClasses");

	public static WarsWorldGenerator worldGen;

	@SuppressWarnings("unchecked")
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Create Config
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		DOSAND_PROPERTY = config.get(Configuration.CATEGORY_GENERAL, ConfigValues.DOSAND_NAME, ConfigValues.DOSAND_DEFAULT);
		syncConfig();

		WarsBlocks.createBlocks();
		WarsItems.createItems();

		registerNetwork();

		getDonators();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		CraftingRecipes.registerRecipes();
		WarsDungeonChests.doDungeonChestHooks();
		WarsTileEntities.createTileEntities();
		FMLCommonHandler.instance().bus().register(new FMLEvents());
		MinecraftForge.EVENT_BUS.register(new ForgeEvents());
		MinecraftForge.EVENT_BUS.register(new WarsPlayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new WarsTickEventHandler());

		// Register World Generator
		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);

		// Register Gui Handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		// Register PTNT Entity (here still as there is only one)
		//int eid = 0;//Don't use global entity ids.
		//EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", eid++, instance, 16, 1, false);

		proxy.registerRenderInformation();

		config.save();
	}

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {

		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();

		ServerCommandManager serverCommand = ((ServerCommandManager) command);

		serverCommand.registerCommand(new CommandKillstreak());
		serverCommand.registerCommand(new CommandTotalKills());
		serverCommand.registerCommand(new CommandRedBase());
		serverCommand.registerCommand(new CommandGreenBase());
		serverCommand.registerCommand(new CommandBlueBase());
		serverCommand.registerCommand(new CommandYellowBase());
		serverCommand.registerCommand(new CommandChaosSpawn());
		serverCommand.registerCommand(new CommandEditMode());
	}

	/**
	 * Used to help with 1.8 update (replaces setBlock)
	 */
	public static void generateBlock(World par1World, int i, int j, int k, Block block) {

		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, block.getDefaultState());

	}

	/**
	 * Used to help with 1.8 update (replaces setBlock)
	 */
	public static void generateBlockWithMeta(World par1World, int i, int j, int k, IBlockState state) {

		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, state);

	}

	private void registerNetwork(){
		network = NetworkRegistry.INSTANCE.newSimpleChannel("WarsChannel");

		network.registerMessage(PacketSpawnStructure.Handler.class, PacketSpawnStructure.class, 0, Side.SERVER);
		network.registerMessage(PacketTeamSelected.Handler.class, PacketTeamSelected.class, 1, Side.SERVER);
		network.registerMessage(PacketClassSelected.Handler.class, PacketClassSelected.class, 2, Side.SERVER);

		network.registerMessage(PacketKills.Handler.class, PacketKills.class, 3, Side.CLIENT);
		network.registerMessage(PacketTeams.Handler.class, PacketTeams.class, 4, Side.CLIENT);
		network.registerMessage(PacketOpenTeamSelect.Handler.class, PacketOpenTeamSelect.class, 5, Side.CLIENT);
	}

	private void getDonators(){
		donators = new ArrayList<String>();
		try {
			URL targetURL = new URL("https://dl.dropboxusercontent.com/u/104023161/Donators.txt");
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
}
