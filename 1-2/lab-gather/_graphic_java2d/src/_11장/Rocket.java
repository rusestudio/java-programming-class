package _11장;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

class panelr extends JPanel implements ActionListener{
	
	private final int WIDTH =500;
	private final int HEIGHT =300;
	private final int START_X =0;
	private final int START_Y =250;
	private BufferedImage image;
	private Timer timer;
	private int x, y;
	
	public panelr() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setDoubleBuffered(true);
		
		File input =  new File("imgs/img1.jpg");
		try {
			image = ImageIO.read(input);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		x= START_X;
		y=START_Y;
		timer = new Timer(20,this);
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image,x,y,this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x+=1;
		y-=1;
		if(x>WIDTH) {
			x=START_X;
			y=START_Y;
		}
		repaint();
	}
	
}

public class Rocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame rf = new JFrame();
		
		rf.add(new panelr());
		 rf.setTitle("애니메이션테스트");
		 rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 rf.setSize(500, 300);
		 rf.setVisible(true);

	}

}
