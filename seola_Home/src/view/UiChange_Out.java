package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UiChange_Out implements WindowListener {
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static int f_width = 800;
	static int f_height = 540;
	static UiChange win;
	static int sno;

	public UiChange_Out() {

		win = new UiChange();

		Dimension screen = tk.getScreenSize();
		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		win.setLocation(f_xpos, f_ypos);
		win.setTitle("dd");
		win.uipanel01 = new UiPanel01(win);
		win.uipanel02 = new UiPanel02(win);
		win.uipanel03 = new UiPanel03(win);
		win.uipanel04 = new UiPanel04(win);

		win.add(win.uipanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(750, 580);
		win.setVisible(true);

		win.addWindowListener(this);

	}

	public static void main(String[] args) {
		UiChange_Out e = new UiChange_Out();

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	// 1번캐릭터 클릭
	// 패널 열리고, DB와 연동된 1번캐릭터의 정보 출력
	// 종료하면 1번 캐릭터의 메소드 실행
	@Override
	public void windowClosed(WindowEvent e) {
		if (sno == 1) {
			Button_Guhyup.move2();
		} else if (sno == 7) {
			Button_Jinwha.move2();
		}

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
