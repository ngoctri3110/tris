package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienChinh {

	public static void main(String[] args) {
		showWindow();

	}

	public static void showWindow() {
		JFrame frame = new JFrame("GiaoDienChinh");
		frame.setBounds(200, 200, 816, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GiaoDienThem t = new GiaoDienThem();
				t.showWindow();
			}
		});
		btnNewButton.setBounds(304, 116, 85, 86);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}

}
