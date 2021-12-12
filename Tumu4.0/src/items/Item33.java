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

import descriptions.Desc33;
import maths.Math33;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Item33 {

	private JFrame frame;
	private JTextField edit_po;
	private JTextField edit_r;
	private JTextField edit_z;
	private JTextField out2;
	private JTextField out1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item33 window = new Item33();
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
//	public Item33() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Item33.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frame.setTitle("\u5706\u5F62\u9762\u79EF\u5747\u5E03\u8377\u8F7D\u4E0B\u9644\u52A0\u5E94\u529B\u8BA1\u7B97");
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Desc33 desc33 = new Desc33();
				desc33.initialize();
			}
			
		});
		//photo.setIcon(new ImageIcon(Item33.class.getResource("/image/p33.jpg")));
		photo.setBackground(Color.WHITE);
		photo.setBounds(10, 0, 424, 288);
		Image img = new BufferedImage(photo.getWidth(),photo.getHeight(),BufferedImage.TYPE_INT_RGB);
		img.getGraphics().drawImage(new ImageIcon((Item33.class.getResource("/image/p33.jpg"))).getImage(), 0, 0,photo.getWidth(),photo.getHeight(), null);
		photo.setIcon(new ImageIcon(img));
		frame.getContentPane().add(photo);
		
		JLabel lblNewLabel = new JLabel("\u5706\u5F62\u8377\u8F7DPo(kp):");
		lblNewLabel.setBounds(444, 79, 144, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5706\u5F62\u8377\u8F7D\u9762\u79EF\u534A\u5F84r(m):");
		lblNewLabel_1.setBounds(444, 156, 154, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u672A\u77E5\u70B9\u6DF1\u5EA6z(m):");
		lblNewLabel_2.setBounds(444, 233, 144, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "\u8BF4\u660E\u53CA\u6CE8\u610F\u4E8B\u9879", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(461, 351, 328, 236);
		frame.getContentPane().add(scrollPane);
		
		JTextArea explain = new JTextArea();
		explain.setLineWrap(true);
		explain.setText("\u8BF4\u660E\uFF1A\r\n\u56FE\u5F62\u9762\u79EF\u4E0A\u4F5C\u7528\u5747\u5E03\u8377\u8F7DPo\u65F6\uFF0C\u5B9C\u91C7\u7528\u6781\u5750\u6807\u6C42\u89E3\uFF0C\u8FD9\u65F6\uFF0CdA=rdrd\u03B8,dF=Pordrd\u03B8\uFF0C\u4EE3\u5165\u516C\u5F0F\uFF0C\u5E76\u901A\u8FC7\u6781\u5750\u6807\u53D8\u6362\u5373\u53EF\u5F97\u5230\u03C3z");
		explain.setEditable(false);
		scrollPane.setViewportView(explain);
		
		edit_po = new JTextField();
		edit_po.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_po.selectAll();
			}
		});
		edit_po.setHorizontalAlignment(SwingConstants.CENTER);
		edit_po.setBounds(605, 71, 166, 32);
		frame.getContentPane().add(edit_po);
		edit_po.setColumns(10);
		
		edit_r = new JTextField();
		edit_r.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_r.selectAll();
			}
		});
		edit_r.setHorizontalAlignment(SwingConstants.CENTER);
		edit_r.setColumns(10);
		edit_r.setBounds(605, 148, 166, 32);
		frame.getContentPane().add(edit_r);
		
		edit_z = new JTextField();
		edit_z.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				edit_z.selectAll();
			}
		});
		edit_z.setHorizontalAlignment(SwingConstants.CENTER);
		edit_z.setColumns(10);
		edit_z.setBounds(605, 221, 166, 32);
		frame.getContentPane().add(edit_z);
		
		JLabel lblNewLabel_4 = new JLabel("\u9644\u52A0\u5E94\u529B\u03C3z\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(28, 464, 129, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		out2 = new JTextField();
		out2.setHorizontalAlignment(SwingConstants.CENTER);
		out2.setEditable(false);
		out2.setBounds(182, 455, 200, 34);
		frame.getContentPane().add(out2);
		out2.setColumns(10);
		
		JButton calculate = new JButton("\u8BA1\u7B97");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double po = Double.parseDouble(edit_po.getText());
					double r = Double.parseDouble(edit_r.getText());
					double z = Double.parseDouble(edit_z.getText());
					
					calculate(po,r,z);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					System.out.println("空串。。");
				}
			}
		});
		calculate.setToolTipText("\u70B9\u51FB\u8BA1\u7B97");
		calculate.setBounds(55, 519, 93, 23);
		frame.getContentPane().add(calculate);
		
		JButton back = new JButton("\u8FD4\u56DE");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Main3 main3 = new Main3();
				main3.initialize();
			}
		});
		back.setToolTipText("\u70B9\u51FB\u8FD4\u56DE\u4E3B\u9875");
		back.setBounds(272, 519, 93, 23);
		frame.getContentPane().add(back);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Math33 math33 = new Math33();
				math33.initialize();
			}
		});
		btnNewButton.setToolTipText("\u70B9\u51FB\u67E5\u770B\u516C\u5F0F");
		btnNewButton.setIcon(new ImageIcon(Item33.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		btnNewButton.setBounds(763, 329, 26, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblo = new JLabel("\u9644\u52A0\u5E94\u529B\u7CFB\u6570\u03B1o\uFF1A");
		lblo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblo.setBounds(28, 394, 129, 15);
		frame.getContentPane().add(lblo);
		
		out1 = new JTextField();
		out1.setHorizontalAlignment(SwingConstants.CENTER);
		out1.setEditable(false);
		out1.setColumns(10);
		out1.setBounds(182, 386, 200, 34);
		frame.getContentPane().add(out1);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(null, "\u53C2\u6570\u8F93\u5165", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		input.setBounds(434, 10, 355, 277);
		frame.getContentPane().add(input);
		
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder(null, "\u8BA1\u7B97\u53CA\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		output.setBounds(8, 339, 443, 258);
		frame.getContentPane().add(output);
		
	}
	
	private void calculate(double po,double r,double z){
		
		double a0,d0;
		if(po<0 || r<0 || z<0){
			JOptionPane.showMessageDialog(null, "参数不得小于0！", "参数错误", JOptionPane.ERROR_MESSAGE);
		}else{
			a0 = 1 - 1 / (Math.pow((1 + Math.pow(r, 2) / (Math.pow(z, 2))),1.5));
			d0 = po * a0;
			
			out1.setText(String.valueOf(a0));
			out2.setText(String.valueOf(d0));
		}
	}
}
