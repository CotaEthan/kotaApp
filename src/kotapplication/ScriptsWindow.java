package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(ScriptsWindow.class.getResource("/kotapplication/powershell.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Folder");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton.setBounds(32, 156, 90, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("List");
		btnNewButton_1.setBounds(298, 156, 90, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(167, 156, 90, 28);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ScriptsWindow.class.getResource("/kotapplication/files.png")));
		lblNewLabel.setBounds(42, 75, 69, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ScriptsWindow.class.getResource("/kotapplication/save.png")));
		lblNewLabel_1.setBounds(167, 75, 78, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(315, 103, 55, 16);
		contentPane.add(lblNewLabel_2);
	}
}