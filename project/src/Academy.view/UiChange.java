package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class UiChange  extends JFrame{
	public UiPanel01 uipanel01 = null;
	public UiPanel02 uipanel02 = null;
	public UiPanel03 uipanel03 = null;
	public UiPanel04 uipanel04 = null;
	public TextPanel01 uipanel01_01 = null;
	
	
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static int f_width = 750;
	static int f_height = 580;
	
	public void change(String panelName) {
		if(panelName.equals("uipanel01")) {
			getContentPane().removeAll();
			getContentPane().add(uipanel01);
			revalidate();
			repaint();
		}else if(panelName.equals("uipanel02")){
			getContentPane().removeAll();
			getContentPane().add(uipanel02);
			revalidate();
			repaint();
		}else if(panelName.equals("uipanel03")){
			getContentPane().removeAll();
			getContentPane().add(uipanel03);
			revalidate();
			repaint();
		}else if(panelName.equals("uipanel04")){
			getContentPane().removeAll();
			getContentPane().add(uipanel04);
			revalidate();
			repaint();
		}else if(panelName.equals("uipanel01_01")) {
			getContentPane().removeAll();
			getContentPane().add(uipanel01_01);
			revalidate();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		UiChange win = new UiChange();
	
		Dimension screen = tk.getScreenSize();
		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		win.setLocation(f_xpos, f_ypos);
		win.setTitle("학생정보");
		win.uipanel01 = new UiPanel01(win);
		win.uipanel02 = new UiPanel02(win);
		win.uipanel03 = new UiPanel03(win);
		win.uipanel04 = new UiPanel04(win);
		
		
		win.add(win.uipanel01);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(767,580);
		win.setVisible(true);

	}



}
