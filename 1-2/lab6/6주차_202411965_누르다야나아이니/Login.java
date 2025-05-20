package labw6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	public Login() {
		 setSize(350,150);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("로그인");
		 
		 JPanel panel1 = new JPanel(new GridLayout(2,2,-100,5)); //center
		 //use grid if have up down
		 
		 JLabel labelid = new JLabel("아이디:");
		 panel1.add(labelid);
		 JTextField labeltf = new JTextField();
		 panel1.add(labeltf);
		 
		 JLabel labelps = new JLabel("비밀번호:");
		 panel1.add(labelps);
		 JPasswordField labelpw = new JPasswordField();
		 panel1.add(labelpw);
		 add(BorderLayout.CENTER,panel1); //need to add panel after finish add all component
		 
		 
		 JButton button = new JButton("로그인"); //east
		 add(BorderLayout.EAST,button);
		 
		 
		 
		 JPanel panel2 = new JPanel(new FlowLayout());//south
		 //use flow if have in one line many component
		 //use border if only one component
		 
		 JButton button1 = new JButton("아이디 찾기");
		 panel2.add(button1);
		 
		 JButton button2 = new JButton("비밀번호 찾기");
		 panel2.add(button2);
		 
		 JButton button3 = new JButton("회원가입");
		 panel2.add(button3);
		 add(BorderLayout.SOUTH,panel2);
		
		 setVisible(true);
		 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login lg = new Login();

	}

}
