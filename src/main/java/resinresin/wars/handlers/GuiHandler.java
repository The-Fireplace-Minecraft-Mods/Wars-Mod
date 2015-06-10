package resinresin.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import resinresin.wars.client.gui.GuiBuildingSelect;
import resinresin.wars.client.gui.GuiClassSelect;
import resinresin.wars.client.gui.GuiClassSelectDonator;
import resinresin.wars.client.gui.GuiGameSelect;
import resinresin.wars.client.gui.GuiSetupSelection;
import resinresin.wars.client.gui.GuiSpleefSelect;
import resinresin.wars.client.gui.GuiTeamSelect;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
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
			return new GuiSetupSelection(player, world.getTileEntity(new BlockPos(x, y, z)));

		case 5:
			return new GuiSpleefSelect(player, world.getTileEntity(new BlockPos(x, y, z)));

		case 6:
			return new GuiBuildingSelect(player, world.getTileEntity(new BlockPos(x, y, z)));

		case 7:
			return new GuiGameSelect(player, world.getTileEntity(new BlockPos(x, y, z)));

		}

		throw new RuntimeException("WTF, this should not happen!");

	}
}