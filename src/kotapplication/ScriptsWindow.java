package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class ScriptsWindow extends JFrame 
{

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ScriptsWindow() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(ScriptsWindow.class.getResource("/kotapplication/powershell.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	//Add command to clean task bar - remove default apps - requested
	//Sleep commands: 
	/*
powercfg /x -hibernate-timeout-ac 0

powercfg /x -hibernate-timeout-dc 0

powercfg /x -disk-timeout-ac 0

powercfg /x -disk-timeout-dc 0

Powercfg /x -standby-timeout-ac 0

powercfg /x -standby-timeout-dc 0

	 */
}