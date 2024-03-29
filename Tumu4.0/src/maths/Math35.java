package maths;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Math35 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math35 window = new Math35();
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
//	public Math35() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Math35.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
		frame.setBounds(100, 100, 608, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		//photo.setIcon(new ImageIcon(Math35.class.getResource("/image/j35.jpg")));
		photo.setBounds(0, 0, 602, 272);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Math35.class.getResource("/image/j35.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
	}
}
