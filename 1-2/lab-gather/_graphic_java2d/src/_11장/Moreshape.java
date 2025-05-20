package _11장;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

class panel11 extends JPanel{
	
	ArrayList<Shape>shapeArray =new ArrayList<Shape>();
	ArrayList<Shape> gradientShapeArray = new ArrayList<>();  // Second row with gradient fill
	
	public panel11() {
		Shape s;
		
		//first row
		s = new Rectangle2D.Float(10,10,70,80);
		shapeArray.add(s);
		
		s = new RoundRectangle2D.Float(110,10,70,80,20,20);
		shapeArray.add(s);
		
		s = new Ellipse2D.Float(210,10,80,80);
		shapeArray.add(s);
		
		s = new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN);
		shapeArray.add(s);
		
		s = new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD);
		shapeArray.add(s);
		
		s = new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE);
		shapeArray.add(s);
		
		
		 // Second row of shapes with gradient fill
        s = new Rectangle2D.Float(10, 110, 70, 80);
        gradientShapeArray.add(s);

        s = new RoundRectangle2D.Float(110, 110, 70, 80, 20, 20);
        gradientShapeArray.add(s);

        s = new Ellipse2D.Float(210, 110, 80, 80);
        gradientShapeArray.add(s);

        s = new Arc2D.Float(310, 110, 80, 80, 90, 90, Arc2D.OPEN);
        gradientShapeArray.add(s);

        s = new Arc2D.Float(410, 110, 80, 80, 0, 180, Arc2D.CHORD);
        gradientShapeArray.add(s);

        s = new Arc2D.Float(510, 110, 80, 80, 45, 90, Arc2D.PIE);
        gradientShapeArray.add(s);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				             RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		for(Shape s : shapeArray)
			g2.draw(s);
		
		 // Draw the second row with gradient fill
        for (Shape s : gradientShapeArray) {
            GradientPaint gp = new GradientPaint(0, 110, Color.WHITE, 0, 190, Color.RED, true);
            g2.setPaint(gp);
            g2.fill(s);
        }
	}
}


public class Moreshape extends JFrame{
	
	public Moreshape(){
		setSize(600, 300);
		setTitle("Java 2D Shapes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panels = new panel11();
		add(panels);
		setVisible(true);

	}
	{
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Moreshape();
	}

}
