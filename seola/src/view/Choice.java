package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.UiPanel01_1.MyActionListener;

public class Choice extends JFrame {

	JButton choice = new JButton();
	JButton h_choice_r = new JButton();
	JButton h_choice_l = new JButton();
	JButton b_choice_r = new JButton();
	JButton b_choice_l = new JButton();
	JButton save = new JButton("생성");
	JButton create = new JButton();
	JPanel panel = new JPanel();
	JPanel hpanel = new MyPanel01();
	JPanel bpanel = new MyPanel02();
	String body;
	String head;
	static boolean hr_chk = false;
	static int  i = 0;
	static int j = 0;
	static ImageIcon[] himagePart = { new ImageIcon("img//H0.png"), new ImageIcon("img//H1.png"), new ImageIcon("img//H2.png") };
	static ImageIcon[] bimagePart = { new ImageIcon("img//B0.png"), new ImageIcon("img//B1.png"), new ImageIcon("img//B2.png") };
	static ImageIcon[] image = {null, new ImageIcon("img//H0+B0.png"), new ImageIcon("img//H1+B1.png"), new ImageIcon("img//H2+B2.png") };

	Choice() {
		setSize(500, 500);
		setLocation(400, 400);
		setLayout(null);
		setVisible(true);
		panel.setSize(300, 300);
		panel.setLocation(50, 50);
		panel.setLayout(null);
		add(panel);

		// choice.setSize(100,100);
		// choice.setLocation(0,0);
		panel.add(hpanel);
		hpanel.setSize(156, 156);
		hpanel.setLocation(50, 0);

		panel.add(bpanel);
		bpanel.setSize(156, 156);
		bpanel.setLocation(50, 0);

		panel.add(choice);
		panel.add(h_choice_l);
		h_choice_l.setSize(20, 20);
		h_choice_l.setLocation(20, 20);
		h_choice_l.addActionListener(new MyActionListener());
		

		panel.add(h_choice_r);
		h_choice_r.setSize(20, 20);
		h_choice_r.setLocation(200, 20);
		h_choice_r.addActionListener(new MyActionListener());

		panel.add(b_choice_l);
		b_choice_l.setSize(20, 20);
		b_choice_l.setLocation(20, 180);
		b_choice_l.addActionListener(new MyActionListener());

		panel.add(b_choice_r);
		b_choice_r.setSize(20, 20);
		b_choice_r.setLocation(200, 180);
		b_choice_r.addActionListener(new MyActionListener());
		
		panel.add(save);
		save.setSize(50,30);
		save.setLocation(100, 210);
		save.addActionListener(new MyActionListener());
		
		
		
		
	}
	

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == h_choice_r) {
				if(i < himagePart.length) {
				i++;
				}
				System.out.println("확인");
				panel.remove(hpanel);
				hpanel = new MyPanel01();
				panel.add(hpanel);
				hpanel.setSize(156,156);
				hpanel.setLocation(50,0);
				
				
			}
			if (e.getSource() == h_choice_l) {
				if(i > 0) {
					i--;
				}
				System.out.println("확인2");
				panel.remove(hpanel);
				hpanel = new MyPanel01();
				panel.add(hpanel);
				hpanel.setSize(156,156);
				hpanel.setLocation(50,0);
				
			}
			if (e.getSource() == b_choice_r) {
				//System.out.println("확인3");
				j++;
				panel.remove(bpanel);
				bpanel = new MyPanel02();
				panel.add(bpanel);
				bpanel.setSize(156,156);
				bpanel.setLocation(50,0);
			}
			if (e.getSource() == b_choice_l) {
				if(j > 0 ) {
					j--;
				}
				panel.remove(bpanel);
				bpanel = new MyPanel02();
				panel.add(bpanel);
				bpanel.setSize(156,156);
				bpanel.setLocation(50,0);
				
			}
			if (e.getSource() == save) {
				System.out.println("세이브 확인");
				image[0] = new ImageIcon("img//H" + i + "+" + "B" + j + ".png");
				create.setIcon(image[0]);
				panel.add(create);
				create.setSize(156,156);
				create.setLocation(0,0);
			}
			
			
			
		}

	}
	static class MyPanel01 extends JPanel {
		static Image himg;
		

		@Override
		protected void paintComponent(Graphics g) {
			himg = himagePart[i].getImage();
			g.drawImage(himg, 0, 0, 156, 156, null);

		}
	}

	static class MyPanel02 extends JPanel {
		static Image bimg;
		@Override
		protected void paintComponent(Graphics g) {
			bimg = bimagePart[j].getImage();
			g.drawImage(bimg, 0, 0, 156, 156, null);
		}
	}


	public static void main(String[] args) {
		new Choice();
	}
	
}
