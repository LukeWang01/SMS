package items;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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



import descriptions.Desc31;
import maths.Math31;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Item31 {

	private JFrame frame;
	private JTextField edit_po;
	private JTextField edit_z;
	private JTextField edit_l;
	private JTextField edit_b;
	private JTextField out1;
	private JTextField out2;
	private double ac=0,dz=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item31 window = new Item31();
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
//	public Item31() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item31.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u77E9\u5F62\u9762\u4E0A\u4F5C\u7528\u8377\u8F7D\u89D2\u70B9\u9644\u52A0\u5E94\u529B\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desc31 desc31 = new Desc31();
				desc31.initialize();
			}
		});
		//photo.setIcon(new ImageIcon(Item31.class.getResource("/image/p31.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item31.class.getResource("/image/p31.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		JLabel lblpkp = new JLabel("\u5747\u5E03\u8377\u8F7DP\u03BF(kp):");
		lblpkp.setBounds(454, 72, 137, 15);
		frame.getContentPane().add(lblpkp);
		
		JLabel lblm = new JLabel("\u77E9\u5F62\u9762\u957Fl(m):");
		lblm.setBounds(527, 134, 88, 15);
		frame.getContentPane().add(lblm);
		
		JLabel lblbm = new JLabel("\u77E9\u5F62\u9762\u5BBDb(m):");
		lblbm.setBounds(527, 172, 88, 15);
		frame.getContentPane().add(lblbm);
		
		JLabel label_1 = new JLabel("\u77E9\u5F62\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(454, 137, 75, 43);
		frame.getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(463, 353, 326, 234);
		frame.getContentPane().add(scrollPane);
		
		JTextArea explain = new JTextArea();
		explain.setLineWrap(true);
		scrollPane.setViewportView(explain);
		explain.setText("\u6269\u5C55\u60C5\u51B5\uFF0C\u5F53\u8BA1\u7B97\u4E0D\u5728\u89D2\u70B9\u65F6\uFF1A\r\n\u89D2\u70B9\u6CD5\u539F\u7406\uFF1A\u82E5\u6240\u6C42\u7684\u70B9M\u4E0D\u5728\u77E9\u5F62\u7684\u89D2\u70B9\u65F6\uFF0C\u5C06\u8377\u8F7D\u5212\u5206\u4E3A\u82E5\u5E72\u4E2A\u77E9\u5F62\u7684\u8377\u8F7D\uFF0C\u800C\u6240\u6C42\u7684\u70B9M\u5FC5\u987B\u4E3A\u6240\u5212\u51FA\u6765\u7684\u77E9\u5F62\u7684\u516C\u5171\u89D2\u70B9\uFF0C\u7136\u540E\u6C42\u5F97\u70B9M\u5728\u5404\u4E2A\u77E9\u5F62\u8377\u8F7D\u4F5C\u7528\u4E0B\u7684\uFF0C\u518D\u8FDB\u884C\u53E0\u52A0\r\n\u89D2\u70B9\u6CD5\u8BF4\u660E\uFF1A\r\n\u2460\u6240\u6C42\u70B9\u4F4D\u4E8E\u6240\u5212\u6BCF\u4E00\u77E9\u5F62\u7684\u516C\u5171\u89D2\u70B9\u2461\u5212\u5206\u540E\uFF0C\u7528\u6B64\u6C42\u89E3\u5668\u6309\u201C\u77E9\u5F62\u9762\u4E0A\u89D2\u70B9\u4E0B\u60C5\u51B5\u201D\u8FDB\u884C\u8BA1\u7B97\uFF0C\u518D\u5C06\u7ED3\u679C\u8FDB\u884C\u53E0\u52A0\r\n\r\u2462\u53E0\u52A0\u7684\u603B\u9762\u79EF\u7B49\u4E8E\u539F\u6709\u7684\u53D7\u8377\u9762\u79EF\r");
		explain.setEditable(false);
		
		JLabel label_4 = new JLabel("\u672A\u77E5\u70B9\u6DF1\u5EA6z(m):");
		label_4.setBounds(454, 228, 144, 15);
		frame.getContentPane().add(label_4);
		
		edit_po = new JTextField();
		edit_po.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_po.selectAll();
			}
		});
		edit_po.setHorizontalAlignment(SwingConstants.CENTER);
		edit_po.setColumns(10);
		edit_po.setBounds(612, 64, 166, 32);
		frame.getContentPane().add(edit_po);
		
		edit_z = new JTextField();
		edit_z.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_z.selectAll();
			}
		});
		edit_z.setHorizontalAlignment(SwingConstants.CENTER);
		edit_z.setColumns(10);
		edit_z.setBounds(612, 222, 166, 32);
		frame.getContentPane().add(edit_z);
		
		edit_l = new JTextField();
		edit_l.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_l.selectAll();
			}
		});
		edit_l.setHorizontalAlignment(SwingConstants.CENTER);
		edit_l.setColumns(10);
		edit_l.setBounds(612, 131, 166, 21);
		frame.getContentPane().add(edit_l);
		
		edit_b = new JTextField();
		edit_b.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_b.selectAll();
			}
		});
		edit_b.setHorizontalAlignment(SwingConstants.CENTER);
		edit_b.setColumns(10);
		edit_b.setBounds(611, 169, 166, 21);
		frame.getContentPane().add(edit_b);
		
		JLabel lblNewLabel = new JLabel("\u03B1c:");
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
					double po = Double.parseDouble(edit_po.getText());
					double z = Double.parseDouble(edit_z.getText());
					double l = Double.parseDouble(edit_l.getText());
					double b = Double.parseDouble(edit_b.getText());
					
					calculate(po,z,l,b);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("空串。。");
				}
				out1.setText(String.valueOf(ac));
				out2.setText(String.valueOf(dz));
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
				
				Math31 math31 = new Math31();
				math31.initialize();
			}
		});
		button.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button.setIcon(new ImageIcon(Item32.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button.setBounds(766, 329, 23, 23);
		frame.getContentPane().add(button);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(444, 10, 345, 280);
		frame.getContentPane().add(input);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(10, 342, 424, 255);
		frame.getContentPane().add(output);
		
	}
	
	public double calculate(double po,double z,double l,double b){
		
		double n,m,y,h,g;
		if(po<0||z<0||l<0||b<0){
			
			JOptionPane.showMessageDialog(null, "参数不得小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);
			
		}else{
		double x = Math.pow((l*l + b*b + z*z),0.5);
		n = Math.pow(l, 2) + Math.pow(b, 2) + 2 * Math.pow(z, 2);
		m = n * l * b * z;
		y = (Math.pow(l, 2) + Math.pow(z, 2)) * (Math.pow(b, 2) + Math.pow(z,2)) * x;
		h = l * b / (z * x);
		g = Math.atan(h);
		ac = (m / y + g) / (2 * Math.PI);
		dz = ac * po;
		
		}

		return ac;
	}
}
