package kotapplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPowerShell
{

	public static void jpowerShell(String[] args) throws IOException 
	{

		String line;

		String command = "powershell.exe & \"C:\\KotaApp\\Scripts\\INSERTNAMEHEREPLACEHOLDER";

		Process powerShellProcess = Runtime.getRuntime().exec(command);

		powerShellProcess.getOutputStream().close();

		BufferedReader stdout = new BufferedReader(new InputStreamReader(powerShellProcess.getInputStream()));
		while ((line = stdout.readLine()) != null) {
			System.out.println("Output: " + line);

		}

		stdout.close();

		BufferedReader stderr = new BufferedReader(new InputStreamReader(powerShellProcess.getErrorStream()));
		while ((line = stderr.readLine()) != null) {
			System.out.println("Output: " + line);
		}
		stderr.close();

	}

}
    