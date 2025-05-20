package 실습14;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() throws InterruptedException {
	
	   setSize(300, 100);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setTitle("Count");
	
	  
	   JPanel panel1 = new JPanel();
	   panel1.setBackground(Color.YELLOW);
	
	   int count=0;
	   
	   JLabel label1 = new JLabel("카운터:" + count);
	   
	   panel1.add(label1);
	   add(panel1);
	   setVisible(true);
	   
	   while (true) {
		   Thread.sleep(1000);
		   count++;
		   label1.setText("카운터:"+ count);
	   }
	   
	   
	   
}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyFrame2 count = new MyFrame2();
		
		
	}

}
