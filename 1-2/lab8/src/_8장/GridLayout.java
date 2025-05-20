package _8장;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayout extends JFrame {
	
	public GridLayout() {
		
		 setTitle("GridLayoutTest");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 setLayout(new GridLayout(0, 3));
		 
		 add(new JButton("Button1"));
		 add(new JButton("Button2"));
		 add(new JButton("Button3"));
		 add(new JButton("B4"));
		 add(new JButton("Long Button5"));
		 
		 pack();
		 setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GridLayout gl = new GridLayout();

	}

}
