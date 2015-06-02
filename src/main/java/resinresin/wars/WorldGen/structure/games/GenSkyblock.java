package resinresin.wars.WorldGen.structure.games;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import resinresin.wars.WarsMod;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenSkyblock {

	public GenSkyblock(EntityPlayer player, int i, int j, int k) {
		resinresinLoader skyBlock = new resinresinLoader("skyBlock.resinresin");
	    
	    	
	    	
	    	skyBlock.generate(player.worldObj, i + -9, j - 0, k + -9, true);
	    	WarsMod.generateBlock(player.worldObj, i + 2, j + 65, k + -1, Blocks.sand);
	    	WarsMod.generateBlock(player.worldObj, i + 1, j + 65, k + -1, Blocks.sand);
	    	WarsMod.generateBlock(player.worldObj, i + 0, j + 65, k + -1, Blocks.sand);
	    	WarsMod.generateBlock(player.worldObj, i + 3, j + 67, k + -2, Blocks.chest);
	        TileEntityChest chest2 = new TileEntityChest();
	        player.worldObj.setBlockTileEntity(i + 3, j + 67, k + -2, chest2);
	        TileEntityChest tileentitychest = (TileEntityChest)player.worldObj.getBlockTileEntity(i + 3, j + 67, k + -2);
	        if (tileentitychest != null && tileentitychest.getSizeInventory() > 0) {
	        	ItemStack itemstack = new ItemStack(Items.string, 12);
	        	tileentitychest.setInventorySlotContents(0, itemstack);
	        	ItemStack itemstack1 = new ItemStack(Items.bucket, 1);
	        	tileentitychest.setInventorySlotContents(1, itemstack1);
	        	ItemStack itemstack2 = new ItemStack(Items.bone, 1);
	        	tileentitychest.setInventorySlotContents(2, itemstack2);
	        	ItemStack itemstack3 = new ItemStack(Items.reeds, 1);
	        	tileentitychest.setInventorySlotContents(3, itemstack3);
	        	ItemStack itemstack4 = new ItemStack(Blocks.red_mushroom, 1);
	        	tileentitychest.setInventorySlotContents(9, itemstack4);
	        	ItemStack itemstack5 = new ItemStack(Blocks.ice, 2);
	        	tileentitychest.setInventorySlotContents(10, itemstack5);
	        	ItemStack itemstack6 = new ItemStack(Items.pumpkin_seeds, 1);
	        	tileentitychest.setInventorySlotContents(11, itemstack6);
	        	ItemStack itemstack7 = new ItemStack(Blocks.brown_mushroom, 1);
	        	tileentitychest.setInventorySlotContents(18, itemstack7);
	        	ItemStack itemstack8 = new ItemStack(Items.melon, 1);
	        	tileentitychest.setInventorySlotContents(19, itemstack8);
	        	ItemStack itemstack9 = new ItemStack(Blocks.cactus, 1);
	        	tileentitychest.setInventorySlotContents(20, itemstack9);
	        	
	        WarsMod.generateBlock(player.worldObj, i + 1, j + 1, k + 0, Blocks.chest);
	        TileEntityChest chest3 = new TileEntityChest();
	        player.worldObj.setBlockTileEntity(i + 1, j + 1, k + 0, chest3);
	        TileEntityChest tileentitychest1 = (TileEntityChest)player.worldObj.getBlockTileEntity(i + 1, j + 1, k + 0);
	        if (tileentitychest1 != null && tileentitychest1.getSizeInventory() > 0) {
	        ItemStack itemstack15 = new ItemStack(Items.boat, 4);
	        tileentitychest1.setInventorySlotContents(0, itemstack15);
	}
	        }
	}

}
