package _10장;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InnerClassListener extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	public InnerClassListener() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test2");

		JPanel panel = new JPanel();

		button = new JButton("click me");
		button.addActionListener(new InnerClassActionListener());

		label = new JLabel("didnt click me yet");

		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}
	
	private class InnerClassActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("button clicked");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerClassListener ifc = new InnerClassListener();

	}

}
