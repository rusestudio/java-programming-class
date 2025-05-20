package labw11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class RPSGame extends JFrame implements ActionListener {
	
	private JLabel playerChoiceLabel, computerChoiceLabel, 
	resultLabel, scoreLabel,totalLabel;
	private JButton rockButton, paperButton, scissorsButton, restartButton;
	private ImageIcon rockIcon, paperIcon, scissorsIcon;
	private int wins = 0, losses= 0, draws = 0, score= 0;
	private String[] choices = {"가위", "바위", "보"};
	private Random random = new Random();
	
	
	public RPSGame() {
		
		setTitle("가위바위보 게임");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(0,25));
		
		//result panel
		JPanel resultPanel = new JPanel();
		resultPanel.setLayout(new GridLayout(1,4));
        
        scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        resultLabel = new JLabel("", SwingConstants.CENTER);
        totalLabel = new JLabel("0승 0무 0패", SwingConstants.CENTER);
        
        restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> restart());
        
        resultPanel.add(totalLabel);
        resultPanel.add(resultLabel);
        resultPanel.add(scoreLabel);
        resultPanel.add(restartButton);
        
        add(resultPanel, BorderLayout.NORTH);
        
        
        //choice panel
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(new GridLayout(1,2));
        
       JPanel playerPanel = new JPanel(new BorderLayout());
       playerPanel.add(new JLabel("플레이어", SwingConstants.CENTER), BorderLayout.NORTH);
       playerChoiceLabel = new JLabel("", SwingConstants.CENTER);
       playerPanel.add(playerChoiceLabel, BorderLayout.CENTER);
       
       JPanel computerPanel = new JPanel(new BorderLayout());
       computerPanel.add(new JLabel("컴퓨터", SwingConstants.CENTER), BorderLayout.NORTH);
       computerChoiceLabel = new JLabel("", SwingConstants.CENTER);
       computerPanel.add(computerChoiceLabel, BorderLayout.CENTER);
       
       choicePanel.add(playerPanel);
       choicePanel.add(computerPanel);
        
       add(choicePanel, BorderLayout.CENTER);
       
       
       //button panel
       JPanel buttonPanel = new JPanel();
       
       rockIcon = createIcon("imgs/rock.png");
       paperIcon = createIcon("imgs/paper.png");
       scissorsIcon = createIcon("imgs/scissors.png");
       
       rockButton = createButton(rockIcon);
       paperButton = createButton(paperIcon);
       scissorsButton = createButton(scissorsIcon);
    		   
       buttonPanel.add(rockButton);
       buttonPanel.add(paperButton);
       buttonPanel.add(scissorsButton);
       
       add(buttonPanel, BorderLayout.SOUTH);
       
       //TODO: 버튼 패널 border 설정
       Border border = BorderFactory.createTitledBorder("선택");
       buttonPanel.setBorder(border);
       
       setVisible(true);
	}
	
	
	private ImageIcon createIcon(String imagePath) {
		
		ImageIcon icon = new ImageIcon(imagePath);
		Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);
		return icon;
	}
	
	private JButton createButton(ImageIcon icon) {
		//TODO: 버튼 생성
		
		JButton button = new JButton(icon);
        button.addActionListener(this);
        return button;
		
	}
	
	private void restart() {
		//TODO: 초기 화면
		wins = 0;
		losses= 0;
		draws = 0;
		score= 0;
		
		playerChoiceLabel.setIcon(null);
		computerChoiceLabel.setIcon(null);
		resultLabel.setText("");
		scoreLabel.setText("Score: 0");
		totalLabel.setText("0승 0무 0패");
    }
	
	//TODO: 그외 필요한 코드 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton) e.getSource();
		ImageIcon playerChoice = (ImageIcon) clickedButton.getIcon();
		playerChoiceLabel.setIcon(playerChoice);
		
		int computerChoiceIndex = random.nextInt(3);
		ImageIcon computerChoice = null;
		
		switch(computerChoiceIndex) {
		case 0:
			computerChoice = scissorsIcon;
            break;
		case 1:
			computerChoice = rockIcon;
            break;
		case 2:
			computerChoice = paperIcon;
            break;
		}
		computerChoiceLabel.setIcon(computerChoice);

		String result = determineWinner(playerChoice, computerChoice);
		resultLabel.setText(result);

		updateScore(result);
		scoreLabel.setText("Score: " + score);
		totalLabel.setText(wins + "승 " + draws + "무 " + losses + "패");

	}
	
	private String determineWinner(ImageIcon playerChoice, ImageIcon computerChoice) {
		if(playerChoice == computerChoice) {
			draws++;
			//resultLabel.setText("무승부");
            return "무승부";
		}else if
		((playerChoice == scissorsIcon && computerChoice ==paperIcon)||
		(playerChoice ==rockIcon && computerChoice ==scissorsIcon)||
		(playerChoice == paperIcon && computerChoice == rockIcon)) {
			wins++;
			//resultLabel.setText("승리!!"+ score +"점 획득");
			return "승리!!";
		}else {
			losses++;
			//resultLabel.setText("패배!!"+ score +"점 차감");
			return "패배!!";
		}
		
	}
	
	private void updateScore(String result) {
		
		int randompoint = random.nextInt(10) + 1;
		
		if (result.equals("승리!!")) {
            score += randompoint; //tp get score + the random point
            resultLabel.setText("승리!!"+randompoint+"점 획득");
        } else if (result.equals("패배!!")) {
            score -= randompoint;;
            resultLabel.setText("패배!!"+randompoint+"점 차감");
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new RPSGame();
	}


	

}
