package _10장;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel2 extends JPanel{
	BufferedImage img = null;
	int img_x=0, img_y=0;
	
	public Panel2() {
		try {
			img = ImageIO.read(new File("imgs/img4.jpg"));
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			
			 //addMouseListener(new MouseAdapter() { if use mouse adapter
				// 무명 클래스로 정의
				//public void mousePressed(MouseEvent e) {
				// img_x = e.getX();
				// img_y = e.getY();
				// repaint();
				// }
				// });

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
	}
}

public class CarMouseMove extends JFrame{
	
	public CarMouseMove() {
		add(new Panel2());
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CarMouseMove();
	}

}
