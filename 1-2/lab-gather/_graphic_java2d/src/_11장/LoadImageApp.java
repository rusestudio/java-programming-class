package _11장;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoadImageApp extends JPanel {
	
	BufferedImage img, img2;
	
	//public void paint(Graphics g) {
	//	g.drawImage(img, 0, 0, null);
	//}
	
	public LoadImageApp() {
		try {
			img = ImageIO.read(new File("imgs/img1.jpg")); //load image
			img2 = ImageIO.read(new File("imgs/img2.jpg"));
		} catch (IOException e) {	
		}
	}
	
	public Dimension getPreferredSize() { //set demension
		if(img == null) {
			return new Dimension(100,100);
		} else {
			return new Dimension(img.getWidth(),img.getHeight());
		}
	}
	
	public void paint(Graphics g) {
        // Example 1: Basic drawImage with no scaling
        boolean success1 = g.drawImage(img, 0, 0, this); //draw image  normal
        System.out.println("Basic drawImage success: " + success1);

        // Example 2: Scaled and cropped drawImage with source and destination coordinates
        if (img2 != null) {
            int srcWidth = img2.getWidth() / 2; // Crop width to half
            int srcHeight = img2.getHeight() / 2; // Crop height to half
            int dstWidth = 100; // Destination width
            int dstHeight = 100; // Destination height
            boolean success2 = g.drawImage(
                img2, 250, 0, 250 + dstWidth, dstHeight, 0, 0, srcWidth, srcHeight, this  //draw image crop
            );
            System.out.println("Scaled drawImage success: " + success2);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame f = new JFrame("이미지 표시 예제");
		 f.add(new LoadImageApp());
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setSize(500,500);
		 f.pack();
		 f.setVisible(true);
	}

}
