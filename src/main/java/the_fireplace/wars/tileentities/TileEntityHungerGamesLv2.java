package the_fireplace.wars.tileentities;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.TextComponentString;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.init.WarsBlocks;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class TileEntityHungerGamesLv2 extends TileEntity implements ITickable {

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
	ResinresinLoader hgLStarted = new ResinresinLoader("hgLStarted.resinresin");

	@Override
	public void update() {
		if (shouldTick && !world.isRemote) {
			tickCount++;

			if (tickCount == TICKS_IN_30_SECONDS) {
				world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a75HUNGER GAMES MEDIUM STARTING IN 30 SECONDS"));
			}
		}

		if (tickCount == TICKS_IN_50_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a75HUNGER GAMES MEDIUM STARTING IN 10 SECONDS"));
		}

		if (tickCount == TICKS_IN_55_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a75HUNGER GAMES MEDIUM STARTING IN 5 SECONDS"));
		}

		if (tickCount == TICKS_IN_56_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a754"));
		}

		if (tickCount == TICKS_IN_57_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a753"));
		}

		if (tickCount == TICKS_IN_58_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a752"));
		}

		if (tickCount == TICKS_IN_59_SECONDS) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a751"));
		}

		if (tickCount == TICKS_IN_1_MINUTE) {
			world.getMinecraftServer().getPlayerList().sendChatMsg(new TextComponentString("\u00a72HUNGER GAMES MEDIUM HAS STARTED GO GO GO "));

			
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 4, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 5, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 6, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 7, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 8, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 9, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 10, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 11, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 12, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 13, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 14, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 15, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 16, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 3, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 2, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY() + 1, pos.getZ(), 0.0F, shouldTick);
			world.createExplosion(null, pos.getX() - 19, pos.getY(), pos.getZ(), 0.0F, shouldTick);

			WarsMod.generateBlock(world, pos.getX(), pos.getY(), pos.getZ(), Blocks.AIR);

			WarsMod.generateBlock(world, pos.getX(), pos.getY(), pos.getZ(), Blocks.GLASS);

			hgLStarted.generate(world, pos.getX() - 40, pos.getY(), pos.getZ() - 22, false);

			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() + 4, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() - 4, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 23, pos.getY(), pos.getZ(), Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 15, pos.getY(), pos.getZ(), Blocks.AIR);

			WarsMod.generateBlock(world, pos.getX() - 18, pos.getY(), pos.getZ(), Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 20, pos.getY(), pos.getZ(), Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() - 1, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() + 1, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() + 5, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() - 5, Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 24, pos.getY(), pos.getZ(), Blocks.AIR);
			WarsMod.generateBlock(world, pos.getX() - 14, pos.getY(), pos.getZ() + 1, Blocks.AIR);

			WarsMod.generateBlock(world, pos.getX() - 18, pos.getY(), pos.getZ(), WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 20, pos.getY(), pos.getZ(), WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() - 1, WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() + 1, WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() + 4, WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY(), pos.getZ() - 4, WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 23, pos.getY(), pos.getZ(), WarsBlocks.insChest3);
			WarsMod.generateBlock(world, pos.getX() - 15, pos.getY(), pos.getZ(), WarsBlocks.insChest3);

			//WarsMod.generateBlock(worldObj, pos.getX() - 19, pos.getY() + 27, pos.getZ() - 0, WarsBlocks.hgTelebM);
			WarsMod.generateBlock(world, pos.getX() - 19, pos.getY() - 1, pos.getZ(), WarsBlocks.hgLv2reset);
			
		}

		if (tickCount == TICKS_WHEN_EVERYTHING_IS_DONE) {
			shouldTick = false;
		}
	}
}
