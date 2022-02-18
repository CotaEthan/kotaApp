package kotapplication;

import java.io.File;
import java.io.IOException;

public class KotaLogSystem 
{
	public static void kLog(String path, String command, String location) 
	{
		try 
		{
			File kotaFolder = new File(path);
			if(!kotaFolder.exists()) {kotaFolder.mkdir();}
			
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
}
