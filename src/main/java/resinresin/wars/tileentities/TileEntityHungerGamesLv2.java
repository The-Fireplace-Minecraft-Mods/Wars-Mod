package resinresin.wars.tileentities;

import net.minecraft.block.Block;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class TileEntityHungerGamesLv2 extends TileEntity {

	private static final int TICKS_IN_30_SECONDS = 30*20; // figure that out
	private static final int TICKS_IN_50_SECONDS = 50*20; // figure that out
	private static final int TICKS_IN_55_SECONDS = 55*20; // figure that out
	private static final int TICKS_IN_56_SECONDS = 56*20; // figure that out
	private static final int TICKS_IN_57_SECONDS = 57*20; // figure that out
	private static final int TICKS_IN_58_SECONDS = 58*20; // figure that out
	private static final int TICKS_IN_59_SECONDS = 59*20; // figure that out
	private static final int TICKS_IN_1_MINUTE = 60*20; // figure that out
	private static final int TICKS_WHEN_EVERYTHING_IS_DONE = 1300; //what is there to figure out? Simple math, if not experience tell how many ticks per second. What more is there to figure out?

	public boolean shouldTick = false;
	public int tickCount = 0;
	resinresinLoader hgLStarted = new resinresinLoader("hgLStarted.resinresin");

	@Override
	public void updateEntity() {
		if (shouldTick && !worldObj.isRemote) {
			tickCount++;

			if (tickCount == TICKS_IN_30_SECONDS) {
				MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES MEDIUM STARTING IN 30 SECONDS"));
			}
		}

		if (tickCount == TICKS_IN_50_SECONDS) {
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES MEDIUM STARTING IN 10 SECONDS"));

		}

		if (tickCount == TICKS_IN_55_SECONDS) {

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a75HUNGER GAMES MEDIUM STARTING IN 5 SECONDS"));

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

			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("\u00a72HUNGER GAMES MEDIUM HAS STARTED GO GO GO "));

			worldObj.createExplosion(null, xCoord - 19, yCoord + 4, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 5, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 6, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 7, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 8, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 9, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 10, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 11, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 12, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 13, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 14, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 15, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 16, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 3, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 2, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 1, zCoord - 0, 0.0F, shouldTick);
			worldObj.createExplosion(null, xCoord - 19, yCoord + 0, zCoord - 0, 0.0F, shouldTick);

			worldObj.setBlock(xCoord + 0, yCoord - 0, zCoord - 0, 0, tickCount, tickCount);

			worldObj.setBlock(xCoord - 0, yCoord + 0, zCoord - 0, Block.glass.blockID, tickCount, tickCount);

			hgLStarted.generate(worldObj, xCoord - 40, yCoord - 0, zCoord - 22, false);

			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord + 4, 0, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord - 4, 0, 2, 2);
			worldObj.setBlock(xCoord - 23, yCoord + 0, zCoord + 0, 0, 2, 2);
			worldObj.setBlock(xCoord - 15, yCoord + 0, zCoord + 0, 0, 2, 2);

			worldObj.setBlock(xCoord - 18, yCoord + 0, zCoord - 0, 0, 2, 2);
			worldObj.setBlock(xCoord - 20, yCoord + 0, zCoord - 0, 0, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord - 1, 0, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord + 1, 0, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord + 5, 0, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord - 5, 0, 2, 2);
			worldObj.setBlock(xCoord - 24, yCoord + 0, zCoord + 0, 0, 2, 2);
			worldObj.setBlock(xCoord - 14, yCoord + 0, zCoord + 1, 0, 2, 2);

			worldObj.setBlock(xCoord - 18, yCoord + 0, zCoord - 0, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 20, yCoord + 0, zCoord - 0, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord - 1, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord + 1, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord + 4, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord + 0, zCoord - 4, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 23, yCoord + 0, zCoord + 0, WarsBlocks.insChest3.blockID, 2, 2);
			worldObj.setBlock(xCoord - 15, yCoord + 0, zCoord + 0, WarsBlocks.insChest3.blockID, 2, 2);

			worldObj.setBlock(xCoord - 19, yCoord + 27, zCoord - 0, WarsBlocks.hgTelebM.blockID, 2, 2);
			worldObj.setBlock(xCoord - 19, yCoord - 1, zCoord - 0, WarsBlocks.hgLv2reset.blockID, 2, 2);
		}

		if (tickCount == TICKS_WHEN_EVERYTHING_IS_DONE) {
			shouldTick = false;
		}

	}
}
