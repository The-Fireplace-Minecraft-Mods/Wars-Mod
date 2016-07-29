package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import the_fireplace.wars.client.gui.*;

public class GuiHandler implements IGuiHandler {
	// returns an instance of the Container you made earlier
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("Gui called: "+id);

		TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));

		switch (id) {
		case 1:
			return new GuiClassSelect(player);
		case 2:
			return new GuiClassSelectDonator(player);
		case 3:
			return new GuiTeamSelect(player);
		case 4:
			if(entity == null)
				return null;
			return new GuiSetupSelection(player, entity);
		case 5:
			if(entity == null)
				return null;//null
			return new GuiSpleefSelect(player, entity);
		case 6:
			if(entity == null)
				return null;//null
			return new GuiBuildingSelect(player, entity);
		case 7:
			if(entity == null)
				return null;//null
			return new GuiGameSelect(player, entity);
		}

		throw new RuntimeException("WTF, this should not happen! Gui ID called: "+id);
	}
}