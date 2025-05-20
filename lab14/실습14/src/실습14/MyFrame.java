package 실습14;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다, 피자의 종류를 선택하시오.");
		panelA.add(label1);
		panelA.setBackground(Color.YELLOW);
		
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.setBackground(Color.PINK);
		
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelC.add(label2);
		panelC.add(field1);
		panelC.setBackground(Color.RED);
		
		panel.add(panelA);
		panel.add(panelB);
		panel.add(panelC);
		add(panel);
		setVisible(true);

		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame pizza = new MyFrame();
	}


}
