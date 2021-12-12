package descriptions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;

public class Desc12 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc12 window = new Desc12();
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
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u7B97\u6CD5\uFF1A\u738B\u5B50\u7490 \u738B\u58EE \r\n\u7A0B\u5E8F\uFF1A\u8212\u9E4F\u98DE  \r\n\u7F8E\u5DE5\uFF1A\u6881\u6668\r\n\u51FA\u54C1\uFF1AZY Studio in  HBUT 3/30/2015\r\n\u610F\u89C1\u53CD\u9988\uFF1A825860815@qq.com   387781602(QQ\u7FA4) ");
		scrollPane.setViewportView(textArea);
	}

}
