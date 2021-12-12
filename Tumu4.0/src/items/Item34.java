package items;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import descriptions.Desc34;
import maths.Math34;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Item34 {

	private JFrame frame;
	private JTextField edit_po;
	private JTextField edit_z;
	private JTextField edit_l;
	private JTextField edit_b;
	private JTextField res_t1;
	private JTextField res_z1;
	private JTextField edit_x;
	private JTextField edit_y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item34 window = new Item34();
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
//	public Item34() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item34.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u5F53\u8BA1\u7B97\u70B9\u4E0D\u5728\u89D2\u70B9\u65F6");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Desc34 desc34 = new Desc34();
				desc34.initialize();
			}
			
		});
		//photo.setIcon(new ImageIcon(Item31.class.getResource("/image/p31.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item34.class.getResource("/image/p34.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		JLabel lblpkp = new JLabel("\u5747\u5E03\u8377\u8F7DP\u03BF(kp):");
		lblpkp.setBounds(450, 72, 129, 15);
		frame.getContentPane().add(lblpkp);
		
		JLabel lblbm = new JLabel("\u77E9\u5F62\u5BBDb(m):");
		lblbm.setBounds(612, 162, 88, 15);
		frame.getContentPane().add(lblbm);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(463, 353, 326, 234);
		frame.getContentPane().add(scrollPane);
		
		JTextArea explain = new JTextArea();
		explain.setLineWrap(true);
		scrollPane.setViewportView(explain);
		explain.setText("   \u5F53\u5E94\u529B\u8BA1\u7B97\u672A\u77E5\u70B9M\u4E0D\u4F4D\u4E8E\u89D2\u70B9\u4E0B\u65F6\uFF0C\u4E00\u822C\u7684\uFF0C\u53EF\u7531\u6548\u5E94\u53E0\u52A0\u539F\u7406\u8BA1\u7B97\u6C42\u89E3\uFF0C\u5373\u8BA1\u7B97\u65F6\uFF0C\u5C06\u8377\u8F7D\u9762\u79EF\u5212\u5206\u4E3A\u4EE5M\u4E3A\u516C\u5171\u89D2\u70B9\u7684\u82E5\u5E72\u4E2A\u77E9\u5F62\uFF0C\u7136\u540E\u63093.2.4\u7684\u89E3\u6CD5\u8BA1\u7B97\u6BCF\u4E2A\u77E9\u5F62\u89D2\u70B9\u4E0B\u540C\u4E00\u6DF1\u5EA6Z\u5904\u7684\u9644\u52A0\u5E94\u529B\uFF0C\u5E76\u5C06\u5176\u4EE3\u6570\u6C42\u548C\u3002\u4E5F\u79F0\u4E3A\u201C\u89D2\u70B9\u6CD5\u201D\u3002\r\n\u3000  \u4F46\u4E0A\u8FF0\u65B9\u6CD5\u4E2D\u8377\u8F7D\u9762\u79EF\u5212\u5206\u5C06\u4F1A\u6709\u56DB\u79CD\u60C5\u51B5\uFF1A\u8BA1\u7B97\u70B9M\u5728(1)\u8377\u8F7D\u9762\u5185\uFF1B(2)\u8377\u8F7D\u9762\u8FB9\u7F18\uFF1B(2)\u8377\u8F7D\u9762\u8FB9\u7F18\u5916\u4FA7\uFF1B(4)\u8377\u8F7D\u9762\u89D2\u70B9\u5916\u4FA7\u3002\u8BA1\u7B97\u65F6\u9700\u8FDB\u884C\u5224\u522B\u6240\u5C5E\u60C5\u51B5\uFF0C\u4E14\u6BCF\u79CD\u60C5\u51B5\u7684\u4EE3\u6570\u6C42\u548C\u8BA1\u7B97\u5F0F\u4E0D\u540C\uFF0C\u6574\u4E2A\u8BA1\u7B97\u6C42\u89E3\u8FC7\u7A0B\u663E\u5F97\u7E41\u7410\uFF0C\u5197\u957F\u3002\r\n\u3000\u7ECF\u8FC7\u7F1C\u5BC6\u7684\u5206\u6790\u4E0E\u63A8\u7B97\uFF0C\u53D1\u73B0\u4E0A\u8FF0\u56DB\u79CD\u60C5\u51B5\u53EF\u4EE5\u5206\u4E3A\u4E09\u5927\u7C7B\uFF0C\u4E03\u5C0F\u7C7B\uFF0C\u4E14\u6BCF\u7C7B\u60C5\u51B5\u90FD\u53EF\u7531\u56DB\u4E2A\u9644\u52A0\u5E94\u529B\u7CFB\u6570\u4E4B\u95F4\u4EE3\u6570\u7EC4\u5408\u7684\u901A\u5F0F\u8868\u793A\uFF0C\u6545\u53EF\u5229\u7528\u8BA1\u7B97\u673A\u8FDB\u884C\u7E41\u7410\u7684\u7A0B\u5E8F\u5316\u8BA1\u7B97\u3002\r\n\u6B64\u90E8\u5206\u529F\u80FD\u6784\u67B6\u4E2D\uFF0C\u521D\u59CB\u6761\u4EF6\u4E3A\u77E9\u5F62\u51E0\u4F55\u5C3A\u5BF8\uFF08\u957Fl\u548C\u5BBDb\uFF09\uFF0C\u672A\u77E5\u70B9\u6DF1\u5EA6z\uFF0C\u5747\u5E03\u8377\u8F7D\uFF0C\u4EE5\u77E9\u5F62\u8377\u8F7D\u9762\u79EF\u5DE6\u4E0B\u89D2\u70B9\u4E3A\u539F\u70B9\u7684\u5750\u6807\u7CFB\u4E2D\u672A\u77E5\u70B9\u7684\u5750\u6807\u3002");
		explain.setEditable(false);
		
		JLabel label_4 = new JLabel("\u672A\u77E5\u70B9\u6DF1\u5EA6z(m):");
		label_4.setBounds(450, 273, 104, 15);
		frame.getContentPane().add(label_4);
		
		edit_po = new JTextField();
		edit_po.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_po.selectAll();
			}
		});
		edit_po.setHorizontalAlignment(SwingConstants.LEFT);
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
		edit_z.setHorizontalAlignment(SwingConstants.LEFT);
		edit_z.setColumns(10);
		edit_z.setBounds(576, 265, 166, 32);
		frame.getContentPane().add(edit_z);
		
		edit_b = new JTextField();
		edit_b.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_b.selectAll();
			}
		});
		edit_b.setHorizontalAlignment(SwingConstants.LEFT);
		edit_b.setColumns(10);
		edit_b.setBounds(699, 159, 76, 21);
		frame.getContentPane().add(edit_b);
		
		JLabel lblNewLabel = new JLabel("\u03B1c:");
		lblNewLabel.setBounds(102, 411, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblt = new JLabel("\u03C3z:");
		lblt.setBounds(102, 473, 54, 15);
		frame.getContentPane().add(lblt);
		
		res_t1 = new JTextField();
		res_t1.setEditable(false);
		res_t1.setBounds(148, 408, 200, 21);
		frame.getContentPane().add(res_t1);
		res_t1.setColumns(10);
		
		res_z1 = new JTextField();
		res_z1.setEditable(false);
		res_z1.setColumns(10);
		res_z1.setBounds(148, 470, 200, 21);
		frame.getContentPane().add(res_z1);
		
		JButton calculate = new JButton("\u8BA1\u7B97");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double l = Double.parseDouble(edit_l.getText());
					double b = Double.parseDouble(edit_b.getText());
					double z = Double.parseDouble(edit_z.getText());
					double x = Double.parseDouble(edit_x.getText());
					double y = Double.parseDouble(edit_y.getText());
					select_c(l,b,z,x,y);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("空串哦TT");
					JOptionPane.showMessageDialog(null, "参数不得为空", "参数错误", JOptionPane.ERROR_MESSAGE);

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
		
		JLabel lblNewLabel_1 = new JLabel("-------------------\u4EE5\u77E9\u5F62\u5DE6\u4E0B\u89D2\u4E3A\u539F\u70B9\u5EFA\u7CFB-----------------------");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(444, 128, 332, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		edit_x = new JTextField();
		edit_x.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_x.selectAll();
			}
		});
		edit_x.setBounds(576, 213, 76, 21);
		frame.getContentPane().add(edit_x);
		edit_x.setColumns(10);
		
		edit_y = new JTextField();
		edit_y.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y.selectAll();
			}
		});
		edit_y.setColumns(10);
		edit_y.setBounds(699, 213, 79, 21);
		frame.getContentPane().add(edit_y);
		
		JLabel lblX = new JLabel("x=");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(544, 216, 33, 15);
		frame.getContentPane().add(lblX);
		
		JLabel lblY = new JLabel("y=");
		lblY.setHorizontalAlignment(SwingConstants.CENTER);
		lblY.setBounds(662, 216, 33, 15);
		frame.getContentPane().add(lblY);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Math34 math34 = new Math34();
				math34.initialize();
			}
		});
		button.setIcon(new ImageIcon(Item34.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button.setBounds(766, 329, 23, 23);
		frame.getContentPane().add(button);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(444, 10, 345, 294);
		frame.getContentPane().add(input);
		input.setLayout(null);
		
		edit_l = new JTextField();
		edit_l.setBounds(80, 148, 76, 21);
		input.add(edit_l);
		edit_l.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_l.selectAll();
			}
		});
		edit_l.setHorizontalAlignment(SwingConstants.LEFT);
		edit_l.setColumns(10);
		
		JLabel lblm = new JLabel("\u77E9\u5F62\u957Fl(m):");
		lblm.setBounds(10, 151, 76, 15);
		input.add(lblm);
		
		JLabel lblxy = new JLabel("\u672A\u77E5\u70B9\u5750\u6807(x,y)\uFF1A");
		lblxy.setBounds(8, 206, 114, 15);
		input.add(lblxy);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(10, 329, 424, 268);
		frame.getContentPane().add(output);
		
		
	}
	
	public void select_c(double l,double b,double z,double x,double y){
		double c1=0,c2=0,c3=0,c4=0,ac=0;
		double po;
		Item31 item31 = new Item31();
		if(l<0||b<0){
			JOptionPane.showMessageDialog(null, "l和b不能小于0！", "数据错误", JOptionPane.ERROR_MESSAGE);
		}else{
			c1 = item31.calculate(0, z, Math.abs(x), Math.abs(y));
			c2 = item31.calculate(0, z, Math.abs(x), Math.abs(y-b));
			c3 = item31.calculate(0, z, Math.abs(l-x), Math.abs(y));
			c4 = item31.calculate(0, z, Math.abs(l-x), Math.abs(y-b));
		}
		if((x>=0&&x<=l) && (y>=0&&y<=b)){
			ac = c1 + c2 + c3 + c4;
		}
		if((x>0&&x<l) && (y>b||y<0)){
			ac = Math.abs(c1 - c2) + Math.abs(c3 - c4);
		}
		if((x<0||x>l) && (y>0&&y<b)){
			ac = Math.abs(c1 - c3) + Math.abs(c2 - c4);
		}
		if((x>l||x<0)&&(y<0||y>b)){
			ac = Math.abs(c1 - c2 - c3 + c4);
		}

		po = Double.parseDouble(edit_po.getText());
		this.calculate(ac, po);	
		
	}
	
	public void calculate(double ac,double po){	
		double dz;
		dz = ac*po;
		
		res_t1.setText(String.valueOf(ac));
		res_z1.setText(String.valueOf(dz));
		
	}
}
