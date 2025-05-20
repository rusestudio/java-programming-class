package labw9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class TypingGame extends JFrame implements ActionListener,KeyListener {

	private JLabel wordLabel,scoreLabel,timerLabel;
	private JTextField inputField;
	private String[] words= {"red","green","blue","black","skyblue","orange","yellow","darkgray","white"};
	private String currentWord;
	private int score =0;
	private int timeLeft=30;
	private Timer timer;

	public TypingGame() {
		//make frame first
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("타자 게임");

		//panel1
		JPanel panel1 = new JPanel();
		scoreLabel = new JLabel("점수:"+score);
		panel1.add(scoreLabel);
		timerLabel = new JLabel("남은 시간:"+ timeLeft);
		panel1.add(timerLabel);

		//label
		wordLabel = new JLabel("",SwingConstants.CENTER);
		wordLabel.setFont(new Font("Serif",Font.BOLD,50));
		add(wordLabel);

		//panel2
		JPanel panel2 = new JPanel(new FlowLayout());
		JLabel inputLabel = new JLabel("입력:");
		panel2.add(inputLabel);
		inputField = new JTextField(15);
		panel2.add(inputField);
        inputField.addKeyListener(this);

		add(BorderLayout.NORTH,panel1);
		add(BorderLayout.SOUTH,panel2);
		setVisible(true);
        startGame();
	}

	private void startGame() {
		displayNewWord();
		timer = new Timer(1000,this);
		timer.start();
	}

	private void displayNewWord() {
		Random random = new Random();
		currentWord = words[random.nextInt(words.length)];
		wordLabel.setText(currentWord);
		wordLabel.setForeground(Color.BLACK);	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timeLeft--;
		timerLabel.setText("남은 시간: "+ timeLeft);
		if(timeLeft<=0) {
			timer.stop();
			endGame();
		}
	}

	private void endGame() {
		getContentPane().removeAll();
		JLabel endMessage = new JLabel("게임 종료! 최종 점수: " + score,SwingConstants.CENTER);
		endMessage.setFont(new Font("Serif",Font.BOLD,20));
		add(endMessage);
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if (inputField.getText().equals(currentWord)){
				score++;
				scoreLabel.setText("점수:"+score);
				displayNewWord();
				inputField.setText("");
			}else {
				wordLabel.setForeground(Color.RED);
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new TypingGame();
}

}
