package 실습14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame3 extends JFrame {
	
	public MyFrame3() {
		
		  
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("로그인");
		   
		   JPanel infopanel = new JPanel();
		   infopanel.setLayout(new GridLayout(2, 2,-200,0));
		   infopanel.setSize(200, 100);
		   
		   JLabel labelid = new JLabel("아이디:");
		   infopanel.add(labelid);
		   JTextField fieldid = new JTextField(10);
		   infopanel.add(fieldid);
		   
		   JLabel labelps = new JLabel("비밀번호:");
		   infopanel.add(labelps);
		   JPasswordField fieldps = new JPasswordField(10);
		   infopanel.add(fieldps);
		   infopanel.setBackground(Color.GREEN);
		   this.add(infopanel, BorderLayout.CENTER);
		   
		   JPanel click = new JPanel();
		   click.setLayout(new FlowLayout());
		   JButton button1 = new JButton("로그인");
		   JButton button2 = new JButton("회원가입");
		   JButton button3 = new JButton("아이디/비밀 번호 찾기");
		   click.add(button1);
		   click.add(button2);
		   click.add(button3);
		   click.setBackground(Color.BLUE);
		   this.add(click, BorderLayout.SOUTH);
		   
		   setSize(400,150);
		  
		   
		   
		   setVisible(true);
		   
		   
		   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 login = new MyFrame3();
	}

}
