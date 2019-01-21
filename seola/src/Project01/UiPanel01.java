package Project01;


import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Project01.UiPanel03.MyActionListener;



public class UiPanel01 extends JPanel {
	private JPanel panel01 = new MyPanel01();
	private UiChange  win;
	private JButton menu1 ;
	private JButton menu2 ;
	private JButton menu3 ;
	private JButton menu4 ;
	private JButton change_bt;
	
	
	Image background[] = { new ImageIcon("C:\\mini\\UI.png").getImage(), new ImageIcon("img\\UI01_1.png").getImage(),
			new ImageIcon("img\\UI02.png").getImage(), };

	public UiPanel01(UiChange win) {
		this.win = win;
		setSize(750,540);
		setVisible(true);
		setLayout(null);
		add(panel01);
		
	
		panel01.setSize(750,540);
		panel01.setLayout(null);
		
		
		menu1 = new JButton();
		menu1.setBounds(60, 100, 100, 60);	
		menu1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu1.setFocusPainted(false);
		menu1.setBorderPainted(false);
		panel01.add(menu1);
		
		menu2 =  new JButton();
		menu2.setBounds(60, 200, 100, 60);	
		menu2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		menu2.setFocusPainted(false);
		menu2.setBorderPainted(false);
		panel01.add(menu2);
		
		menu3 =  new JButton();
		menu3.setBounds(60, 300, 100, 60);	
		menu3.setContentAreaFilled(true);// 버튼 내용영역 안채움
		menu3.setFocusPainted(false);
		menu3.setBorderPainted(false);
		panel01.add(menu3);
		
		menu4 =  new JButton();
		menu4.setBounds(60, 400, 100, 60);	
		menu4.setContentAreaFilled(true);// 버튼 내용영역 안채움
		menu4.setFocusPainted(false);
		menu4.setBorderPainted(false);
		panel01.add(menu4);
		
		menu1.addActionListener(new MyActionListener());
		menu2.addActionListener(new MyActionListener());
		menu3.addActionListener(new MyActionListener());
		menu4.addActionListener(new MyActionListener());
		
		
		change_bt = new JButton();
		change_bt.setBounds(390, 210, 50, 30);
		panel01.add(change_bt);
		change_bt.addActionListener(new MyActionListener());
		
//		TextPanel01 textpanel = new TextPanel01();
//		add(textpanel);
//		textpanel.setSize(500,250);
//		textpanel.setVisible(true);
				
	}

	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_1.png").getImage();
			g.drawImage(img, 0, 0, 750, 500, null);
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
			else if (e.getSource() == change_bt) {
				System.out.println("적용");
				panel01.remove(change_bt);
				TextPanel01 textpanel = new TextPanel01();
				add(textpanel);
				textpanel.setSize(500,500);
				textpanel.setVisible(true);
			}
			
			
		}

	}
//	public static void main(String[] args) {
//		UiPanel01 e = new UiPanel01(win);
//		win.setTitle("test");
//		win.setSize(750,540);
//		win.setVisible(true);
//		win.add(e);
//	}

}

class TextPanel01	extends JPanel{
	
	public TextPanel01() {
	setSize(500, 200);
	setLocation(230,30);
	setVisible(true);
	setLayout(null);
	
	JTextField nameTextField =  new JTextField();
	add(nameTextField);
	nameTextField.setSize(100,50);
	nameTextField.setLocation(10,90);
	
	JTextField birthTextField =  new JTextField();
	add(birthTextField);
	birthTextField.setSize(110,50);
	birthTextField.setLocation(135,90);
	
	JTextField telTextField =  new JTextField();
	add(telTextField);
	telTextField.setSize(105,80);
	telTextField.setLocation(270,60);
	
	
	JTextField addressTextField =  new JTextField();
	add(addressTextField);
	addressTextField.setSize(100,80);
	addressTextField.setLocation(390,70);
	
	}
	
}
