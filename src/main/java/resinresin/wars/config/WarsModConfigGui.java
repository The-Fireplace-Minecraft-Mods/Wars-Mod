package resinresin.wars.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import resinresin.wars.WarsMod;
/**
 * @author The_Fireplace
 */
public class WarsModConfigGui extends GuiConfig {
	public WarsModConfigGui(GuiScreen parentScreen){
		super(parentScreen, new ConfigElement(WarsMod.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), WarsMod.MODID, false, true, GuiConfig.getAbridgedConfigPath(WarsMod.config.toString()));
	}
}
