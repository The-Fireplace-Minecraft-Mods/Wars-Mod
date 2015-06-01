package resinresin.wars.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.data.WarsSavedData;

public class CommandGreenBase extends CommandBase{

@Override
public String getCommandName()
{
return "setGreenBase"; //Name of the command e.g "/Test", "/Command"
}


    @Override
    public int compareTo(Object o) {
        return 0;
    }


@Override
public void processCommand(ICommandSender var1, String[] var2)
{
	
	EntityPlayer player1 = (EntityPlayer)var1;
	WarsSavedData savedData = WarsSavedData.get(player1.worldObj);
	
    if(var1 instanceof EntityPlayer)
    {
                    EntityPlayer player = (EntityPlayer)var1;
                    
                    
                   savedData.teamGreen.baseX = (int) player.posX;
                   savedData.teamGreen.baseY = (int) player.posY;
                   savedData.teamGreen.baseZ = (int) player.posZ;
                   savedData.markDirty();
                   player.addChatMessage("Green Team Base Set To: " + savedData.teamGreen.baseX + " " + savedData.teamGreen.baseY + " " + savedData.teamGreen.baseZ);
                   
    			   
    }
	
}



@Override
public String getCommandUsage(ICommandSender icommandsender) {
	// TODO Auto-generated method stub
	return null;
}

}