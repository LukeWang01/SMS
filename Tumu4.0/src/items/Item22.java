package items;

import java.awt.Color;
import java.awt.EventQueue;
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

import descriptions.Desc22;
import maths.Math22;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Item22 {

	private JFrame frame;
	private JTextField edit_p;
	private JTextField edit_y1;
	private JTextField edit_d1;
	private JTextField edit_y2;
	private JTextField edit_d2;
	private JTextField edit_d3;
	private JTextField edit_d4;
	private JTextField edit_d5;
	private JTextField edit_y3;
	private JTextField edit_y4;
	private JTextField edit_y5;
	private JTextField out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item22 window = new Item22();
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
//	public Item22() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item22.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u57FA\u5E95\u9644\u52A0\u538B\u529B\u8BA1\u7B97");
		frame.setBounds(100, 100, 805, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u57FA\u5E95\u538B\u529Bp(kPa):");
		lblNewLabel_2.setBounds(448, 47, 126, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desc22 desc22 = new Desc22();
				desc22.initialize();
			}
		});
		photo.setIcon(new ImageIcon(Item22.class.getResource("/image/p22.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(0, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item22.class.getResource("/image/p22.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		edit_p = new JTextField();
		edit_p.setHorizontalAlignment(SwingConstants.CENTER);
		edit_p.setColumns(10);
		edit_p.setBounds(567, 45, 166, 18);
		frame.getContentPane().add(edit_p);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double p = Double.parseDouble(edit_p.getText());
					double y1 = Double.parseDouble(edit_y1.getText());
					double d1 = Double.parseDouble(edit_d1.getText());
					double y2 = Double.parseDouble(edit_y2.getText());
					double d2 = Double.parseDouble(edit_d2.getText());
					double y3 = Double.parseDouble(edit_y3.getText());
					double d3 = Double.parseDouble(edit_d3.getText());
					double y4 = Double.parseDouble(edit_y4.getText());
					double d4 = Double.parseDouble(edit_d4.getText());
					double y5 = Double.parseDouble(edit_y5.getText());
					double d5 = Double.parseDouble(edit_d5.getText());
					
					calculate(p,y1,d1,y2,d2,y3,d3,y4,d4,y5,d5);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("空串。。");
				}
			}
		});
		button.setToolTipText("\u70B9\u51FB\u5F00\u59CB\u8FD0\u7B97");
		button.setBounds(73, 545, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main2 main2 = new Main2();
				main2.initialize();
			}
		});
		button_1.setToolTipText("\u70B9\u51FB\u8FD4\u56DE\u4E3B\u9875\u9762");
		button_1.setBounds(262, 545, 93, 23);
		frame.getContentPane().add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(465, 358, 324, 232);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		textArea.setText("1.\u5728\u9644\u52A0\u538B\u529B\u8BA1\u7B97\u4E2D\uFF0C\u571F\u4F53\u5206\u5C42\u4E00\u822C\u5C0F\u4E8E3\u5C42\uFF0C  \u672C\u6C42\u89E3\u5668\u8BBE\u8BA1\u6700\u591A\u6C42\u89E35\u5C42\r\n2.\u5F53\u8003\u8651\u5730\u4E0B\u6C34\u4F4D\u65F6\uFF0C\u5730\u4E0B\u6C34\u4F4D\u4EE5\u4E0B\u56FE\u5C42\u91CD\u5EA6\u5E94\u53D6\u6709\u6548\u91CD\u5EA6\r\n3.\u57FA\u5E95\u9644\u52A0\u538B\u529B\uFF1A\u4F5C\u7528\u4E8E\u5730\u57FA\u8868\u9762\uFF0C  \u7531\u4E8E\u5EFA\u9020\u5EFA\u7B51\u7269\u800C\u65B0\u589E\u52A0\u7684\u538B\u529B\u79F0\u4E3A\u57FA\u5E95\u9644\u52A0\u538B\u529B\u3002\r\n4.\u57FA\u5E95\u9644\u52A0\u538B\u529B\u5728\u6570\u503C\u4E0A\u7B49\u4E8E\u57FA\u5E95\u538B\u529B\u6263\u9664\u57FA\u5E95\u6807\u9AD8   \u5904\u539F\u6709\u571F\u4F53\u7684\u81EA\u91CD\u5E94\u529B\r\n");
		textArea.setEditable(false);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Math22 math22 = new Math22();
				math22.initialize();
			}
		});
		button_2.setIcon(new ImageIcon(Item22.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button_2.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button_2.setBounds(766, 330, 23, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("\u7B2C\u4E00\u5C42:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(434, 135, 93, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("\u7B2C\u4E8C\u5C42:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(434, 160, 93, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u7B2C\u4E09\u5C42:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(434, 185, 93, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u7B2C\u56DB\u5C42:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(434, 210, 93, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u7B2C\u4E94\u5C42:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(434, 235, 93, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u91CD\u5EA6");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(538, 101, 93, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\u539A\u5EA6");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(657, 101, 93, 15);
		frame.getContentPane().add(label_8);
		
		edit_y1 = new JTextField();
		edit_y1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y1.selectAll();
			}
		});
		edit_y1.setText("0");
		edit_y1.setHorizontalAlignment(SwingConstants.CENTER);
		edit_y1.setColumns(10);
		edit_y1.setBounds(548, 133, 84, 18);
		frame.getContentPane().add(edit_y1);
		
		edit_d1 = new JTextField();
		edit_d1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d1.selectAll();
			}
		});
		edit_d1.setText("0");
		edit_d1.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d1.setColumns(10);
		edit_d1.setBounds(666, 135, 84, 18);
		frame.getContentPane().add(edit_d1);
		
		edit_y2 = new JTextField();
		edit_y2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y2.selectAll();
			}
		});
		edit_y2.setText("0");
		edit_y2.setHorizontalAlignment(SwingConstants.CENTER);
		edit_y2.setColumns(10);
		edit_y2.setBounds(547, 160, 84, 18);
		frame.getContentPane().add(edit_y2);
		
		edit_d2 = new JTextField();
		edit_d2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d2.selectAll();
			}
		});
		edit_d2.setText("0");
		edit_d2.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d2.setColumns(10);
		edit_d2.setBounds(666, 157, 84, 18);
		frame.getContentPane().add(edit_d2);
		
		edit_d3 = new JTextField();
		edit_d3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d3.selectAll();
			}
		});
		edit_d3.setText("0");
		edit_d3.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d3.setColumns(10);
		edit_d3.setBounds(666, 182, 84, 18);
		frame.getContentPane().add(edit_d3);
		
		edit_d4 = new JTextField();
		edit_d4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d4.selectAll();
			}
		});
		edit_d4.setText("0");
		edit_d4.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d4.setColumns(10);
		edit_d4.setBounds(666, 207, 84, 18);
		frame.getContentPane().add(edit_d4);
		
		edit_d5 = new JTextField();
		edit_d5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_d5.selectAll();
			}
		});
		edit_d5.setText("0");
		edit_d5.setHorizontalAlignment(SwingConstants.CENTER);
		edit_d5.setColumns(10);
		edit_d5.setBounds(666, 235, 84, 18);
		frame.getContentPane().add(edit_d5);
		
		edit_y3 = new JTextField();
		edit_y3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y3.selectAll();
			}
		});
		edit_y3.setText("0");
		edit_y3.setHorizontalAlignment(SwingConstants.CENTER);
		edit_y3.setColumns(10);
		edit_y3.setBounds(547, 184, 84, 18);
		frame.getContentPane().add(edit_y3);
		
		edit_y4 = new JTextField();
		edit_y4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y4.selectAll();
			}
		});
		edit_y4.setText("0");
		edit_y4.setHorizontalAlignment(SwingConstants.CENTER);
		edit_y4.setColumns(10);
		edit_y4.setBounds(548, 207, 84, 18);
		frame.getContentPane().add(edit_y4);
		
		edit_y5 = new JTextField();
		edit_y5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y5.selectAll();
			}
		});
		edit_y5.setText("0");
		edit_y5.setHorizontalAlignment(SwingConstants.CENTER);
		edit_y5.setColumns(10);
		edit_y5.setBounds(547, 235, 84, 18);
		frame.getContentPane().add(edit_y5);
		
		
		JLabel lblpo = new JLabel("\u57FA\u5E95\u5E73\u5747\u9644\u52A0\u5E94\u529BPo\uFF1A");
		lblpo.setHorizontalAlignment(SwingConstants.CENTER);
		lblpo.setBounds(120, 393, 166, 15);
		frame.getContentPane().add(lblpo);
		
		out = new JTextField();
		out.setText("0");
		out.setHorizontalAlignment(SwingConstants.CENTER);
		out.setEditable(false);
		out.setColumns(10);
		out.setBounds(107, 443, 200, 34);
		frame.getContentPane().add(out);	
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(434, 10, 355, 288);
		frame.getContentPane().add(input);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(10, 329, 414, 261);
		frame.getContentPane().add(output);
		
	}
	
	public void calculate(double p,double y1,double d1,double y2,double d2,double y3,double d3,double y4,double d4,double y5,double d5){
		
		double p0;
		if(p<0||y1<0||d1<0||y2<0||d2<0||y3<0||d3<0||y4<0||d4<0||y5<0||d5<0){
			JOptionPane.showMessageDialog(null, "输的参数不得小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);
		}else{
		p0 = p - (y1 * d1 + y2 * d2 + y3 * d3 + y4 * d4 + y5 * d5);
		out.setText(String.valueOf(p0));
		}
	}
}
