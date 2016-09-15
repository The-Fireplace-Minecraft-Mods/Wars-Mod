package the_fireplace.wars.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import the_fireplace.wars.tileentities.TileEntityClassSelect;
//TODO: Is this necessary?
public class ContainerClassSelectDonator extends Container {

	protected TileEntityClassSelect tileEntity;

	public ContainerClassSelectDonator(InventoryPlayer inventoryPlayer, TileEntityClassSelect te) {
		tileEntity = te;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);
	}

}
