package resinresin.wars.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.CommonProxy;
import resinresin.wars.client.gui.GuiTeamSelect;
import resinresin.wars.entities.EntityPTNTPrimed;
import resinresin.wars.handlers.WarsTickEventHandler;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	public static KeyBinding toggleHUD;
	
	public static boolean guiVisible = true; 

	@SuppressWarnings("rawtypes")
	public static List donators;

	protected GuiTeamSelect teamSelected;

	@SuppressWarnings("unchecked")
	@Override
	public void registerRenderInformation() {
		
		donators = new ArrayList<String>();

		try {
			URL targetURL = new URL("https://dl.dropbox.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				// toLowerCase().
				donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TickRegistry.registerTickHandler(new ClientTickEventHandler(),
		// Side.CLIENT);
		WarsTickEventHandler clienttickhandler = new WarsTickEventHandler();
		MinecraftForge.EVENT_BUS.register(clienttickhandler);
		
		WarsKeyEventHandler clientkeyhandler = new WarsKeyEventHandler();
		MinecraftForge.EVENT_BUS.register(clientkeyhandler);
		

		RenderingRegistry.registerEntityRenderingHandler(EntityPTNTPrimed.class, new RenderPTNTPrimed());

		
	    toggleHUD = new KeyBinding("key.toggleHUD", Keyboard.KEY_B, "key.categories.warsmod");
		ClientRegistry.registerKeyBinding(toggleHUD);

		
		//Automatically adds official server to servers list
		//TODO turn this into a button 
		ServerList list = new ServerList(Minecraft.getMinecraft());
		list.loadServerList();
		boolean found = false;
		for (int i = 0; i < list.countServers(); i++) {
			ServerData data = list.getServerData(i);
			if (data.serverName.equals("Wars Mod Battle Server") && data.serverIP.equals("108.170.23.98:63293")) {
				found = true;
				break;
			}
		}
		if (!found) {
			list.addServerData(new ServerData("Wars Mod Battle Server", "108.170.23.98:63293"));

		}
		list.saveServerList();
		
	}

	public static int killstreak;

	@Override
	public void handleKillstreak(int killstreak) {

		ClientProxy.killstreak = killstreak;
	}

	public static int warsmod_totalKill;

	@Override
	public void handleTotalKill(int warsmod_totalKill) {

		ClientProxy.warsmod_totalKill = warsmod_totalKill;
	}

	public static int redPlayers;

	@Override
	public void handleRedPlayers(int redPlayers) {

		ClientProxy.redPlayers = redPlayers;

	}

	public static int bluePlayers;

	@Override
	public void handleBluePlayers(int bluePlayers) {

		ClientProxy.bluePlayers = bluePlayers;

	}

	public static int greenPlayers;

	@Override
	public void handleGreenPlayers(int greenPlayers) {

		ClientProxy.greenPlayers = greenPlayers;
	}

	public static int yellowPlayers;

	@Override
	public void handleYellowPlayers(int yellowPlayers) {
		ClientProxy.yellowPlayers = yellowPlayers;
	}

	public void closeOpenGui() {

	}
}