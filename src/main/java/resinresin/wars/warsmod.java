package resinresin.wars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import resinresin.wars.WorldGen.BiomeGenExtremeBattlefield;
import resinresin.wars.WorldGen.BiomeGenWasteland;
import resinresin.wars.WorldGen.WarsWorldGenerator;
import resinresin.wars.command.CommandBlueBase;
import resinresin.wars.command.CommandChaosSpawn;
import resinresin.wars.command.CommandEditMode;
import resinresin.wars.command.CommandGreenBase;
import resinresin.wars.command.CommandKillstreak;
import resinresin.wars.command.CommandRedBase;
import resinresin.wars.command.CommandTotalKills;
import resinresin.wars.command.CommandYellowBase;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.events.FMLEvents;
import resinresin.wars.events.ForgeEvents;
import resinresin.wars.handlers.GuiHandler;
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
	public static final String VERSION = "6.3";

	@SidedProxy(clientSide = "resinresin.wars.client.ClientProxy", serverSide = "resinresin.wars.CommonProxy")
	public static CommonProxy proxy;

	public static List donators;
	public static CreativeTabs tabWarsBlocks = new WarsBlocksTab("tabWarsItems");
	public static CreativeTabs tabWarsItems = new WarsItemsTab("tabWarsBlocks");
	public static CreativeTabs tabWarsClasses = new WarsClassesTab("tabWarsClasses");
	public boolean doBiomes;
	public static boolean doSand;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
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

		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		DOBIOMES_PROPERTY = config.get(Configuration.CATEGORY_GENERAL, ConfigValues.DOBIOMES_NAME, ConfigValues.DOBIOMES_DEFAULT);
		DOBIOMES_PROPERTY.comment=StatCollector.translateToLocal("cfg.doBiomes");
		DOSAND_PROPERTY = config.get(Configuration.CATEGORY_GENERAL, ConfigValues.DOSAND_NAME, ConfigValues.DOSAND_DEFAULT);
		DOSAND_PROPERTY.comment=StatCollector.translateToLocal("cfg.doSand");
		syncConfig();
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
		proxy.capesInit();

	}

	public static WarsWorldGenerator worldGen;
	public static BiomeGenBase waste;
	public static BiomeGenBase EXbattlefield;

	@EventHandler
	public void InitiateModWars(FMLInitializationEvent initEvent) {
		
		WarsBlocks.createBlocks();
		WarsItems.createItems();
		CraftingRecipes.registerRecipes();
		WarsDungeonChests.doDungeonChestHooks();
		WarsTileEntities.createTileEntities();

		FMLCommonHandler.instance().bus().register(new FMLEvents());
		MinecraftForge.EVENT_BUS.register(new ForgeEvents());

		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

		worldGen = new WarsWorldGenerator();
		if (doBiomes == true) {
			waste = (new BiomeGenWasteland(25));
			EXbattlefield = (new BiomeGenExtremeBattlefield(26));

			GameRegistry.addBiome(waste);
			GameRegistry.addBiome(EXbattlefield);
		}

		int entityIdPTNT = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT);
		EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", entityIdPTNT, Warsmod.instance, 16, 1, false);

		proxy.registerRenderInformation();
	}

	public static void generateBlock(World par1World, int i, int j, int k, Block block) {
		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, block.getDefaultState());
	}
}
