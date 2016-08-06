package the_fireplace.wars.tileentities;

import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ITickable;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;
import the_fireplace.wars.init.WarsBlocks;

public class TileEntityHungerGames extends TileEntity implements ITickable {

	private static final int TICKS_IN_30_SECONDS = 600;
	private static final int TICKS_IN_50_SECONDS = 1000; 
	private static final int TICKS_IN_55_SECONDS = 1100; 
	private static final int TICKS_IN_56_SECONDS = 1120; 
	private static final int TICKS_IN_57_SECONDS = 1140;
	private static final int TICKS_IN_58_SECONDS = 1160;
	private static final int TICKS_IN_59_SECONDS = 1180; 
	private static final int TICKS_IN_1_MINUTE = 1200;
	private static final int TICKS_WHEN_EVERYTHING_IS_DONE = 1300; 
																	
	public boolean shouldTick = false;
	public int tickCount = 0;
	ResinresinLoader hgSStarted = new ResinresinLoader("hgSStarted.resinresin");

	@Override
	public void update() {

		if (shouldTick && !worldObj.isRemote) {
			tickCount++;

			if (tickCount == TICKS_IN_30_SECONDS) {
				MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a75HUNGER GAMES SMALL STARTING IN 30 SECONDS"));
			}
		}

		if (tickCount == TICKS_IN_50_SECONDS) {
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a75HUNGER GAMES SMALL STARTING IN 10 SECONDS"));

		}

		if (tickCount == TICKS_IN_55_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a75HUNGER GAMES SMALL STARTING IN 5 SECONDS"));

		}

		if (tickCount == TICKS_IN_56_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a754"));

		}

		if (tickCount == TICKS_IN_57_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a753"));

		}

		if (tickCount == TICKS_IN_58_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a752"));

		}

		if (tickCount == TICKS_IN_59_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a751"));

		}

		if (tickCount == TICKS_IN_1_MINUTE) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("\u00a72HUNGER GAMES SMALL HAS STARTED GO GO GO "));

			worldObj.createExplosion(null, pos.getX(), pos.getY() + 3, pos.getZ() - 5, 0.0F, shouldTick);
			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY(), pos.getZ(), Blocks.air);

			hgSStarted.generate(worldObj, pos.getX() - 9, pos.getY() - 2, pos.getZ() - 16, false);
			WarsMod.generateBlock(worldObj, pos.getX() + 1, pos.getY() + 1, pos.getZ() - 7, WarsBlocks.insChest3);
			WarsMod.generateBlock(worldObj, pos.getX() - 1, pos.getY() + 1, pos.getZ() - 7, WarsBlocks.insChest3);
			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY() + 1, pos.getZ() - 6, WarsBlocks.insChest3);
			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY() + 1, pos.getZ() - 8, WarsBlocks.insChest3);

			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY() + 2, pos.getZ() - 7, Blocks.crafting_table);
			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY() + 1, pos.getZ() - 7, Blocks.stonebrick);
			WarsMod.generateBlock(worldObj, pos.getX(), pos.getY(), pos.getZ() - 7, WarsBlocks.hgLv1reset);
			//WarsMod.generateBlock(worldObj, pos.getX() - 0, pos.getY() + 16, pos.getZ() - 7, WarsBlocks.hgTeleMain);

		}

		if (tickCount == TICKS_WHEN_EVERYTHING_IS_DONE) {
			shouldTick = false;
		}

	}

}
