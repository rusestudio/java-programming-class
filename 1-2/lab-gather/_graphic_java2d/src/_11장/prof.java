package _11장;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class prof extends JPanel{
	

	BufferedImage img;
	
	// Constructor to load the image
    public prof() {
        try {
            img = ImageIO.read(new File("imgs/plhg.jpg")); // load image
        } catch (IOException e) {
            System.out.println("Image file not found.");
        }
    }
	
	protected void paintComponent(Graphics g) {
	
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
	
        
        // Draw the image first, then the shapes on top
        if (img != null) {
            g2.drawImage(img, 0, 200,200,250, null);
        }
        
        
        // Set rendering hints for better quality
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Coordinates offset for face placement
        int startX = 50;
        int startY = 50;
        
        // Face outline
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Arc2D.Double(startX, startY, 100, 120, 180, 180, Arc2D.OPEN));
        
        // Hair (simple lines for bangs)
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Line2D.Double(startX + 10, startY + 20, startX + 30, startY + 40));
        g2.draw(new Line2D.Double(startX + 30, startY + 20, startX + 40, startY + 40));
        g2.draw(new Line2D.Double(startX + 50, startY + 20, startX + 50, startY + 40));
        g2.draw(new Line2D.Double(startX + 70, startY + 20, startX + 60, startY + 40));
        g2.draw(new Line2D.Double(startX + 90, startY + 20, startX + 70, startY + 40));
        
        // Eyes
        g2.setStroke(new BasicStroke(2));
        g2.draw(new Ellipse2D.Double(startX + 25, startY + 50, 10, 10)); // Left eye
        g2.draw(new Ellipse2D.Double(startX + 65, startY + 50, 10, 10)); // Right eye

        // Nose (simple line)
        g2.draw(new Line2D.Double(startX + 50, startY + 60, startX + 50, startY + 70));

        // Mouth (smiling arc)
        g2.setStroke(new BasicStroke(2));
        g2.draw(new Arc2D.Double(startX + 30, startY + 80, 40, 20, 0, -180, Arc2D.OPEN));
        
	} 
        
        @Override
        public Dimension getPreferredSize() {
            if (img == null) {
                return new Dimension(100, 100); // Default size if image is not loaded
            } else {
                return new Dimension(img.getWidth(), img.getHeight());
            }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  JFrame frame = new JFrame("Simple Face Drawing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 600);
	        frame.add(new prof());
	        frame.setVisible(true);

	}

}
