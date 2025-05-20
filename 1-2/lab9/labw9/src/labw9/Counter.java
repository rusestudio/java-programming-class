package labw9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Counter extends JFrame implements ActionListener{
	
	private JLabel labelcounter;
	private JButton buttonup;
	private JButton buttondown;
	private int counter=0;

	public Counter() {

		//make frame first
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("카운터");

		//label
		labelcounter = new JLabel(""+counter,SwingConstants.CENTER);
		labelcounter.setFont(new Font("Serif",Font.BOLD,100));
		add(labelcounter);

		//panel button
		JPanel panelbutton = new JPanel(new GridLayout(1,2));

		//button
		buttonup = new JButton("증가");
		buttondown = new JButton("감소");
		panelbutton.add(buttonup);
		buttonup.addActionListener(this);
		panelbutton.add(buttondown);
		buttondown.addActionListener(this);

		add(BorderLayout.SOUTH,panelbutton);
		setVisible(true);
		setEnabled(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//use setEnabled
		if(e.getSource()==buttonup) {
			counter++;
			labelcounter.setText(counter+"");
			if(counter%10==0 &&counter!=0) { //find 10의 배수 0재외
				labelcounter.setForeground(Color.RED);
			}else {
				labelcounter.setForeground(Color.BLACK);
			}
		}else if(e.getSource()==buttondown) {
			counter--;
			labelcounter.setText(counter+"");
			if(counter%10==0 &&counter!=0) { //find 10의 배수 0재외
				labelcounter.setForeground(Color.RED);
			}else {
				labelcounter.setForeground(Color.BLACK);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c = new Counter();

	}


}
