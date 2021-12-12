package descriptions;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Desc11 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desc11 window = new Desc11();
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
//	public Exp1() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Desc11.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextArea txtre = new JTextArea();
		txtre.setEditable(false);
		txtre.setText("(1)\u672C\u6C42\u89E3\u5668\u7528\u4E8E\u5B66\u751F\u6C42\u89E3\u571F\u529B\u5B66\u95EE\u9898\u53CA\u521D\u6B65\u5DE5\u7A0B\u8BA1\u7B97\u3001\u9A8C\u7B97\u3002\r\n\r\n(2)\u672C\u6C42\u89E3\u5668\u8BA1\u7B97\u5206\u4E3A\u57FA\u5E95\u538B\u529B\u8BA1\u7B97,\u57FA\u5E95\u9644\u52A0\u5E94\u529B\u8BA1\u7B97,\u6700\u7EC8\u6C89\u964D\u91CF\u8BA1\u7B97\u4E09\u5927\u7C7B\uFF0C\u4E0B\u5206\u6570\u4E2A\u5C0F\u7C7B\r\n\r\n(3)\u8BF7\u5728\u8FDB\u884C\u6BCF\u7C7B\u8BA1\u7B97\u524D\u9605\u8BFB\u754C\u9762\u4E0B\u65B9\u7684\u8BF4\u660E\r\n\r\n(4)\u70B9\u51FB\u8BA1\u7B97\u754C\u9762\u53F3\u4FA7\u8FB9\u754C\u5904\u7684\u95EE\u53F7\uFF0C\u53EF\u663E\u793A\u76F8\u5173\u8BA1\u7B97\u539F\u7406\u53CA\u516C\u5F0F");
		txtre.setLineWrap(true);
		frame.getContentPane().add(txtre, BorderLayout.CENTER);
	}

}
