package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UiChange_Out implements WindowListener {
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static int f_width = 800;
	static int f_height = 540;
	static UiChange win;
	static int sno = 0;
	static Move btmove = new Move();

	
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

	}

	// 1��ĳ���� Ŭ��
	// �г� ������, DB�� ������ 1��ĳ������ ���� ���
	// �����ϸ� 1�� ĳ������ �޼ҵ� ����
	@Override
	public void windowClosed(WindowEvent e) {
		
				Move.move2();

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	

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
		
	}

}
