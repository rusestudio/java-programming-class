package graphiclatihan;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


class drawingpanel extends JPanel {
	
	
	//draw image
	private Image img;
	
	public drawingpanel() {
		try {
			img = ImageIO.read(new File("10.JPG"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d =(Graphics2D) g;
		
		// draw rectangle
		Double rect = new Rectangle.Double(100,100,200,100);
		g2d.draw(rect);
		
		// draw oval
		Ellipse2D oval = new Ellipse2D.Double(400,100,200,100);
		g2d.draw(oval);
		
		//draw polygon
		Path2D polygon = new Path2D.Double();
		polygon.moveTo(200, 300);
		polygon.lineTo(300, 400);
		polygon.lineTo(100, 400);
		polygon.closePath();
		g2d.draw(polygon);
		
		//set font and color
		g2d.setFont(new Font("Arial",Font.BOLD,24));
		g2d.setColor(Color.red);
		
		//draw a string
		g2d.drawString("Hello java", 200, 50);
		
		//draw image
		if(img != null) {
			int imgWidth = 300;  // desired width
	        int imgHeight = 200; // desired height
	        int x = 300;         // x-coordinate for top-left corner
	        int y = 300;         // y-coordinate for top-left corner
	        g2d.drawImage(img, x, y, imgWidth, imgHeight, this);
			
		}
	}
	
}

public class drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Java 2D Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new drawingpanel());
        frame.setVisible(true);

	}

}
