package _10장;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor extends JFrame implements ActionListener{
	
	static final int ROCK =0;
	static final int PAPER=1;
	static final int SCISSOR=2;
	
	private JPanel panel;
	private JTextField output;
	private JTextField information;
	private JButton rock;
	private JButton paper;
	private JButton scissor;
	
	public RockPaperScissor() {
		
		setTitle("test8");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		information = new JTextField("click any button below");
		output = new JTextField(20);
		
		rock = new JButton("rock");
		paper= new JButton("paper");
		scissor = new JButton("scissor");
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		
		add(information,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		add(output,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int computer = random.nextInt(3);
		if(e.getSource()== rock) {
			if(computer == SCISSOR)
				output.setText("user win");
			else if(computer == ROCK)
				output.setText("same");
			else
				output.setText("computer win");
		} else if(e.getSource()== paper) {
			if(computer == ROCK)
				output.setText("user win");
			else if(computer == PAPER)
				output.setText("same");
			else
				output.setText("computer win");
		} else if(e.getSource()==scissor) {
			if(computer == PAPER)
				output.setText("user win");
			else if(computer == SCISSOR)
				output.setText("same");
			else
				output.setText("computer win");
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RockPaperScissor rps = new RockPaperScissor();
	}

}
