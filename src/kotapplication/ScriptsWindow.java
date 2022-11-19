package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ScriptsWindow extends JFrame 
{

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ScriptsWindow() 
	{
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ScriptsWindow.class.getResource("/kotapplication/powershell.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Folder function, button, icon
		JButton btnNewButton = new JButton("Folder");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Runtime.getRuntime().exec("explorer.exe C:\\KotaApp\\Scripts"); // /select, path
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(32, 156, 90, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ScriptsWindow.class.getResource("/kotapplication/files.png")));
		lblNewLabel.setBounds(42, 75, 69, 69);
		contentPane.add(lblNewLabel);
		
		//List of scripts function, button, icon
		JButton btnNewButton_1 = new JButton("List");
		btnNewButton_1.setBounds(298, 156, 90, 28);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ScriptsWindow.class.getResource("/kotapplication/list.png")));
		lblNewLabel_2.setBounds(306, 75, 69, 69);
		contentPane.add(lblNewLabel_2);
		
		//Add new function, button, icon
		JButton btnNewButton_2 = new JButton("New");
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				EventQueue.invokeLater(new Runnable() 
				{
					public void run() {
						try {
							ScriptName frame = new ScriptName();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setBounds(167, 156, 90, 28);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ScriptsWindow.class.getResource("/kotapplication/saveSize.png")));
		lblNewLabel_1.setBounds(176, 75, 69, 69);
		contentPane.add(lblNewLabel_1);
		
	}
}