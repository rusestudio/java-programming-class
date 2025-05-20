package _12장;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Capture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame capture = new JFrame();
		
        capture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension d;
        Rectangle rect = new Rectangle(500,500);
        capture.setSize(d = new Dimension(500,500));
        
        try {
        	Robot robot = new Robot(); //capture screen
        	final BufferedImage image = robot.createScreenCapture(rect);
        	image.flush();
        	JPanel panel  = new JPanel() { //panel that will show the capture
        		public void paintComponent(Graphics g) {
                    g.drawImage(image, 0, 0, d.width, d.height, this); //add panel to frame
                }
        	};
        	panel.setOpaque(false);
        	panel.prepareImage(image,panel);
        	panel.repaint();
        	capture.getContentPane().add(panel);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        capture.setVisible(true);

	}

}
