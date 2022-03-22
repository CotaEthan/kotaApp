package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Folder");
		btnNewButton.setBounds(49, 156, 90, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("List");
		btnNewButton_1.setBounds(273, 156, 90, 28);
		contentPane.add(btnNewButton_1);
	}
}