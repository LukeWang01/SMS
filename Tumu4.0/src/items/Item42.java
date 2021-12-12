package items;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.ImageIcon;

import maths.Math42;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Item42 {

	private JFrame frame;
	private JTextField edit_h;
	private JTextField edit_y;
	private JButton button;
	private JLabel label_1;
	private JLabel lblE;
	private JLabel lblE_1;
	private JTextField edit_e1;
	private JTextField edit_e2;
	private JButton calculate;
	private JLabel lbls;
	private JButton back;
	private JTextField total;
	private JTable table;
	private JScrollPane scrollPane2;
		
	static double h=0,y=0,z,σcz,σz,n,s=0,di,dxi,length,width;  //定义静态变量，用在下面的trans及calculate函数中，方便函数复用
	static int i = 1,flag = 0,flag_1 = 1;     //用于表格行标的自增
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item42 window = new Item42();
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
		frame.setResizable(false);
		frame.setTitle("\u5206\u5C42\u603B\u548C\u6CD5\u8BA1\u7B97\u6700\u7EC8\u6C89\u964D");
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item41.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setBounds(100, 100, 900, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BE5\u5C42\u5206\u5C42\u539A\u5EA6(h)\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(0, 15, 117, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u8BE5\u5C42\u91CD\u5EA6(\u03B3)\uFF1A");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 50, 117, 25);
		frame.getContentPane().add(label);
		
		edit_h = new JTextField();
		edit_h.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_h.selectAll();
			}
		});
		edit_h.setBounds(118, 15, 117, 25);
		frame.getContentPane().add(edit_h);
		edit_h.setColumns(10);
		
		edit_y = new JTextField();
		edit_y.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_y.selectAll();
			}
		});
		edit_y.setColumns(10);
		edit_y.setBounds(118, 50, 117, 25);
		frame.getContentPane().add(edit_y);
		
		button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					h = Double.parseDouble(edit_h.getText());
					y = Double.parseDouble(edit_y.getText());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.err.println("空串了哦……");
				}
				if(flag_1 == 1){
					if(h!=0 && y!=0){
					first_calculate(h,y);
					flag_1 = 0;         //此处两个flag用来防止重复赋值
					flag = 1;
					}else{
						JOptionPane.showMessageDialog(null, "参数不得为空", "参数错误", JOptionPane.ERROR_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(null, "请勿重复点击", "提示", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		button.setBounds(262, 35, 93, 23);
		frame.getContentPane().add(button);
		
		label_1 = new JLabel("\u5B54\u9699\u6BD4");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(395, 34, 93, 25);
		frame.getContentPane().add(label_1);
		
		lblE = new JLabel("e1\uFF1A");
		lblE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblE.setBounds(484, 15, 34, 25);
		frame.getContentPane().add(lblE);
		
		lblE_1 = new JLabel("e2\uFF1A");
		lblE_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblE_1.setBounds(484, 50, 34, 25);
		frame.getContentPane().add(lblE_1);
		
		edit_e1 = new JTextField();
		edit_e1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_e1.selectAll();
			}
		});
		edit_e1.setColumns(10);
		edit_e1.setBounds(524, 15, 117, 25);
		frame.getContentPane().add(edit_e1);
		
		edit_e2 = new JTextField();
		edit_e2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_e2.selectAll();
			}
		});
		edit_e2.setColumns(10);
		edit_e2.setBounds(524, 50, 117, 25);
		frame.getContentPane().add(edit_e2);
		
		calculate = new JButton("\u8BA1\u7B97");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double e1=0,e2=0;
				try {
					e1 = Double.parseDouble(edit_e1.getText());
					e2 = Double.parseDouble(edit_e2.getText());
				} catch (NumberFormatException e3) {
					// TODO Auto-generated catch block
					System.err.println("空串了哦……");
				}
				if(flag ==1){
					if(e1!=0 && e2!=0){
					second_calculate(e1,e2);
					flag = 0;
					flag_1 = 1;
					}else{
						JOptionPane.showMessageDialog(null, "参数不得为空", "参数错误", JOptionPane.ERROR_MESSAGE);
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "请先点击确定按钮", "参数错误", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		calculate.setBounds(680, 35, 93, 23);
		frame.getContentPane().add(calculate);
		
		lbls = new JLabel("\u603B\u6C89\u964D\u91CF(S)\uFF1A");
		lbls.setHorizontalAlignment(SwingConstants.RIGHT);
		lbls.setBounds(627, 488, 93, 25);
		frame.getContentPane().add(lbls);
		
		back = new JButton("\u8FD4\u56DE");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//返回时将静态标量清零
				h=0;
				y=0;
				z=0;
				σcz=0;
				σz=0;
				n=0;
				s=0;
				di=0;
				dxi=0;
				length=0;
				width=0;
				frame.dispose();
				Item41 item41 = new Item41();
				item41.initialize();
			}
		});
		back.setBounds(717, 540, 93, 23);
		frame.getContentPane().add(back);
		
		total = new JTextField();
		total.setEditable(false);
		total.setBackground(new Color(245, 245, 245));
		total.setBounds(745, 488, 124, 25);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setEnabled(false);
		scrollPane1.setBounds(0, 92, 894, 386);
		frame.getContentPane().add(scrollPane1);
		
		//定义表头colu
		Object[] colu = {"分层编号","γ","h","z","σcz","Z/(b/2)","α","σz","P1:平均σcz","平均σz","P2:平均(σcz+σz)","e1","e2","Δs"};
		DefaultTableModel tmod = new DefaultTableModel(colu,22);    //声明一个表格模型
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();  //声明一个表格模型
	    tcr.setHorizontalAlignment(JLabel.CENTER);

		table = new JTable(tmod);
		table.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setDefaultRenderer(Object.class, tcr);
		
		scrollPane1.setViewportView(table);
		TableColumn column = null;
		for(int i=11;i<13;i++){
			column = table.getColumnModel().getColumn(i);  //设置e1和e2的行宽
			column.setPreferredWidth(50);
		}
		column = table.getColumnModel().getColumn(10);     //设置p2行宽
		column.setPreferredWidth(120);
		column = table.getColumnModel().getColumn(8);      //设置p1行宽
		column.setPreferredWidth(100);
				
		scrollPane2 = new JScrollPane();
		scrollPane2.setViewportBorder(new TitledBorder(null, "\u8868\u683C\u5143\u7D20\u89E3\u91CA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane2.setBounds(10, 486, 573, 97);
		frame.getContentPane().add(scrollPane2);
		
		JTextArea explian = new JTextArea();
		explian.setText("\u03B3:\u5206\u5C42\u91CD\u5EA6(KN/m3)           z:\u6DF1\u5EA6(m)            h:\u5206\u5C42\u539A\u5EA6(m)           \u03C3cz:\u81EA\u91CD\u5E94\u529B(kpa)\r\nz/(b/2):\u6DF1\u5BBD\u6BD4                    a:\u5E94\u529B\u7CFB\u6570          \u03C3z:\u9644\u52A0\u5E94\u529B(kpa)      e1,e2:\u5B54\u9699\u6BD4\r\n\u0394s:\u5206\u5C42\u6C89\u964D\u91CF(cm)");
		scrollPane2.setViewportView(explian);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Math42 math42 = new Math42();
				math42.initialize();
			}
		});
		button_2.setIcon(new ImageIcon(Item42.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		button_2.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		button_2.setBounds(846, 35, 23, 23);
		frame.getContentPane().add(button_2);
	}
	
	//用来计算Item41里面传过来的值，并将其显示在表格第一行
	void trans(double l,double b,double y,double d,double f,double dx,double yg,double tu){
		
		Item31 item31 = new Item31();
		n = tu;    //记录下土的性质及对应取值，在second_calculate中用到
		length = l/2;
		width = b/2;
		double a = 4*(item31.calculate(0, 0, length, width));
		σcz = y*d;
		σz = (f+yg*l*b*d)/(l*b)-y*d;
		z = 0;
		di = d*10;           //乘以10来减少浮点数精度误差
		dxi = dx*10;
		
		table.setValueAt("0", 0, 0);
		table.setValueAt(z, 0, 3);
		table.setValueAt(σcz, 0, 4);
		table.setValueAt("0", 0, 5);
		table.setValueAt(a, 0, 6);
		table.setValueAt(σz, 0, 7);
	}
	
	//用于之后每一层的第一步计算，可以重复使用
	void first_calculate(double h,double y){
		Item31 item31 = new Item31();
		
		/*
		 * 定义几个变量在此函数中临时使用，其中
		 * ave_σcz是平均σcz，ave_σz是平均σz，
		 * 而b_σcz是上一层的σcz，b_σz是上一层的σz
		 */
		double a,ave_σz,ave_σcz,b_σcz,b_σz;
		b_σcz = σcz;
		b_σz = σz;
		z = z + h;
		if(z*10<=dxi-di){
			σcz = σcz + y*h;
		}else{
			σcz = σcz + (y-10)*h;
		}
		a = 4 * item31.calculate(0, z, length, width);
		σz = a * σz;
		ave_σcz = (σcz+b_σcz)/2;
		ave_σz = (σz+b_σz)/2;
		table.setValueAt(i, i, 0);
		table.setValueAt(y, i, 1);
		table.setValueAt(h, i, 2);
		table.setValueAt(z, i, 3);
		table.setValueAt(σcz, i, 4);
		table.setValueAt(z/width, i, 5);    //z/width即z/(b/2)
		table.setValueAt(a, i, 6);
		table.setValueAt(σz, i, 7);
		table.setValueAt(ave_σcz, i, 8);    //ave_σcz即是p1
		table.setValueAt(ave_σz, i, 9);
		table.setValueAt(ave_σcz+ave_σz, i, 10);    //ave_σcz+ave_σz就是p2
		
	}
	
	//用于之后每一层的第二步计算
	void second_calculate(double e1,double e2){
		double ds;   //记录每层的沉降量
		ds = ((e1-e2)/(1+e1))*h;
		s = s + ds;
		table.setValueAt(e1, i, 11);
		table.setValueAt(e2, i, 12);
		table.setValueAt(ds*100, i, 13);
		i++;
		if(σz/σcz <= n){
			total.setText(String.valueOf(s));			
			JOptionPane.showMessageDialog(null, "计算已完成", "结束提示", JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			JOptionPane.showMessageDialog(null, "点击确定进行下一层运算", "继续提示", JOptionPane.INFORMATION_MESSAGE);
			total.setText(String.valueOf(s*100));			
			
		}
	}
}
