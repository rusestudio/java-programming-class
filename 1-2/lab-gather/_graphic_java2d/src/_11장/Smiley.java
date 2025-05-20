package _11장;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel3 extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(20, 30, 200, 200);
		g.setColor(Color.black);
		
		g.drawArc(60, 80, 50, 50, 180, -180);// draw smily eye left
		g.drawArc(130, 80, 50, 50, 180, -180);// x,y, wid,heighdraw smily eye right
		g.drawLine(45,130, 70,130); //cheeck line1 x1,y2,x2,y2
		g.drawLine(175,130, 200,130); //cheeck line2 x1,y2,x2,y2
		g.drawArc(70, 90, 100, 100, 180, 180);// draw mouth
		
		//smiley num2
		g.setColor(Color.BLUE);
		g.fillOval(20, 250, 200, 200);
		g.setColor(Color.black);
		
		g.drawArc(60, 300, 50, 50, 180, -180); //eye left
		g.drawArc(130, 300, 50, 50, 180, -180);//eye right
		g.drawArc(70, 300, 100, 100, 180, 180);// draw mouth
		
	}
}

public class Smiley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame smile = new JFrame();
		
        smile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        smile.add(new Panel3()); //add panel that painted
        smile.setSize(280,500);
        smile.setTitle("smily face");
        smile.setVisible(true);

	}

}
