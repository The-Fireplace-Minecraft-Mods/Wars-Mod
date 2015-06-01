package resinresin.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import resinresin.wars.client.gui.GuiBuildingSelect;
import resinresin.wars.client.gui.GuiClassSelect;
import resinresin.wars.client.gui.GuiClassSelectDonator;
import resinresin.wars.client.gui.GuiGameSelect;
import resinresin.wars.client.gui.GuiSetupSelection;
import resinresin.wars.client.gui.GuiSpleefSelect;
import resinresin.wars.client.gui.GuiTeamSelect;
import resinresin.wars.tileentities.TileEntityBasicStructures;
import resinresin.wars.tileentities.TileEntityBuildingStructures;
import resinresin.wars.tileentities.TileEntityGameStructures;
import resinresin.wars.tileentities.TileEntitySpleefStructures;

public class GuiHandler implements IGuiHandler {
	// returns an instance of the Container you made earlier
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		return null;
	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		switch (id) {

		case 1:
			return new GuiClassSelect(player);
		case 2:
			return new GuiClassSelectDonator(player);
		case 3:

			return new GuiTeamSelect(player);

		case 4:
			return new GuiSetupSelection(player, (TileEntityBasicStructures) world.getBlockTileEntity(x, y, z));

		case 5:
			return new GuiSpleefSelect(player, (TileEntitySpleefStructures) world.getBlockTileEntity(x, y, z));

		case 6:
			return new GuiBuildingSelect(player, (TileEntityBuildingStructures) world.getBlockTileEntity(x, y, z));

		case 7:
			return new GuiGameSelect(player, (TileEntityGameStructures) world.getBlockTileEntity(x, y, z));

		}

		throw new RuntimeException("WTF, this should not happen!");

	}
}