package kotapplication;

import java.io.File;
import java.io.IOException;

public class KotaLogSystem 
{
	//Usage: Run cmd, cmd output .txt location
	public static void kLog(String command, String logFile) //String path, 
	{
		try 
		{			
			ProcessBuilder buildOutput = new ProcessBuilder(command);
			buildOutput.redirectOutput(new File(logFile));
			buildOutput.redirectError(new File(logFile));
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
			File kotaFolder = new File(path);
			if(!kotaFolder.exists()) {kotaFolder.mkdir();}
	}
	public static void cmdRun(String arg)
	{
	      Runtime runtime = Runtime.getRuntime();
	      try
	      {
	         runtime.exec(arg);
	      }
	      catch(IOException e0)
	      {
	         System.out.println("Exception: " +e0);
	      }
	}
}
