package items;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import descriptions.Desc41;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;

public class Item41 {

	private JFrame frame;
	private JTextField edit_l;
	private JTextField edit_b;
	private JTextField edit_y;
	private JTextField edit_d;
	private JTextField edit_f;
	private JTextField edit_dx;
	private JRadioButton r1;
	private JRadioButton r2;
	private JTextField edit_yg;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item41 window = new Item41();
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
//	public Extra() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(){
	frame = new JFrame();
	frame.setTitle("\u5730\u57FA\u6700\u7EC8\u6C89\u964D\u8BA1\u7B97\uFF08\u5206\u5C42\u603B\u548C\u6CD5\uFF09");
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item41.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
	frame.setBounds(100, 100, 805, 628);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel photo = new JLabel("");
	photo.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Desc41 desc41 = new Desc41();
			desc41.initialize();
		}
	});
	photo.setHorizontalAlignment(SwingConstants.CENTER);
	photo.setBounds(0, 0, 416, 323);
	
	Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
	img.getGraphics().drawImage(new ImageIcon((Item41.class.getResource("/image/p41.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
	photo.setIcon(new ImageIcon(img));
	frame.getContentPane().add(photo);
	
	JLabel lblNewLabel = new JLabel("\u57FA\u7840\u957F\u5EA6(l)\uFF1A");
	lblNewLabel.setBounds(441, 40, 116, 27);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel lblb = new JLabel("\u57FA\u7840\u5BBD\u5EA6(b)\uFF1A");
	lblb.setBounds(441, 77, 116, 27);
	frame.getContentPane().add(lblb);
	
	JLabel label_2 = new JLabel("\u571F\u5C42\u91CD\u5EA6(\u03B3)\uFF1A");
	label_2.setBounds(441, 114, 116, 27);
	frame.getContentPane().add(label_2);
	
	JLabel lbld = new JLabel("\u57FA\u5E95\u6DF1\u5EA6(d)\uFF1A");
	lbld.setBounds(441, 150, 116, 27);
	frame.getContentPane().add(lbld);
	
	JLabel lblf = new JLabel("\u7AD6\u5411\u6B63\u538B\u529B(F)\uFF1A");
	lblf.setBounds(441, 183, 116, 27);
	frame.getContentPane().add(lblf);
	
	JLabel lbldx = new JLabel("\u5730\u4E0B\u6C34\u4F4D(dx)\uFF1A");
	lbldx.setBounds(441, 216, 116, 27);
	frame.getContentPane().add(lbldx);
	
	JLabel lbln = new JLabel("\u571F\u7684\u6027\u8D28(n)\uFF1A");
	lbln.setBounds(441, 286, 116, 27);
	frame.getContentPane().add(lbln);
	
	edit_l = new JTextField();
	edit_l.setHorizontalAlignment(SwingConstants.CENTER);
	edit_l.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_l.selectAll();
		}
	});
	
	JLabel lblg = new JLabel("\u57FA\u7840\u53CA\u56DE\u586B\u571F\u5E73\u5747\u91CD\u5EA6\u03B3G:");
	lblg.setBounds(441, 253, 157, 27);
	frame.getContentPane().add(lblg);
	edit_l.setBounds(540, 40, 200, 27);
	frame.getContentPane().add(edit_l);
	edit_l.setColumns(10);
	
	edit_b = new JTextField();
	edit_b.setHorizontalAlignment(SwingConstants.CENTER);
	edit_b.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_b.selectAll();
		}
	});
	edit_b.setColumns(10);
	edit_b.setBounds(540, 75, 200, 27);
	frame.getContentPane().add(edit_b);
	
	edit_y = new JTextField();
	edit_y.setHorizontalAlignment(SwingConstants.CENTER);
	edit_y.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_y.selectAll();
		}
	});
	edit_y.setColumns(10);
	edit_y.setBounds(540, 110, 200, 27);
	frame.getContentPane().add(edit_y);
	
	edit_d = new JTextField();
	edit_d.setHorizontalAlignment(SwingConstants.CENTER);
	edit_d.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_d.selectAll();
		}
	});
	edit_d.setColumns(10);
	edit_d.setBounds(540, 145, 200, 27);
	frame.getContentPane().add(edit_d);
	
	edit_f = new JTextField();
	edit_f.setHorizontalAlignment(SwingConstants.CENTER);
	edit_f.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_f.selectAll();
		}
	});
	edit_f.setColumns(10);
	edit_f.setBounds(540, 180, 200, 27);
	frame.getContentPane().add(edit_f);
	
	edit_dx = new JTextField();
	edit_dx.setHorizontalAlignment(SwingConstants.CENTER);
	edit_dx.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_dx.selectAll();
		}
	});
	edit_dx.setColumns(10);
	edit_dx.setBounds(540, 215, 200, 27);
	frame.getContentPane().add(edit_dx);
	
	edit_yg = new JTextField();
	edit_yg.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			edit_yg.selectAll();
		}
	});
	edit_yg.setHorizontalAlignment(SwingConstants.CENTER);
	edit_yg.setText("20");
	edit_yg.setColumns(10);
	edit_yg.setBounds(608, 249, 132, 27);
	frame.getContentPane().add(edit_yg);
	
	r1 = new JRadioButton("\u4E00\u822C\u571F");
	r1.setBounds(563, 288, 69, 23);
	frame.getContentPane().add(r1);
	
	r2 = new JRadioButton("\u8F6F\u571F");
	r2.setBounds(654, 288, 69, 23);
	frame.getContentPane().add(r2);
	
	ButtonGroup group = new ButtonGroup();
	group.add(r1);
	group.add(r2);	
	
	JButton button = new JButton("\u8BA1\u7B97");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//定义用于存放用户输入初始值的变量,先设定一个表示数-1，用作后面的判断
			double l=-1,b=-1,y=-1,d=-1,f=-1,dx=-1,tu=-1,yg=-1;
			
			//读取用户输入的初始数据
			try {
				l = Double.parseDouble(edit_l.getText());
				b = Double.parseDouble(edit_b.getText());
				y = Double.parseDouble(edit_y.getText());
				d = Double.parseDouble(edit_d.getText());
				f = Double.parseDouble(edit_f.getText());
				dx = Double.parseDouble(edit_dx.getText());
				yg = Double.parseDouble(edit_yg.getText());
				//用判断语句获取Radio Button的值
				if(r1.isSelected()){				
					tu = 0.2;
				}
				if(r2.isSelected()){
					tu = 0.1;
				}
				
			} catch (NumberFormatException e1) {
				System.out.println("空串了哦。。");				
			}
			
			//若参数输入正确，则跳转到下一个页面,即若有一个数依然是零则表示输入有问题
			if(l!=-1 && b!=-1 && y!=-1 && d!=-1 && f!=-1 && dx!=-1 && tu!=-1 && yg!=-1){
			frame.dispose();
			Item42 item42 = new Item42();
			item42.initialize();
			//调用item42中的一个函数，将计算后数据传入下一个页面的表格中作为一行初始值
			item42.trans(l,b,y,d,f,dx,yg,tu);
			}else{
				//如果参数录入不完整，则弹出一个提示框
				JOptionPane.showMessageDialog(null, "参数不得为空", "参数错误", JOptionPane.ERROR_MESSAGE);
			}
			
		}
	});
	button.setBounds(647, 383, 93, 23);
	frame.getContentPane().add(button);
	
	JButton button_1 = new JButton("\u8FD4\u56DE");
	button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			Main1 main = new Main1();
			main.initialize();
		}
	});
	button_1.setBounds(647, 502, 93, 23);
	frame.getContentPane().add(button_1);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	scrollPane.setBounds(10, 351, 588, 239);
	frame.getContentPane().add(scrollPane);
	
	JTextArea txtrJscrollpanel = new JTextArea();
	txtrJscrollpanel.setLineWrap(true);
	txtrJscrollpanel.setText("\u8BF4\u660E\uFF1A\r\n1.\u5F53\u524D\u9875\u8F93\u5165\u53C2\u6570\u7528\u4E8E\u8BA1\u7B97\u5730\u57FA\u7AD6\u5411\u81EA\u91CD\u5E94\u529B\u53CA\u9644\u52A0\u5E94\u529B\uFF0C\u5404\u5206\u5C42\u53C2\u6570\u8F93\u5165\u3001\u8BA1\u7B97\u7ED3\u679C\u53CA\u6C89\u964D  \u91CF\u8868\u8BF7\u5355\u51FB\u4E0B\u4E00\u6B65\r\n2.\u5355\u51FB\u201C\u4E0B\u4E00\u6B65\u201D\uFF0C\u8FDB\u5165\u5206\u5C42\u8BA1\u7B97\u53CA\u6C89\u964D\u91CF\u8868\u754C\u9762\uFF0C\u8F93\u5165\u5206\u5C42\u53C2\u6570\u540E\uFF0C\u5355\u51FB\u786E\u5B9A\u53EF\u5728\u6C89\u964D\u91CF\u8868  \u4E2D\u663E\u793A\u8F93\u5165\u6570\u636E\u53CA\u8BA1\u7B97\u7ED3\u679C\r\n3.\u5355\u51FB\u6B64\u754C\u9762\u53F3\u4FA7\u201C\u95EE\u53F7\u201D\uFF0C\u663E\u793A\u5206\u5C42\u7EFC\u548C\u6CD5\u8BA1\u7B97\u539F\u7406\u53CA\u6B65\u9AA4\r\n4.\u4E0D\u540C\u538B\u529B\u4E0B\u7684\u5B54\u9699\u6BD4\u9700\u7528\u6237\u67E5\u66F2\u7EBF\u5E76\u8F93\u5165\r\n5.\u6240\u6709\u8BA1\u7B97\u6570\u636E\u53CA\u7ED3\u679C\u4EE5\u6C89\u964D\u91CF\u8868\u5F62\u5F0F\u663E\u793A\uFF0C\u5E76\u7ED9\u51FA\u6700\u7EC8\u6C89\u964D\u91CF\u6570\u503C\r\n\r\n\u6CE8\u610F\uFF1A\r\n1.\u5916\u8377\u8F7D\u5F62\u5F0F\uFF1A\u9ED8\u8BA4\u4E3A\u4E2D\u5FC3\u8377\u8F7D\r\n2.\u5B54\u9699\u6BD4\u6C42\u6CD5\uFF1A\u6839\u636E\u5BF9\u4E8E\u571F\u5C42\u7684\u538B\u7F29\u66F2\u7EBF\uFF0C\u67E5\u627E\u51FA\u8BA1\u7B97\u6240\u5F97\u8BE5\u5206\u5C42\u5E73\u5747\u81EA\u91CD\u5E94\u529B\u5BF9\u5E94\u7684\u7A7A\u9699\u6BD4\uFF0C\u4EE5\u53CA\u5E73\u5747\u9644\u52A0\u5E94\u529B\u4E0E\u5E73\u5747\u81EA\u91CD\u5E94\u529B\u4E4B\u548C\u5BF9\u5E94\u7684\u5B54\u9699\u6BD4\r\n3.\u5730\u57FA\u5206\u5C42\uFF1A\u6BCF\u5C42\u539A\u5EA6hi\u22640.4b,\u5730\u4E0B\u6C34\u4F4D\u51FA\u3001\u571F\u5C42\u5206\u754C\u9762\u5904\u5355\u72EC\u5212\u5206");
	scrollPane.setViewportView(txtrJscrollpanel);
	
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panel.setBounds(426, 10, 363, 313);
	frame.getContentPane().add(panel);
	
	
	
	}		
}
