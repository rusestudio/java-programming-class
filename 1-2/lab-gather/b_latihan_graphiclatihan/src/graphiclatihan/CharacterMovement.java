package graphiclatihan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class CharacterMovement extends JFrame implements KeyListener{
	
	 private int x = 50, y = 50;

	    public CharacterMovement() {
	        setTitle("Character Movement");
	        setSize(600, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        addKeyListener(this);
	        setFocusable(true);

	        setVisible(true);
	    }

	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        g.setColor(Color.RED);
	        g.fillRect(x, y, 50, 50);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new CharacterMovement();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
        case KeyEvent.VK_UP -> y = Math.max(0, y - 10);
        case KeyEvent.VK_DOWN -> y = Math.min(getHeight() - 70, y + 10); // Account for title bar height
        case KeyEvent.VK_LEFT -> x = Math.max(0, x - 10);
        case KeyEvent.VK_RIGHT -> x = Math.min(getWidth() - 50, x + 10);
    }
    repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
