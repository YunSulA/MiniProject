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

	private static JFrame frame = new JFrame("DB ���� �׽�Ʈ ");
	private static JPanel panel = new JPanel();
	private static JButton b1 = new JButton("����");
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
//				�߰� �ߵȴ�. �׷��� ���� �߸� �Է��ϸ� SQL�������� �����ϴµ� �׳� �������� �������ʰ� �ٿ�Ǵ� ������ �߻��ϴµ� �� �׷��� �𸣰ڴ�.
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
