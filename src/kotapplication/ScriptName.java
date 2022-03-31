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

public class ScriptName extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
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

	/**
	 * Create the frame.
	 */
	public ScriptName() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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