package _11장;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Colorchooser extends JFrame implements ChangeListener{
	
	protected JColorChooser color;
	
	public Colorchooser() {
		setTitle("choose color test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener(this);
		color.setBorder(BorderFactory.createTitledBorder("choose color"));
		
		JPanel panel6 = new JPanel();
		panel6.add(color);
		add(panel6);
		pack();
		this.setVisible(true);
	}
			
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		Color newColor = color.getColor();
		System.out.println(newColor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Colorchooser();
	}

}
