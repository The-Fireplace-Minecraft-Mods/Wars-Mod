package resinresin.wars.events;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import resinresin.wars.WarsMod;

/**
 *
 * @author The_Fireplace
 *
 */
public class FMLEvents {
	@SubscribeEvent
	public void configChanged(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(WarsMod.MODID)){
			WarsMod.instance.syncConfig();
		}
	}
}
