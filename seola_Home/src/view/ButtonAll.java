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
import model.Academy;
import service.Service_select;

public class ButtonAll extends JButton implements ActionListener {
	
	static int[] x1 =  { 5, 137, 264, 394, 695, 823, 953, 1080 };
	static int[] y1 =  { 365 ,537 ,700 };


	/*
	 * 365 5 137 264 394 695 823 953 1080 
	 * 537 5 137 264 394 695 823 953 1080
	 * 700 5 137 264 394 695 823 953 1080
	 * 
	 */
	// 5 / 137 / 264 / 394 / 695 / 823 / 953 / 1080
	// 1�� 365
	// 2�� 537
	// 3�� 700

	static int sno = 8;
	static ImageIcon[] img = { new ImageIcon("img//Dunsol_charback.png"),
			new ImageIcon("img//Dunsol_charback_walk1.png"), new ImageIcon("img//Dunsol_charback_walk2.png"),
			new ImageIcon("img//Dunsol_charfront.png"), new ImageIcon("img//Dunsol_charfront_walk1.png"),
			new ImageIcon("img//Dunsol_charfront_walk2.png"), new ImageIcon("img//Dunsol_charLeft.png"),
			new ImageIcon("img//Dunsol_charLeft_walk1.png"), new ImageIcon("img//Dunsol_charLeft_walk2.png"),
			new ImageIcon("img//Dunsol_charRight.png"), new ImageIcon("img//Dunsol_charRight_walk1.png"),
			new ImageIcon("img//Dunsol_charRight_walk2.png"), new ImageIcon("img//Dunsol_charfront_roll.png"),
			new ImageIcon("img//Dunsol_chair.png") };
	static JButton Dunsol = new JButton(img[13]);
	int x, y;
	Thread t;
	static Thread t2;
	UiChange_Out ui_unit;
	Academy_DAO select;
	static Academy academy;
	UiPanel01_1 uipanel01_1 = new UiPanel01_1();
	UiPanel01_2 uipanel01_2 = new UiPanel01_2();
	static List<JButton> buttons = new ArrayList<JButton>();
	static int cnt = 0; //���° ��ư�� ����Ұ���
	static int snocnt;  //sno�� �������
	static int a = 0;	//���° x��ǥ�� ��ġ�Ұ���

	public ButtonAll() {
		// setLayout(null);
		x = 267;
		y = 365;
		Dunsol.setBounds(x, y, 156, 156);
		Dunsol.addActionListener(this);
		Dunsol.setContentAreaFilled(false);// ��ư ���뿵�� ��ä��
		Dunsol.setFocusPainted(false);
		Dunsol.setBorderPainted(false);
		Dunsol.setRolloverEnabled(true);
		Dunsol.setRolloverIcon(img[12]);
		// add(Dunsol);
		// setResizable(false);
		Dunsol.setVisible(true);

		Academy academy = new Academy();
		Service_select serselect = Service_select.getInstance();
		serselect.selectsno(academy);

		for (int i = 0; i < Academy_DAO.selsno.length; i++) {
			buttons.add(new JButton());
		} //sno�� �ԷµǾ��ִ� ����ŭ ��ư����
		
		System.out.println(buttons.size()); //��ư�� Ȯ��
		
		//��ư ����ŭ ������ ��ǥ�� ��ġ
		//1~19������ ���� �������� ������ if���� ������ȴ�
		//���� else if���� �߰��� ������ �����ɽ�, �׻���� �ڸ��� ���� ��ư�� �߰��ϱ� ����(sno�� ������ ���� �ڸ���ġ)
		//��ǻ�� ȭ�鿡 �ڸ���ȣ(sno)�� �������, ���ϴ°��� ĳ���� ��� �����ϰ�//
		for (int i = 0; i < y1.length; i++) {
			for (int j = 0; j < x1.length; j++) {
				if(cnt >= buttons.size()) {
					System.out.println(cnt);
					break;
				}
	
				if(cnt+1 == Academy_DAO.selsno[cnt]) {
				System.out.println(  Academy_DAO.selsno[cnt] + "/" + x1[j] + " ," +  y1[i] + "�� �ݺ���");
				buttons.get(cnt).setSize(156, 156);
				buttons.get(cnt).setLocation(x1[j], y1[i]);
				buttons.get(cnt).setVisible(true);
				cnt++;
				snocnt++;
				a++;
				}else if(cnt+1 != Academy_DAO.selsno[snocnt] && Academy_DAO.selsno[snocnt] <= 8) {
					//System.out.println(cnt +"Ȯ��");
					buttons.get(cnt).setSize(156, 156);
					a = Academy_DAO.selsno[snocnt]-1;
					System.out.println( Academy_DAO.selsno[snocnt] + "/" + x1[a] + " ," +  y1[i]);
					buttons.get(cnt).setLocation(x1[a], y1[i]);
					buttons.get(cnt).setVisible(true);
					cnt++;
					snocnt++;
					if(cnt < 8) {
						i = 0;
					}
				}else if(cnt+1 != Academy_DAO.selsno[snocnt] && Academy_DAO.selsno[snocnt] > 8 && Academy_DAO.selsno[snocnt] <= 16) {
					
					buttons.get(cnt).setSize(156, 156);
					a = Academy_DAO.selsno[snocnt]-9;
					i = 1;
					System.out.println( Academy_DAO.selsno[snocnt] + "/" + x1[a] + " ," +  y1[i]);
					buttons.get(cnt).setLocation(x1[a], y1[i]);
					buttons.get(cnt).setVisible(true);
					cnt++;
					snocnt++;
			   }else if(cnt+1 != Academy_DAO.selsno[snocnt] && Academy_DAO.selsno[snocnt] > 16) {
				   i = 2;
					buttons.get(cnt).setSize(156, 156);
					a = Academy_DAO.selsno[snocnt]-17;
					System.out.println( Academy_DAO.selsno[snocnt] + "/" + x1[a] + " ," +  y1[i]);
					buttons.get(cnt).setLocation(x1[a], y1[i]);
					buttons.get(cnt).setVisible(true);
					cnt++;
					snocnt++;
					if(cnt < 24) {
						i = 1;
					}
				}
				
				
				
			}
		}
		
		//�� ��ư�� �̹��� ����
	

	}

	public void setRolloverIcon(ImageIcon imageIcon) {
		Dunsol.setRolloverEnabled(true);
		Dunsol.setRolloverIcon(imageIcon);
		Dunsol.setLocation(Dunsol.getX(), Dunsol.getY());
	}

	// 1 2 3 4 5 6 7 8 9 10 11 12
	// 1 3 5 7 9 11 -> img[9](���ִ� �̹���)
	// 2 6 10 - >img[10](������1)
	// 4 8 12 -> img[11](������2) 4�ǹ��
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
		// ������ ����??
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
							if (i % 2 == 1) {
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
		if (MainView.click == 0) {
			move();
			MainView.click = sno; // �����̰� �ִ��� ����(�����϶� �ٸ�ĳ���� Ŭ���Ұ�)
			UiChange_Out.sno = sno; // Ui�� ������ ���ư� ĳ���Ͱ� �������
			Academy.button_check = sno; // ��ư �������� ����

		}

	}

	public List<JButton> getButton() {
		return buttons;
	}

	public static void main(String[] args) {
		new ButtonAll();
//		System.out.println(xy[0][3]);
//		System.out.println(xy[0][1]);
//		for(int i = 0; i < xy.length; i++) {
//			for(int j = 0; j < xy[i].length; j++) {
//				System.out.print(xy[i][j] + "  ");
//			}System.out.println(); //���� ������ �̵�
//		}
	}
}
