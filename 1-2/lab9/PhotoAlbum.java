package labw9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PhotoAlbum extends JFrame {
	private int i=1;

	public PhotoAlbum() {
		ImageIcon[] img = {new ImageIcon("imgs/img1.jpg"),
				new ImageIcon("imgs/img2.jpg"),new ImageIcon("imgs/img3.jpg"),
				new ImageIcon("imgs/img4.jpg")};
			
		//make frame first
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("사진첩");
		
		//img label
		 JLabel labelimg = new JLabel();
		 add(labelimg);
		 labelimg.setIcon(new ImageIcon("imgs/img1.jpg"));
		 
		 setVisible(true);
		 
		 addMouseListener(new MouseAdapter() {
			 public void mousePressed(MouseEvent e) {
				 if(e.getClickCount()==2) {
					labelimg.setIcon(img[i%4]);
					i++;
				 }
			 }
		 });

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhotoAlbum pa= new PhotoAlbum();
		

	}

}
