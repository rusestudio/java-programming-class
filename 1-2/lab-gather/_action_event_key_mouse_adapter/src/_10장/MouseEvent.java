package _10장;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


class FrameMe extends JFrame implements MouseListener,MouseMotionListener{
	
	public FrameMe() {
		 setTitle("Mouse Event");
		 setSize(300, 200);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel panel1 = new JPanel();
		 panel1.addMouseListener(this);
		 panel1.addMouseMotionListener(this);
		 add(panel1);
		 setVisible(true);
		 
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse dragged", e);
		
	}

	private void display(String s, java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(s + " X=" + e.getX() + " Y=" + e.getY());
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse moved", e);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse clicked (# of clicks:"+ e.getClickCount()+ ")", e);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse pressed (# of clicks:"+ e.getClickCount()+ ")", e);
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse released (# of clicks:"+ e.getClickCount()+ ")", e);
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse entered", e);
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouse exited", e);
	}
}

public class MouseEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FrameMe fm = new FrameMe();
	}

}
