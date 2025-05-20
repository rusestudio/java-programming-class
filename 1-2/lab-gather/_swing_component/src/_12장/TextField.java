package _12장;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TextField extends JFrame {
	private JButton b;
	private JTextField t,r;
	
	public TextField() {
		 setSize(300, 130);
		  setTitle("제곱계산하기");
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  ButtonListener l = new ButtonListener();
		  
		  JPanel p = new JPanel();
		  p.add(new JLabel("enter num:"));
		  t = new JTextField(15);
		  t.addActionListener(l);
		  p.add(t);
		  
		  p.add(new JLabel("squared val:"));
		  r= new JTextField(15);
		  r.setEditable(false);
		  p.add(r);
		  
		  b= new JButton("OK");
		  b.addActionListener(l);
		  p.add(b);
		  
		  add(p);
		  setVisible(true);
		  
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b || e.getSource()==t) {
				String name = t.getText();
				int value = Integer.parseInt(name);
				r.setText(" "+ value*value);
				t.requestFocus();
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TextField();
	}

}


