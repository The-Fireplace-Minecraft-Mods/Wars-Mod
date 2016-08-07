package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
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