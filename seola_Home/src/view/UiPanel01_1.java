package view;

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

import model.Academy;
import service.Service_change;
import view.UiPanel01_1.MyActionListener;
import view.UiPanel01_1.MyPanel01;

public class UiPanel01_1 extends JPanel{
	private JPanel panel01 = new MyPanel01();
	public static JTextArea nametext = new JTextArea();
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
			new ImageIcon("img\\Add_bt3.png"), new ImageIcon("img\\Add_bt3_roll.png"),  new ImageIcon("img\\Cancel_bt2.png"), new ImageIcon("img\\Cancel_bt2_roll.png")};

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
		add_bt1.setBounds(430, 190, 51, 28);
		add_bt1.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt1.setBorderPainted(false);
		add_bt1.setRolloverEnabled(true);
		add_bt1.setRolloverIcon(ui_bt[3]);
		add_bt1.addActionListener(new MyActionListener());
		

		add_bt2 = new JButton(ui_bt[2]);
		add_bt2.setBounds(480, 190, 51, 28);
		add_bt2.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt2.setBorderPainted(false);
		add_bt2.setRolloverEnabled(true);
		add_bt2.setRolloverIcon(ui_bt[3]);
		add_bt2.addActionListener(new MyActionListener());
		

		add_bt3 = new JButton(ui_bt[2]);
		add_bt3.setBounds(530, 190, 51, 28);
		add_bt3.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt3.setBorderPainted(false);
		add_bt3.setRolloverEnabled(true);
		add_bt3.setRolloverIcon(ui_bt[3]);
		add_bt3.addActionListener(new MyActionListener());
		

		add_bt4 = new JButton(ui_bt[2]);
		add_bt4.setBounds(580, 190, 51, 28);
		add_bt4.setContentAreaFilled(false);// 버튼 내용영역 안채움
		add_bt4.setBorderPainted(false);
		add_bt4.setRolloverEnabled(true);
		add_bt4.setRolloverIcon(ui_bt[3]);
		add_bt4.addActionListener(new MyActionListener());
		
		
		cancel_bt1 = new JButton(ui_bt[4]);
		cancel_bt1 .setBounds(460, 190, 51, 28);
		cancel_bt1 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt1 .setBorderPainted(false);
		cancel_bt1 .setRolloverEnabled(true);
		cancel_bt1 .setRolloverIcon(ui_bt[5]);
		cancel_bt1 .addActionListener(new MyActionListener());

		cancel_bt2 = new JButton(ui_bt[4]);
		cancel_bt2 .setBounds(510, 190, 51, 28);
		cancel_bt2 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt2 .setBorderPainted(false);
		cancel_bt2 .setRolloverEnabled(true);
		cancel_bt2 .setRolloverIcon(ui_bt[5]);
		cancel_bt2 .addActionListener(new MyActionListener());
		
		cancel_bt3 = new JButton(ui_bt[4]);
		cancel_bt3 .setBounds(560, 190, 51, 28);
		cancel_bt3 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt3 .setBorderPainted(false);
		cancel_bt3 .setRolloverEnabled(true);
		cancel_bt3 .setRolloverIcon(ui_bt[5]);
		cancel_bt3 .addActionListener(new MyActionListener());
		
		cancel_bt4 = new JButton(ui_bt[4]);
		cancel_bt4 .setBounds(610, 190, 51, 28);
		cancel_bt4 .setContentAreaFilled(false);// 버튼 내용영역 안채움
		cancel_bt4 .setBorderPainted(false);
		cancel_bt4 .setRolloverEnabled(true);
		cancel_bt4 .setRolloverIcon(ui_bt[5]);
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
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == change_bt1) {
				panel01.remove(change_bt1);
				panel01.add(add_bt1);
				panel01.add(cancel_bt1);
				add_bt1.setSize(51,28);
				add_bt1.setLocation(25,205);
				cancel_bt1.setSize(51,28);
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
				add_bt2.setSize(51,28);
				add_bt2.setLocation(150,205);
				cancel_bt2.setSize(51,28);
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
				add_bt3.setSize(51,28);
				add_bt3.setLocation(279,205);
				cancel_bt3.setSize(51,28);
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
				add_bt4.setSize(51,28);
				add_bt4.setLocation(394,205);
				cancel_bt4.setSize(51,28);
				cancel_bt4.setLocation(448,205);
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
				academy = new Academy();
				Service_change serchange = Service_change.getInstance();
				serchange.nameChange(academy);
				academy.nameB = false;
				
				
				
				
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
				academy = new Academy(birthtext.getText());
				academy.birthB = false;
				
				
				
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
				academy = new Academy(teltext.getText());
				academy.telB = false;
				
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
				academy = new Academy(addresstext.getText());
				academy.addressB = false;
				
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
