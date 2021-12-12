package maths;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Math22 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math22 window = new Math22();
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
//	public Math22() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Math22.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
		frame.setBounds(100, 100, 542, 330);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		//photo.setIcon(new ImageIcon(Math22.class.getResource("/image/j22.jpg")));
		photo.setBounds(0, 0, 535, 302);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Math22.class.getResource("/image/j22.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
	}
}
