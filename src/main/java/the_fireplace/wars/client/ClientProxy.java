package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.CommonProxy;
import the_fireplace.wars.client.render.PTNTRenderFactory;
import the_fireplace.wars.entities.EntityPTNTPrimed;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	public static boolean guiVisible = true;

	public static int totalKills;
	public static int killStreak;
	public static int deaths;
	public static int redPlayers;
	public static int bluePlayers;
	public static int greenPlayers;
	public static int yellowPlayers;

	@Override
	public void registerRenderInformation() {
		WarsBlocks.registerItemRenders();
		WarsItems.registerItemRenders();

		MinecraftForge.EVENT_BUS.register(new ClientEvents());

		RenderingRegistry.registerEntityRenderingHandler(EntityPTNTPrimed.class, new PTNTRenderFactory());

		addServerToList();
	}

	private void addServerToList(){
		ArrayList serverip = new ArrayList<String>();
		try {
			URL targetURL = new URL("http://thefireplace.bitnamiapp.com/warsmodserverip.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				serverip.add(dona);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		if(serverip.isEmpty())
			return;
		if(serverip.get(0).equals(""))
			return;
		// Automatically adds official server to servers list
		ServerList list = new ServerList(Minecraft.getMinecraft());
		list.loadServerList();
		boolean found = false;
		for (int i = 0; i < list.countServers(); i++) {
			ServerData data = list.getServerData(i);
			if (data.serverName.equals("Wars Mod Battle Server") && data.serverIP.equals(serverip.get(0))) {
				found = true;
				break;
			}
		}
		if (!found) {
			list.addServerData(new ServerData("Wars Mod Battle Server", (String)serverip.get(0), false));
		}
		list.saveServerList();
	}

	@Override
	public void handleKillData(EntityPlayer player, int totalKills, int killStreak, int deaths) {
		this.totalKills = totalKills;
		this.killStreak = killStreak;
		this.deaths = deaths;
		super.handleKillData(player, totalKills, killStreak, deaths);
	}

	@Override
	public void handleTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
		this.redPlayers = redPlayers;
		this.greenPlayers = greenPlayers;
		this.bluePlayers = bluePlayers;
		this.yellowPlayers = yellowPlayers;
	}

    @Override
    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx);
    }
}