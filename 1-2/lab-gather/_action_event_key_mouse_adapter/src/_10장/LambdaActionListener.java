package _10장;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LambdaActionListener extends JFrame{
	
	private JButton button;
	private JLabel label;
	
	public LambdaActionListener() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test5");
		
		JPanel panel = new JPanel();
		
		button = new JButton("click me");
		label = new JLabel("didnt click me yet");
		button.addActionListener(e->{
			label.setText("button clicked");
		});
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaActionListener lal = new LambdaActionListener();
	}

}
