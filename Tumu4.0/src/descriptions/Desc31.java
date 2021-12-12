package descriptions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc31 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc31 window = new Desc31();
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
//	public Desc31() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("\u70B9\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc31.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 805, 637);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		photo.setIcon(new ImageIcon(Desc31.class.getResource("/image/p31.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 800, 600);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Desc31.class.getResource("/image/p31.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
	}

}
