package _10장;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InheritActionListener extends JFrame implements ActionListener {
	
	private JButton button;
	private JLabel label;
	
	public InheritActionListener() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test3");
		
		JPanel panel = new JPanel();
		
		button = new JButton("click me");
		label = new JLabel("didnt click me yet");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			label.setText("button clicked");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      InheritActionListener ial = new InheritActionListener();
	}


}
