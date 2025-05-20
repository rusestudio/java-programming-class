package _11장;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Panel5 extends JPanel implements ActionListener{
	
	private JButton cb;
	Color color = new Color(0,0,0); //color black;
	
	public Panel5() {
		setLayout(new BorderLayout());
		cb = new JButton("색상 변경");
		cb.addActionListener(this);
		add(cb,BorderLayout.SOUTH);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //call method for draw
		g.drawRect(10, 10, 270, 270); //draw rec
		g.setColor(color);
		g.fillRect(10, 10, 270, 270);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = new Color((int)(Math.random()*256),
				(int)(Math.random()*256),
				(int)(Math.random()*256));
		repaint();
	}
}

public class Colorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        JFrame cf = new JFrame("Change rec color");
		cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cf.add(new Panel5()); //add panel that painted
		cf.setSize(300,350);
		cf.setVisible(true);
		
	}

}
