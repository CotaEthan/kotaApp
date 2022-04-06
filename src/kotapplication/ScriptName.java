package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ScriptName extends JFrame 
{

	private JPanel contentPane;
	private JTextField textFileName;
	private JTextField textFileType;
	/**
	 * Create the frame for adding new to list.
	 */
	public ScriptName() 
	{
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton.setBounds(162, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		textFileName = new JTextField();
		textFileName.setBounds(25, 59, 191, 20);
		contentPane.add(textFileName);
		textFileName.setColumns(10);
		
		textFileType = new JTextField();
		textFileType.setBounds(236, 59, 110, 20);
		contentPane.add(textFileType);
		textFileType.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setBounds(226, 62, 25, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("File Name");
		lblNewLabel_1.setBounds(25, 34, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("File Type");
		lblNewLabel_2.setBounds(236, 34, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		/*btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String phoneNumber = textField.getText();
				String message = textArea.getText();
				
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
				txtpnTemp.setText("Sent to: \n" + phoneNumber + "\n\n\nMessage Sent: "+ message);
				txtpnTemp.setBounds(10, 11, 250, 300);
				contentPane.add(txtpnTemp);

				System.out.println(phoneNumber + "  " + message);
			}
		});*/
	}
}