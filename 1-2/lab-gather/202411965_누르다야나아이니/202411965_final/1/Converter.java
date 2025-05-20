package test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Convert extends JFrame implements ActionListener {
	
	private JLabel salaryLabel;
	private JLabel rateInterestLabel;
	private JLabel yearLabel;
	private JTextField  salaryfield;
	private JTextField ratefield;
	private JTextField yearfield;
	private JButton convertButton;
	private JLabel resultLabel;
	int result;
	
	public Convert() {
		
		setSize(400,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		 
		//create panel label n field
		JPanel panel = new JPanel(new GridLayout(5, 2));
		
		salaryLabel = new JLabel("원금을 입력하시오.(원)");
		salaryfield = new JTextField();
		rateInterestLabel = new JLabel("연 이율을 입력하시어.(%)");
		ratefield = new JTextField();
		yearLabel = new JLabel("기간을 입력하시오.(년)");
		yearfield = new JTextField();
		panel.add(salaryLabel);
		panel.add(salaryfield);
		panel.add(rateInterestLabel);
		panel.add(ratefield);
		panel.add(yearLabel);
		panel.add(yearfield);
		add(BorderLayout.CENTER,panel);
		
		JPanel panel2 = new JPanel(new GridLayout(2,0));
		convertButton = new JButton("변환");
		panel2.add(convertButton);
		convertButton.addActionListener(this);
		
		resultLabel = new JLabel("이자는 ...");
		resultLabel.setEnabled(false);
		panel2.add(resultLabel);	
		
		add(BorderLayout.SOUTH,panel2);
		
		setVisible(true);
		setEnabled(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//when button click
		//calculate rate
		//return result
		//settext label to result
		
		 String salaryamt = salaryfield.getText();
		 int p = Integer.parseInt(salaryamt);
		 
		 String rateamt = ratefield.getText();
		 double r = Double.parseDouble(rateamt);
		 
		 String yearr = yearfield.getText();
		 int n = Integer.parseInt(yearr);
		
		 double rateval = Math.pow((1 + (r/100)), n);
		 
		if(e.getSource()==convertButton) {
			result = (int) (p * ((rateval) -1));	//double type
			resultLabel.setText("이자는 " + n + "년동안 "+ result + "원 입니다." );
		}
	}
	
}

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Convert();
	}

}
