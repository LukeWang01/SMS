package descriptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc35 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc35 window = new Desc35();
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
//	public Desc35() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("\u70B9\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc35.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 728, 514);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Desc35.class.getResource("/image/p35.jpg")));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
