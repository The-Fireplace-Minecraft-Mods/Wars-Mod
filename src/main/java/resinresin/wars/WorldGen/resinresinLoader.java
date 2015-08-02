
package resinresin.wars.WorldGen;

import java.io.InputStream;

import net.minecraft.block.Block;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.google.common.primitives.UnsignedBytes;

public class ResinresinLoader {

	public byte[] blocks;
	public byte[] datablocks;
	public short width;
	public short length;
	public short height;
	public short[] sizes;

	public ResinresinLoader(String path) {
		blocks = null;
		datablocks = null;
		width = 0;
		length = 0;
		height = 0;
		loadResinresin(path);
	}

	public void loadResinresin(String path) {
		try {
			InputStream inputstream = ResinresinLoader.class.getResourceAsStream("/assets/warsmod/structures/" + path);
			NBTTagCompound nbt = CompressedStreamTools.readCompressed(inputstream);

			blocks = nbt.getByteArray("Blocks");
			datablocks = nbt.getByteArray("Data");
			width = nbt.getShort("Width");
			length = nbt.getShort("Length");
			height = nbt.getShort("Height");
			sizes = new short[] { width, length, height };
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void generate(World world, int posX, int posY, int posZ, boolean spawnairblocks) {
		
		try {
			int xnum = 0;
			int ynum = 0;
			int znum = 0;

			for (int i = 0; i < blocks.length; i++) {
				int blockId = UnsignedBytes.toInt(blocks[i]);
				if (((blocks[i] != 0) && (!spawnairblocks)) || (spawnairblocks == true)) {
					
					
					
					BlockPos position = new BlockPos(posX + xnum, posY + ynum, posZ + znum);
					world.setBlockState(position, Block.getBlockById(blockId).getStateFromMeta(datablocks[i]));

					//world.setBlock(posX + xnum, posY + ynum, posZ + znum, blockId, datablocks[i], 2);
				}

				if (xnum < width - 1) {
					xnum++;
				} else if ((xnum >= width - 1) && (znum < length - 1)) {
					xnum = 0;
					znum++;
				} else if ((xnum >= width - 1) && (znum >= length - 1) && (ynum < height - 1)) {
					xnum = 0;
					znum = 0;
					ynum++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}