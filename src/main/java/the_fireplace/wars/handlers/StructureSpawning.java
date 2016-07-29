package the_fireplace.wars.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.FMLCommonHandler;
import the_fireplace.wars.worldgen.structure.basic.GenBlueCastle;
import the_fireplace.wars.worldgen.structure.basic.GenControlTower;
import the_fireplace.wars.worldgen.structure.basic.GenGlassDome;
import the_fireplace.wars.worldgen.structure.basic.GenGreenCastle;
import the_fireplace.wars.worldgen.structure.basic.GenRedCastle;
import the_fireplace.wars.worldgen.structure.basic.GenYellowCastle;
import the_fireplace.wars.worldgen.structure.building.GenArcherTower;
import the_fireplace.wars.worldgen.structure.building.GenBlacksmith;
import the_fireplace.wars.worldgen.structure.building.GenGuardHut;
import the_fireplace.wars.worldgen.structure.building.GenKnightHut;
import the_fireplace.wars.worldgen.structure.building.GenWindmill;
import the_fireplace.wars.worldgen.structure.building.GenWizardTower;
import the_fireplace.wars.worldgen.structure.games.GenBookshelf;
import the_fireplace.wars.worldgen.structure.games.GenChestParkour;
import the_fireplace.wars.worldgen.structure.games.GenHgLarge;
import the_fireplace.wars.worldgen.structure.games.GenHgSmall;
import the_fireplace.wars.worldgen.structure.games.GenMazerace;
import the_fireplace.wars.worldgen.structure.games.GenSkyblock;
import the_fireplace.wars.worldgen.structure.spleef.GenMinersSpleefMedium;
import the_fireplace.wars.worldgen.structure.spleef.GenMinersSpleefSmall;
import the_fireplace.wars.worldgen.structure.spleef.GenNaturalSpleefMedium;
import the_fireplace.wars.worldgen.structure.spleef.GenNaturalSpleefSmall;
import the_fireplace.wars.worldgen.structure.spleef.GenNetherSpleefMedium;
import the_fireplace.wars.worldgen.structure.spleef.GenNetherSpleefSmall;

public class StructureSpawning {


	//handles what structure should be spawned based on what packet was received. There are 6 structure per GUI over 4 GUI's
	public StructureSpawning(EntityPlayer player, int type, int structure, int i, int j, int k) {

		switch (type) {

		case 1:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().canSendCommands((playerMP).getGameProfile())) {

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
					player.addChatMessage(new ChatComponentText("\u00a75\u00a7lYou need to be op / have cheats enabled!"));
				}
			}

			break;
		case 2:

			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().canSendCommands((playerMP).getGameProfile())) {

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

					player.addChatMessage(new ChatComponentText("\u00a75\u00a7lYou need to be op / have cheats enabled!"));
				}
			}

			break;

		case 3:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().canSendCommands((playerMP).getGameProfile())) {

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

					player.addChatMessage(new ChatComponentText("\u00a75\u00a7lYou need to be op / have cheats enabled!"));
				}
			}
			break;
		case 4:
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMP = (EntityPlayerMP) player;
				if (FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().canSendCommands((playerMP).getGameProfile())) {

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

					player.addChatMessage(new ChatComponentText("\u00a75\u00a7lYou need to be op / have cheats enabled!"));
				}
			}
			break;

		}

	}
}
