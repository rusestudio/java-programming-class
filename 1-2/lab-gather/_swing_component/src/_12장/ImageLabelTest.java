package _12장;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ImageLabelTest extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		setTitle("image label");
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("click to see image");
		
		button = new JButton("image label");
		ImageIcon icon = new ImageIcon("icon.gif");
		button.setIcon(icon);
		button.setPreferredSize(new Dimension(200, 30)); // Increased width to 200
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ImageLabelTest img = new ImageLabelTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ImageIcon img = new ImageIcon("imgs/img1.jpg");
		
		label.setIcon(img);
		label.setText(null);
		
	}

}
