package the_fireplace.wars.worldgen.structure.games;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.math.BlockPos;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class GenSkyblock {

	public GenSkyblock(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader skyBlock = new ResinresinLoader("skyBlock.resinresin");
	    
	    	
	    	
	    	skyBlock.generate(player.world, i + -9, j, k + -9, true);
	    	WarsMod.generateBlock(player.world, i + 2, j + 65, k + -1, Blocks.SAND);
	    	WarsMod.generateBlock(player.world, i + 1, j + 65, k + -1, Blocks.SAND);
	    	WarsMod.generateBlock(player.world, i, j + 65, k + -1, Blocks.SAND);
	    	WarsMod.generateBlock(player.world, i + 3, j + 67, k + -2, Blocks.CHEST);
	        TileEntityChest chest2 = new TileEntityChest();
	        
	        BlockPos chestPos1 = new BlockPos(i + 3, j + 67, k + -2);
	        player.world.setTileEntity(chestPos1, chest2);
	        TileEntityChest tileentitychest = (TileEntityChest)player.world.getTileEntity(chestPos1);
	        if (tileentitychest != null && tileentitychest.getSizeInventory() > 0) {
	        	ItemStack itemstack = new ItemStack(Items.STRING, 12);
	        	tileentitychest.setInventorySlotContents(0, itemstack);
	        	ItemStack itemstack1 = new ItemStack(Items.BUCKET, 1);
	        	tileentitychest.setInventorySlotContents(1, itemstack1);
	        	ItemStack itemstack2 = new ItemStack(Items.BONE, 1);
	        	tileentitychest.setInventorySlotContents(2, itemstack2);
	        	ItemStack itemstack3 = new ItemStack(Items.REEDS, 1);
	        	tileentitychest.setInventorySlotContents(3, itemstack3);
	        	ItemStack itemstack4 = new ItemStack(Blocks.RED_MUSHROOM, 1);
	        	tileentitychest.setInventorySlotContents(9, itemstack4);
	        	ItemStack itemstack5 = new ItemStack(Blocks.ICE, 2);
	        	tileentitychest.setInventorySlotContents(10, itemstack5);
	        	ItemStack itemstack6 = new ItemStack(Items.PUMPKIN_SEEDS, 1);
	        	tileentitychest.setInventorySlotContents(11, itemstack6);
	        	ItemStack itemstack7 = new ItemStack(Blocks.BROWN_MUSHROOM, 1);
	        	tileentitychest.setInventorySlotContents(18, itemstack7);
	        	ItemStack itemstack8 = new ItemStack(Items.MELON, 1);
	        	tileentitychest.setInventorySlotContents(19, itemstack8);
	        	ItemStack itemstack9 = new ItemStack(Blocks.CACTUS, 1);
	        	tileentitychest.setInventorySlotContents(20, itemstack9);
	        	
	        WarsMod.generateBlock(player.world, i + 1, j + 1, k, Blocks.CHEST);
	        TileEntityChest chest3 = new TileEntityChest();
	        
	        BlockPos chestPos2 = new BlockPos(i + 1, j + 1, k);
	        
	        player.world.setTileEntity(chestPos2, chest3);
	        TileEntityChest tileentitychest1 = (TileEntityChest)player.world.getTileEntity(chestPos2);
	        if (tileentitychest1 != null && tileentitychest1.getSizeInventory() > 0) {
	        ItemStack itemstack15 = new ItemStack(Items.BOAT, 4);
	        tileentitychest1.setInventorySlotContents(0, itemstack15);
	}
	        }
	}

}
