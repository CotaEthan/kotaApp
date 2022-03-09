package kotapplication;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class KTechWindow extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public KTechWindow() 
	{
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Desktop.getDesktop().browse(new URI("https://www.kota.tech/"));
				} 
				catch (IOException e1) 
				{
	
					e1.printStackTrace();
				} 
				catch (URISyntaxException e1) 
				{
					e1.printStackTrace();
				} 
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton.setIcon(new ImageIcon(KTechWindow.class.getResource("/kotapplication/logo.png")));
		btnNewButton.setBounds(172, 11, 69, 69);
		contentPane.add(btnNewButton);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setEditable(false);
		txtrTest.setText("Phone: (605) 799-1199\n\nEmail: Support@kota.tech\n\nWebsite: Select logo above");
		txtrTest.setBounds(10, 151, 414, 99);
		contentPane.add(txtrTest);
	}
}