package _11장;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BezierCurve extends JFrame implements MouseListener, MouseMotionListener {
	
	private int[] xs = {50,150,400,450};
	private int[] ys = {200,50,300,200};
	
	private int dragIndex = -1;
	
	private MyPanel drawPanel;
	
	class MyPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.fillRect(xs[0], ys[0],16, 16);
			g.fillRect(xs[2], ys[2],16, 16);
			g.setColor(Color.red);
			g.fillRect(xs[1],ys[1],16,16); 
			g.fillRect(xs[3],ys[3],16,16); 
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.BLACK);
			GeneralPath path = new GeneralPath();
			path.moveTo(xs[0], ys[0]);
			path.curveTo(xs[1], ys[1], xs[2], ys[2], xs[3], ys[3]);
			g2d.draw(path);
		}
		
	}
	
	public BezierCurve() {
		setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bezier Curve");
        
        drawPanel = new MyPanel();
        drawPanel.addMouseListener(this);
        drawPanel.addMouseMotionListener(this);
        add(drawPanel,BorderLayout.CENTER);
        
        setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(dragIndex!= -1) {
            xs[dragIndex] = e.getX();
            ys[dragIndex] = e.getY();
            
        }
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		dragIndex = -1;
		
        for(int i=0; i<4; i++) {
        	Rectangle r = new Rectangle(xs[i]-4, ys[i]-4, 20,20);
        	if(r.contains(e.getX(), e.getY())) {
                dragIndex = i;
            }
        }
        repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		dragIndex = -1;
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BezierCurve();
	}

}
