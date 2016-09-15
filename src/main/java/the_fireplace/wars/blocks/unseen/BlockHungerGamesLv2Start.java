package the_fireplace.wars.blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import the_fireplace.wars.tileentities.TileEntityHungerGamesLv2;

public class BlockHungerGamesLv2Start extends Block {

	public BlockHungerGamesLv2Start() {
		super(Material.IRON);
		setSoundType(SoundType.STONE);
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityHungerGamesLv2();
	}

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack held, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		BlockPos position = new BlockPos(i, j, k);
		TileEntityHungerGamesLv2 te = (TileEntityHungerGamesLv2) world.getTileEntity(position);
		if (te.shouldTick) {
			return false;
		}
		te.tickCount = 0;
		te.shouldTick = true;
		world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentTranslation("hungergames.medium.start"));

		return false;
	}
}
