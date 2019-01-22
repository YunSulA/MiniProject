package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import view.UiPanel03.MyActionListener;
import model.Academy;

public class UiPanel01 extends JPanel {

	static JPanel panel01 = new MyPanel01();
	static JTextArea major = new JTextArea();
	static JTextArea itcourse = new JTextArea();
	static JTextArea tribute = new JTextArea();
	private UiChange win;
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
		nameTextField.setSize(102, 60);
		nameTextField.setLocation(20, 105);

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
	private Color c1 = new Color(167, 93, 67);
	private Font f1 = new Font("궁서", Font.BOLD, 20);
	private JButton change_bt;
	private JButton add_bt;
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

		nametext.setSize(100, 60);
		nametext.setLocation(40, 110);
		nametext.setForeground(c1);
		nametext.setFont(f1);
		nametext.setCursor(null);
		nametext.setEditable(false);
		nametext.setBackground(new Color(40, 38, 38));

		birthtext.setSize(100, 60);
		birthtext.setLocation(170, 110);
		birthtext.setForeground(c1);
		birthtext.setFont(f1);
		birthtext.setCursor(null);
		birthtext.setEditable(false);
		birthtext.setBackground(new Color(40, 38, 38));

		teltext.setSize(100, 60);
		teltext.setLocation(285, 110);
		teltext.setForeground(c1);
		teltext.setFont(f1);
		teltext.setLineWrap(true);
		teltext.setCursor(null);
		teltext.setEditable(false);
		teltext.setBackground(new Color(40, 38, 38));

		addresstext.setSize(100, 60);
		addresstext.setLocation(430, 110);
		addresstext.setForeground(c1);
		addresstext.setFont(f1);
		addresstext.setLineWrap(true);
		addresstext.setCursor(null);
		addresstext.setEditable(false);
		addresstext.setBackground(new Color(40, 38, 38));

		change_bt = new JButton(ui_bt[0]);
		change_bt.setBounds(200, 190, 75, 43);
		panel01.add(change_bt);
		change_bt.setContentAreaFilled(false);// 버튼 내용영역 안채움
		// change_bt.setFocusPainted(false);
		change_bt.setBorderPainted(false);
		change_bt.setRolloverEnabled(true);
		change_bt.setRolloverIcon(ui_bt[1]);
		change_bt.addActionListener(new MyActionListener());

		add_bt = new JButton(ui_bt[2]);
		add_bt.setBounds(430, 190, 75, 43);
		add_bt.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt.setBorderPainted(false);
		add_bt.setRolloverEnabled(true);
		add_bt.setRolloverIcon(ui_bt[3]);
		add_bt.addActionListener(new MyActionListener());

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
			if (e.getSource() == change_bt) {
				panel01.removeAll();
				UiPanel01.panel01.remove(menu1);
				revalidate();
				repaint();
				UiPanel01.panel01.add(textpanel);
				textpanel.setSize(515,257);
				textpanel.setLocation(223,8);
				panel01.add(add_bt);
				add_bt.setSize(75,43);
				add_bt.setLocation(100,100);
				
				
			}
			else if(e.getSource() == add_bt) {
				textpanel.panel02.remove(add_bt);
				panel01.remove(textpanel.panel02);
				panel01.add(change_bt);
				
		
				
				Academy academy = new Academy();
				academy.setName(textpanel.nameTextField.getText());
				System.out.println(textpanel.nameTextField.getText());
				academy.setBirth(textpanel.birthTextField.getText());
				academy.setTel(textpanel.telTextField.getText());
				academy.setAddress(textpanel.addressTextField.getText());
			}
		}
	}

}
