package _12장;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame implements ActionListener{
	
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextArea() {
        setTitle("Text Area Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textField = new JTextField(30);
        textField.addActionListener(this);
        
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        add(textField, BorderLayout.NORTH);
        //add(textArea,BorderLayout.CENTER);
        add(scrollPane, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new TextArea();	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = textField.getText();
		
		textArea.append(text + "\n"  );
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

}
