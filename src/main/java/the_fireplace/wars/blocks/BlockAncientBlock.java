package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import the_fireplace.wars.WarsMod;

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
}