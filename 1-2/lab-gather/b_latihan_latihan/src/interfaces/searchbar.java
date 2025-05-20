package interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class searchbar extends JFrame implements ActionListener {
	 private JTextField searchBar = new JTextField("Enter your search here");
	    private JButton submit = new JButton("Search");

	    public searchbar() {
	        Container cp = getContentPane();
	        setSize(300, 100);
	        setResizable(true);
	        submit.addActionListener(this);
	        cp.setLayout(new BorderLayout());
	        cp.add(searchBar, BorderLayout.CENTER);
	        cp.add(submit, BorderLayout.EAST);
	        setVisible(true);
	        pack();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String input = searchBar.getText();
	        search(input);
	    }

	    private void search(String input) {
	        // Add your search logic here
	        System.out.println("Searching for: " + input);
	    }

	    public static void main(String[] args) {
	        new searchbar();
	    }
	}
