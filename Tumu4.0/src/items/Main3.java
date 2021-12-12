package items;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main3 window = new Main3();
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
//	public Main3() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main3.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u57FA\u5E95\u9644\u52A0\u5E94\u529B\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton buttonback = new JButton("");
		buttonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main1 main1 = new Main1();
				main1.initialize();
				
			}
		});
		buttonback.setIcon(new ImageIcon(Main3.class.getResource("/image/back.jpg")));
		buttonback.setBorder(null);
		buttonback.setBounds(100, 504, 136, 31);
		frame.getContentPane().add(buttonback);
		
		JButton button31 = new JButton("");
		button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item31 item31 = new Item31();
				item31.initialize();
			}
		});
		button31.setIcon(new ImageIcon(Main3.class.getResource("/image/l31.jpg")));
		button31.setBorder(null);
		button31.setBounds(100, 117, 256, 56);
		frame.getContentPane().add(button31);
		
		JButton button32 = new JButton("");
		button32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item32 item32 = new Item32();
				item32.initialize();
			}
		});
		button32.setIcon(new ImageIcon(Main3.class.getResource("/image/l32.jpg")));
		button32.setBorder(null);
		button32.setBounds(100, 189, 264, 54);
		frame.getContentPane().add(button32);
		
		JButton button33 = new JButton("");
		button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item33 item33 = new Item33();
				item33.initialize();
			}
		});
		button33.setIcon(new ImageIcon(Main3.class.getResource("/image/l33.jpg")));
		button33.setBorder(null);
		button33.setBounds(100, 265, 256, 55);
		frame.getContentPane().add(button33);
		
		JButton button34 = new JButton("");
		button34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item34 item34 = new Item34();
				item34.initialize();
			}
		});
		button34.setIcon(new ImageIcon(Main3.class.getResource("/image/l34.jpg")));
		button34.setBorder(null);
		button34.setBounds(100, 341, 256, 52);
		frame.getContentPane().add(button34);
		
		JButton button35 = new JButton("");
		button35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Item35 item35 = new Item35();
				item35.initialize();
			}
		});
		button35.setIcon(new ImageIcon(Main3.class.getResource("/image/l35.jpg")));
		button35.setBorder(null);
		button35.setBounds(100, 411, 330, 54);
		frame.getContentPane().add(button35);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Main3.class.getResource("/image/p3.jpg")));
		background.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(background);
	}
}
