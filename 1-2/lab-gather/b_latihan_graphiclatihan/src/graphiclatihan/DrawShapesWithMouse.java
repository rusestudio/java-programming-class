package graphiclatihan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class DrawShapesWithMouse extends JFrame implements MouseListener{
	
	
	 private JPanel panel;

	    public DrawShapesWithMouse() {
	        setTitle("Draw Shapes");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        panel = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                setBackground(Color.WHITE);
	            }
	        };
	        panel.addMouseListener(this);
	        add(panel);

	        setVisible(true);
	    }
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 Graphics g = panel.getGraphics();
	        if (SwingUtilities.isLeftMouseButton(e)) {
	            g.setColor(Color.BLUE);
	            g.fillOval(e.getX() - 15, e.getY() - 15, 30, 30);
	        } else if (SwingUtilities.isRightMouseButton(e)) {
	            panel.repaint();
	        }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
        new DrawShapesWithMouse();
    }
	
	

}
