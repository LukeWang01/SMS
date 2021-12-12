package items;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import descriptions.Desc35;
import maths.Math35;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

public class Item35 {

	private JFrame frame;
	private JTextField edit_f;
	private JTextField edit_z;
	private JTextField out1;
	private JTextField out2;
	private JTextField edit_r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item35 window = new Item35();
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
//	public Item35() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item35.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u5355\u4E2A\u7AD6\u5411\u96C6\u4E2D\u529B\u4F5C\u7528\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Desc35 desc35 = new Desc35();
				desc35.initialize();
			}
			
		});
		photo.setIcon(new ImageIcon(Item35.class.getResource("/image/p35.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item35.class.getResource("/image/p35.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		JLabel lblpkp = new JLabel("\u7AD6\u5411\u96C6\u4E2D\u529BF(kN):");
		lblpkp.setBounds(457, 72, 158, 15);
		frame.getContentPane().add(lblpkp);
		
		JLabel lblbm = new JLabel("\u672A\u77E5\u70B9\u8DDD\u96C6\u4E2D\u529B\u7684\u6C34\u5E73\u8DDD\u79BBr(m):");
		lblbm.setBounds(457, 217, 186, 15);
		frame.getContentPane().add(lblbm);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(463, 353, 326, 234);
		frame.getContentPane().add(scrollPane);
		
		JTextArea explain = new JTextArea();
		explain.setLineWrap(true);
		scrollPane.setViewportView(explain);
		explain.setText("1.\u6240\u9009\u8BA1\u7B97\u70B9\u4E0D\u5E94\u8FC7\u4E8E\u63A5\u8FD1\u96C6\u4E2D\u529B\u4F5C\u7528\u70B9\uFF0C  \u6B64\u65F6\u5730\u57FA\u571F\u5DF2\u53D1\u751F\u5851\u6027\u53D8\u5F62\uFF0C\u6309\u5F39\u6027\u7406\u8BBA\u89E3\u5DF2\u4E0D\u9002\u7528\r\n\r\n2.\u5355\u4E2A\u7AD6\u5411\u96C6\u4E2D\u529B\u4F5C\u7528\u89C4\u5F8B\r\n(1)\u5728\u96C6\u4E2D\u8377\u8F7D\u4F5C\u7528\u7EBF\u4E0A\uFF0C\u9644\u52A0\u5E94\u529B\u968F\u6DF1\u5EA6\u589E\u52A0\u800C\u51CF\u5C11\uFF1B\u5728\u5176\u4ED6\u7AD6\u7EBF\u4E0A\uFF0C\u5148\u589E\u52A0\u540E\u51CF\u5C11\r\n(2)\u5728\u540C\u4E00\u6C34\u5E73\u9762\u4E0A\uFF0C\u5728\u96C6\u4E2D\u529B\u4F5C\u7528\u7EBF\u4E0A\u7684\u9644\u52A0\u5E94\u529B\u6700\u5927\uFF0C\u5411\u5468\u56F4\u9010\u6E10\u51CF\u5C0F\r\n3.\u591A\u4E2A\u7AD6\u5411\u96C6\u4E2D\u529B\u4F5C\u7528\r\n  \u53E0\u52A0\u539F\u7406\uFF1A\u7531\u51E0\u4E2A\u5916\u529B\u5171\u540C\u4F5C\u7528\u65F6\u6240\u5F15\u8D77\u7684\u67D0\u4E00\u53C2\u6570\uFF08\u5185\u529B\u3001\u5E94\u529B\u6216\u4F4D\u79FB\uFF09\uFF0C\u7B49\u4E8E\u6BCF\u4E2A\u5916\u529B\u5355\u72EC\u4F5C\u7528\u65F6\u6240\u5F15\u8D77\u7684\u8BE5\u53C2\u6570\u503C\u7684\u4EE3\u6570\u548C\r");
		explain.setEditable(false);
		
		JLabel label_4 = new JLabel("\u672A\u77E5\u70B9\u6DF1\u5EA6z(m):");
		label_4.setBounds(457, 147, 158, 15);
		frame.getContentPane().add(label_4);
		
		edit_f = new JTextField();
		edit_f.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_f.selectAll();
			}
		});
		edit_f.setHorizontalAlignment(SwingConstants.CENTER);
		edit_f.setColumns(10);
		edit_f.setBounds(640, 64, 138, 32);
		frame.getContentPane().add(edit_f);
		
		edit_z = new JTextField();
		edit_z.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_z.selectAll();
			}
		});
		edit_z.setHorizontalAlignment(SwingConstants.CENTER);
		edit_z.setColumns(10);
		edit_z.setBounds(640, 139, 138, 32);
		frame.getContentPane().add(edit_z);
		
		JLabel lblNewLabel = new JLabel("\u03B1:");
		lblNewLabel.setBounds(102, 411, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblt = new JLabel("\u03C3z:");
		lblt.setBounds(102, 473, 54, 15);
		frame.getContentPane().add(lblt);
		
		out1 = new JTextField();
		out1.setHorizontalAlignment(SwingConstants.CENTER);
		out1.setEditable(false);
		out1.setBounds(148, 408, 200, 21);
		frame.getContentPane().add(out1);
		out1.setColumns(10);
		
		out2 = new JTextField();
		out2.setHorizontalAlignment(SwingConstants.CENTER);
		out2.setEditable(false);
		out2.setColumns(10);
		out2.setBounds(148, 470, 200, 21);
		frame.getContentPane().add(out2);
		
		JButton calculate = new JButton("\u8BA1\u7B97");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double f = Double.parseDouble(edit_f.getText());
					double z = Double.parseDouble(edit_z.getText());
					double r = Double.parseDouble(edit_r.getText());
					
					calculate(f,z,r);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("空串。。");
				}
			}
		});
		calculate.setToolTipText("\u70B9\u51FB\u5F00\u59CB\u8FD0\u7B97");
		calculate.setBounds(63, 564, 93, 23);
		frame.getContentPane().add(calculate);
		
		JButton back = new JButton("\u8FD4\u56DE");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main3 main3 = new Main3();
				main3.initialize();
			}
		});
		back.setToolTipText("\u70B9\u51FB\u8FD4\u56DE\u4E3B\u9875\u9762");
		back.setBounds(255, 564, 93, 23);
		frame.getContentPane().add(back);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Math35 math35 = new Math35();
				math35.initialize();
			}
		});
		button.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button.setIcon(new ImageIcon(Item32.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button.setBounds(766, 329, 23, 23);
		frame.getContentPane().add(button);
		
		edit_r = new JTextField();
		edit_r.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_r.selectAll();
			}
		});
		edit_r.setHorizontalAlignment(SwingConstants.CENTER);
		edit_r.setColumns(10);
		edit_r.setBounds(640, 209, 138, 32);
		frame.getContentPane().add(edit_r);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(10, 329, 424, 268);
		frame.getContentPane().add(output);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(444, 6, 345, 282);
		frame.getContentPane().add(panel);
		
		
	}
	
	private void calculate(double f,double z,double r){
		
		double a,dz;
		if(f<0 || z<0 || r<0){
			
			JOptionPane.showMessageDialog(null, "参数不得小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);
		}else{
			
			a = 1.5 / (Math.PI * Math.pow((Math.pow(r/z, 2) + 1),2.5));
			dz = a * f / Math.pow(z, 2);
			
			out1.setText(String.valueOf(a));
			out2.setText(String.valueOf(dz));
		}
	}
}
