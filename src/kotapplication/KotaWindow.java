package kotapplication;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class KotaWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public KotaWindow() {
		setPreferredSize(new Dimension(200, 200));
		setSize(new Dimension(200, 200));
		setResizable(false);
		//setPreferredSize(new Dimension(200, 200));
		setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage(KotaWindow.class.getResource("/kotapplication/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaption);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Help");
		mnNewMenu.setBackground(SystemColor.activeCaption);
		mnNewMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Kota Technology");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("KotaApp Support");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(200, 200));
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(43, 16, 69, 73);
		lblNewLabel.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/tools.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(191, 35, 69, 54);
		lblNewLabel_1.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/powershell.png")));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(333, 16, 69, 68);
		lblNewLabel_2.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/syncrocut.png")));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tools");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ToolWindow frame = new ToolWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(43, 93, 59, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Scripts");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e2) {
					e2.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ScriptsWindow frame = new ScriptsWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(191, 93, 66, 28);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Syncro");
		btnNewButton_2.setBounds(333, 93, 65, 28);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e3) {
					e3.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SyncroWindow frame = new SyncroWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(53, 133, 69, 69);
		lblNewLabel_3.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/winlight.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(191, 133, 69, 69);
		lblNewLabel_4.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/log.png")));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(333, 133, 69, 69);
		lblNewLabel_5.setIcon(new ImageIcon(KotaWindow.class.getResource("/kotapplication/softare.png")));
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_5 = new JButton("Windows");
		btnNewButton_5.setBounds(43, 206, 79, 28);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e4) {
					e4.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							WinWindow frame = new WinWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("Log Files");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e5) {
					e5.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							LogWindow frame = new LogWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_4.setBounds(191, 206, 79, 28);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Software");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (Throwable e6) {
					e6.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SoftWindow frame = new SoftWindow();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_3.setBounds(333, 206, 76, 28);
		contentPane.add(btnNewButton_3);
	}

}
