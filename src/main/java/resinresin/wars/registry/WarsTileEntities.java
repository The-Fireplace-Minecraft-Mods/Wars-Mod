package resinresin.wars.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import resinresin.wars.tileentities.TileEntityBasicStructures;
import resinresin.wars.tileentities.TileEntityBuildingStructures;
import resinresin.wars.tileentities.TileEntityClassSelect;
import resinresin.wars.tileentities.TileEntityClassSelectDonator;
import resinresin.wars.tileentities.TileEntityGameStructures;
import resinresin.wars.tileentities.TileEntityHungerGames;
import resinresin.wars.tileentities.TileEntityHungerGamesLv2;
import resinresin.wars.tileentities.TileEntitySpleefStructures;
import resinresin.wars.tileentities.TileEntityTeleporter;

public abstract class WarsTileEntities {

	public static void createTileEntities() {

		GameRegistry.registerTileEntity(TileEntityTeleporter.class, "simpleTeleporter");
		GameRegistry.registerTileEntity(TileEntityHungerGames.class, "hungerGames");
		GameRegistry.registerTileEntity(TileEntityHungerGamesLv2.class, "hungerGamesLv2");
		//GameRegistry.registerTileEntity(TileEntityPlayerTNT.class, "playertnt");
		GameRegistry.registerTileEntity(TileEntityClassSelect.class, "containerInfo");
		GameRegistry.registerTileEntity(TileEntityClassSelectDonator.class, "containerInfo2");
		GameRegistry.registerTileEntity(TileEntityBasicStructures.class, "basicStructures");
		GameRegistry.registerTileEntity(TileEntitySpleefStructures.class, "spleefStructures");
		GameRegistry.registerTileEntity(TileEntityBuildingStructures.class, "buildingStructures");
		GameRegistry.registerTileEntity(TileEntityGameStructures.class, "gameStructures");

	}
}