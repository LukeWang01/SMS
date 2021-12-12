package items;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import descriptions.Desc11;
import descriptions.Desc12;

public class Main1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 window = new Main1();
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
//	public Main1() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main1.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u6C42\u89E3\u5668\u4E3B\u9875");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main2 main2 = new Main2();
				main2.initialize();
			}
		});
		btn1.setBorder(null);
		btn1.setIcon(new ImageIcon(Main1.class.getResource("/image/l11.png")));
		btn1.setBounds(404, 264, 247, 38);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main3 main3 = new Main3();
				main3.initialize();
			}
		});
		btn2.setBorder(null);
		btn2.setIcon(new ImageIcon(Main1.class.getResource("/image/l12.png")));
		btn2.setBounds(401, 378, 321, 38);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Item41 item41 = new Item41();
				item41.initialize();
			}
		});
		btn3.setIcon(new ImageIcon(Main1.class.getResource("/image/l13.png")));
		btn3.setBorder(null);
		btn3.setBounds(401, 495, 321, 38);
		frame.getContentPane().add(btn3);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desc12 desc12 = new Desc12();
				desc12.initialize();
			}
		});
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Desc11 desc = new Desc11();
				desc.initialize();
			}
		});
		btn4.setBorder(null);
		btn4.setIcon(new ImageIcon(Main1.class.getResource("/image/l14.png")));
		btn4.setBounds(10, 534, 87, 25);
		frame.getContentPane().add(btn4);
		btn5.setIcon(new ImageIcon(Main1.class.getResource("/image/l15.png")));
		btn5.setBorder(null);
		btn5.setBounds(15, 569, 78, 23);
		frame.getContentPane().add(btn5);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Main1.class.getResource("/image/p1.jpg")));
		background.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(background);
		
		
	}
}
