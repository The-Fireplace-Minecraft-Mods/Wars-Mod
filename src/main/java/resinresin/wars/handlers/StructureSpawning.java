package resinresin.wars.handlers;

import resinresin.wars.WorldGen.structure.basic.GenBlueCastle;
import resinresin.wars.WorldGen.structure.basic.GenControlTower;
import resinresin.wars.WorldGen.structure.basic.GenGlassDome;
import resinresin.wars.WorldGen.structure.basic.GenGreenCastle;
import resinresin.wars.WorldGen.structure.basic.GenRedCastle;
import resinresin.wars.WorldGen.structure.basic.GenYellowCastle;
import resinresin.wars.WorldGen.structure.building.GenArcherTower;
import resinresin.wars.WorldGen.structure.building.GenBlacksmith;
import resinresin.wars.WorldGen.structure.building.GenGuardHut;
import resinresin.wars.WorldGen.structure.building.GenKnightHut;
import resinresin.wars.WorldGen.structure.building.GenWindmill;
import resinresin.wars.WorldGen.structure.building.GenWizardTower;
import resinresin.wars.WorldGen.structure.games.GenBookshelf;
import resinresin.wars.WorldGen.structure.games.GenChestParkour;
import resinresin.wars.WorldGen.structure.games.GenHgLarge;
import resinresin.wars.WorldGen.structure.games.GenHgSmall;
import resinresin.wars.WorldGen.structure.games.GenMazerace;
import resinresin.wars.WorldGen.structure.games.GenSkyblock;
import resinresin.wars.WorldGen.structure.spleef.GenMinersSpleefMedium;
import resinresin.wars.WorldGen.structure.spleef.GenMinersSpleefSmall;
import resinresin.wars.WorldGen.structure.spleef.GenNaturalSpleefMedium;
import resinresin.wars.WorldGen.structure.spleef.GenNaturalSpleefSmall;
import resinresin.wars.WorldGen.structure.spleef.GenNetherSpleefMedium;
import resinresin.wars.WorldGen.structure.spleef.GenNetherSpleefSmall;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class StructureSpawning {

	public StructureSpawning(EntityPlayer player, int type, int structure, int i, int j, int k) {

		switch (type) {

		case 1:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (MinecraftServer.getServerConfigurationManager(playerMP.mcServer).isPlayerOpped(playerMP.username)) {

					switch (structure) {

					case 1:

						new GenRedCastle(player, i, j, k);
						break;
					case 2:
						new GenBlueCastle(player, i, j, k);
						break;

					case 3:
						new GenGreenCastle(player, i, j, k);
						break;
					case 4:
						new GenYellowCastle(player, i, j, k);
						break;
					case 5:
						new GenGlassDome(player, i, j, k);
						break;
					case 6:
						new GenControlTower(player, i, j, k);
						break;
					}

				} else {

					player.addChatMessage("\u00a75\u00a7lYou need to be op / have cheats enabled!");
				}
			}

			break;
		case 2:

			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (MinecraftServer.getServerConfigurationManager(playerMP.mcServer).isPlayerOpped(playerMP.username)) {

					switch (structure) {

					case 1:

						new GenMinersSpleefSmall(player, i, j, k);
						break;
					case 2:
						new GenNaturalSpleefSmall(player, i, j, k);
						break;

					case 3:
						new GenNetherSpleefSmall(player, i, j, k);
						break;
					case 4:
						new GenMinersSpleefMedium(player, i, j, k);
						break;
					case 5:
						new GenNaturalSpleefMedium(player, i, j, k);
						break;
					case 6:
						new GenNetherSpleefMedium(player, i, j, k);
						break;
					}

				} else {

					player.addChatMessage("\u00a75\u00a7lYou need to be op / have cheats enabled!");
				}
			}

			break;

		case 3:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (MinecraftServer.getServerConfigurationManager(playerMP.mcServer).isPlayerOpped(playerMP.username)) {

					switch (structure) {

					case 1:

						new GenGuardHut(player, i, j, k);
						break;
					case 2:
						new GenKnightHut(player, i, j, k);
						break;

					case 3:
						new GenArcherTower(player, i, j, k);
						break;
					case 4:
						new GenWizardTower(player, i, j, k);
						break;
					case 5:
						new GenBlacksmith(player, i, j, k);
						break;
					case 6:
						new GenWindmill(player, i, j, k);
						break;
					}

				} else {

					player.addChatMessage("\u00a75\u00a7lYou need to be op / have cheats enabled!");
				}
			}
			break;
		case 4:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (MinecraftServer.getServerConfigurationManager(playerMP.mcServer).isPlayerOpped(playerMP.username)) {

					switch (structure) {

					case 1:

						new GenChestParkour(player, i, j, k);
						break;
					case 2:
						new GenSkyblock(player, i, j, k);
						break;

					case 3:
						new GenHgSmall(player, i, j, k);
						break;
					case 4:
						new GenBookshelf(player, i, j, k);
						break;
					case 5:
						new GenMazerace(player, i, j, k);
						break;
					case 6:
						new GenHgLarge(player, i, j, k);
						break;
					}

				} else {

					player.addChatMessage("\u00a75\u00a7lYou need to be op / have cheats enabled!");
				}
			}
			break;

		}

	}
}
