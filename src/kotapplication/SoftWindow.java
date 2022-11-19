package kotapplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class SoftWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public SoftWindow() 
	{
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SoftWindow.class.getResource("/kotapplication/softare.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
