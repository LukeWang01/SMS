package descriptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc34 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc34 window = new Desc34();
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
//	public Desc34() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("\u70B9\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc34.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 976, 713);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Desc34.class.getResource("/image/p34b.jpg")));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
