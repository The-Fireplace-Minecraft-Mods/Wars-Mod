package resinresin.wars.tileentities;

import net.minecraft.block.Block;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatMessageComponent;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class TileEntityHungerGames extends TileEntity {

	private static final int TICKS_IN_30_SECONDS = 600; // figure that out
	private static final int TICKS_IN_50_SECONDS = 1000; // figure that out
	private static final int TICKS_IN_55_SECONDS = 1100; // figure that out
	private static final int TICKS_IN_56_SECONDS = 1120; // figure that out
	private static final int TICKS_IN_57_SECONDS = 1140; // figure that out
	private static final int TICKS_IN_58_SECONDS = 1160; // figure that out
	private static final int TICKS_IN_59_SECONDS = 1180; // figure that out
	private static final int TICKS_IN_1_MINUTE = 1200; // figure that out
	private static final int TICKS_WHEN_EVERYTHING_IS_DONE = 1300; // figure
																	// that out
	public boolean shouldTick = false;
	public int tickCount = 0;
	resinresinLoader hgSStarted = new resinresinLoader("hgSStarted.resinresin");

	@Override
	public void updateEntity() {

		if (shouldTick && !worldObj.isRemote) {
			tickCount++;

			if (tickCount == TICKS_IN_30_SECONDS) {
				MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES SMALL STARTING IN 30 SECONDS"));
			}
		}

		if (tickCount == TICKS_IN_50_SECONDS) {
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES SMALL STARTING IN 10 SECONDS"));

		}

		if (tickCount == TICKS_IN_55_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES SMALL STARTING IN 5 SECONDS"));

		}

		if (tickCount == TICKS_IN_56_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a754"));

		}

		if (tickCount == TICKS_IN_57_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a753"));

		}

		if (tickCount == TICKS_IN_58_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a752"));

		}

		if (tickCount == TICKS_IN_59_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a751"));

		}

		if (tickCount == TICKS_IN_1_MINUTE) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a72HUNGER GAMES SMALL HAS STARTED GO GO GO "));

			worldObj.createExplosion(null, xCoord + 0, yCoord + 3, zCoord - 5, 0.0F, shouldTick);
			worldObj.setBlock(xCoord + 0, yCoord - 0, zCoord - 0, 0, 2, 2);

			hgSStarted.generate(worldObj, xCoord - 9, yCoord - 2, zCoord - 16, false);
			worldObj.setBlock(xCoord + 1, yCoord + 1, zCoord - 7, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 1, yCoord + 1, zCoord - 7, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord + 0, yCoord + 1, zCoord - 6, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 0, yCoord + 1, zCoord - 8, WarsBlocks.insChest3.blockID, 2, 2);

			worldObj.setBlock(xCoord - 0, yCoord + 2, zCoord - 7, Block.workbench.blockID, 2, 2);
			worldObj.setBlock(xCoord - 0, yCoord + 1, zCoord - 7, Block.stoneBrick.blockID, 2, 2);
			worldObj.setBlock(xCoord - 0, yCoord + 0, zCoord - 7, WarsBlocks.hgLv1reset.blockID, 2, 2);
			worldObj.setBlock(xCoord - 0, yCoord + 16, zCoord - 7, WarsBlocks.hgTeleMain.blockID, 2, 2);

		}

		if (tickCount == TICKS_WHEN_EVERYTHING_IS_DONE) {
			shouldTick = false;
		}

	}

}
