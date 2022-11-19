package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ToolWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ToolWindow() 
	{
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ToolWindow.class.getResource("/kotapplication/tools.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(51, 95, 55, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(36, 137, 90, 28);
		contentPane.add(btnNewButton);
		
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
				 runtime.exec("shutdown -s -t 5");
			  }
			  catch(IOException e1)
			  {
				  System.out.println("Reboot failure, Exception: " +e1);
			  }
			}
		});
		btnNewButton_1.setBounds(320, 137, 90, 28);
		contentPane.add(btnNewButton_1);
	}
}
