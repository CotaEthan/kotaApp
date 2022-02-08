package kotapplication;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.UIManager;

public class Kota 
{

	public static void main(String[] args) 
	{
		try 
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					KotaWindow frame = new KotaWindow();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});

	}

}
