package labw10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inversion extends JFrame{
	

	BufferedImage image;
	int width;
	int height;
	
	public Inversion() {
		try {
			File input = new File("imgs/img4.jpg"); //read image
			image = ImageIO.read(input);
			
			width = image.getWidth(); //get image width n height
			height = image.getHeight();
			
			//convert to negative
			for (int y = 0; y < height; y++) { 
	            for (int x = 0; x < width; x++) { 
	                int p = image.getRGB(x, y); 
	                int a = (p >> 24) & 0xff; 
	                int r = (p >> 16) & 0xff; 
	                int g = (p >> 8) & 0xff; 
	                int b = p & 0xff; 
	  
	                // subtract RGB from 255 
	                r = 255 - r; 
	                g = 255 - g; 
	                b = 255 - b; 
	  
	                // set new RGB value 
	                p = (a << 24) | (r << 16) | (g << 8) | b; 
	                image.setRGB(x, y, p); 
				}
			}
			
			File output= new File("output.jpg");
			ImageIO.write(image, "jpg", output);
			
			add(new Panelinvert());
			pack();
			setTitle("반전");
			setVisible(true);
			
		} catch(Exception e) {
			System.out.println("fail to read img!");
		}
	}
	
	class Panelinvert extends JPanel{
		
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
         new Inversion();
	}

}
