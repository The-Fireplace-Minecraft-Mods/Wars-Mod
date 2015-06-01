package resinresin.wars.Blocks;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.world.World;
import resinresin.wars.warsmod;
import resinresin.wars.data.WarsSavedData;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class BlockAncientBlock extends Block {

	public BlockAncientBlock() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);

	}

	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {
		WarsSavedData savedWarsData = WarsSavedData.get(player.worldObj);
		if (savedWarsData.editMode.editModeToggle == false) {

			ByteArrayDataOutput out7 = ByteStreams.newDataOutput();
			out7.writeByte(1);
			Packet packet7 = PacketDispatcher.getTinyPacket(warsmod.instance, (short) 10, out7.toByteArray());
			PacketDispatcher.sendPacketToPlayer(packet7, (Player) player);
		}
		return false;
	}

}