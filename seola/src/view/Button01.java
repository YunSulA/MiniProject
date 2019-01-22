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
import javax.swing.SwingUtilities;

import DAO.Academy_DAO_select;
import model.Academy;

/* 버튼이 움직이면 버튼안의 이미지가 바뀜
 * 
 */
public class Button01 extends JButton implements ActionListener {

	static ImageIcon[] img = { new ImageIcon("img//Guhyup_charback.png"),
			new ImageIcon("img//Guhyup_charback_walk1.png"), new ImageIcon("img//Guhyup_charback_walk2.png"),
			new ImageIcon("img//Guhyup_charfront.png"), new ImageIcon("img//Guhyup_charfront_walk1.png"),
			new ImageIcon("img//Guhyup_charfront_walk2.png"), new ImageIcon("img//Guhyup_charLeft.png"),
			new ImageIcon("img//Guhyup_charLeft_walk1.png"),
			new ImageIcon("img//Guhyup_charLeft_walk2.png"), new ImageIcon("img//Guhyup_charRight.png"),
			new ImageIcon("img//Guhyup_charRight_walk1.png"),
			new ImageIcon("img//Guhyup_charRight_walk2.png"),
			new ImageIcon("img//Guhyup_charfront_roll.png")
	};
	Image Backgraound = new ImageIcon("img//back.png").getImage();
	static JButton chung = new JButton(img[3]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	static int telnum;
	TelSave telsave;
	Academy_DAO_select select = new Academy_DAO_select();
	Academy academy ;
	private UiChange  win ;
	UiPanel01 uipanel01 = new UiPanel01(win);
	
	
	
	//구협좌석 좌표 793 , 540
	//목표 좌표 625 180
	
	public Button01() {
		//setLayout(null);
		x = 793;
		y = 540;
		chung.setBounds(x, y, 156, 156);
		chung.addActionListener(this);
		chung.setContentAreaFilled(false);// 버튼 내용영역 안채움
		chung.setFocusPainted(false);
		chung.setBorderPainted(false);
		chung.setRolloverEnabled(true);
		chung.setRolloverIcon(img[12]);
		//add(chung);
		//setResizable(false);
		chung.setVisible(true);	

	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		chung.setRolloverEnabled(true);
		chung.setRolloverIcon(imageIcon);
		chung.setLocation(chung.getX(), chung.getY());

	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](서있는 이미지)
	// 2 6 10 - >img[10](움직임1)
	// 4 8 12 -> img[11](움직임2) 4의배수
	public void move() {
		Point point = chung.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 52; i++) {

					try {
						if (i < 16) {
							if (i >= 2 && !(i % 4 == 0)) {
								chung.setIcon(img[7]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i % 2 == 1) {
								chung.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								chung.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}

						} else if (i >= 17) {

							if (i >= 2 && !(i % 4 == 0) ) {
								chung.setIcon(img[1]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i % 2 == 1 ) {
								chung.setIcon(img[0]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i >= 4 && i % 4 == 0) {
								chung.setIcon(img[2]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i == 51) {
								chung.setIcon(img[3]);
								ui_unit = new UiChange_Out();

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
		Point point = chung.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {
			
					for (int i = 0; i < 52; i++) {
						try {
							if (i < 37) {
								if (i >= 2 && !(i % 4 == 0)) {
									chung.setIcon(img[4]);
									moveButton(new Point(point.x, point.y += 7));
								}
								if (i % 2 == 1) {
									chung.setIcon(img[3]);
									moveButton(new Point(point.x, point.y += 7));
								}
								if (i >= 4 && i % 4 == 0) {
									chung.setIcon(img[5]);
									moveButton(new Point(point.x, point.y += 7));
								}

							} else if (i >= 37) {

								if (i >= 2 && !(i % 4 == 0) ) {
									chung.setIcon(img[10]);
									moveButton(new Point(point.x += 7, point.y));
								}
								if (i % 2 == 1 && i < 50) {
									chung.setIcon(img[9]);
									moveButton(new Point(point.x += 7, point.y));
								}
								if (i >= 4 && i % 4 == 0 ) {
									chung.setIcon(img[11]);
									moveButton(new Point(point.x += 7, point.y));
								}
								if( i == 51) {
									chung.setIcon(img[3]);
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
				chung.setLocation(p);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == chung && chung.getX() == 793) {
			move();
			int stdno = select.stdno[0];
			uipanel01.namelabel.setText(stdno + "");
		}

	}

	public JButton getButton() {
		return chung;
	}

}

