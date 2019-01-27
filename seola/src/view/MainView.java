package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame implements ActionListener {
	Toolkit tk = Toolkit.getDefaultToolkit();
	static int click = 0;
	Button_Guhyup Guhyup = new Button_Guhyup();
	JButton guhyup = Guhyup.getButton();
	Button_Jinwha Jinwha = new Button_Jinwha();
	JButton jinwha = Jinwha.getButton();
	Button_Dunsol Dunsol = new Button_Dunsol();
	JButton dunsol = Dunsol.getButton();
	Button_JungHun JungHun = new Button_JungHun();
	JButton junghun = JungHun.getButton();
	JFrame frame = new JFrame("박성정 선생님 취업반");
	private JPanel panel = new MyPanel();
	static int f_width = 1250;
	static int f_height = 950;

	MainView() {
		Dimension screen = tk.getScreenSize();
		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		frame.setLocation(f_xpos, f_ypos);
        frame.setLayout(null);
        frame.setSize(1250,930);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        panel.setBounds(0,0,1244,950);
        panel.add(guhyup);
        panel.add(jinwha);
        panel.add(dunsol);
        panel.add(junghun);
 
	}
          

    class MyPanel extends JPanel{
    @Override
    	protected void paintComponent(Graphics g) {
    		Image img = new ImageIcon("img//class4.png").getImage();
    		g.drawImage(img,0,0,1250,900,null);
    	}
    }
    
    
	
	public static void main(String[] args) {
		MainView b = new MainView();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}

