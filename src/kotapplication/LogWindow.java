package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class LogWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public LogWindow() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogWindow.class.getResource("/kotapplication/log.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(WinWindow.class.getResource("/kotapplication/reboot.png")));
		lblNewLabel_1.setBounds(335, 56, 64, 69);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Software");	//wmic product get name, version
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				KotaLogSystem.cmdRun("wmic product get name > C:\\KotaApp\\Log\\software.txt");
				//KotaLogSystem.kLog("product get name", "C:\\KotaApp\\Log\\software.txt");
			}
		});
		btnNewButton_1.setBounds(320, 137, 90, 28);
		contentPane.add(btnNewButton_1);
	}

}
