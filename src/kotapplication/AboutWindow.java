package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class AboutWindow extends JFrame 
{

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public AboutWindow() 
	{
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setEditable(false);
		txtrTest.setBackground(SystemColor.inactiveCaption);
		txtrTest.setText("Version 0.0.16\n\n\n\nCreated by Ethan Cota");
		txtrTest.setBounds(10, 11, 414, 239);
		contentPane.add(txtrTest);
	}

}