package resinresin.wars.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockSetSpawn extends Block {

	public BlockSetSpawn() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public int getRenderBlockPass() {
		return 0;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		par1World.getWorldInfo().setSpawnPosition(i, j, k);

		if (!par1World.isRemote) {

			Minecraft mc = Minecraft.getMinecraft();

			mc.thePlayer.addChatMessage("World Spawn Set To" + "  " + i + "  " + j + "  " + k);

		}
		par1World.setBlock(i + 0, j - 0, k + 0, 0, 2, 2);
		return blockConstructorCalled;

	}

}