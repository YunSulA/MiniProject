package Project01;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class UiChange  extends JFrame implements WindowListener{
	public UiPanel01 uipanel01 = null;
	public UiPanel02 uipanel02 = null;
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static int f_width = 750;
	static int f_height = 539;
	ButtonFinal01 buttonmove;
	
	public void change(String panelName) {
		if(panelName.equals("uipanel01")) {
			getContentPane().removeAll();
			getContentPane().add(uipanel01);
			revalidate();
			repaint();
		}else {
			getContentPane().removeAll();
			getContentPane().add(uipanel02);
			revalidate();
			repaint();
		}
	}
	
	
	
	public static void main(String[] args) {
		UiChange win = new UiChange();
	
		Dimension screen = tk.getScreenSize();
		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		win.setLocation(f_xpos, f_ypos);
		win.setTitle("dd");
		win.uipanel01 = new UiPanel01(win);
		win.uipanel02 = new UiPanel02(win);
		
		win.add(win.uipanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(750,540);
		win.setVisible(true);
		
		win.addWindowListener(win);
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosed(WindowEvent e) {
	
		
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
