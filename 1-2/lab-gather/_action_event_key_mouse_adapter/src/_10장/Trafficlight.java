package _10장;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel implements ActionListener{
	boolean flag = false;
	private int light_number =0;
	
	public MyPanel2() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}

	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawOval(100,100,100,100);
		g.drawOval(100,200,100,100);
		g.drawOval(100,300,100,100);
		
		if(light_number==0) {
			g.setColor(Color.RED);
			g.fillOval(100, 100, 100, 100);
		} else if(light_number ==1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 200, 100, 100);
		} else {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 300, 100, 100);
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(++light_number>=3)
			light_number=0;
			repaint();
		
	}
}

public class Trafficlight extends JFrame{
	
	public Trafficlight() {
		add(new MyPanel2());
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Trafficlight();

	}

}
