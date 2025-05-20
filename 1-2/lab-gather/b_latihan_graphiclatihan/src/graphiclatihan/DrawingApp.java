package graphiclatihan;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingApp extends JFrame{

	 private DrawingCanvas canvas;

	    public DrawingApp() {
	        setTitle("Drawing App");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        canvas = new DrawingCanvas();
	        canvas.addMouseListener(new DrawingMouseListener());
	        canvas.addKeyListener(new CanvasKeyListener());
	        canvas.setFocusable(true);

	        add(canvas);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new DrawingApp();
	    }

	    // Inner class for the drawing canvas
	    private class DrawingCanvas extends JPanel {
	        Point start, end;

	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            setBackground(Color.WHITE);
	            if (start != null && end != null) {
	                Graphics2D g2 = (Graphics2D) g;
	                g2.setStroke(new BasicStroke(2));
	                g2.drawLine(start.x, start.y, end.x, end.y);
	            }
	        }
	    }

	    // Inner class for handling mouse events
	    private class DrawingMouseListener implements MouseListener {
	        @Override
	        public void mousePressed(MouseEvent e) {
	            canvas.start = e.getPoint();
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            canvas.end = e.getPoint();
	            canvas.repaint();
	        }

	        @Override
	        public void mouseClicked(MouseEvent e) {}
	        @Override
	        public void mouseEntered(MouseEvent e) {}
	        @Override
	        public void mouseExited(MouseEvent e) {}
	    }

	    // Inner class for handling key events
	    private class CanvasKeyListener implements KeyListener {
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
	                canvas.start = null;
	                canvas.end = null;
	                canvas.repaint();
	            }
	        }

	        @Override
	        public void keyReleased(KeyEvent e) {}
	        @Override
	        public void keyTyped(KeyEvent e) {}
	    }
	}
