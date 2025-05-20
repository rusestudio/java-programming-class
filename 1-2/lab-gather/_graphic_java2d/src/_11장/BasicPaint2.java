package _11장;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Panel2 extends JPanel {
	
	private int squareX=50; //draw the rec first
	private int squareY=50;
	private int squareW= 20;
	private int squareH=20;
	
	public Panel2() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		
		addMouseListener(new MouseAdapter() { //adapter is class
			public void mousePressed(MouseEvent e) { //listener is interface
				moveSquare(e.getX(),e.getY());
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(),e.getY());
			}
		});
		
	}
	
	private void moveSquare(int x, int y) {
		int OFFSET=1;
		if((squareX!=x)||(squareY!=y)) {
			repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
			squareX=x;
			squareY=y;
			repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("click to move or drag rec",10,20); //draw text instead of using label since on panel
		g.setColor(Color.RED);
		g.fillRect(squareX,squareY,squareW,squareH); //draw rec
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
}



public class BasicPaint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame f2 = new JFrame("그래픽 기초 프로그램");
		
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f2.add(new Panel2()); //add panel that painted
		f2.setSize(300,200);
		f2.setVisible(true);
	}

}
