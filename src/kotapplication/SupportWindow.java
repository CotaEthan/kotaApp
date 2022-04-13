package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SupportWindow extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SupportWindow() 
	{
 		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnTemp = new JTextPane();
		txtpnTemp.setEditable(false);
		txtpnTemp.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnTemp.setText("General number: (605) 799-1199\n\nDirect: (605) 646-7979 | ext 1004");
		txtpnTemp.setBounds(10, 11, 414, 121);
		contentPane.add(txtpnTemp);
		
		JButton btnNewButton = new JButton("Emergency");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBackground(SystemColor.inactiveCaption);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JTextPane txtpnTemp = new JTextPane();
				txtpnTemp.setFont(new Font("Times New Roman", Font.BOLD, 11));
				txtpnTemp.setEditable(false);
				txtpnTemp.setBackground(SystemColor.inactiveCaption);
				txtpnTemp.setText("Call/Text: (512) 636-7670");
				txtpnTemp.setBounds(141, 11, 146, 37);
				contentPane.add(txtpnTemp);
			}
		});
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(158, 179, 104, 23);
		contentPane.add(btnNewButton);
	}

}
