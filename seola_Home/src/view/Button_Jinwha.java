package view;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import DAO.Academy_DAO_select;
import model.Academy;

public class Button_Jinwha extends JButton implements ActionListener {
	int sno = 7;
	static ImageIcon[] img = { new ImageIcon("img//Jinwha_charback.png"),
			new ImageIcon("img//Jinwha_charback_walk1.png"), new ImageIcon("img//Jinwha_charback_walk2.png"),
			new ImageIcon("img//Jinwha_charfront.png"), new ImageIcon("img//Jinwha_charfront_walk1.png"),
			new ImageIcon("img//Jinwha_charfront_walk2.png"), new ImageIcon("img//Jinwha_charLeft.png"),
			new ImageIcon("img//Jinwha_charLeft_walk1.png"), new ImageIcon("img//Jinwha_charLeft_walk2.png"),
			new ImageIcon("img//Jinwha_charRight.png"), new ImageIcon("img//Jinwha_charRihgt_walk1.png"),
			new ImageIcon("img//Jinwha_charRigth_walk2.png"), new ImageIcon("img//Jinwha_charfront_roll.png") };
	static ImageIcon img2 = new ImageIcon("img//Jinwha_charRight_walk2.png");
	static JButton jinwha = new JButton(img[3]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	Academy_DAO_select select = new Academy_DAO_select();
	Academy academy;
	UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	static boolean move = false;

	// ��ǥ ��ǥ 625 180

	public Button_Jinwha() {
		// setLayout(null);
		x = 140;
		y = 540;
		jinwha.setBounds(x, y, 156, 156);
		jinwha.addActionListener(this);
		jinwha.setContentAreaFilled(false);// ��ư ���뿵�� ��ä��
		jinwha.setFocusPainted(false);
		jinwha.setBorderPainted(false);
		jinwha.setRolloverEnabled(true);
		jinwha.setRolloverIcon(img[12]);
		// add(jinwha);
		// setResizable(false);
		jinwha.setVisible(true);

	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		jinwha.setRolloverEnabled(true);
		jinwha.setRolloverIcon(imageIcon);
		jinwha.setLocation(jinwha.getX(), jinwha.getY());

	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](���ִ� �̹���)
	// 2 6 10 - >img[10](������1)
	// 4 8 12 -> img[11](������2) 4�ǹ��
	public void move() {
		Point point = jinwha.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 73; i++) {

					try {
						if (i < 39) {
							if (i >= 2 && !(i % 4 == 0)) {
								jinwha.setIcon(img[10]);
								moveButton(new Point(point.x += 7, point.y));

							}
							if (i % 2 == 1) {
								jinwha.setIcon(img[9]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								jinwha.setIcon(img[11]);
								moveButton(new Point(point.x += 7, point.y));
							}

						} else if (i >= 40) {
							if (i >= 2 && !(i % 4 == 0)) {
								jinwha.setIcon(img[1]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i % 2 == 1) {
								jinwha.setIcon(img[0]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i >= 4 && i % 4 == 0) {
								jinwha.setIcon(img[2]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i == 72) {
								jinwha.setIcon(img[3]);
								ui_unit = new UiChange_Out();
								uipanel01_1.nametext.setText(select.selectGetName(sno));
								uipanel01_1.birthtext.setText(select.selectGetBirth(sno));
								

							}
							
							 
							 
							
							

						}
						Thread.sleep(delay);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}

			}
		};
		t = new Thread(r);
		t.start();
		// ������ ����??
	}

	public static void move2() {
		Point point = jinwha.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 73; i++) {
					try {
						if (i < 35) {
							if (i >= 2 && !(i % 4 == 0)) {
								jinwha.setIcon(img[4]);
								moveButton(new Point(point.x, point.y += 7));
							}
							if (i % 2 == 1) {
								jinwha.setIcon(img[3]);
								moveButton(new Point(point.x, point.y += 7));
							}
							if (i >= 4 && i % 4 == 0) {
								jinwha.setIcon(img[5]);
								moveButton(new Point(point.x, point.y += 7));
							}

						} else if (i >= 34) {
							if (i >= 2 && !(i % 4 == 0)) {
								jinwha.setIcon(img[7]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i % 2 == 1 && i < 70) {
								jinwha.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								jinwha.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i == 72) {
								jinwha.setIcon(img[3]);
								
							}

						}
						Thread.sleep(delay);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		};
		t2 = new Thread(r);
		t2.start();
	}

	private static void moveButton(Point p) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				jinwha.setLocation(p);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		UiChange_Out.sno = sno;
		
		
//		uipanel01_1.nametext.setText(select.selectGetName(sno));
//		System.out.println(select.selectGetName(sno));
	}
	
	
	public void select() {
		
	}
	

//	public void select() {
//		select = new Academy_DAO_select();
//		for (int i = 0; sno != select.sno[i]; i++) {
//			if (sno == select.sno[i+1]) {
//				select.move = true;
//				uipanel01_1.nametext.setText(select.name[i+1]);
//				uipanel01_1.birthtext.setText(" " + select.birth[i+1]);
//				uipanel01_1.teltext.setText(select.tel[i+1]);
//				uipanel01_1.addresstext.setText("     " + select.address[i+1]);
//			}
//
//		}
//	}

	public JButton getButton() {
		return jinwha;
	}

}