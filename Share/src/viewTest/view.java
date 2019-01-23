package viewTest;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Academy.model.Academy;
import Academy.service.Service_change;

public class view {

	private static JFrame frame = new JFrame("DB 저장 테스트 ");
	private static JPanel panel = new JPanel();
	private static JButton b1 = new JButton("변경");
	public static JTextField t1 = new JTextField();
	public static String name = "";

	view() {
		
		frame.setVisible(true);
		frame.setBounds(750, 200, 685, 649);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		b1.setBounds(90, 100, 100, 100);
		t1.setBounds(10, 100, 50, 50);
		panel.setPreferredSize(new Dimension(300, 300));
		frame.add(panel);
		panel.add(b1);
		panel.add(t1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Academy academy = new Academy();
//				추가 잘된다. 그런데 값을 잘못 입력하면 SQL에러문이 떠야하는데 그냥 프레임이 꺼지지않고 다운되는 현상이 발생하는데 왜 그런지 모르겠다.
//				Service_add seradd = Service_add.getInstance();
//				seradd.insert(academy);
				
				Service_change serchange = Service_change.getInstance();
				serchange.nameChange(academy);
				
			}
		});
	}
	public static void main(String[] args) {
		new view();
	}

}
