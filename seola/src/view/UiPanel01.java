package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;

import view.UiPanel03.MyActionListener;
import model.Academy;



public class UiPanel01 extends JPanel {
	
	static JPanel panel01 = new MyPanel01();
	static JTextArea major = new JTextArea();
	static JTextArea itcourse = new JTextArea();
	static JTextArea tribute = new JTextArea();
	private static UiChange win;
	static UiPanel01_1 uipanel01_1 = new UiPanel01_1();

	private JButton menu1;
	private JButton menu2;
	private JButton menu3;
	private JButton menu4;

	private Color c1 = new Color(167, 93, 67);
	private Font f1 = new Font("궁서", Font.BOLD, 20);

	public UiPanel01(UiChange win) {
		
		this.win = win;
		setSize(750, 540);
		setVisible(true);
		setLayout(null);
		add(panel01);
		
		
		panel01.setSize(750, 540);
		panel01.setLayout(null);
		panel01.add(uipanel01_1);
		

		uipanel01_1.setSize(515, 257);
		uipanel01_1.setLocation(223, 8);
		

		menu1 = new JButton();
		menu1.setBounds(40, 40, 140, 80);
		menu1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu1.setFocusPainted(false);
		menu1.setBorderPainted(false);
		panel01.add(menu1);

		menu2 = new JButton();
		menu2.setBounds(40, 160, 140, 80);
		menu2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu2.setFocusPainted(false);
		menu2.setBorderPainted(false);
		panel01.add(menu2);

		menu3 = new JButton();
		menu3.setBounds(40, 300, 140, 80);
		menu3.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu3.setFocusPainted(false);
		menu3.setBorderPainted(false);
		panel01.add(menu3);

		menu4 = new JButton();
		menu4.setBounds(40, 420, 140, 80);
		menu4.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu4.setFocusPainted(false);
		menu4.setBorderPainted(false);
		panel01.add(menu4);

		menu1.addActionListener(new MyActionListener());
		menu2.addActionListener(new MyActionListener());
		menu3.addActionListener(new MyActionListener());
		menu4.addActionListener(new MyActionListener());

	}

	static class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_1.png").getImage();
			g.drawImage(img, 0, 0, 750, 540, null);
		}
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == menu1) {
				win.change("uipanel01");
			} else if (e.getSource() == menu2) {
				win.change("uipanel02");
			} else if (e.getSource() == menu3) {
				win.change("uipanel03");
			} else if (e.getSource() == menu4) {
				win.change("uipanel04");
			}

		}

	}

}

class TextPanel01 extends JPanel {

	MyPanel02 panel02 = new MyPanel02();
	JTextField nameTextField;
	JTextField birthTextField;
	JTextField telTextField;
	JTextField addressTextField;
	
	
	public TextPanel01() {
		setSize(515, 257);
		setLocation(223, 8);
		setVisible(true);
		setLayout(null);

		panel02.setSize(515, 257);
		panel02.setLocation(0, 0);
		add(panel02);

		nameTextField = new JTextField();
		panel02.add(nameTextField);
		nameTextField.setSize(90, 20);
		nameTextField.setLocation(30, 105);

		birthTextField = new JTextField();
		panel02.add(birthTextField);
		birthTextField.setSize(102, 60);
		birthTextField.setLocation(140, 105);

		telTextField = new JTextField();
		panel02.add(telTextField);
		telTextField.setSize(102, 60);
		telTextField.setLocation(265, 105);

		addressTextField = new JTextField();
		panel02.add(addressTextField);
		addressTextField.setSize(102, 60);
		addressTextField.setLocation(390, 105);

	}

	class MyPanel02 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_1_change1.png").getImage();
			g.drawImage(img, 0, 0, 515, 257, null);
		}
	}

}

class UiPanel01_1 extends JPanel {
	private JPanel panel01 = new MyPanel01();
	static JTextArea nametext = new JTextArea();
	static JTextArea birthtext = new JTextArea();
	static JTextArea teltext = new JTextArea();
	static JTextArea addresstext = new JTextArea();
	static String name;
	static String birth;
	static String tel;
	static String address;
	private Color c1 = new Color(167, 93, 67);
	private Font f1 = new Font("궁서", Font.BOLD, 20);
	private JButton change_bt1;
	private JButton change_bt2;
	private JButton change_bt3;
	private JButton change_bt4;
	private JButton add_bt1;
	private JButton add_bt2;
	private JButton add_bt3;
	private JButton add_bt4;
	private JButton cancel_bt1;
	private JButton cancel_bt2;
	private JButton cancel_bt3;
	private JButton cancel_bt4;
	Academy academy = new Academy();
	

