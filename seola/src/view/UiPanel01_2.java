package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Academy;
import service.Service_change;

public class UiPanel01_2 extends JPanel {
	private JPanel panel01 = new MyPanel01();
	public static JTextArea majortext = new JTextArea();
	public static JTextArea tributetext = new JTextArea();
	static String major;
	static String tribute;
	private JButton change_bt1;
	private JButton change_bt2;
	private JButton add_bt1;
	private JButton add_bt2;
	private JButton cancle_bt1;
	private JButton cancle_bt2;
	private Color c1 = new Color(175, 138, 125);
	private Font f1 = new Font("궁서", Font.BOLD, 20);
	Academy academy = new Academy();

	ImageIcon ui_bt[] = { new ImageIcon("img\\Change_bt.png"), new ImageIcon("img\\Change_bt_roll.png"),
			new ImageIcon("img\\Add_bt3.png"), new ImageIcon("img\\Add_bt3_roll.png"),
			new ImageIcon("img\\Cancel_bt2.png"), new ImageIcon("img\\Cancel_bt2_roll.png") };

	public UiPanel01_2() {
		setSize(515, 257);
		setVisible(true);
		setLayout(null);
		setFont(f1);
		setForeground(c1);
		setBorder(null);
		add(panel01);

		panel01.setSize(515, 257);
		panel01.setLocation(0, 0);
		panel01.setLayout(null);

		panel01.add(majortext);
		panel01.add(tributetext);

		majortext.setSize(130, 50);
		majortext.setLocation(30, 100);
		majortext.setForeground(c1);
		majortext.setFont(f1);
		majortext.setCursor(null);
		majortext.setEditable(false);
		majortext.setBackground(new Color(40, 38, 38));

		tributetext.setSize(120, 50);
		tributetext.setLocation(350, 100);
		tributetext.setForeground(c1);
		tributetext.setFont(f1);
		tributetext.setCursor(null);
		tributetext.setEditable(false);
		tributetext.setBackground(new Color(255, 38, 38));

		change_bt1 = new JButton(ui_bt[0]);
		change_bt1.setBounds(38, 200, 75, 43);
		change_bt1.setContentAreaFilled(false);
		change_bt1.setBorderPainted(false);
		change_bt1.setRolloverEnabled(true);
		change_bt1.setRolloverIcon(ui_bt[1]);
		change_bt1.addActionListener(new MyActionListener());
		panel01.add(change_bt1);
		
		change_bt2 = new JButton(ui_bt[0]);
		change_bt2.setBounds(378, 200, 75, 43);
		change_bt2.setContentAreaFilled(false);
		change_bt2.setBorderPainted(false);
		change_bt2.setRolloverEnabled(true);
		change_bt2.setRolloverIcon(ui_bt[1]);
		change_bt2.addActionListener(new MyActionListener());
		panel01.add(change_bt2);
		
		
		add_bt1 = new JButton(ui_bt[2]);
		add_bt1.setBounds(480, 190, 51, 28);
		add_bt1.setContentAreaFilled(false);
		add_bt1.setBorderPainted(false);
		add_bt1.setRolloverEnabled(true);
		add_bt1.setRolloverIcon(ui_bt[3]);
		add_bt1.addActionListener(new MyActionListener());
		
		add_bt2 = new JButton(ui_bt[2]);
		add_bt2.setBounds(480, 190, 51, 28);
		add_bt2.setContentAreaFilled(false);
		add_bt2.setBorderPainted(false);
		add_bt2.setRolloverEnabled(true);
		add_bt2.setRolloverIcon(ui_bt[3]);
		add_bt2.addActionListener(new MyActionListener());
		
		
		
		cancle_bt1 = new JButton(ui_bt[4]);
		cancle_bt1.setBounds(460, 190, 51, 28);
		cancle_bt1.setContentAreaFilled(false);
		cancle_bt1.setBorderPainted(false);
		cancle_bt1.setRolloverEnabled(true);
		cancle_bt1.setRolloverIcon(ui_bt[5]);
		cancle_bt1.addActionListener(new MyActionListener());
		
		cancle_bt2 = new JButton(ui_bt[4]);
		cancle_bt2.setBounds(460, 190, 51, 28);
		cancle_bt2.setContentAreaFilled(false);
		cancle_bt2.setBorderPainted(false);
		cancle_bt2.setRolloverEnabled(true);
		cancle_bt2.setRolloverIcon(ui_bt[5]);
		cancle_bt2.addActionListener(new MyActionListener());
	}

	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_2_change1.png").getImage();
			g.drawImage(img, 0, 0, 515, 257, null);
		}
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == change_bt1) {
				panel01.remove(change_bt1);
				panel01.add(add_bt1);
				panel01.add(cancle_bt1);
				add_bt1.setSize(51, 28);
				add_bt1.setLocation(35, 185);
				cancle_bt1.setSize(51, 28);
				cancle_bt1.setLocation(100, 185);
				majortext.setCursor(getCursor());
				major = majortext.getText();
				majortext.setText(major);
				majortext.setEditable(true);
				majortext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.majorB = true;
			}
			else if (e.getSource() == change_bt2) {
				panel01.remove(change_bt2);
				panel01.add(add_bt2);
				panel01.add(cancle_bt2);
				add_bt2.setSize(51, 28);
				add_bt2.setLocation(355, 185);
				cancle_bt2.setSize(51, 28);
				cancle_bt2.setLocation(420, 185);
				tributetext.setCursor(getCursor());
				tribute = tributetext.getText();
				tributetext.setText(tribute);
				tributetext.setEditable(true);
				tributetext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.tributeB = true;
			}
			
			else if(e.getSource() == add_bt1) {
//				if(majortext.getText().length() == 0) {
//					JOptionPane.showMessageDialog(null, "전공은 비워둘 수 없습니다.", "NAME_EMPTY_ERROR", 0 );
//				} else {
					panel01.remove(add_bt1);
					panel01.remove(cancle_bt1);
					panel01.add(change_bt1);
					change_bt1.setSize(75, 43);
					change_bt1.setLocation(38, 200);
					majortext.setCursor(null);
					majortext.setEditable(false);
					majortext.setBackground(new Color(40, 38, 38));
					majortext.setText(majortext.getText());
					revalidate();
					repaint();
					Service_change serchange = Service_change.getInstance();
					serchange.majorChange(academy);
					academy.majorB = true;
							
				}
				else if(e.getSource() == add_bt2) {
				panel01.remove(add_bt2);
				panel01.remove(cancle_bt2);
				panel01.add(change_bt2);
			}
			
			else if(e.getSource() == cancle_bt1) {
				panel01.remove(add_bt1);
				panel01.remove(cancle_bt1);
				panel01.add(change_bt1);
				change_bt1.setSize(75, 43);
				change_bt1.setLocation(38, 200);
				majortext.setCursor(null);
				majortext.setEditable(false);
				majortext.setBackground(new Color(40, 38, 38));
				majortext.setText(major);
				revalidate();
				repaint();
				academy.majorB = false;
			}

		}

	}
}
