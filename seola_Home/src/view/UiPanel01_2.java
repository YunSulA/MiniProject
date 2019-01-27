package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import DAO.Academy_DAO;
import model.Academy;
import service.Service_change;

public class UiPanel01_2 extends JPanel {
	private JPanel panel01 = new MyPanel01();
	public static JTextArea majortext = new JTextArea();
	public static JTextArea tributetext = new JTextArea();
	public static JTextArea test = new JTextArea();
	static JPanel itcourse = new JPanel();
	public static String test2;

	static List<JCheckBox> chboxlist;
	static JCheckBox checkc = new JCheckBox("C");
	static JCheckBox checkjava = new JCheckBox("JAVA");
	static JCheckBox checkit = new JCheckBox("IT기초");
	static JCheckBox checkpython = new JCheckBox("Python");
	static JCheckBox checkjsp = new JCheckBox("JSP");
	static JCheckBox checkjavascript = new JCheckBox("JavaScript");
	static JCheckBox checklinux = new JCheckBox("리눅스");
	static JCheckBox checksecurity = new JCheckBox("보안");
	static List<String> itcourselist = new ArrayList<String>();
	static int j = 0;
	public static String itcourses = "";
	static String major;
	static String tribute;
	private JButton change_bt1;
	private JButton change_bt2;
	private JButton change_bt3;
	private JButton add_bt1;
	private JButton add_bt2;
	private JButton add_bt3;
	private JButton cancle_bt1;
	private JButton cancle_bt2;
	private JButton cancle_bt3;
	private Color c1 = new Color(175, 138, 125);
	private Font f1 = new Font("궁서", Font.BOLD, 20);
	Academy academy = new Academy();

	ImageIcon ui_bt[] = { new ImageIcon("img\\Change_bt.png"), new ImageIcon("img\\Change_bt_roll.png"),
			new ImageIcon("img\\Add_bt3.png"), new ImageIcon("img\\Add_bt3_roll.png"),
			new ImageIcon("img\\Cancel_bt2.png"), new ImageIcon("img\\Cancel_bt2_roll.png") };

