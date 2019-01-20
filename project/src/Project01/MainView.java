package Project01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonOut2Final01 extends JFrame implements ActionListener {

	ButtonFinal01 button = new ButtonFinal01();
	JButton chung1 = button.getButton();
	JFrame frame = new JFrame("박성정 선생님 취업반");
	private JPanel panel = new MyPanel();


	ButtonOut2Final01() {
    	
        frame.setLayout(null);
        frame.setSize(1400,900);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);
        panel.setBounds(0,0,1400,900);
        panel.add(chung1);
       
       
	}
          

    class MyPanel extends JPanel{
    @Override
    	protected void paintComponent(Graphics g) {
    		Image img = new ImageIcon("img//back.png").getImage();
    		g.drawImage(img,0,0,1400,900,null);
    	}
    }
    
    
	
	public static void main(String[] args) {
		ButtonOut2Final01 b = new ButtonOut2Final01();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}

