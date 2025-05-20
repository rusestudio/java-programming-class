package _8장;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class BorderLayout1 extends JFrame {
	
	public BorderLayout1() {
	
		 setTitle("BorderLayoutTest");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 // 프레임은디폴트로BorderLayout이므로사실은불필요
		 setLayout(new BorderLayout());

		// 버튼을 추가한다.
		 add(new JButton("Center"), BorderLayout.CENTER);
		 add(new JButton("Line Start"), BorderLayout.LINE_START);
		 add(new JButton("Line End"), BorderLayout.LINE_END);
		 add(new JButton("Page Start"), BorderLayout.PAGE_START);
		 add(new JButton("Page End"), BorderLayout.PAGE_END);
		 
		 pack();
		 setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BorderLayout1 bl = new BorderLayout1();

	}

}
