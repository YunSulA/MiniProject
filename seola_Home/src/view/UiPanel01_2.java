package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import view.UiPanel01_1.MyPanel01;

public class UiPanel01_2 {
	private JPanel panel01 = new MyPanel01();
	
	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_1_change1.png").getImage();
			g.drawImage(img, 0, 0, 515, 257, null);
		}
	}

}
