package items;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 window = new Main2();
					window.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public Main2() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main2.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u57FA\u5E95\u538B\u529B\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main1 main1 = new Main1();
				main1.initialize();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(Main2.class.getResource("/image/back.jpg")));
		btnNewButton.setBounds(99, 504, 136, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item21 item21 = new Item21();
				item21.initialize();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Main2.class.getResource("/image/l21.jpg")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(115, 123, 234, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item22 item22 = new Item22();
				item22.initialize();
			}
		});
		button.setIcon(new ImageIcon(Main2.class.getResource("/image/l22.jpg")));
		button.setBorder(null);
		button.setBounds(115, 255, 234, 42);
		frame.getContentPane().add(button);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Main2.class.getResource("/image/p2.jpg")));
		background.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(background);
	}
}
