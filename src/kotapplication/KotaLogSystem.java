package kotapplication;

import java.io.File;
import java.io.IOException;

public class KotaLogSystem 
{
	//Usage: Run cmd, cmd output .txt location
	public static void kLog(String command, String location) //String path, 
	{
		try 
		{			
			//createDir(path);
			ProcessBuilder buildOutput = new ProcessBuilder(command);
			buildOutput.redirectOutput(new File(location));
			buildOutput.redirectError(new File(location));
			buildOutput.start();
		} 
		catch (IOException e1) 
		{
			System.out.println("Sys debug err: spec print failed");
			e1.printStackTrace();
		}
	}
	
	public static void createDir(String path)
	{
		//try
		//{
			File kotaFolder = new File(path);
			if(!kotaFolder.exists()) {kotaFolder.mkdir();}
		//}
		//catch (IOException e2)
		//{
		//	System.out.println("Folder(s) failed to create properly");
			//e2.printStackTrace();
		//}
	}
}
