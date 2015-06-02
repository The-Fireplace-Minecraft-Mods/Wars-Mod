package resinresin.wars.Blocks;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
import resinresin.wars.data.WarsSavedData;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
/**
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class BlockAncientBlock extends Block {

	public BlockAncientBlock() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);

	}


	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		WarsSavedData savedWarsData = WarsSavedData.get(player.worldObj);
		if (savedWarsData.editMode.editModeToggle == false) {

			ByteArrayDataOutput out7 = ByteStreams.newDataOutput();
			out7.writeByte(1);
			Packet packet7 = PacketDispatcher.getTinyPacket(WarsMod.instance, (short) 10, out7.toByteArray());
			PacketDispatcher.sendPacketToPlayer(packet7, (Player) player);
		}
		return false;
	}

}