package View;

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
	Button01 Button01 = new Button01();
	JButton chung1 = Button01.getButton();
	JFrame frame = new JFrame("박성정 선생님 취업반");
	private JPanel panel = new MyPanel();
	static int f_width = 1400;
	static int f_height = 970;

	MainView() {
		Dimension screen = tk.getScreenSize();
		int f_xpos = (int) (screen.getWidth() / 2 - f_width / 2);
		int f_ypos = (int) (screen.getHeight() / 2 - f_height / 2);
		frame.setLocation(f_xpos, f_ypos);
        frame.setLayout(null);
        frame.setSize(1400,970);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        panel.setBounds(0,0,1400,950);
        panel.add(chung1);
       
       
	}
          

    class MyPanel extends JPanel{
    @Override
    	protected void paintComponent(Graphics g) {
    		Image img = new ImageIcon("img//class.png").getImage();
    		g.drawImage(img,0,0,1400,950,null);
    	}
    }
    
    
	
	public static void main(String[] args) {
		MainView b = new MainView();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}

