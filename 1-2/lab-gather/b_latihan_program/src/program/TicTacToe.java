package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private JButton startButton = new JButton("Start Timer");
    private JButton quitButton = new JButton("Quit");
    private JLabel timerLabel = new JLabel("Time Left: 30", SwingConstants.CENTER);
    private JLabel scoreLabel = new JLabel("Player X: 0 | Player O: 0", SwingConstants.CENTER);
    private JLabel finalMessageLabel = new JLabel("", SwingConstants.CENTER);
    private boolean playerX = true; // true for Player X, false for Player O
    private int playerXScore = 0;
    private int playerOScore = 0;
    private Timer timer;
    private int timeLeft = 30;
    private boolean gameRunning = false;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(3, 3));

        // Initialize buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].setEnabled(false);
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        JPanel controlPanel = new JPanel(new GridLayout(4, 1));
        startButton.addActionListener(e -> startGame());
        quitButton.addActionListener(e -> quitGame());
        controlPanel.add(timerLabel);
        controlPanel.add(scoreLabel);
        controlPanel.add(startButton);
        controlPanel.add(quitButton);

        add(boardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(finalMessageLabel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameRunning) return;

        JButton buttonClicked = (JButton) e.getSource();

        if (!buttonClicked.getText().equals("")) {
            return; // Ignore clicks on already filled buttons
        }

        if (playerX) {
            buttonClicked.setText("X");
            buttonClicked.setForeground(Color.RED);
        } else {
            buttonClicked.setText("O");
            buttonClicked.setForeground(Color.BLUE);
        }

        if (checkWin()) {
            if (playerX) {
                playerXScore++;
            } else {
                playerOScore++;
            }
            updateScore();
            resetGame();
        } else if (isBoardFull()) {
            resetGame();
        } else {
            playerX = !playerX; // Switch turns
        }
    }

    private boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                !buttons[i][0].getText().equals("")) {
                return true;
            }
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                !buttons[0][i].getText().equals("")) {
                return true;
            }
        }

        // Check diagonals
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText()) &&
            !buttons[0][0].getText().equals("")) {
            return true;
        }
        if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText()) &&
            !buttons[0][2].getText().equals("")) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        playerX = true;
    }

    private void startGame() {
        if (gameRunning) return;

        gameRunning = true;
        timeLeft = 30;
        timerLabel.setText("Time Left: " + timeLeft);
        finalMessageLabel.setText("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(true);
            }
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeLeft--;
                SwingUtilities.invokeLater(() -> timerLabel.setText("Time Left: " + timeLeft));
                if (timeLeft <= 0) {
                    timer.cancel();
                    gameRunning = false;
                    endGame();
                }
            }
        }, 1000, 1000);
    }

    private void quitGame() {
        if (timer != null) {
            timer.cancel();
        }
        gameRunning = false;
        endGame();
    }

    private void endGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
        String finalMessage;
        if (playerXScore > playerOScore) {
            finalMessage = "Player X wins overall!";
        } else if (playerOScore > playerXScore) {
            finalMessage = "Player O wins overall!";
        } else {
            finalMessage = "It's a draw overall!";
        }
        finalMessageLabel.setText("Final Score: Player X: " + playerXScore + " | Player O: " + playerOScore + " | " + finalMessage);
        resetGame();
    }

    private void updateScore() {
        scoreLabel.setText("Player X: " + playerXScore + " | Player O: " + playerOScore);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToe game = new TicTacToe();
            game.setVisible(true);
        });
    }
}
