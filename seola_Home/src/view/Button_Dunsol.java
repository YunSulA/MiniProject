package view;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import DAO.Academy_DAO_select;
import model.Academy;

public class Button_Dunsol  extends JButton implements ActionListener{
	int sno = 8;
	static ImageIcon[] img = { new ImageIcon("img//Dunsol_charback.png"),
			new ImageIcon("img//Dunsol_charback_walk1.png"), new ImageIcon("img//Dunsol_charback_walk2.png"),
			new ImageIcon("img//Dunsol_charfront.png"), new ImageIcon("img//Dunsol_charfront_walk1.png"),
			new ImageIcon("img//Dunsol_charfront_walk2.png"), new ImageIcon("img//Dunsol_charLeft.png"),
			new ImageIcon("img//Dunsol_charLeft_walk1.png"), new ImageIcon("img//Dunsol_charLeft_walk2.png"),
			new ImageIcon("img//Dunsol_charRight.png"), new ImageIcon("img//Dunsol_charRight_walk1.png"),
			new ImageIcon("img//Dunsol_charRight_walk2.png"), new ImageIcon("img//Dunsol_charfront_roll.png")
			,new ImageIcon("img//Dunsol_chair.png")};
	static JButton Dunsol = new JButton(img[13]);
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

	public Button_Dunsol() {
		// setLayout(null);
		x = 953;
		y = 365;
		Dunsol.setBounds(x, y, 156, 156);
		Dunsol.addActionListener(this);
		Dunsol.setContentAreaFilled(false);// 버튼 내용영역 안채움
		Dunsol.setFocusPainted(false);
		Dunsol.setBorderPainted(false);
		Dunsol.setRolloverEnabled(true);
		Dunsol.setRolloverIcon(img[12]);
		// add(Dunsol);
		// setResizable(false);
		Dunsol.setVisible(true);
	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		Dunsol.setRolloverEnabled(true);
		Dunsol.setRolloverIcon(imageIcon);
		Dunsol.setLocation(Dunsol.getX(), Dunsol.getY());
	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](서있는 이미지)
	// 2 6 10 - >img[10](움직임1)
	// 4 8 12 -> img[11](움직임2) 4의배수
	public void move() {
		Point point = Dunsol.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 58; i++) {

					try {
						if (i < 40) {
							if (i >= 2 && !(i % 4 == 0)) {
								Dunsol.setIcon(img[7]);
								moveButton(new Point(point.x -= 7, point.y));

							}
							if (i % 2 == 1) {
								Dunsol.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								Dunsol.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}

						} else if (i >= 40) {

							if (i >= 2 && !(i % 4 == 0)) {
								Dunsol.setIcon(img[1]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i % 2 == 1) {
								Dunsol.setIcon(img[0]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i >= 4 && i % 4 == 0) {
								Dunsol.setIcon(img[2]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i == 57) {
								Dunsol.setIcon(img[3]);
								ui_unit = new UiChange_Out();
								uipanel01_1.nametext.setText(select.selectGetName(sno));

							}
							//기본 불린 true
							//캐릭을 누르면 false
							//

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
		Point point = Dunsol.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 59; i++) {
					try {
						if (i < 20) {
							if (i >= 2 && !(i % 4 == 0)) {
								Dunsol.setIcon(img[4]);
								moveButton(new Point(point.x, point.y += 7));

							}
							if (i % 2 == 1) {
								Dunsol.setIcon(img[3]);
								moveButton(new Point(point.x, point.y += 7));
							}
							if (i >= 4 && i % 4 == 0) {
								Dunsol.setIcon(img[5]);
								moveButton(new Point(point.x, point.y += 7));
							}

						} else if (i >= 21) {

							if (i >= 2 && !(i % 4 == 0)) {
								Dunsol.setIcon(img[10]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i % 2 == 1 ) {
								Dunsol.setIcon(img[9]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								Dunsol.setIcon(img[11]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i == 58) {
								Dunsol.setIcon(img[13]);
								MainView.click = 0;
								moveButton(new Point(953, 365));
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
				Dunsol.setLocation(p);
				
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(MainView.click == 0) {
		MainView.click = sno;
		move();
		UiChange_Out.sno = sno;
		}

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
		return Dunsol;
	}
}
