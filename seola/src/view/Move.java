package view;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Move implements ActionListener {
	static ButtonAll btall = new ButtonAll();
	static List<JButton> btlist = btall.getButton();
	JPanel panel = new JPanel();
	static Point originpoint;
	static Point point;
	static int x = 530;
	static int y = 180;
	static Thread t, t2;
	static int i = 0;
	static int sno = 1;
	static boolean movecheck = false;
	static UiChange_Out ui_unit;

	Move() {
//		setVisible(true);
//		setSize(1244, 950);
//		setLocation(100, 0);
//		setLayout(null);
//		add(panel);
//		panel.setLayout(null);
//		panel.setSize(1244, 956);
//		panel.setLocation(0, 0);

		// Image img = new ImageIcon("img//Add_bt_roll.png").getImage();
//		JLabel l = new JLabel(new ImageIcon("img//Add_bt_roll.png"));
//		panel.add(l);
//		l.setSize(500,500);
//		l.setLocation(0,0);

		for (int i = 0; i < btlist.size(); i++) {
			panel.add(btlist.get(i));
			btlist.get(i).addActionListener(this);
		}
		

	}

	public static void move1() {
		originpoint = btlist.get(sno - 1).getLocation();
		point = btlist.get(sno - 1).getLocation();
		final int delay = 60;
		int btx = btlist.get(sno - 1).getX();// 왼쪽 오른쪽 나누기
		int bty = btlist.get(sno - 1).getY();
		System.out.println(btlist.get(sno - 1).getX());
		Runnable r = new Runnable() {
			@Override
			public void run() {
				if (btx <= 400) {
					for (int i = 0; point.x < x; i++) {
						try {
							if (i >= 2 && !(i % 4 == 0)) {
								moveButton(new Point(point.x += 7, point.y));
							} else if (i % 2 == 1) {
								moveButton(new Point(point.x += 7, point.y));
							} else if (i >= 4 && i % 4 == 0) {
								moveButton(new Point(point.x += 7, point.y));
							}
							if (sno - 1 != 0 && point.x < 7) {
								break;
							}
							Thread.sleep(delay);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
						movecheck = true;
					}
				} else if (btx > 400) {
					i = 0;
					for (i = 0; point.x > x; i++) {
						try {
							if (i >= 2 && !(i % 4 == 0)) {
								moveButton(new Point(point.x -= 7, point.y));
							} else if (i % 2 == 1) {
								moveButton(new Point(point.x -= 7, point.y));
							} else if (i >= 4 && i % 4 == 0) {
								moveButton(new Point(point.x -= 7, point.y));
							}
							if (point.x < 7) {
								break;
							}

							Thread.sleep(delay);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
						movecheck = true;
					}

				}
				if (movecheck == true) {
					for (int i = 0; point.y > y; i++) {
						try {
							if (i >= 2 && !(i % 4 == 0)) {
								moveButton(new Point(point.x, point.y -= 7));
							} else if (i % 2 == 1) {
								moveButton(new Point(point.x, point.y -= 7));
							} else if (i >= 4 && i % 4 == 0) {
								moveButton(new Point(point.x, point.y -= 7));
							}
							if (point.y < 7) {
								break;
							}
							Thread.sleep(delay);
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}

					}
					ui_unit = new UiChange_Out();
				}
			}
		};
		t = new Thread(r);
		t.start();
		// 쓰레드 종료??
	}

	public static void move2() {
		//Point point = btlist.get(sno - 1).getLocation();
		System.out.println(point);
		System.out.println(originpoint);
		final int delay = 60;
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; point.y != originpoint.y; i++) {
					try {
						if (i >= 2 && !(i % 4 == 0)) {
							if(point.y == originpoint.y) {
								break;
							}
							System.out.println("확인");
							moveButton(new Point(point.x, point.y += 7));
							System.out.println(point);
							
						}
						if (i % 2 == 1) {
							if(point.y == originpoint.y) {
								break;
							}
							System.out.println("확인2");
							moveButton(new Point(point.x, point.y += 7));
							
						}
						if (i >= 4 && i % 4 == 0) {
							if(point.y == originpoint.y) {
								break;
							}
							System.out.println("확인3");
							moveButton(new Point(point.x, point.y += 7));
							
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
				btlist.get(sno - 1).setLocation(p);
				System.out.println(sno + "  움직임");
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// "i번째 버튼을 클릭하면"
		if (MainView.click == 0) {
			for (int i = 0; i < btlist.size(); i++) {
				if (e.getSource() == btlist.get(i)) {
					System.out.println(i + "번째 버튼 클릭");
					sno = i + 1;
					MainView.click = sno;
					
					move1();
					break;
				}
			}

		}
	}

	public static List<JButton> getButton() {
		return btlist;
	}

	public static void main(String[] args) {
		new Move();
	}
}