	public UiPanel01_2() {
		setSize(515, 257);
		setVisible(true);
		setLayout(null);
		setFont(f1);
		setForeground(c1);
		setBorder(null);
		add(panel01);

		panel01.setSize(515, 257);
		panel01.setLocation(0, 0);
		panel01.setLayout(null);

		itcourse.setLayout(new BoxLayout(itcourse, BoxLayout.Y_AXIS));
		itcourse.setLayout(new GridLayout(8, 1));
		itcourse.setForeground(c1);
		chboxlist = new ArrayList<JCheckBox>();
		chboxlist.add(checkc);
		chboxlist.add(checkjava);
		chboxlist.add(checkjavascript);
		chboxlist.add(checkit);
		chboxlist.add(checkjsp);
		chboxlist.add(checkpython);
		chboxlist.add(checklinux);
		chboxlist.add(checksecurity);

		for (int i = 0; i < chboxlist.size(); i++) {
			chboxlist.get(i).setEnabled(false);
			chboxlist.get(i).setBackground(new Color(40, 38, 38));
			chboxlist.get(i).setForeground(c1);
			;
			itcourse.add(chboxlist.get(i));
		} // 체크박스 리스트들의 추가및 설정

		JScrollPane jScrollPane = new JScrollPane(itcourse);
		jScrollPane.setSize(150, 110);
		jScrollPane.setLocation(175, 60);
		jScrollPane.setBackground(new Color(40, 38, 38));

		panel01.add(jScrollPane);
		panel01.add(majortext);
		panel01.add(tributetext);

		majortext.setSize(130, 50);
		majortext.setLocation(30, 100);
		majortext.setForeground(c1);
		majortext.setFont(f1);
		majortext.setCursor(null);
		majortext.setEditable(false);
		majortext.setBackground(new Color(40, 38, 38));

		tributetext.setSize(120, 50);
		tributetext.setLocation(350, 100);
		tributetext.setForeground(c1);
		tributetext.setFont(f1);
		tributetext.setCursor(null);
		tributetext.setEditable(false);
		tributetext.setBackground(new Color(40, 38, 38));

		change_bt1 = new JButton(ui_bt[0]);
		change_bt1.setBounds(38, 200, 75, 43);
		change_bt1.setContentAreaFilled(false);
		change_bt1.setBorderPainted(false);
		change_bt1.setRolloverEnabled(true);
		change_bt1.setRolloverIcon(ui_bt[1]);
		change_bt1.addActionListener(new MyActionListener());
		panel01.add(change_bt1);

		change_bt2 = new JButton(ui_bt[0]);
		change_bt2.setBounds(378, 200, 75, 43);
		change_bt2.setContentAreaFilled(false);
		change_bt2.setBorderPainted(false);
		change_bt2.setRolloverEnabled(true);
		change_bt2.setRolloverIcon(ui_bt[1]);
		change_bt2.addActionListener(new MyActionListener());
		panel01.add(change_bt2);

		change_bt3 = new JButton(ui_bt[0]);
		change_bt3.setBounds(210, 200, 75, 43);
		change_bt3.setContentAreaFilled(false);
		change_bt3.setBorderPainted(false);
		change_bt3.setRolloverEnabled(true);
		change_bt3.setRolloverIcon(ui_bt[1]);
		change_bt3.addActionListener(new MyActionListener());
		panel01.add(change_bt3);

		add_bt1 = new JButton(ui_bt[2]);
		add_bt1.setBounds(480, 190, 51, 28);
		add_bt1.setContentAreaFilled(false);
		add_bt1.setBorderPainted(false);
		add_bt1.setRolloverEnabled(true);
		add_bt1.setRolloverIcon(ui_bt[3]);
		add_bt1.addActionListener(new MyActionListener());

		add_bt2 = new JButton(ui_bt[2]);
		add_bt2.setBounds(480, 190, 51, 28);
		add_bt2.setContentAreaFilled(false);
		add_bt2.setBorderPainted(false);
		add_bt2.setRolloverEnabled(true);
		add_bt2.setRolloverIcon(ui_bt[3]);
		add_bt2.addActionListener(new MyActionListener());

		add_bt3 = new JButton(ui_bt[2]);
		add_bt3.setBounds(480, 190, 51, 28);
		add_bt3.setContentAreaFilled(false);
		add_bt3.setBorderPainted(false);
		add_bt3.setRolloverEnabled(true);
		add_bt3.setRolloverIcon(ui_bt[3]);
		add_bt3.addActionListener(new MyActionListener());

		cancle_bt1 = new JButton(ui_bt[4]);
		cancle_bt1.setBounds(460, 190, 51, 28);
		cancle_bt1.setContentAreaFilled(false);
		cancle_bt1.setBorderPainted(false);
		cancle_bt1.setRolloverEnabled(true);
		cancle_bt1.setRolloverIcon(ui_bt[5]);
		cancle_bt1.addActionListener(new MyActionListener());

		cancle_bt2 = new JButton(ui_bt[4]);
		cancle_bt2.setBounds(460, 190, 51, 28);
		cancle_bt2.setContentAreaFilled(false);
		cancle_bt2.setBorderPainted(false);
		cancle_bt2.setRolloverEnabled(true);
		cancle_bt2.setRolloverIcon(ui_bt[5]);
		cancle_bt2.addActionListener(new MyActionListener());

		cancle_bt3 = new JButton(ui_bt[4]);
		cancle_bt3.setBounds(460, 190, 51, 28);
		cancle_bt3.setContentAreaFilled(false);
		cancle_bt3.setBorderPainted(false);
		cancle_bt3.setRolloverEnabled(true);
		cancle_bt3.setRolloverIcon(ui_bt[5]);
		cancle_bt3.addActionListener(new MyActionListener());

	}

	public void itcourseBoolean() {
		if (Academy_DAO.selectitcourse.contains("C")) {
			UiPanel01_2.checkc.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("JAVA")) {
			UiPanel01_2.checkjava.setSelected(true);

		}
		if (Academy_DAO.selectitcourse.contains("Python")) {
			UiPanel01_2.checkpython.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("IT기초")) {
			UiPanel01_2.checkit.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("JSP")) {
			UiPanel01_2.checkjsp.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("JavaScript")) {
			UiPanel01_2.checkjavascript.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("리눅스")) {
			UiPanel01_2.checklinux.setSelected(true);
		}
		if (Academy_DAO.selectitcourse.contains("보안")) {
			UiPanel01_2.checksecurity.setSelected(true);
		}
	}
	
	public static String itcourseCheck() {

		for (int i = 0; i < chboxlist.size(); i++) {
			// chboxlist 에 있는 체크된 체크박스 리스트의 이름을 String 배열에 저장
			if (chboxlist.get(i).isSelected() == true) {
				itcourselist.add(chboxlist.get(i).getText() + " / ");
				itcourses += itcourselist.get(j);
				j++;
			}

		}

		return itcourses;
	}

