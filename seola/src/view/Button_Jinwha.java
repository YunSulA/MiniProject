package view;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import DAO.Academy_DAO;
import DAO.Academy_DAO_select;
import model.Academy;
import service.Service_select;

public class Button_Jinwha extends JButton implements ActionListener {
	int sno = 7;
	static ImageIcon[] img = { new ImageIcon("img//Jinwha_charback.png"),
			new ImageIcon("img//Jinwha_charback_walk1.png"), new ImageIcon("img//Jinwha_charback_walk2.png"),
			new ImageIcon("img//Jinwha_charfront.png"), new ImageIcon("img//Jinwha_charfront_walk1.png"),
			new ImageIcon("img//Jinwha_charfront_walk2.png"), new ImageIcon("img//Jinwha_charLeft.png"),
			new ImageIcon("img//Jinwha_charLeft_walk1.png"), new ImageIcon("img//Jinwha_charLeft_walk2.png"),
			new ImageIcon("img//Jinwha_charRight.png"), new ImageIcon("img//Jinwha_charRihgt_walk1.png"),
			new ImageIcon("img//Jinwha_charRigth_walk2.png"), new ImageIcon("img//Jinwha_charfront_roll.png"),
			new ImageIcon("img//Jinwha_chair.png") };

	static JButton jinwha = new JButton(img[13]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	Academy_DAO_select select = new Academy_DAO_select();
	Academy academy;
	UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	static UiPanel01_2 uipanel01_2 = new UiPanel01_2();
	static boolean move = false;
	static List<String> itcourselist = new ArrayList<String>();
	static int j = 0;
	static String itcourses = ""; // 초기 널값대신 넣어줌

	// 목표 좌표 625 180

	public Button_Jinwha() {
		// setLayout(null);
		x = 135;
		y = 540;
		jinwha.setBounds(x, y, 156, 156);
		jinwha.addActionListener(this);
		jinwha.setContentAreaFilled(false);// 버튼 내용영역 안채움
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
	// 1 3 5 7 9 11 -> img[9](서있는 이미지)
	// 2 6 10 - >img[10](움직임1)
	// 4 8 12 -> img[11](움직임2) 4의배수
	public void move() {
		Point point = jinwha.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 74; i++) {

					try {
						if (i < 40) {
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
							if (i == 73) {
								jinwha.setIcon(img[3]);
								ui_unit = new UiChange_Out();
								Academy academy = new Academy();
								Service_select serSelect = Service_select.getInstance();
								serSelect.select(academy);
								uipanel01_1.nametext.setText(Academy_DAO.selectname);
								uipanel01_1.birthtext.setText( Academy_DAO.selectbirth);
								uipanel01_1.teltext.setText(Academy_DAO.selecttel);
								uipanel01_1.addresstext.setText( Academy_DAO.selectaddress);
								uipanel01_2.majortext.setText(Academy_DAO.selectmajor);
								uipanel01_2.tributetext.setText(Academy_DAO.selecttribute);	
								uipanel01_2.itcourseBoolean();
								uipanel01_2.itcourseSave();
								
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
		Point point = jinwha.getLocation();
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < 74; i++) {
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
							if (i % 2 == 1) {
								jinwha.setIcon(img[6]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i >= 4 && i % 4 == 0) {
								jinwha.setIcon(img[8]);
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (i == 73) {
								jinwha.setIcon(img[13]);
								MainView.click = 0;
								moveButton(new Point(135, 540));

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
		if (MainView.click == 0) {
			move();
			MainView.click = sno; // 캐릭터가 움직이고있는지 여부(움직이고있으면 다른캐릭터 클릭불가)
			UiChange_Out.sno = sno;// Ui가 닫히고 돌아갈 캐릭터의 sno 저장
			Academy.button_check = sno;// 버튼을 눌렀는지 여부
		}

	}


	public JButton getButton() {
		return jinwha;
	}

}
