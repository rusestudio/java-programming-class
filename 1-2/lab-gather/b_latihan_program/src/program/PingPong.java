 package program;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


class ball {
	 
	 private static final int RADIUS = 20;
	 int x = 0;
	 int y = 0;
	 int xspeed =1;
	 int yspeed = 1;
	 private PingPong game;
	 Color color;
	 
	 public ball (PingPong game, Color color) {
		 this.game = game;
		 this.color = color;
	 }
	 
	 void move() {
		 if (x + xspeed <0)
			 xspeed =1;
		 if(x + xspeed > game.getWidth() -2 * RADIUS)
			 xspeed = -1;
		 if (y + xspeed <0)
			 yspeed =1;
		 if(y + yspeed > game.getHeight() -2 * RADIUS)
			 yspeed = -1;
		 if (collision()) {
			 xspeed = -xspeed;
		 }
		 
		 x = x + xspeed;
		 y = y + yspeed;
		 
	 }
	 
	 private boolean collision() {
		 return game.r1.getBounds().intersects(getBounds())
				 || game.r1.getBounds().intersects(getBounds());
	 }
	 
	 public void draw(Graphics2D g) {
		 g.setColor(color);
		 g.fillOval(x,y,2*RADIUS, 2*RADIUS);
	 }
	 
	 public Rectangle getBounds() {
		 return new Rectangle(x,y, 2*RADIUS, 2*RADIUS);
	 }
	 
 }
 
 class racquet {
	 
	 private static final int WIDTH =10;
	 private static final int HEIGHT =80;
	 int x=0;
	 int y=0;
	 int xspeed =1;
	 int yspeed = 1;
	 private PingPong game;
	 Color color;
	 
	 
	 public racquet(PingPong game, int x, int y, Color color) {
		 this.game = game;
		 this.x=x;
		 this.y=y;
		 this.color = color;
	 }
	 
	 public void move() {
		 if (y + yspeed > 0 && y + yspeed < game.getHeight() - HEIGHT)
			 y = y + yspeed;
	 }
	 
	 public void draw(Graphics2D g) {
		 g.setColor(color);
		 g.fillRect(x,y,WIDTH,HEIGHT);
	 }
	 
	 public void keyReleased(KeyEvent e) {
		 yspeed =0;
		 
	 }
	 
	 public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_UP)
			 yspeed = -3;
		 if(e.getKeyCode() == KeyEvent.VK_DOWN)
			 yspeed = 3;
	 }
	 
	 public Rectangle getBounds() {
		 return new Rectangle(x,y,WIDTH,HEIGHT);
	 }
	 
 }


public class PingPong extends JPanel implements KeyListener {
	
	ball b;
	racquet r1;
	racquet r2;
	
	public PingPong() {
		b = new ball(this, Color.red);
		this.setBackground(Color.green);
		r1 = new racquet(this, 10, 150, Color.blue);
		r2 = new racquet(this, 560, 150, Color.yellow);
		setFocusable(true);
		addKeyListener(this);
		
	}
	
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		r1.keyPressed(e);
		r2.keyPressed(e);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		r1.keyReleased(e);
		r2.keyReleased(e);
		
	}
	
	private void move() {
		b.move();
		r1.move();
		r2.move();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		b.draw(g2d);
		r1.draw(g2d);
		r2.draw(g2d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("pong game");
		f.setSize(600,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PingPong game = new PingPong();
		f.add(game);
		
		while (true) {
			game.move();
			game.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
