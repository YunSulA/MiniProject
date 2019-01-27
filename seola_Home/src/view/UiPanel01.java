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
	public static UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	public static UiPanel01_2 uipanel01_2 = new UiPanel01_2();
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
		panel01.add(uipanel01_2);

		uipanel01_1.setSize(515, 257);
		uipanel01_1.setLocation(223, 8);
		
		uipanel01_2.setSize(515,257);
		uipanel01_2.setLocation(221, 272);

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

