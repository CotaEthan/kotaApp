package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class WinWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) 
	{

	}*/

	/**
	 * Create the frame.
	 */
	public WinWindow() {
		setSize(new Dimension(200, 200));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(WinWindow.class.getResource("/kotapplication/winlight.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String path = "C:\\KotaAppLog";

		
		
		JButton btnNewButton = new JButton("My Files");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Runtime.getRuntime().exec("explorer.exe"); // /select, path
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(28, 137, 90, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WinWindow.class.getResource("/kotapplication/files.png")));
		lblNewLabel.setBounds(44, 84, 55, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(WinWindow.class.getResource("/kotapplication/reboot.png")));
		lblNewLabel_1.setBounds(335, 56, 64, 69);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Reboot");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			      Runtime runtime = Runtime.getRuntime();
			      try
			      {
			         //System.out.println("Shutting down the PC after 5 seconds.");
			         runtime.exec("shutdown -s -t 5");
			      }
			      catch(IOException e0)
			      {
			         System.out.println("Exception: " +e);
			      }
			}
		});
		btnNewButton_1.setBounds(320, 137, 90, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Specs");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			//Create system info log at path destination
			public void actionPerformed(ActionEvent e) 
			{		
				try 
				{
					File kotaFolder = new File(path);
					if(!kotaFolder.exists()) {kotaFolder.mkdir();}
					
					ProcessBuilder buildOutput = new ProcessBuilder("systeminfo");
					buildOutput.redirectOutput(new File("C:\\KotaAppLog\\sysinfo.txt"));
					buildOutput.redirectError(new File("C:\\KotaAppLog\\sysinfo.txt"));
					buildOutput.start();
				} 
				catch (IOException e1) 
				{
					System.out.println("Sys debug err: spec print failed");
					e1.printStackTrace();
				}	
			}
		});
		btnNewButton_2.setBounds(173, 137, 90, 28);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(WinWindow.class.getResource("/kotapplication/pc.png")));
		lblNewLabel_2.setBounds(185, 56, 76, 69);
		contentPane.add(lblNewLabel_2);
	}
}