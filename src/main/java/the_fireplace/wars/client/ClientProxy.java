package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import the_fireplace.wars.CommonProxy;
import the_fireplace.wars.client.render.RenderPTNTPrimed;
import the_fireplace.wars.entities.EntityPTNTPrimed;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.init.WarsItems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

	@SuppressWarnings("rawtypes")
	public static List donators;

	@SuppressWarnings("unchecked")
	@Override
	public void registerRenderInformation() {
		WarsBlocks.registerItemRenders();
		WarsItems.registerItemRenders();
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
			e.printStackTrace();
		}

		MinecraftForge.EVENT_BUS.register(new ClientEvents());

		RenderingRegistry.registerEntityRenderingHandler(EntityPTNTPrimed.class, new RenderPTNTPrimed(Minecraft.getMinecraft().getRenderManager()));

		// Automatically adds official server to servers list
		/*ServerList list = new ServerList(Minecraft.getMinecraft());
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
		list.saveServerList();*/
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