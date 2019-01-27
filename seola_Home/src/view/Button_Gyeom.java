package view;

import java.awt.Button;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import DAO.Academy_DAO;
import model.Academy;
import service.Service_select;

public class Button_Gyeom extends Button implements ActionListener {
	int sno = 6;
	static ImageIcon[] img = { new ImageIcon("img//Gyeom_charback.png"),
			new ImageIcon("img//Gyeom_charback_walk1.png"), new ImageIcon("img//Gyeom_charback_walk2.png"),
			new ImageIcon("img//Gyeom_charfront.png"), new ImageIcon("img//Gyeom_charfront_walk1.png"),
			new ImageIcon("img//Gyeom_charfront_walk2.png"), new ImageIcon("img//Gyeom_charLeft.png"),
			new ImageIcon("img//Gyeom_charLeft_walk1.png"), new ImageIcon("img//Gyeom_charLeft_walk2.png"),
			new ImageIcon("img//Gyeom_charRight.png"), new ImageIcon("img//Gyeom_charRight_walk1.png"),
			new ImageIcon("img//Gyeom_charRight_walk2.png"), new ImageIcon("img//Gyeom_charfront_roll.png")
			,new ImageIcon("img//Gyeom_chair.png")};
	static JButton Gyeom = new JButton(img[13]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	Academy_DAO select ;
	static Academy academy;
	UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	UiPanel01_2 uipanel01_2 = new UiPanel01_2();
	

	public Button_Gyeom() {
		// setLayout(null);
		x = 264;
		y = 540;
		Gyeom.setBounds(x, y, 156, 156);
		Gyeom.addActionListener(this);
		Gyeom.setContentAreaFilled(false);// 버튼 내용영역 안채움
		Gyeom.setFocusPainted(false);
		Gyeom.setBorderPainted(false);
		Gyeom.setRolloverEnabled(true);
		Gyeom.setRolloverIcon(img[12]);
		// add(Gyeom);
		// setResizable(false);
		Gyeom.setVisible(true);
	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		Gyeom.setRolloverEnabled(true);
		Gyeom.setRolloverIcon(imageIcon);
		Gyeom.setLocation(Gyeom.getX(), Gyeom.getY());
	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](서있는 이미지)
	// 2 6 10 - >img[10](움직임1)
	// 4 8 12 -> img[11](움직임2) 4의배수
	public void move() {
		Point point = Gyeom.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 58; i++) {

					try {
						if (i < 28) {
							if (i >= 2 && !(i % 4 == 0)) {
								Gyeom.setIcon(img[10]);
								moveButton(new Point(point.x += 7, point.y));

							}
							if (i % 2 == 1) {
								Gyeom.setIcon(img[9]);
								moveButton(new Point(point.x += 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								Gyeom.setIcon(img[11]);
								moveButton(new Point(point.x += 7, point.y));
							}

						} else if (i >= 28) {

							if (i >= 2 && !(i % 4 == 0)) {
								Gyeom.setIcon(img[1]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i % 2 == 1) {
								Gyeom.setIcon(img[0]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i >= 4 && i % 4 == 0) {
								Gyeom.setIcon(img[2]);
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (i == 57) {
								Gyeom.setIcon(img[3]);
								ui_unit = new UiChange_Out();
								Academy academy = new Academy();
								Service_select serSelect = Service_select.getInstance();
								serSelect.select(academy);

								uipanel01_1.nametext.setText(Academy_DAO.selectname);
								uipanel01_1.birthtext.setText(Academy_DAO.selectbirth);
								uipanel01_1.teltext.setText(Academy_DAO.selecttel);
								uipanel01_1.addresstext.setText(Academy_DAO.selectaddress);
								uipanel01_2.majortext.setText(Academy_DAO.selectmajor);
								uipanel01_2.tributetext.setText(Academy_DAO.selecttribute);
								uipanel01_2.itcourseBoolean();

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
		Point point = Gyeom.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 58; i++) {
					try {
						if (i < 30) {
							if (i >= 2 && !(i % 4 == 0)) {
								Gyeom.setIcon(img[4]);
								moveButton(new Point(point.x, point.y += 7));

							}
							if (i % 2 == 1) {
								Gyeom.setIcon(img[3]);
								moveButton(new Point(point.x, point.y += 7));
							}
							if (i >= 4 && i % 4 == 0) {
								Gyeom.setIcon(img[5]);
								moveButton(new Point(point.x, point.y += 7));
							}

						} else if (i >= 30) {

							if (i >= 2 && !(i % 4 == 0)) {
								Gyeom.setIcon(img[7]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i % 2 == 1 ) {
								Gyeom.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								Gyeom.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i == 57) {
								Gyeom.setIcon(img[13]);
								MainView.click = 0;
								moveButton(new Point(264, 540));
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
				Gyeom.setLocation(p);
				
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(MainView.click == 0) {
		move();
		MainView.click = sno;	//움직이고 있는지 여부(움직일땐 다른캐릭터 클릭불가)
		UiChange_Out.sno = sno;	//Ui가 닫히면 돌아갈 캐릭터가 몇번인지
		Academy.button_check = sno;	//버튼 눌렀는지 여부
		
		
		}

	}

	public JButton getButton() {
		return Gyeom;
	}

}
