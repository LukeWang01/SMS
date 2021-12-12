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

import descriptions.Desc32;
import maths.Math32;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Item32 {

	private JFrame frame;
	private JTextField edit_po;
	private JTextField edit_z;
	private JTextField edit_l;
	private JTextField edit_b;
	private JTextField out1;
	private JTextField out2;
	private JTextField out3;
	private JTextField out4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item32 window = new Item32();
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
//	public Item32() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item32.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u77E9\u5F62\u9762\u4E0A\u4F5C\u7528\u4E09\u89D2\u5F62\u5206\u5E03\u8377\u8F7D\u4E0B\u89D2\u70B9\u9644\u52A0\u5E94\u529B\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				Desc32 desc32 = new Desc32();
				desc32.initialize();
			}
			
			
		});
		//photo.setIcon(new ImageIcon(Item32.class.getResource("/image/p32.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item32.class.getResource("/image/p32.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		JLabel lblpkp = new JLabel("\u4E09\u89D2\u5F62\u5206\u5E03\u8377\u8F7D\u6700\u5927\u503CP\u03BF(kp):");
		lblpkp.setBounds(445, 69, 186, 15);
		frame.getContentPane().add(lblpkp);
		
		JLabel lblm = new JLabel("\u77E9\u5F62\u9762\u957Fl(m):");
		lblm.setBounds(521, 134, 88, 15);
		frame.getContentPane().add(lblm);
		
		JLabel lblbm = new JLabel("\u77E9\u5F62\u9762\u5BBDb(m):");
		lblbm.setBounds(521, 172, 88, 15);
		frame.getContentPane().add(lblbm);
		
		JLabel label_1 = new JLabel("\u77E9\u5F62\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(448, 137, 75, 43);
		frame.getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(463, 353, 326, 234);
		frame.getContentPane().add(scrollPane);
		
		JTextArea explain = new JTextArea();
		explain.setLineWrap(true);
		scrollPane.setViewportView(explain);
		explain.setText("1.\u8377\u8F7D\u4E3A0\u7684\u89D2\u70B9\uFF0C\u79F0\u4E3A1\u7C7B\u70B9\uFF0C\u76F8\u5E94\u9644\u52A0  \u5E94\u529B\u7CFB\u6570\u4E3A\u03B1t1\uFF0C\u7AD6\u5411\u5E94\u529B\u4E3A\u03C3z1\u8377\u8F7D\u4E3APmax\u7684\u89D2\u70B9\uFF0C\u79F0\u4E3A2\u7C7B\u70B9\uFF0C  \u76F8\u5E94\u9644\u52A0\u5E94\u529B\u7CFB\u6570\u4E3A\u03B1t2,\u7AD6\u5411\u5E94\u529B\u4E3A\u03C3z2(\u5982\u56FE)\r\n2.\u5BBD\u5EA6b\u503C\u4E0D\u662F\u6307\u57FA\u7840\u5BBD\u5EA6\uFF0C\u800C\u662F\u6307  \u4E09\u89D2\u5F62\u8377\u8F7D\u5206\u5E03\u65B9\u5411\u7684\u57FA\u7840\u8FB9\u957F(\u5982\u56FE\u4E2Db,l\u6240\u793A)");
		explain.setEditable(false);
		
		JLabel label_4 = new JLabel("\u672A\u77E5\u70B9\u6DF1\u5EA6z(m):");
		label_4.setBounds(448, 228, 144, 15);
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
		
		JLabel label_3 = new JLabel("\u5BF9\u4E8E1\u7C7B\u70B9:");
		label_3.setBounds(38, 373, 88, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_5 = new JLabel("\u5BF9\u4E8E1\u7C7B\u70B9:");
		label_5.setBounds(38, 447, 88, 15);
		frame.getContentPane().add(label_5);
		
		JLabel lblNewLabel = new JLabel("\u03B1t1:");
		lblNewLabel.setBounds(102, 398, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblt = new JLabel("\u03C3z1:");
		lblt.setBounds(102, 423, 54, 15);
		frame.getContentPane().add(lblt);
		
		JLabel lblt_1 = new JLabel("\u03B1t2:");
		lblt_1.setBounds(102, 472, 54, 15);
		frame.getContentPane().add(lblt_1);
		
		JLabel lblz = new JLabel("\u03C3z2:");
		lblz.setBounds(102, 497, 54, 15);
		frame.getContentPane().add(lblz);
		
		out1 = new JTextField();
		out1.setHorizontalAlignment(SwingConstants.CENTER);
		out1.setEditable(false);
		out1.setBounds(148, 395, 200, 21);
		frame.getContentPane().add(out1);
		out1.setColumns(10);
		
		out2 = new JTextField();
		out2.setHorizontalAlignment(SwingConstants.CENTER);
		out2.setEditable(false);
		out2.setColumns(10);
		out2.setBounds(148, 420, 200, 21);
		frame.getContentPane().add(out2);
		
		out3 = new JTextField();
		out3.setHorizontalAlignment(SwingConstants.CENTER);
		out3.setEditable(false);
		out3.setColumns(10);
		out3.setBounds(148, 469, 200, 21);
		frame.getContentPane().add(out3);
		
		out4 = new JTextField();
		out4.setHorizontalAlignment(SwingConstants.CENTER);
		out4.setEditable(false);
		out4.setColumns(10);
		out4.setBounds(148, 497, 200, 21);
		frame.getContentPane().add(out4);
		
		JButton calculate = new JButton("\u8BA1\u7B97");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double po = Double.parseDouble(edit_po.getText());
					double l = Double.parseDouble(edit_l.getText());
					double b = Double.parseDouble(edit_b.getText());
					double z = Double.parseDouble(edit_z.getText());
					
					calculate(po,l,b,z);
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
				
				
				Math32 math = new Math32();
				math.initialize();
				
			}
		});
		button.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button.setIcon(new ImageIcon(Item32.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button.setBounds(766, 329, 23, 23);
		frame.getContentPane().add(button);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(10, 342, 414, 255);
		frame.getContentPane().add(output);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(441, 10, 348, 278);
		frame.getContentPane().add(input);
		
	}
	
	private void calculate(double po,double l,double b,double z){
		
		double ac,ac1,dz1,ac2,dz2,n,m,y,h,g;
		if(po<0||z<0||l<0||b<0){
			
			JOptionPane.showMessageDialog(null, "参数不得为小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);
			
		}else{
			double x = Math.pow((l*l + b*b + z*z),0.5);
			n = Math.pow((z * z + l * l),0.5);
			m = Math.pow(b, 2) + Math.pow(z, 2);
			y = l/(2 * Math.PI * b);
			ac1 = y * (z/n - Math.pow(z, 3) / (m * x));
			dz1 = ac1 * po;
			
			
			n = Math.pow(l, 2) + Math.pow(b, 2) + 2 * Math.pow(z, 2);
			m = n * l * b * z;
			y = (Math.pow(l, 2) + Math.pow(z, 2)) * (Math.pow(b, 2) + Math.pow(z,2)) * x;
			h = l * b / (z * x);
			g = Math.atan(h);
			ac = (m / y + g) / (2 * Math.PI);
			ac2 = ac - ac1;
			dz2 = ac2 * po;
			
			out1.setText(String.valueOf(ac1));
			out2.setText(String.valueOf(dz1));
			out3.setText(String.valueOf(ac2));
			out4.setText(String.valueOf(dz2));
		}
			
	}
}
