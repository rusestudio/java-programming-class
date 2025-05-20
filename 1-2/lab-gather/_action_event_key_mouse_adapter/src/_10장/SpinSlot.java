package _10장;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpinSlot extends JFrame implements ActionListener {
	
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	
	public SpinSlot() {
		setSize(500,300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		labels = new JLabel[3];
		numbers = new int[3];
		
		for( int i =0; i <3; i++) {
			labels[i] = new JLabel("" +numbers[i]);
			labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setSize(100,100);
			labels[i].setLocation(100 + 100*i, 20);
			panel.add(labels[i]);
		}
		
		
		button = new JButton("Spin");
		button.setSize(250,50);
		button.setLocation(100, 150);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setTitle("My Spin");
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 3; i++) {
			numbers[i] = (int)(Math.random()*10);
            labels[i].setText("" + numbers[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new SpinSlot();
	}

}
