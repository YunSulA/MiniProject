package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import DAO.Academy_DAO_select;
import model.Academy;

/* 버튼이 움직이면 버튼안의 이미지가 바뀜
 * 
 */
public class Button_Guhyup extends JButton implements ActionListener {
	int sno = 1;
	static ImageIcon[] img = { new ImageIcon("img//Guhyup_charback.png"),
			new ImageIcon("img//Guhyup_charback_walk1.png"), new ImageIcon("img//Guhyup_charback_walk2.png"),
			new ImageIcon("img//Guhyup_charfront.png"), new ImageIcon("img//Guhyup_charfront_walk1.png"),
			new ImageIcon("img//Guhyup_charfront_walk2.png"), new ImageIcon("img//Guhyup_charLeft.png"),
			new ImageIcon("img//Guhyup_charLeft_walk1.png"), new ImageIcon("img//Guhyup_charLeft_walk2.png"),
			new ImageIcon("img//Guhyup_charRight.png"), new ImageIcon("img//Guhyup_charRight_walk1.png"),
			new ImageIcon("img//Guhyup_charRight_walk2.png"), new ImageIcon("img//Guhyup_charfront_roll.png") };
	static JButton guhyup = new JButton(img[3]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	Academy_DAO_select select = new Academy_DAO_select();
	Academy academy;
	UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	static boolean move = false;

	// 구협좌석 좌표 700 , 540
	// 목표 좌표 625 180

	public Button_Guhyup() {
		// setLayout(null);
		x = 700;
		y = 540;
		guhyup.setBounds(x, y, 156, 156);
		guhyup.addActionListener(this);
		guhyup.setContentAreaFilled(false);// 버튼 내용영역 안채움
		guhyup.setFocusPainted(false);
		guhyup.setBorderPainted(false);
		guhyup.setRolloverEnabled(true);
		guhyup.setRolloverIcon(img[12]);
		// add(guhyup);
		// setResizable(false);
		guhyup.setVisible(true);
	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		guhyup.setRolloverEnabled(true);
		guhyup.setRolloverIcon(imageIcon);
		guhyup.setLocation(guhyup.getX(), guhyup.getY());
	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](서있는 이미지)
	// 2 6 10 - >img[10](움직임1)
	// 4 8 12 -> img[11](움직임2) 4의배수
	public void move() {
		Point point = guhyup.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 52; i++) {

					try {
						if (i < 16) {
							if (i >= 2 && !(i % 4 == 0)) {
								guhyup.setIcon(img[7]);
								moveButton(new Point(point.x -= 7, point.y));

							}
							if (i % 2 == 1) {
								guhyup.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								guhyup.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}

						} else if (i >= 17) {

							if (i >= 2 && !(i % 4 == 0)) {
								guhyup.setIcon(img[1]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i % 2 == 1) {
								guhyup.setIcon(img[0]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i >= 4 && i % 4 == 0) {
								guhyup.setIcon(img[2]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i == 51) {
								guhyup.setIcon(img[3]);
								ui_unit = new UiChange_Out();
								uipanel01_1.nametext.setText(select.selectGetName(sno));

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
		// 쓰레드 종료??
	}

	public static void move2() {
		Point point = guhyup.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 52; i++) {
					try {
						if (i < 37) {
							if (i >= 2 && !(i % 4 == 0)) {
								guhyup.setIcon(img[4]);
								moveButton(new Point(point.x, point.y += 7));

							}
							if (i % 2 == 1) {
								guhyup.setIcon(img[3]);
								moveButton(new Point(point.x, point.y += 7));
							}
							if (i >= 4 && i % 4 == 0) {
								guhyup.setIcon(img[5]);
								moveButton(new Point(point.x, point.y += 7));
							}

						} else if (i >= 37) {

							if (i >= 2 && !(i % 4 == 0)) {
								guhyup.setIcon(img[10]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i % 2 == 1 && i < 50) {
								guhyup.setIcon(img[9]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								guhyup.setIcon(img[11]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i == 51) {
								guhyup.setIcon(img[3]);
								move = true;

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
				guhyup.setLocation(p);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		UiChange_Out.sno = sno;

	}

//	public void select() {
//		select = new Academy_DAO_select();
//		for (int i = 0; sno != select.sno[i]; i++) {
//			if (sno == select.sno[i]) {
//				select.move = true;
//				uipanel01_1.nametext.setText(select.name[i]);
//				uipanel01_1.birthtext.setText(" " + select.birth[i]);
//				uipanel01_1.teltext.setText(select.tel[i]);
//				uipanel01_1.addresstext.setText("     " + select.address[i]);
//
//			}
//
//		}

	public JButton getButton() {
		return guhyup;
	}

	public int getSno() {
		return sno;
	}

}
