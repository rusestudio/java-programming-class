package _10장;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorFrame extends JFrame{
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	public ColorFrame() {
		
		setTitle("test9");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		button1 = new JButton("yellow");
		button1.addActionListener(new MyListener()); // 내부 class
		panel.add(button1);
		
		button2 = new JButton("pink");
		button2.addActionListener(new MyListener()); // 내부 class
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
		
	}


private class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) { //get source is to identify object that cause event 
			panel.setBackground(Color.YELLOW);
		} else if(e.getSource()==button2) { //if button is obj that cause event(click)
			panel.setBackground(Color.PINK);
		}
	}
	
}
}

public class Changebgcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorFrame cf = new ColorFrame();

	}

}
