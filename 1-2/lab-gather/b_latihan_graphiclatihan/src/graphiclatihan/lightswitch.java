package graphiclatihan;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class lightswitch extends JFrame implements ActionListener{
	
	private JButton on;
	private JButton off;
	public static int bg=0;
	
	public lightswitch(int bg) {
		this.bg = bg;
	}
	
	static int getBg() {
		return bg;
	}
	
	public lightswitch() {
		
		setTitle("light switch");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lightpanel panel = new Lightpanel();
		add(panel, BorderLayout.CENTER); //panel light
		
		JPanel btnPanel = new JPanel(new GridLayout(1,2)); //panel button
		
		on = new JButton("ON");
		on.addActionListener(this);
		btnPanel.add(on);
		
		off = new JButton("OFF");
		off.addActionListener(this);
		btnPanel.add(off);
		
		add(btnPanel, BorderLayout.SOUTH);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new lightswitch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==on) { //get source is to identify object that cause event 
			bg=1;
			//getContentPane().setBackground(Color.WHITE); // on bg white
			//setBackground(Color.WHITE);
			repaint();
		} else if(e.getSource()==off) { //if button is obj that cause event(click)
			bg=2;
			//getContentPane().setBackground(Color.BLUE); //off bg black
			//setBackground(Color.BLUE);
			repaint();
		}
	}

}

class Lightpanel extends JPanel {
	
	protected void paintComponent(Graphics g) {
		//TODO:draw the shape
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//drawlamp
		g2d.drawLine(230, 0, 230, 200);
		//drawtri
		 int[] xPoints = {230, 350, 110};
         int[] yPoints = {200, 280, 280};
         g2d.drawPolygon(xPoints, yPoints, 3);
         //draw arc
         g2d.drawArc(185, 235, 90, 90, -180, 180);
        
         //if bg white
         //fill arc yellow
         //if bg black
         //fill arc black
         
         int arcX = 185, arcY = 235, arcWidth = 90, arcHeight = 90;
         int centerX = arcX + arcWidth / 2;
         int centerY = arcY + arcHeight / 2;
         
         if(lightswitch.getBg()==1) {
        	 g2d.setColor(Color.YELLOW);
        	 g2d.fillArc(185, 235, 90, 90, -180, 180);
        	 
        	 // Lines radiating out from below the bulb
             for (int i = -4; i <= 4; i++) {
                 int offset = i * 10;  // Control distance between the lines
                 g2d.draw(new Line2D.Double(centerX, centerY + arcHeight / 2, centerX + offset, centerY + arcHeight + 50));
             }
        	 
        	 setBackground(Color.GREEN);
        	
         }
         if(lightswitch.getBg()==2) {
        	 g2d.setColor(Color.BLACK);
        	 g2d.fillArc(185, 235, 90, 90, -180, 180);
        	 setBackground(Color.BLUE);
        	
         }
         
         
		
	
	
}}
