package _10장;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener{
	
	private JTextField txt;
	private JPanel panel;
	
	public KeyPad() {
		
		txt = new JTextField(25);
		add(txt,BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		add(panel,BorderLayout.CENTER);
		
		for(int i=1;i<=9; i++) {
			JButton btn = new JButton(""+i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100,100));
			btn.setFont(new Font("Serif",Font.BOLD,20));
			panel.add(btn);
		}
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("test6");
		setVisible(true);
		
	}
	
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText()+ actionCommand);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new KeyPad();

	}


}
