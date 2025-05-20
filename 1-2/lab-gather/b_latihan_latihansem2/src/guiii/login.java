package guiii;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame{
	
	 private JTextField usernameField;
	    private JPasswordField passwordField;
	    private JLabel messageLabel;

	    public login() {
	        // Set frame properties
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Login Form");

	        // Create a panel with GridBagLayout for proper alignment
	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5, 5, 5, 5);
	        gbc.fill = GridBagConstraints.HORIZONTAL;

	        // Username Label and TextField
	        JLabel usernameLabel = new JLabel("Username:");
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        panel.add(usernameLabel, gbc);

	        usernameField = new JTextField(15);
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        panel.add(usernameField, gbc);

	        // Password Label and TextField (use JPasswordField for password)
	        JLabel passwordLabel = new JLabel("Password:");
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        panel.add(passwordLabel, gbc);

	        passwordField = new JPasswordField(15);
	        gbc.gridx = 1;
	        gbc.gridy = 1;
	        panel.add(passwordField, gbc);

	        // Login Button
	        JButton loginButton = new JButton("Login");
	        gbc.gridx = 0;
	        gbc.gridy = 2;
	        gbc.gridwidth = 2;
	        panel.add(loginButton, gbc);

	        // Message Label to show success or error
	        messageLabel = new JLabel();
	        gbc.gridx = 0;
	        gbc.gridy = 3;
	        gbc.gridwidth = 2;
	        gbc.anchor = GridBagConstraints.CENTER;
	        panel.add(messageLabel, gbc);

	        // Add action listener to button
	        loginButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // When button is clicked, show "Success!" message
	                messageLabel.setText("Success!");
	            }
	        });

	        // Add the panel to the frame
	        add(panel);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new login();
	    }

}