	class MyPanel01 extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			Image img = new ImageIcon("img\\UI01_2_change1.png").getImage();
			g.drawImage(img, 0, 0, 515, 257, null);
		}
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == change_bt1) {
				panel01.remove(change_bt1);
				panel01.add(add_bt1);
				panel01.add(cancle_bt1);
				add_bt1.setSize(51, 28);
				add_bt1.setLocation(35, 185);
				cancle_bt1.setSize(51, 28);
				cancle_bt1.setLocation(100, 185);
				majortext.setCursor(getCursor());
				major = majortext.getText();
				majortext.setText(major);
				majortext.setEditable(true);
				majortext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.majorB = true;
			} else if (e.getSource() == change_bt2) {
				panel01.remove(change_bt2);
				panel01.add(add_bt2);
				panel01.add(cancle_bt2);
				add_bt2.setSize(51, 28);
				add_bt2.setLocation(355, 185);
				cancle_bt2.setSize(51, 28);
				cancle_bt2.setLocation(420, 185);
				tributetext.setCursor(getCursor());
				tribute = tributetext.getText();
				tributetext.setText(tribute);
				tributetext.setEditable(true);
				tributetext.setBackground(new Color(255, 255, 255));
				revalidate();
				repaint();
				academy.tributeB = true;
			} else if (e.getSource() == change_bt3) {
				panel01.remove(change_bt3);
				panel01.add(add_bt3);
				panel01.add(cancle_bt3);
				add_bt3.setSize(51, 28);
				add_bt3.setLocation(190, 185);
				cancle_bt3.setSize(51, 28);
				cancle_bt3.setLocation(260, 185);
				for (int i = 0; i < chboxlist.size(); i++) {
					chboxlist.get(i).setEnabled(true);
				} // 체크박스 리스트들 체크가능하게 변경
				revalidate();
				repaint();
				academy.itcourseB = true;
			}

			else if (e.getSource() == add_bt1) {
//				if(majortext.getText().length() == 0) {
//					JOptionPane.showMessageDialog(null, "전공은 비워둘 수 없습니다.", "NAME_EMPTY_ERROR", 0 );
//				} else {
				panel01.remove(add_bt1);
				panel01.remove(cancle_bt1);
				panel01.add(change_bt1);
				change_bt1.setSize(75, 43);
				change_bt1.setLocation(38, 200);
				majortext.setCursor(null);
				majortext.setEditable(false);
				majortext.setBackground(new Color(40, 38, 38));
				majortext.setText(majortext.getText());
				revalidate();
				repaint();
				Service_change serchange = Service_change.getInstance();
				serchange.majorChange(academy);
				academy.majorB = true;

			} else if (e.getSource() == add_bt2) {
				panel01.remove(add_bt2);
				panel01.remove(cancle_bt2);
				panel01.add(change_bt2);
				change_bt2.setSize(75, 43);
				change_bt2.setLocation(378, 200);
				tributetext.setCursor(null);
				tributetext.setEditable(false);
				tributetext.setBackground(new Color(40, 38, 38));
				tributetext.setText(tributetext.getText());
				revalidate();
				repaint();
				Service_change serchange = Service_change.getInstance();
				serchange.tributeChange(academy);
				academy.tributeB = false;

			} else if (e.getSource() == add_bt3) {
				panel01.remove(add_bt3);
				panel01.remove(cancle_bt3);
				panel01.add(change_bt3);
				change_bt3.setSize(75, 43);
				change_bt3.setLocation(210, 200);
				for (int i = 0; i < chboxlist.size(); i++) {
					chboxlist.get(i).setEnabled(false);
				} // 체크
				revalidate();
				repaint();
				Service_change serchange = Service_change.getInstance();
				serchange.itcourseChange(academy);
				academy.itcourseB = false;
			}

			else if (e.getSource() == cancle_bt1) {
				panel01.remove(add_bt1);
				panel01.remove(cancle_bt1);
				panel01.add(change_bt1);
				change_bt1.setSize(75, 43);
				change_bt1.setLocation(38, 200);
				majortext.setCursor(null);
				majortext.setEditable(false);
				majortext.setBackground(new Color(40, 38, 38));
				majortext.setText(major);
				revalidate();
				repaint();
				academy.majorB = false;
			} else if (e.getSource() == cancle_bt2) {
				panel01.remove(add_bt2);
				panel01.remove(cancle_bt2);
				panel01.add(change_bt2);
				change_bt2.setSize(75, 43);
				change_bt2.setLocation(378, 200);
				tributetext.setCursor(null);
				tributetext.setEditable(false);
				tributetext.setBackground(new Color(40, 38, 38));
				tributetext.setText(tribute);
				revalidate();
				repaint();
				academy.tributeB = false;
			} else if (e.getSource() == cancle_bt3) {
				panel01.remove(add_bt3);
				panel01.remove(cancle_bt3);
				panel01.add(change_bt3);
				change_bt3.setSize(75, 43);
				change_bt3.setLocation(210, 200);
				for (int i = 0; i < chboxlist.size(); i++) {
					chboxlist.get(i).setEnabled(false);
				} // 체크
				revalidate();
				repaint();
				academy.itcourseB = false;

			}
		}
	}
}
