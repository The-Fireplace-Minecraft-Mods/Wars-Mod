package resinresin.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import resinresin.wars.tileentities.TileEntityHungerGames;

public class BlockHungerGamesLv1Start extends Block {

	public BlockHungerGamesLv1Start() {
		super(Material.iron);
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityHungerGames();
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getX();
		int k = pos.getX();
		
		BlockPos position = new BlockPos(i, j, k);
		TileEntityHungerGames te = (TileEntityHungerGames) world.getTileEntity(position);
		if (te.shouldTick) {
			return false;
		}
		te.tickCount = 0;
		te.shouldTick = true;

		if (!world.isRemote) {
			player.addChatMessage(new ChatComponentText("\u00a79HUNGER GAMES SMALL STARTING IN 1 MINUTE"));
		}

		return false;

	}
}
