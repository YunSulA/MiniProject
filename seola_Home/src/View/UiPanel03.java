package View;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import View.UiPanel01.MyActionListener;
import View.UiPanel01.MyPanel01;

public class UiPanel03 extends JPanel {
	private JPanel panel03 = new MyPanel03();
	private UiChange  win;
	private JButton menu1 ;
	private JButton menu2 ;
	private JButton menu3 ;
	private JButton menu4 ;
	

	public UiPanel03(UiChange win) {
		this.win = win;
		setSize(750,540);
		setVisible(true);
		setLayout(null);
		add(panel03);
		
	
		panel03.setSize(750,540);
		panel03.setLayout(null);
		
		
		menu1 = new JButton();
		menu1.setBounds(40, 40, 140, 80);	
		menu1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu1.setFocusPainted(false);
		menu1.setBorderPainted(false);
		panel03.add(menu1);
		
		menu2 =  new JButton();
		menu2.setBounds(40, 160, 140, 80);	
		menu2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu2.setFocusPainted(false);
		menu2.setBorderPainted(false);
		panel03.add(menu2);
		
		menu3 =  new JButton();
		menu3.setBounds(40, 300, 140, 80);	
		menu3.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu3.setFocusPainted(false);
		menu3.setBorderPainted(false);
		panel03.add(menu3);
		
		menu4 =  new JButton();
		menu4.setBounds(40, 420, 140, 80);	
		menu4.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu4.setFocusPainted(false);
		menu4.setBorderPainted(false);
		panel03.add(menu4);
		
		menu1.addActionListener(new MyActionListener());
		menu2.addActionListener(new MyActionListener());
		menu3.addActionListener(new MyActionListener());
		menu4.addActionListener(new MyActionListener());
	}
	
	class MyPanel03 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_3.png").getImage();
			g.drawImage(img, 0, 0, 750, 540, null);
		}
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == menu1) {
				win.change("uipanel01");
			}
			else if (e.getSource() == menu2) {
				win.change("uipanel02");
			}
			else if (e.getSource() == menu3) {
				win.change("uipanel03");
			}
			else if (e.getSource() == menu4) {
				win.change("uipanel04");
			}
		}

	}
}