	ImageIcon ui_bt[] = { new ImageIcon("img\\Change_bt.png"), new ImageIcon("img\\Change_bt_roll.png"),
			new ImageIcon("img\\Add_bt.png"), new ImageIcon("img\\Add_bt_roll.png") };

	public UiPanel01_1() {
	
		setSize(515, 257);
		setVisible(true);
		setLayout(null);
		add(panel01);
		
		setFont(f1);
		setForeground(c1);
		setBorder(null);

		panel01.setSize(515, 257);
		panel01.setLocation(0, 0);
		panel01.setLayout(null);

		panel01.add(nametext);
		panel01.add(birthtext);
		panel01.add(teltext);
		panel01.add(addresstext);

		nametext.setSize(80, 30);
		nametext.setLocation(32, 110);
		nametext.setForeground(c1);
		nametext.setFont(f1);
		nametext.setCursor(null);
		nametext.setEditable(false);
		nametext.setBackground(new Color(40, 38, 38));

		birthtext.setSize(80, 30);
		birthtext.setLocation(160, 110);
		birthtext.setForeground(c1);
		birthtext.setFont(f1);
		birthtext.setCursor(null);
		birthtext.setEditable(false);
		
		birthtext.setBackground(new Color(40, 38, 38));

		teltext.setSize(100, 50);
		teltext.setLocation(275, 100);
		teltext.setForeground(c1);
		teltext.setFont(f1);
		teltext.setLineWrap(true);
		teltext.setCursor(null);
		teltext.setEditable(false);
		//teltext.setAlignmentX(CENTER_ALIGNMENT);
		teltext.setBackground(new Color(40, 38, 38));

		addresstext.setSize(100, 50);
		addresstext.setLocation(390, 100);
		addresstext.setForeground(c1);
		addresstext.setFont(f1);
		addresstext.setLineWrap(true);
		addresstext.setCursor(null);
		addresstext.setEditable(false);
		addresstext.setBackground(new Color(40, 38, 38));

		change_bt1 = new JButton(ui_bt[0]);
		change_bt1.setBounds(30, 200, 75, 43);
		panel01.add(change_bt1);
		change_bt1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		// change_bt.setFocusPainted(false);
		change_bt1.setBorderPainted(false);
		change_bt1.setRolloverEnabled(true);
		change_bt1.setRolloverIcon(ui_bt[1]);
		change_bt1.addActionListener(new MyActionListener());
		
		
		change_bt2 = new JButton(ui_bt[0]);
		change_bt2.setBounds(160, 200, 75, 43);
		panel01.add(change_bt2);
		change_bt2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		// change_bt.setFocusPainted(false);
		change_bt2.setBorderPainted(false);
		change_bt2.setRolloverEnabled(true);
		change_bt2.setRolloverIcon(ui_bt[1]);
		change_bt2.addActionListener(new MyActionListener());
		
		change_bt3 = new JButton(ui_bt[0]);
		change_bt3.setBounds(290, 200, 75, 43);
		panel01.add(change_bt3);
		change_bt3.setContentAreaFilled(false);// 버튼 내용영역 안채움
		// change_bt.setFocusPainted(false);
		change_bt3.setBorderPainted(false);
		change_bt3.setRolloverEnabled(true);
		change_bt3.setRolloverIcon(ui_bt[1]);
		change_bt3.addActionListener(new MyActionListener());
		
		change_bt4 = new JButton(ui_bt[0]);
		change_bt4.setBounds(420, 200, 75, 43);
		panel01.add(change_bt4);
		change_bt4.setContentAreaFilled(false);// 버튼 내용영역 안채움
		// change_bt.setFocusPainted(false);
		change_bt4.setBorderPainted(false);
		change_bt4.setRolloverEnabled(true);
		change_bt4.setRolloverIcon(ui_bt[1]);
		change_bt4.addActionListener(new MyActionListener());
		

		add_bt1 = new JButton(ui_bt[2]);
		add_bt1.setBounds(430, 190, 45, 26);
		add_bt1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt1.setBorderPainted(false);
		add_bt1.setRolloverEnabled(true);
		add_bt1.setRolloverIcon(ui_bt[3]);
		add_bt1.addActionListener(new MyActionListener());
		

		add_bt2 = new JButton(ui_bt[2]);
		add_bt2.setBounds(480, 190, 45, 26);
		add_bt2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt2.setBorderPainted(false);
		add_bt2.setRolloverEnabled(true);
		add_bt2.setRolloverIcon(ui_bt[3]);
		add_bt2.addActionListener(new MyActionListener());
		

		add_bt3 = new JButton(ui_bt[2]);
		add_bt3.setBounds(530, 190, 45, 26);
		add_bt3.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt3.setBorderPainted(false);
		add_bt3.setRolloverEnabled(true);
		add_bt3.setRolloverIcon(ui_bt[3]);
		add_bt3.addActionListener(new MyActionListener());
		

		add_bt4 = new JButton(ui_bt[2]);
		add_bt4.setBounds(580, 190, 45, 26);
		add_bt4.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt4.setBorderPainted(false);
		add_bt4.setRolloverEnabled(true);
		add_bt4.setRolloverIcon(ui_bt[3]);
		add_bt4.addActionListener(new MyActionListener());
		
		
		cancel_bt1 = new JButton(ui_bt[2]);
		cancel_bt1 .setBounds(460, 190, 45, 26);
		cancel_bt1 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt1 .setBorderPainted(false);
		cancel_bt1 .setRolloverEnabled(true);
		cancel_bt1 .setRolloverIcon(ui_bt[3]);
		cancel_bt1 .addActionListener(new MyActionListener());

		cancel_bt2 = new JButton(ui_bt[2]);
		cancel_bt2 .setBounds(510, 190, 45, 26);
		cancel_bt2 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt2 .setBorderPainted(false);
		cancel_bt2 .setRolloverEnabled(true);
		cancel_bt2 .setRolloverIcon(ui_bt[3]);
		cancel_bt2 .addActionListener(new MyActionListener());
		
		cancel_bt3 = new JButton(ui_bt[2]);
		cancel_bt3 .setBounds(560, 190, 45, 26);
		cancel_bt3 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt3 .setBorderPainted(false);
		cancel_bt3 .setRolloverEnabled(true);
		cancel_bt3 .setRolloverIcon(ui_bt[3]);
		cancel_bt3 .addActionListener(new MyActionListener());
		
		cancel_bt4 = new JButton(ui_bt[2]);
		cancel_bt4 .setBounds(610, 190, 45, 26);
		cancel_bt4 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt4 .setBorderPainted(false);
		cancel_bt4 .setRolloverEnabled(true);
		cancel_bt4 .setRolloverIcon(ui_bt[3]);
		cancel_bt4 .addActionListener(new MyActionListener());
		
		
	}

	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_1_change1.png").getImage();
			g.drawImage(img, 0, 0, 515, 257, null);
		}
	}

	class MyActionListener implements ActionListener {
		private TextPanel01 textpanel = new TextPanel01();
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == change_bt1) {
				panel01.remove(change_bt1);
				panel01.add(add_bt1);
				panel01.add(cancel_bt1);
				add_bt1.setSize(45,26);
				add_bt1.setLocation(25,205);
				cancel_bt1.setSize(45,26);
				cancel_bt1.setLocation(80,205);
				nametext.setCursor(getCursor());
				name = nametext.getText();
				nametext.setText("");
				nametext.setEditable(true);
				nametext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.nameB = true;
			
				
			}else if(e.getSource() == change_bt2) {
				panel01.remove(change_bt2);
				panel01.add(add_bt2);
				panel01.add(cancel_bt2);
				add_bt2.setSize(45,26);
				add_bt2.setLocation(150,205);
				cancel_bt2.setSize(45,26);
				cancel_bt2.setLocation(205,205);
				birthtext.setCursor(getCursor());
				birth = birthtext.getText();
				birthtext.setText("");
				birthtext.setEditable(true);
				birthtext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.birthB = true;
				
			}else if(e.getSource() == change_bt3) {
				panel01.remove(change_bt3);
				panel01.add(add_bt3);
				panel01.add(cancel_bt3);
				add_bt3.setSize(45,26);
				add_bt3.setLocation(279,205);
				cancel_bt3.setSize(45,26);
				cancel_bt3.setLocation(334,205);
				teltext.setCursor(getCursor());
				tel = teltext.getText();
				teltext.setText("");
				teltext.setEditable(true);
				teltext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.telB = true;
				
			}else if(e.getSource() == change_bt4) {
				panel01.remove(change_bt4);
				panel01.add(add_bt4);
				panel01.add(cancel_bt4);
				add_bt4.setSize(45,26);
				add_bt4.setLocation(394,205);
				cancel_bt4.setSize(45,26);
				cancel_bt4.setLocation(439,205);
				addresstext.setCursor(getCursor());
				address = addresstext.getText();
				addresstext.setText("");
				addresstext.setEditable(true);
				addresstext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.addressB = true;
				
			}
			else if(e.getSource() == add_bt1) {
				panel01.remove(add_bt1);
				panel01.remove(cancel_bt1);
				panel01.add(change_bt1);
				change_bt1.setSize(75,43);
				change_bt1.setLocation(30,200);
				nametext.setCursor(null);
				nametext.setEditable(false);
				nametext.setBackground(new Color(40, 38, 38));
				nametext.setText(nametext.getText());
				revalidate();
				repaint();
				academy.nameB = false;
				
				Academy academy = new Academy();
				academy.setName(textpanel.nameTextField.getText());
				System.out.println(textpanel.nameTextField.getText());
				academy.setBirth(textpanel.birthTextField.getText());
				academy.setTel(textpanel.telTextField.getText());
				academy.setAddress(textpanel.addressTextField.getText());
				
			}else if(e.getSource() == add_bt2) {
				panel01.remove(add_bt2);
				panel01.remove(cancel_bt2);
				panel01.add(change_bt2);
				change_bt2.setSize(75,43);
				change_bt2.setLocation(160,200);
				birthtext.setCursor(null);
				birthtext.setEditable(false);
				birthtext.setBackground(new Color(40, 38, 38));
				birthtext.setText(birthtext.getText());
				revalidate();
				repaint();
				academy.birthB = false;
				
				Academy academy = new Academy();
				academy.setName(textpanel.nameTextField.getText());
				System.out.println(textpanel.nameTextField.getText());
				academy.setBirth(textpanel.birthTextField.getText());
				academy.setTel(textpanel.telTextField.getText());
				academy.setAddress(textpanel.addressTextField.getText());
				
			}
			else if(e.getSource() == add_bt3) {
				panel01.remove(add_bt3);
				panel01.remove(cancel_bt3);
				panel01.add(change_bt3);
				change_bt3.setSize(75,43);
				change_bt3.setLocation(290,200);
				teltext.setCursor(null);
				teltext.setEditable(false);
				teltext.setBackground(new Color(40, 38, 38));
				teltext.setText(teltext.getText());
				revalidate();
				repaint();
				academy.telB = false;
				
				Academy academy = new Academy();
				academy.setName(textpanel.nameTextField.getText());
				System.out.println(textpanel.nameTextField.getText());
				academy.setBirth(textpanel.birthTextField.getText());
				academy.setTel(textpanel.telTextField.getText());
				academy.setAddress(textpanel.addressTextField.getText());
				
			}
			else if(e.getSource() == add_bt4) {
				panel01.remove(add_bt4);
				panel01.remove(cancel_bt4);
				panel01.add(change_bt4);
				change_bt4.setSize(75,43);
				change_bt4.setLocation(420,200);
				addresstext.setCursor(null);
				addresstext.setEditable(false);
				addresstext.setBackground(new Color(40, 38, 38));
				addresstext.setText(addresstext.getText());
				revalidate();
				repaint();
				academy.addressB = false;
				
				Academy academy = new Academy();
				academy.setName(textpanel.nameTextField.getText());
				System.out.println(textpanel.nameTextField.getText());
				academy.setBirth(textpanel.birthTextField.getText());
				academy.setTel(textpanel.telTextField.getText());
				academy.setAddress(textpanel.addressTextField.getText());
				
			}
	
			else if(e.getSource() == cancel_bt1) {
				panel01.remove(add_bt1);
				panel01.remove(cancel_bt1);
				panel01.add(change_bt1);
				change_bt1.setSize(75,43);
				change_bt1.setLocation(30,200);
				nametext.setCursor(null);
				nametext.setEditable(false);
				nametext.setBackground(new Color(40, 38, 38));
				nametext.setText(name);
				revalidate();
				repaint();
				academy.nameB = false;
			}
			else if(e.getSource() == cancel_bt2) {
				panel01.remove(add_bt2);
				panel01.remove(cancel_bt2);
				panel01.add(change_bt2);
				change_bt2.setSize(75,43);
				change_bt2.setLocation(160,200);
				birthtext.setCursor(null);
				birthtext.setEditable(false);
				birthtext.setBackground(new Color(40, 38, 38));
				birthtext.setText(birth);
				revalidate();
				repaint();
				academy.birthB = false;
			}
			else if(e.getSource() == cancel_bt3) {
				panel01.remove(add_bt3);
				panel01.remove(cancel_bt3);
				panel01.add(change_bt3);
				change_bt3.setSize(75,43);
				change_bt3.setLocation(290,200);
				teltext.setCursor(null);
				teltext.setEditable(false);
				teltext.setBackground(new Color(40, 38, 38));
				teltext.setText(tel);
				revalidate();
				repaint();
				academy.telB = false;
			}
			else if(e.getSource() == cancel_bt4) {
				panel01.remove(add_bt4);
				panel01.remove(cancel_bt4);
				panel01.add(change_bt4);
				change_bt4.setSize(75,43);
				change_bt4.setLocation(420,200);
				addresstext.setCursor(null);
				addresstext.setEditable(false);
				addresstext.setBackground(new Color(40, 38, 38));
				addresstext.setText(address);
				revalidate();
				repaint();
				academy.addressB = false;
			}
			
			
		}
	}
	
	
}
