package _8장;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GridLayout1 extends JFrame {
	
	public GridLayout1() {
		
		 setTitle("GridLayoutTest");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 setLayout(new GridLayout(0, 3));
		 
		 add(new JButton("Button1"));
		 add(new JButton("Button2"));
		 add(new JButton("Button3"));
		 add(new JButton("B4"));
		 add(new JButton("Long Button5"));
		 
		 pack();
		 setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GridLayout1 gl = new GridLayout1();

	}

}
