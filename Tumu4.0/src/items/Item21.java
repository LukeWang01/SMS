package items;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JPanel;

import descriptions.Desc21;
import maths.Math21;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Item21 {

	private JFrame frame;
	private JTextField edit_e;
	private JTextField edit_f;
	private JTextField edit_d;
	private JTextField edit_l;
	private JTextField edit_b;
	private JTextField edit_dw;
	private JTextField edit_yg;
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
					Item21 window = new Item21();
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
//	public Item21() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item21.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u57FA\u5E95\u538B\u529B\u7B80\u5316\u8BA1\u7B97");
		frame.setBounds(100, 100, 805, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u504F\u5FC3\u8DDDe(M):");
		lblNewLabel_1.setBounds(448, 47, 78, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u57FA\u7840\u9876\u9762\u7AD6\u5411\u529BF(KN):");
		lblNewLabel_2.setBounds(448, 75, 126, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u57FA\u7840\u57CB\u6DF1d(M):");
		lblNewLabel_3.setBounds(448, 108, 106, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u57FA\u7840\u957F\u5EA6l(M):");
		lblNewLabel_4.setBounds(448, 142, 114, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u57FA\u7840\u5BBD\u5EA6b(M):");
		lblNewLabel_5.setBounds(448, 175, 106, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5730\u4E0B\u6C34\u4F4D\u6DF1\u5EA6dw(M):");
		lblNewLabel_6.setBounds(448, 210, 126, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblygknm = new JLabel("\u57FA\u7840\u53CA\u56DE\u586B\u571F\u5E73\u5747\u91CD\u5EA6\u03B3G(KN/M3):");
		lblygknm.setBounds(448, 246, 197, 15);
		frame.getContentPane().add(lblygknm);
		
		JLabel lbla = new JLabel("\u4E2D\u5FC3\u8377\u8F7D\u4F5C\u7528(\u56FEa):  P=");
		lbla.setBounds(10, 348, 154, 15);
		frame.getContentPane().add(lbla);
		
		JLabel lblb = new JLabel("\u504F\u5FC3\u8377\u8F7D\u4F5C\u7528(\u56FEb): Pmax =");
		lblb.setBounds(10, 395, 165, 15);
		frame.getContentPane().add(lblb);
		
		JLabel lblPmin = new JLabel("Pmin =");
		lblPmin.setBounds(125, 440, 50, 15);
		frame.getContentPane().add(lblPmin);
		
		JLabel lblcPmax = new JLabel("\u504F\u5FC3\u8377\u8F7D\u4F5C\u7528(\u56FEc): Pmax =");
		lblcPmax.setBounds(10, 487, 165, 15);
		frame.getContentPane().add(lblcPmax);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desc21 desc21 = new Desc21();
				desc21.initialize();
			}
		});
		//photo.setIcon(new ImageIcon(Item21.class.getResource("/image/p21.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(0, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item21.class.getResource("/image/p21.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		edit_e = new JTextField();
		edit_e.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				edit_e.selectAll();
			}
		});
		edit_e.setHorizontalAlignment(SwingConstants.CENTER);
		edit_e.setColumns(10);
		edit_e.setBounds(595, 45, 166, 18);
		frame.getContentPane().add(edit_e);
		
		edit_f = new JTextField();
		edit_f.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_f.selectAll();
			}
		});
		edit_f.setHorizontalAlignment(SwingConstants.CENTER);
		edit_f.setColumns(10);
		edit_f.setBounds(595, 72, 166, 18);
		frame.getContentPane().add(edit_f);
		
		edit_d = new JTextField();
		edit_d.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d.selectAll();
			}
		});
		edit_d.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d.setColumns(10);
		edit_d.setBounds(595, 106, 166, 18);
		frame.getContentPane().add(edit_d);
		
		edit_l = new JTextField();
		edit_l.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_l.selectAll();
			}
		});
		edit_l.setHorizontalAlignment(SwingConstants.CENTER);
		edit_l.setColumns(10);
		edit_l.setBounds(595, 142, 166, 18);
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
		edit_b.setBounds(595, 173, 166, 18);
		frame.getContentPane().add(edit_b);
		
		edit_dw = new JTextField();
		edit_dw.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_dw.selectAll();
			}
		});
		edit_dw.setText(" ");
		edit_dw.setHorizontalAlignment(SwingConstants.CENTER);
		edit_dw.setColumns(10);
		edit_dw.setBounds(595, 210, 166, 18);
		frame.getContentPane().add(edit_dw);
		
		edit_yg = new JTextField();
		edit_yg.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_yg.selectAll();
			}
		});
		edit_yg.setText("20");
		edit_yg.setHorizontalAlignment(SwingConstants.CENTER);
		edit_yg.setColumns(10);
		edit_yg.setBounds(655, 243, 106, 18);
		frame.getContentPane().add(edit_yg);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				
				try {
					double f = Double.parseDouble(edit_f.getText());
					double e = Double.parseDouble(edit_e.getText());
					double d = Double.parseDouble(edit_d.getText());
					double l = Double.parseDouble(edit_l.getText());
					double b = Double.parseDouble(edit_b.getText());
					double dw = Double.parseDouble(edit_dw.getText());
					double yg = Double.parseDouble(edit_yg.getText());
					calculate(e,f,d,l,b,dw,yg);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("空串。。");
				}
				
			}
		});
		button.setToolTipText("\u70B9\u51FB\u5F00\u59CB\u8FD0\u7B97");
		button.setBounds(96, 545, 93, 23);
		frame.getContentPane().add(button);
		
		out1 = new JTextField();
		out1.setHorizontalAlignment(SwingConstants.CENTER);
		out1.setText("0");
		out1.setEditable(false);
		out1.setColumns(10);
		out1.setBounds(185, 348, 200, 21);
		frame.getContentPane().add(out1);
		
		out2 = new JTextField();
		out2.setHorizontalAlignment(SwingConstants.CENTER);
		out2.setText("0");
		out2.setEditable(false);
		out2.setColumns(10);
		out2.setBounds(185, 389, 200, 21);
		frame.getContentPane().add(out2);
		
		out3 = new JTextField();
		out3.setHorizontalAlignment(SwingConstants.CENTER);
		out3.setText("0");
		out3.setEditable(false);
		out3.setColumns(10);
		out3.setBounds(185, 434, 200, 21);
		frame.getContentPane().add(out3);
		
		out4 = new JTextField();
		out4.setHorizontalAlignment(SwingConstants.CENTER);
		out4.setText("0");
		out4.setEditable(false);
		out4.setColumns(10);
		out4.setBounds(185, 481, 200, 21);
		frame.getContentPane().add(out4);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main2 main2 = new Main2();
				main2.initialize();
			}
		});
		button_1.setToolTipText("\u70B9\u51FB\u8FD4\u56DE\u4E3B\u9875\u9762");
		button_1.setBounds(284, 545, 93, 23);
		frame.getContentPane().add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u4F7F\u7528\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setBounds(465, 346, 324, 244);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtrgknm = new JTextArea();
		txtrgknm.setLineWrap(true);
		scrollPane.setViewportView(txtrgknm);
		txtrgknm.setText("\u5047\u8BBE\uFF1A\u57FA\u7840\u7EDD\u5BF9\u521A\u6027\uFF0C\u57FA\u7840\u5E95\u9762\u59CB\u7EC8\u4FDD\u6301\u5E73\u9762\uFF0C\u57FA\u5E95\u7684\u538B\u529B\u5047\u8BBE\u4E3A\u7EBF\u6027\u5206\u5E03\r\n\r\n\u53C2\u6570\uFF1A\r\n1.\u0423g\u4E00\u822C\u53D620KN/M3\r\n\r\n2.\u5F53\u5DF2\u77E5\u91CF\u4E2D\u672A\u7ED9\u51FA\u5730\u4E0B\u6C34\u4F4D\u6DF1\u5EA6\u65F6\uFF0C\u9ED8\u8BA4\u5730\u4E0B\u6C34\u4F4D\u6DF1\u5EA6\u4E3A\u57FA\u7840\u57CB\u6DF1\uFF0C\u5373dw=d\r\n\r\n3.\u504F\u5FC3\u8DDDe\u5E94\u4E0E\u57FA\u5E95\u957F\u8FB9\u65B9\u5411\u4E00\u81F4\uFF0C\u4E14\u4E3A\u5355\u5411\u504F\u5FC3\r\n\u6C42\u89E3\uFF1A\r\n   \u56FEa\u60C5\u5F62\u4E3A\u4E2D\u5FC3\u8377\u8F7D\u4F5C\u7528\uFF0C\u8377\u8F7D\u5408\u529B\u901A\u8FC7\u57FA\u5E95\u578B\u5FC3\uFF0C\r\n\u57FA\u5E95\u538B\u529B\u5047\u5B9A\u4E3A\u5E73\u5747\u5206\u5E03\uFF0C\u7531\u538B\u5F3A\u516C\u5F0F\u8FDB\u884C\u8BA1\u7B97\r\n   \u56FEb\u60C5\u5F62\u4E3A\u504F\u5FC3\u8377\u8F7D\u4F5C\u7528\uFF0C\u6309\u6750\u6599\u529B\u5B66\u77ED\u67F1\u504F\u5FC3\u53D7\u538B\r\n\u516C\u5F0F\u8BA1\u7B97\uFF0C\u4E14\u57FA\u5E95\u538B\u529B\u5448\u68AF\u5F62\u5206\u5E03\r\n   \u56FEc\u60C5\u5F62\u4E0E\u56FEb\u7C7B\u4F3C\uFF0C\u4F46\u57FA\u5E95\u538B\u529B\u5448\u4E09\u89D2\u5206\u5E03\uFF0C\u4E14\u5F53\r\ne=l/6\u65F6\uFF0CPmin=0\uFF1B\u5F53e>l/6\u65F6\uFF0CPmin< 0,\u4E5F\u5373\u4EA7\u751F\u62C9\u5E94\r\n\u529B\uFF0C\u7531\u4E8E\u57FA\u5E95\u4E0E\u5730\u57FA\u4E4B\u95F4\u4E0D\u80FD\u627F\u53D7\u62C9\u5E94\u529B\uFF0C\u6B64\u65F6\u4EA7\u751F\u62C9\r\n\u5E94\u529B\u90E8\u5206\u7684\u57FA\u5E95\u5C06\u4E8E\u5730\u57FA\u56FE\u5C40\u90E8\u5206\u5F00\uFF0C\u81F4\u4F7F\u57FA\u5E95\u538B\u5E94\u529B\r\n\u91CD\u65B0\u5206\u5E03\u3002\u518D\u6839\u636E\u504F\u5FC3\u8377\u8F7D\u4E0E\u57FA\u5E95\u53CD\u529B\u5E94\u5E73\u8861\uFF0C\u8377\u8F7D\u5408\r\n\u529BF+G\u5E94\u901A\u8FC7\u4E09\u89D2\u5F62\u53CD\u529B\u5206\u5E03\u56FE\u7684\u5F62\u5FC3\uFF0C\u53EF\u8BA1\u7B97\u51FAPmax(\r\n\u5982\u56FEc)\r\n");
		txtrgknm.setEditable(false);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Math21 math21 = new Math21();
				math21.initialize();
			}
		});
		button_2.setIcon(new ImageIcon(Item21.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button_2.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button_2.setBounds(766, 319, 23, 23);
		frame.getContentPane().add(button_2);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(434, 10, 355, 277);
		frame.getContentPane().add(input);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(0, 319, 404, 281);
		frame.getContentPane().add(output);
		
		
	}
	private void calculate(double e,double f,double d,double l,double b,double dw,double yg){
		
		double G,p,pmax,pmin;
		double flag = l/6;
		int zero = 0;
		if(e<0||f<0||d<0||l<0||b<0||dw<0||yg<0){
			
			JOptionPane.showMessageDialog(null, "输入的参数不得小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);			
		}else{
				if(dw>=d){
					G = yg * l * b * d;
				}else{
					G = yg * l * b * d - 10 * l * b * (d - dw);
				}
				
				if(e == 0){
					p = (f + G)/(l * b);
					out1.setText(String.valueOf(p));
					out2.setText(String.valueOf(zero));
					out3.setText(String.valueOf(zero));
					out4.setText(String.valueOf(zero));
				}else if(e <= flag){
					pmax = (f + G) * (1 + 6 * e / l) / (l * b);
					pmin = (f + G) * (1 - 6 * e / l) / (l * b);
					out1.setText(String.valueOf(zero));
					out2.setText(String.valueOf(pmax));
					out3.setText(String.valueOf(pmin));
					out4.setText(String.valueOf(zero));
				}else{
					pmax = 2 * (f + G)/(3 * b * (l / 2 - e));
					out4.setText(String.valueOf(pmax));
					out2.setText(String.valueOf(zero));
					out3.setText(String.valueOf(zero));
					out1.setText(String.valueOf(zero));
				}		
		
		}		
		
	}
}
