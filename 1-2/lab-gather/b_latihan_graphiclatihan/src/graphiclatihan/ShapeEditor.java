package graphiclatihan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapeEditor  extends JFrame implements MouseListener, ActionListener {
	
	 private String selectedShape = "Rectangle";
	    private JPanel canvas;

	    public ShapeEditor() {
	        setTitle("Shape Editor");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel controlPanel = new JPanel();
	        JComboBox<String> shapeSelector = new JComboBox<>(new String[]{"Rectangle", "Circle", "Triangle"});
	        shapeSelector.addActionListener(e -> selectedShape = (String) shapeSelector.getSelectedItem());
	        JButton clearButton = new JButton("Clear");
	        clearButton.addActionListener(this);

	        controlPanel.add(shapeSelector);
	        controlPanel.add(clearButton);

	        canvas = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                setBackground(Color.WHITE);
	            }
	        };
	        canvas.addMouseListener(this);

	        add(controlPanel, BorderLayout.NORTH);
	        add(canvas, BorderLayout.CENTER);

	        setVisible(true);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShapeEditor();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 canvas.repaint();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 Graphics2D g = (Graphics2D) canvas.getGraphics();
	        if ("Rectangle".equals(selectedShape)) {
	            g.drawRect(e.getX(), e.getY(), 50, 30);
	        } else if ("Circle".equals(selectedShape)) {
	            g.drawOval(e.getX(), e.getY(), 30, 30);
	        } else if ("Triangle".equals(selectedShape)) {
	            int[] xPoints = {e.getX(), e.getX() + 20, e.getX() - 20};
	            int[] yPoints = {e.getY(), e.getY() + 30, e.getY() + 30};
	            g.drawPolygon(xPoints, yPoints, 3);
	        }
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

}
