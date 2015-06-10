package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.WarsMod;
/**
 *
 * @author resinresin
 * @author The_Fireplace
 *
 */
public class BlockSetSpawn extends Block {

	public BlockSetSpawn() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isFullCube()
	{
		return false;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();

		world.getWorldInfo().setSpawn(pos);

		if (!world.isRemote) {

			Minecraft mc = Minecraft.getMinecraft();

			mc.thePlayer.sendChatMessage("World Spawn Set To" + "  " + i + "  " + j + "  " + k);

		}
		WarsMod.generateBlock(world, i + 0, j - 0, k + 0, Blocks.air);

		return false;

	}

}