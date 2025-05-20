package _8장;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class FlowLayout2 extends JFrame{
	
	

	 public FlowLayout2() {
		 setSize(300, 200);
		 setTitle("My Frame");

		 JPanel p1= new JPanel();
		 p1.setLayout(new FlowLayout());
		 
		 for(int i= 0; i< 10; i++)
			 p1.add(new JButton("Button"+ i));
		 
		 add(p1);
		 setVisible(true); // 프레임을화면에표시한다.
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlowLayout2 fl2 = new FlowLayout2();

	}

}
