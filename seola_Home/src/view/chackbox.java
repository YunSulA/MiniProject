package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chackbox  extends Thread implements ActionListener {

	public static void main(String args[]) {
		JFrame jFrame = new JFrame("Checkable list");

		JPanel contentPane = new JPanel();
		JPanel listOfFiles = new JPanel();
		listOfFiles.setLayout(new BoxLayout(listOfFiles, BoxLayout.Y_AXIS));

		JCheckBox ch1 = new JCheckBox("ch1");
		JCheckBox ch2 = new JCheckBox("ch2");
		JCheckBox ch3 = new JCheckBox("ch3");
		JCheckBox ch4 = new JCheckBox("ch4");
		JCheckBox ch5 = new JCheckBox("ch5");
		JCheckBox ch6 = new JCheckBox("ch6");
		JLabel lbl = new JLabel("inside the scroll");
		listOfFiles.add(ch1);
		listOfFiles.add(ch2);
		listOfFiles.add(ch3);
		listOfFiles.add(ch4);
		listOfFiles.add(ch5);
		listOfFiles.add(ch6);
		listOfFiles.add(lbl);

		JLabel lbl1 = new JLabel("Other stuff");
		contentPane.add(lbl1);

		JScrollPane jScrollPane = new JScrollPane(listOfFiles);
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane.setPreferredSize(new Dimension (200, 100));
		contentPane.add(jScrollPane);
		jFrame.add(contentPane);

		jFrame.setSize(400, 300);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

		}
	}

