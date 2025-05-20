package _11장;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;



class Panel1 extends JPanel{

	public Panel1() {
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //call method for draw
		g.drawRect(50, 50, 50, 50); //draw rec
		g.drawOval(200, 50, 50, 50);//draw oval
		//g.draw3DRect(150, 150, 250, 250, true);
		//g.drawRoundRect(80, 80, 60, 60, 60, 60);
		
		//draw poly star
		int [] x = {45, 55, 75, 55, 63, 43, 17, 31, 12, 35, 45}; //x coor
        int [] y = {41, 65, 71, 83, 108, 88, 105, 78, 61, 63,41}; //y coor
        g.drawPolygon(x, y, 10); // 10 vertices required to draw a star

        //draw poly love
        g.drawArc(50, 200, 60, 60, 0, 180);//x,y,w,h,startangle,arcangle
        g.drawArc(110, 200, 60, 60, 0, 180);
        
        // Draw the triangle to connect the arcs at the bottom
        int[] xPoints = {50, 110, 170}; // X coordinates for the triangle
        int[] yPoints = {230, 300, 230}; // Y coordinates for the triangle
        g.drawPolyline(xPoints, yPoints, 3);
        
        //pic
    		
 
    
        //draw prof face
        
        
        
	}
	
}

public class BasicPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("그래픽 기초 프로그램");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(new Panel1()); //add panel that painted
		f.setSize(500,500);
		f.setVisible(true);

	}

}
