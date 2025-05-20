package _12장;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


public class TextConverter extends JFrame{

	JButton converter;
	JButton cancel;
	JTextArea textIn;
	JTextArea textOut;
	
	public TextConverter() {
        // TODO Auto-generated constructor stub
        super("change text");
        
        textIn = new JTextArea(10,14);
        textOut = new JTextArea(10,14);
        textIn.setLineWrap(true);
        textOut.setLineWrap(true);
        textOut.setEnabled(false);
        
        JPanel textAreaPanel = new JPanel(new GridLayout(1,2,20,20));
        textAreaPanel.add(textIn);
        textAreaPanel.add(textOut);
        
        converter = new JButton("변환");
        cancel = new JButton("취소");
        converter.addActionListener(new ButtonActionListener());
        cancel.addActionListener(new ButtonActionListener());
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(converter);
        buttonPanel.add(cancel);
        
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.add(textAreaPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        add(mainPanel);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
	}
	
	private class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==converter) {
				textOut.setText("");
				String result = toEnglish(textIn.getText());
				textOut.append(result);
			}
			if(e.getSource()==cancel) {
				textIn.setText("");
                textOut.setText("");
            }
		}

		private String toEnglish(String korean) {
			// TODO Auto-generated method stub
			String result = korean;
			result = result.replace("텍스트", "Text");
			result = result.replace("영어", "English");
			return result;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TextConverter converter = new TextConverter();
	}

}
