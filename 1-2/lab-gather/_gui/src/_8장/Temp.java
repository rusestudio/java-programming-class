package _8장;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame f= new JFrame();
		 JPanel panel= new JPanel();
		 f.add(panel);
		 
		 JLabel label1= new JLabel("화씨온도");
		 JLabel label2= new JLabel("섭씨온도");
		 JTextField field1= new JTextField(15);
		 JTextField field2= new JTextField(15);
		 JButton button= new JButton("변환");
		 
		 panel.add(label1);
		 panel.add(field1);
		 panel.add(label2);
		 panel.add(field2);
		 panel.add(button);
		 
		 f.setSize(300, 150);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setTitle("온도변환기");
		 f.setVisible(true);

	}

}
