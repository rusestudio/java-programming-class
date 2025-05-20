package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGraphics {

    private JFrame frame;
    private HangmanPanel hangmanPanel;
    private JLabel wordLabel;
    private JTextField inputField;
    private JButton guessButton;
    private JLabel scoreLabel;
    private String word;
    private List<Character> playerGuesses;
    private int wrongCount;
    private int score;

    public HangmanGraphics() throws FileNotFoundException {
        initializeStartPanel();
    }

    private void initializeStartPanel() {
        frame = new JFrame("Hangman Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel startPanel = new JPanel();
        startPanel.setLayout(new GridLayout(3, 1));

        JLabel playerLabel = new JLabel("1 or 2 players?", SwingConstants.CENTER);
        playerLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        startPanel.add(playerLabel);

        JTextField playerInput = new JTextField();
        startPanel.add(playerInput);

        JButton startButton = new JButton("Start");
        startPanel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String players = playerInput.getText();
                if (players.equals("1")) {
                    try {
                        initializeSinglePlayerGame();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                } else if (players.equals("2")) {
                    initializeTwoPlayerSetup();
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter 1 or 2.");
                }
            }
        });

        frame.add(startPanel);
        frame.setVisible(true);
    }

    private void initializeSinglePlayerGame() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("KNU.txt"));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }

        Random rand = new Random();
        word = words.get(rand.nextInt(words.size()));

        initializeGamePanel();
    }

    private void initializeTwoPlayerSetup() {
        frame.getContentPane().removeAll();

        JPanel setupPanel = new JPanel();
        setupPanel.setLayout(new GridLayout(3, 1));

        JLabel enterWordLabel = new JLabel("Player 1, enter your word:", SwingConstants.CENTER);
        enterWordLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        setupPanel.add(enterWordLabel);

        JTextField wordInput = new JTextField();
        setupPanel.add(wordInput);

        JButton proceedButton = new JButton("Proceed");
        setupPanel.add(proceedButton);

        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                word = wordInput.getText();
                if (word.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid word.");
                } else {
                    initializeGamePanel();
                }
            }
        });

        frame.add(setupPanel);
        frame.revalidate();
        frame.repaint();
    }

    private void initializeGamePanel() {
        frame.getContentPane().removeAll();

        playerGuesses = new ArrayList<>();
        wrongCount = 0;
        score = 0;

        hangmanPanel = new HangmanPanel();
        frame.add(hangmanPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        wordLabel = new JLabel(getWordState(), SwingConstants.CENTER);
        wordLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        bottomPanel.add(wordLabel, BorderLayout.NORTH);

        inputField = new JTextField();
        bottomPanel.add(inputField, BorderLayout.CENTER);

        guessButton = new JButton("Guess");
        bottomPanel.add(guessButton, BorderLayout.EAST);
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });

        scoreLabel = new JLabel("Score: " + score, SwingConstants.CENTER);
        scoreLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        bottomPanel.add(scoreLabel, BorderLayout.SOUTH);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.revalidate();
        frame.repaint();
    }

    private void handleGuess() {
        String guess = inputField.getText();
        if (guess.isEmpty() || guess.length() > 1) {
            JOptionPane.showMessageDialog(frame, "Please enter a single letter.");
            return;
        }

        char guessedChar = guess.charAt(0);
        if (playerGuesses.contains(guessedChar)) {
            JOptionPane.showMessageDialog(frame, "You already guessed that letter.");
            return;
        }

        playerGuesses.add(guessedChar);
        if (word.contains(String.valueOf(guessedChar))) {
            score++;
        } else {
            score--;
            wrongCount++;
        }

        wordLabel.setText(getWordState());
        scoreLabel.setText("Score: " + score);
        hangmanPanel.repaint();

        if (wrongCount >= 6) {
            JOptionPane.showMessageDialog(frame, "You lose! The word was: " + word);
            System.exit(0);
        }

        if (isWordGuessed()) {
            JOptionPane.showMessageDialog(frame, "You win! Final score: " + score);
            System.exit(0);
        }

        inputField.setText("");
    }

    private String getWordState() {
        StringBuilder state = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (playerGuesses.contains(c)) {
                state.append(c).append(" ");
            } else {
                state.append("_ ");
            }
        }
        return state.toString().trim();
    }

    private boolean isWordGuessed() {
        for (char c : word.toCharArray()) {
            if (!playerGuesses.contains(c)) {
                return false;
            }
        }
        return true;
    }

    private class HangmanPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(2));

            g2d.drawLine(50, 300, 200, 300); // Base
            g2d.drawLine(125, 300, 125, 50); // Pole
            g2d.drawLine(125, 50, 200, 50);  // Beam
            g2d.drawLine(200, 50, 200, 100); // Rope

            if (wrongCount >= 1) g2d.drawOval(175, 100, 50, 50); // Head
            if (wrongCount >= 2) g2d.drawLine(200, 150, 200, 220); // Body
            if (wrongCount >= 3) g2d.drawLine(200, 170, 170, 200); // Left Arm
            if (wrongCount >= 4) g2d.drawLine(200, 170, 230, 200); // Right Arm
            if (wrongCount >= 5) g2d.drawLine(200, 220, 170, 270); // Left Leg
            if (wrongCount >= 6) g2d.drawLine(200, 220, 230, 270); // Right Leg
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new HangmanGraphics();
    }
}
