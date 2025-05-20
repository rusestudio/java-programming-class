package _11장;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class greyscale  extends JFrame{
	
	BufferedImage image;
	int width;
	int height;
	
	public greyscale() {
		try {
			File input = new File("imgs/img2.jpg");
			image = ImageIO.read(input);
			width = image.getWidth();
			height = image.getHeight();
			
			for(int r=0; r<height; r++) {
				for(int c =0; c< width; c++) {
					Color color = new Color(image.getRGB(r, c));
					
					int red=(int)(color.getRed());
					int green =(int)(color.getGreen());
					int blue =(int)(color.getBlue());
					int avg =(red+green+blue)/3;
					Color newColor = new Color(avg,avg,avg);
					
					image.setRGB( r, c, newColor.getRGB());
				}
			}
			
			File output= new File("output.jpg");
			ImageIO.write(image, "jpg", output);
			
			add(new Panel10());
			pack();
			setVisible(true);
			
		} catch(Exception e) {
			System.out.println("fail to read img!");
		}
	}
	
class Panel10 extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,0,0,null);
	}
	
	public Dimension getPreferredSize() {
		if(image==null) {
			return new Dimension(100,100);
		}else {
			return new Dimension(image.getWidth(), image.getHeight());
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new greyscale();
	}

}
