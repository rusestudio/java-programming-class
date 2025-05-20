package _10장;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Point{
	int x, y;
}

class Panel4 extends JPanel implements MouseMotionListener{
	private int index =0;
	Point[] array = new Point[1000];
	
	public Panel4() {
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(index>=1000)
			return;
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Point p: array)
			if(p != null)
				g.drawRect(p.x,p.y, 1,1);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class DrawCanvas extends JFrame {
	
	public DrawCanvas() {
		setSize(300,300);
		setTitle("마우스로 그림 그리기");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 add(new Panel4());
		 
		 setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawCanvas dc = new DrawCanvas();
	}

}
