package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class UserForm {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Sign Up, Login, and Feed");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new CardLayout());

        // Panels for Sign Up, Login, Landing Page, Dashboard, and Feed
        JPanel signUpPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        JPanel loginPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        JPanel landingPanel = new JPanel(new BorderLayout());
        JPanel feedPanel = new JPanel(new BorderLayout());

        // ArrayLists to store user data and posts
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();

        // ------------------ SIGN-UP PANEL ------------------
        JLabel signUpUsernameLabel = new JLabel("Username:");
        JTextField signUpUsernameField = new JTextField();
        JLabel signUpPasswordLabel = new JLabel("Password:");
        JPasswordField signUpPasswordField = new JPasswordField();
        JButton signUpButton = new JButton("Sign Up");
        JButton switchToLoginButton = new JButton("Go to Login");

        signUpPanel.add(signUpUsernameLabel);
        signUpPanel.add(signUpUsernameField);
        signUpPanel.add(signUpPasswordLabel);
        signUpPanel.add(signUpPasswordField);
        signUpPanel.add(signUpButton);
        signUpPanel.add(switchToLoginButton);

        // ------------------ LOGIN PANEL ------------------
        JLabel loginUsernameLabel = new JLabel("Username:");
        JTextField loginUsernameField = new JTextField();
        JLabel loginPasswordLabel = new JLabel("Password:");
        JPasswordField loginPasswordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton switchToSignUpButton = new JButton("Go to Sign Up");

        loginPanel.add(loginUsernameLabel);
        loginPanel.add(loginUsernameField);
        loginPanel.add(loginPasswordLabel);
        loginPanel.add(loginPasswordField);
        loginPanel.add(loginButton);
        loginPanel.add(switchToSignUpButton);

        // ------------------ LANDING PAGE PANEL ------------------
        JLabel landingWelcomeLabel = new JLabel("Welcome to Your Dashboard!", JLabel.CENTER);
        JButton uploadPictureButton = new JButton("Upload Picture");
        JButton viewFeedButton = new JButton("View Feed");
        JButton logoutButtonLanding = new JButton("Logout");
        JButton viewProfileButton = new JButton("View Profile");
        JPanel landingButtonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        

        landingButtonPanel.add(uploadPictureButton);
        landingButtonPanel.add(viewFeedButton);
        landingButtonPanel.add(logoutButtonLanding);
        landingButtonPanel.add(viewProfileButton);

        landingPanel.add(landingWelcomeLabel, BorderLayout.CENTER);
        landingPanel.add(landingButtonPanel, BorderLayout.SOUTH);

        // ------------------ FEED PAGE PANEL ------------------
        JLabel feedLabel = new JLabel("Feed", JLabel.CENTER);
        JPanel feedContentPanel = new JPanel();
        feedContentPanel.setLayout(new BoxLayout(feedContentPanel, BoxLayout.Y_AXIS));
        JScrollPane feedScrollPane = new JScrollPane(feedContentPanel);
        JButton backToLandingButton = new JButton("Back to Landing Page");

        feedPanel.add(feedLabel, BorderLayout.NORTH);
        feedPanel.add(feedScrollPane, BorderLayout.CENTER);
        feedPanel.add(backToLandingButton, BorderLayout.SOUTH);

        // Add panels to the frame
        frame.add(signUpPanel, "SignUp");
        frame.add(loginPanel, "Login");
        frame.add(landingPanel, "Landing");
        frame.add(feedPanel, "Feed");

        // CardLayout to switch between panels
        CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
        
     // ------------------ PROFILE PANEL ------------------
        JPanel profilePanel = new JPanel(new BorderLayout());
        JLabel profileLabel = new JLabel("Profile", JLabel.CENTER);
        JTextArea profileInfoArea = new JTextArea();
        profileInfoArea.setEditable(false);
        JScrollPane profileScrollPane = new JScrollPane(profileInfoArea);
        JButton backToLandingFromProfileButton = new JButton("Back to Landing Page");

        profilePanel.add(profileLabel, BorderLayout.NORTH);
        profilePanel.add(profileScrollPane, BorderLayout.CENTER);
        profilePanel.add(backToLandingFromProfileButton, BorderLayout.SOUTH);

        // Add the Profile Panel to the Frame
        frame.add(profilePanel, "Profile");

        // ------------------ BUTTON ACTIONS ------------------
        // Sign Up Button Action
        signUpButton.addActionListener(e -> {
            String username = signUpUsernameField.getText();
            String password = new String(signUpPasswordField.getPassword());

            if (!username.isEmpty() && !password.isEmpty()) {
                // Check if username is already taken
                boolean userExists = users.stream().anyMatch(user -> user.getUsername().equals(username));
                if (userExists) {
                    JOptionPane.showMessageDialog(frame, "Username already taken. Please choose another one.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Add user to the list
                    users.add(new User(username, password));
                    JOptionPane.showMessageDialog(frame, "Sign Up successful! Please log in.");
                    signUpUsernameField.setText("");
                    signUpPasswordField.setText("");
                    cardLayout.show(frame.getContentPane(), "Login");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Switch to Login Panel
        switchToLoginButton.addActionListener(e -> cardLayout.show(frame.getContentPane(), "Login"));

        // Login Button Action
        loginButton.addActionListener(e -> {
            String username = loginUsernameField.getText();
            String password = new String(loginPasswordField.getPassword());

            // Validate login
            User user = users.stream()
                    .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                    .findFirst()
                    .orElse(null);

            if (user != null) {
                // Login successful
                landingWelcomeLabel.setText("Welcome, " + user.getUsername() + "!");
                cardLayout.show(frame.getContentPane(), "Landing");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Upload Picture Button Action
        uploadPictureButton.addActionListener(e -> {
            String username = landingWelcomeLabel.getText().replace("Welcome, ", "").replace("!", "");
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                String caption = JOptionPane.showInputDialog(frame, "Enter a caption for the picture:");
                if (caption != null && !caption.isEmpty()) {
                    posts.add(new Post(username, filePath, caption));
                    JOptionPane.showMessageDialog(frame, "Picture and caption uploaded successfully!");
                }
            }
        });

        // View Feed Button Action
        viewFeedButton.addActionListener(e -> {
            feedContentPanel.removeAll();
            for (Post post : posts) {
                JPanel postPanel = new JPanel(new BorderLayout());
                JLabel pictureLabel = new JLabel(new ImageIcon(post.getFilePath()));
                JLabel captionLabel = new JLabel("Caption: " + post.getCaption());

                postPanel.add(pictureLabel, BorderLayout.CENTER);
                postPanel.add(captionLabel, BorderLayout.SOUTH);
                feedContentPanel.add(postPanel);
            }
            feedContentPanel.revalidate();
            feedContentPanel.repaint();
            cardLayout.show(frame.getContentPane(), "Feed");
        });
        
     // View Profile Button Action
        viewProfileButton.addActionListener(e -> {
            String username = landingWelcomeLabel.getText().replace("Welcome, ", "").replace("!", "");
            User user = users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);

            if (user != null) {
                profileInfoArea.setText("Username: " + user.getUsername() + "\nPassword: " + user.getPassword());
                cardLayout.show(frame.getContentPane(), "Profile");
            } else {
                JOptionPane.showMessageDialog(frame, "Error retrieving profile information.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // Back to Landing Page from Profile Button Action
        backToLandingFromProfileButton.addActionListener(e -> cardLayout.show(frame.getContentPane(), "Landing"));

        // Back to Landing Page Button Action
        backToLandingButton.addActionListener(e -> cardLayout.show(frame.getContentPane(), "Landing"));

        // Logout Button Action
        logoutButtonLanding.addActionListener(e -> {
            loginUsernameField.setText("");
            loginPasswordField.setText("");
            cardLayout.show(frame.getContentPane(), "Login");
        });

        // Set frame visibility
        frame.setVisible(true);
    }

    // User class to store user information
    static class User {
        private final String username;
        private final String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    // Post class to store picture and caption information
    static class Post {
        private final String username;
        private final String filePath;
        private final String caption;

        public Post(String username, String filePath, String caption) {
            this.username = username;
            this.filePath = filePath;
            this.caption = caption;
        }

        public String getUsername() {
            return username;
        }

        public String getFilePath() {
            return filePath;
        }

        public String getCaption() {
            return caption;
        }
    }
}
