package labw6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Photo extends JFrame{
	
	public Photo() {
		 setSize(400,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("사진첩");
		 
		 JPanel panel = new JPanel();
		 panel.setLayout(new GridLayout(0,2,10,10));
		 
		 JLabel label1 = new JLabel();
		 panel.add(label1);
		 label1.setIcon(new ImageIcon("imgs/img1.jpg"));
		 label1.setBorder(new LineBorder((Color.black)));
		 
		 JLabel label2 = new JLabel();
		 panel.add(label2);
		 label2.setIcon(new ImageIcon("imgs/img2.jpg"));
		 label2.setBorder(new LineBorder((Color.black)));
		 
		 JLabel label3 = new JLabel();
		 panel.add(label3);
		 label3.setIcon(new ImageIcon("imgs/img3.jpg"));
		 label3.setBorder(new LineBorder((Color.black)));
		 
		 JLabel label4 = new JLabel();
		 panel.add(label4);
		 label4.setIcon(new ImageIcon("imgs/img4.jpg"));
		 label4.setBorder(new LineBorder((Color.black)));
		 
		 
		 add(panel);
		 setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Photo p = new Photo();

	}

}
