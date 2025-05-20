package graphiclatihan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class updownleftright extends JPanel implements ActionListener {
	
	private final int START_X =0;
	private final int START_Y=100;
	private final int WIDTH=50;
	private final int HEIGHT =50;
	private Timer timer;//Fires an event every 10 milliseconds, 
	           //triggering the actionPerformed method to update the circle’s position.
	private int x,y,a,b;
	private int xSpeed = 1;          // speed move x
	private int ySpeed = 1;
	private int aSpeed = 1;
	private int bSpeed = 1;
	
	public updownleftright() {
		
		setPreferredSize(new Dimension(300, 300)); // Panel size
		
		x=START_X;
		y=START_Y;
		timer = new Timer(10,this);//0.01초(10밀리초)마다 x방향을 기준으로 1씩 이동하도록
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.ORANGE); //circle color blue
		g.fillOval(x, y, WIDTH, HEIGHT); //fill circle blue
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("애니메이션");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new updownleftright());
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x += xSpeed; //increase 1 everytime time increase
		y -= ySpeed; //increase 1 everytime time increase
		//a += aSpeed; //increase 1 everytime time increase
		//b -= bSpeed; //increase 1 everytime time increase
		
		// if circle hit panel
		if (x < 0 || x + WIDTH > getWidth()) {
			// Reverse the horizontal direction, change direction right left
			xSpeed = -xSpeed;
		}
			// if circle hit panel
			if (y <0 || y + HEIGHT > getHeight()) {
				// Reverse the horizontal direction, change direction up down
				ySpeed = -ySpeed;
	}repaint();

}}
