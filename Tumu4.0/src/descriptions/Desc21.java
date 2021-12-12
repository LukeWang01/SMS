package descriptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Desc21 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc21 window = new Desc21();
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
//	public Desc21() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5355\u51FB\u7F29\u5C0F\u56FE\u7247");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc21.class.getResource("/javax/swing/plaf/metal/icons/ocean/minimize.gif")));
		frame.setVisible(true);
		frame.setBounds(100, 100, 627, 450);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Desc21.class.getResource("/image/p21.jpg")));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
