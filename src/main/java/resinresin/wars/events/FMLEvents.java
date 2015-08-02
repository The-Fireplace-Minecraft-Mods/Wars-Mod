package resinresin.wars.events;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import resinresin.wars.WarsMod;
import resinresin.wars.command.CommandBlueBase;
import resinresin.wars.command.CommandChaosSpawn;
import resinresin.wars.command.CommandEditMode;
import resinresin.wars.command.CommandGreenBase;
import resinresin.wars.command.CommandKillstreak;
import resinresin.wars.command.CommandRedBase;
import resinresin.wars.command.CommandTotalKills;
import resinresin.wars.command.CommandYellowBase;

/**
 *
 * @author The_Fireplace
 *
 */
public class FMLEvents {
	@SubscribeEvent
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
	@SubscribeEvent
	public void configChanged(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(WarsMod.MODID)){
			WarsMod.instance.syncConfig();
		}
	}
}
