package descriptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc33 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc33 window = new Desc33();
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
//	public Desc33() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("\u70B9\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc33.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 802, 695);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Desc33.class.getResource("/image/p33.jpg")));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
