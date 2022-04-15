package kotapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//ReCreated for Datto implementation
public class DattoWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public DattoWindow() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DattoWindow.class.getResource("/kotapplication/Datto.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(33, 66, 123));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Desktop.getDesktop().browse(new URI("https://store.kota.tech/"));
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
		//btnNewButton.setBounds(50, 120, 90, 28);
		//contentPane.add(btnNewButton);
		btnNewButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton.setIcon(new ImageIcon(DattoWindow.class.getResource("/kotapplication/KotaCommerce.png")));
		btnNewButton.setBounds(141, 54, 140, 15);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Desktop.getDesktop().browse(new URI("https://kota.itclientportal.com/"));
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
		btnNewButton_1.setIcon(new ImageIcon(DattoWindow.class.getResource("/kotapplication/clientPortal.png")));
		btnNewButton_1.setBounds(141, 108, 140, 33);
		contentPane.add(btnNewButton_1);
	}
}
