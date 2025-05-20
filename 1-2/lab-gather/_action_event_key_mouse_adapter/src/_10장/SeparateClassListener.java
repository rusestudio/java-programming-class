package _10장;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class separate_actionclass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		button.setText("click clicked");
	}

}

class FrameSeparateClass extends JFrame{
	private JButton button;
	private JLabel label;

	public FrameSeparateClass() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test1");

		JPanel panel = new JPanel();

		button = new JButton("click me");
		button.addActionListener(new separate_actionclass());
		label = new JLabel("didnt click me yet");

		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}
}


public class SeparateClassListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSeparateClass f = new FrameSeparateClass();

	}

}
