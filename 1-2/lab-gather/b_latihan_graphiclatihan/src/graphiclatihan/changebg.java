package graphiclatihan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class changebg extends JPanel implements MouseListener{
	
	private Color backgroundColor = Color.WHITE; // start bg color
	
	public changebg() {
		
		setPreferredSize(new Dimension(300, 300));
		this.addMouseListener(this); //add listener to the panel
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(backgroundColor);;//start set background wite
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("change bg ");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new changebg());
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount()==1) { //get source is to identify object that cause event 
			backgroundColor = new Color((int) (Math.random() * 256), //change bg
					(int) (Math.random() * 256),
					(int) (Math.random() * 256));
	    }repaint();
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
		
	}}
