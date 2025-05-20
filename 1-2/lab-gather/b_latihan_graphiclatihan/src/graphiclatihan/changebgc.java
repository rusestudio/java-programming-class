package graphiclatihan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class frame1 extends JFrame implements ActionListener{
	
	private JButton red;
	private JButton blue;
	private JButton green;
	private JPanel panel;

	
	public frame1() {
		
		panel = new JPanel(new FlowLayout());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Panel color");
		add(BorderLayout.CENTER,panel);
		
		red = new JButton("Red");
		blue = new JButton("Blue");
		green = new JButton("Green");
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		
        red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		
		setVisible(true);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==red) {
		panel.setBackground(Color.red);
		}
		if(e.getSource()==blue) {
			panel.setBackground(Color.blue);
		}
		if(e.getSource()==green) {
			panel.setBackground(Color.green);
		}
	
}
}
public class changebgc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new frame1();
	}

}
