package _8장;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout extends JFrame{
	
	public FlowLayout() {
		
		setSize(400,400);
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;

		// 패널을생성하고배치관리자를FlowLayout으로설정
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));

		// 패널에 버튼을생성하여추가
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		
		add(panel);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlowLayout fl = new FlowLayout();

	}

}
