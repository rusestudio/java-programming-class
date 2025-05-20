package _12장;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

public class PasswordField extends JFrame {
    private JPasswordField pwdField1;
    private JPasswordField pwdField2;
    private JFormattedTextField dateField;
    private JFormattedTextField numberField;
    private JFormattedTextField customField;
    private JButton showButton;

    public PasswordField() {
        setTitle("Password and Formatted Text Field Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Password fields
        add(new JLabel("Password 1:"));
        pwdField1 = new JPasswordField(20);
        add(pwdField1);

        add(new JLabel("Password 2:"));
        pwdField2 = new JPasswordField("Initial");
        pwdField2.setEchoChar('#');
        add(pwdField2);

        // Date formatted text field
        add(new JLabel("Date (MM/dd/yyyy):"));
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateField = new JFormattedTextField(dateFormat);
        dateField.setValue(new Date());
        add(dateField);

        // Number formatted text field
        add(new JLabel("Number (###.##):"));
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberField = new JFormattedTextField(numberFormat);
        numberField.setValue(0.00);
        add(numberField);

        // Custom formatted text field (e.g., phone number)
        add(new JLabel("Phone (###-###-####):"));
        try {
            MaskFormatter phoneMask = new MaskFormatter("###-###-####");
            customField = new JFormattedTextField(phoneMask);
            add(customField);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        showButton = new JButton("Show Values");
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showValues();
            }
        });
        add(showButton);
    }

    private void showValues() {
        char[] password1 = pwdField1.getPassword();
        char[] password2 = pwdField2.getPassword();

        String message = "Password 1: " + new String(password1) + "\n" +
                         "Password 2: " + new String(password2) + "\n" +
                         "Echo char for Password 2: " + pwdField2.getEchoChar() + "\n" +
                         "Date: " + dateField.getValue() + "\n" +
                         "Number: " + numberField.getValue() + "\n" +
                         "Phone: " + customField.getValue();

        JOptionPane.showMessageDialog(this, message, "Entered Values", JOptionPane.INFORMATION_MESSAGE);

        // Clear the arrays for security reasons
        java.util.Arrays.fill(password1, '0');
        java.util.Arrays.fill(password2, '0');
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PasswordField().setVisible(true);
            }
        });
    }
}