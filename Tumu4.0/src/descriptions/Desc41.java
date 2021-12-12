package descriptions;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc41 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc41 window = new Desc41();
					window.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc41.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setTitle("\u70B9\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 412, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		label.setIcon(new ImageIcon(Desc41.class.getResource("/image/p41.jpg")));
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}

}
