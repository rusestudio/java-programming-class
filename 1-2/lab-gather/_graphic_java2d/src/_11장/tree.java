package _11장;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class tree extends JFrame{
	public tree() {
		setSize(800,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if(depth ==0) return; //when depth 0 stop
		
		int x2= x1+(int)(Math.cos(Math.toRadians(angle))*depth*10.0); //10 level
		int y2= y1+(int)(Math.sin(Math.toRadians(angle))*depth*10.0);
		g.drawLine(x1,y1,x2,y2);
		drawTree(g,x2,y2,angle-20,depth-1);//recursion call itself in its method
		drawTree(g,x2,y2,angle+20,depth-1);//everytime call -1 util 0
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		drawTree(g, 400, 600, -90, 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new tree();

	}

}
