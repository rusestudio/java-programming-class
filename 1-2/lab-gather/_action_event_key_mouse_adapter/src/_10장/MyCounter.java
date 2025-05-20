package _10장;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyCounter extends JFrame implements ActionListener{
	
	private JLabel label, label1;
	private JButton button;
	private int count =0;
	
	public MyCounter() {
		JPanel panel5 = new JPanel();
		label = new JLabel("Counter");
		panel5.add(label);
		
		label1 = new JLabel("Counter");
		panel5.add(label);
		
		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		panel5.add(label1);
		
		button = new JButton("increase");
		panel5.add(button);
		button.addActionListener(this);
		
		add(panel5);
		setSize(300,200);
		setTitle("my counter");
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new MyCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label1.setText(count + "");
	}

}
