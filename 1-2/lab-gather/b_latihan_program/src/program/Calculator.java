package program;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JTextField display;
	private JButton[] buttons;
	private String[] labels = {"Backspace", " ", " ","CE", "C", 
			    "7", "8", "9", "/", "sqrt",
                "4", "5", "6", "x", "%",
                "1", "2", "3", "-", "1/x",
                "0", "+/-", ".", "+", "="};
	private double result =0;
	private String operator = "=";
	private boolean startOfNumber = true;
	
	public Calculator(){
		display =  new JTextField(35);
		panel = new JPanel();
		display.setText("0.0");
		display.setEditable(false);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		
		int index =0;
		for(int rows =0; rows <5; rows++) {
			for(int cols =0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
                if(cols >=3) {
                    buttons[index].setForeground(Color.RED);
                } else {
                    buttons[index].setForeground(Color.BLUE);
                }
                buttons[index].setBackground(Color.YELLOW);
                buttons[index].addActionListener(this);
                panel.add(buttons[index]);
                index++;
			}
		}
		
		add(display, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
				
	}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String command = e.getActionCommand();
			
			if(command.charAt(0)=='C') { //for clear button
				display.setText("0.0");
                result = 0;
                operator = "=";
                startOfNumber = true;
			} else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
				if(startOfNumber == true)
					display.setText(command);
				else
					display.setText(display.getText() + command);
                startOfNumber = false;
			} else {
				if(startOfNumber) {
					if(command.equals("-")) {
						display.setText(command);
						startOfNumber = false;
					} else 
						operator = command;
				} else {
					double x = Double.parseDouble(display.getText());
					calculate(x);
					operator = command;
					startOfNumber = true;
				}
			}

}
		
		public void calculate(double n) {
			
			if(operator.equals("+"))
				result += n;
            else if(operator.equals("-"))
            	result -= n;
            else if(operator.equals("*"))
            	result *= n;
            else if(operator.equals("/"))
            	result /=n;
            else if(operator.equals("="))
            	result = n;
			display.setText(" " + result);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator s = new Calculator();
}


}
