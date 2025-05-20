package _10장;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEventTest() {
		
		setTitle("test10");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("enter text"));
		
		field = new JTextField(10);
		panel.add(field);
		
		area = new JTextArea(3,30);
		add(panel,BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		field.addKeyListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new KeyEventTest();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"Key Typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"Key Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e,"Key Released");
	}
	
	protected void display(KeyEvent e, String s) {
		
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode(); //read the key in unicode
		
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " +
		e.isControlDown() + "Shift: " + e.isShiftDown();
		//isControlDown is true if clicked
		
		area.append(" "+ s+ "문자"+ c+ "(code:" + keyCode+ ")" + modifiers + "\n");
	}

}
