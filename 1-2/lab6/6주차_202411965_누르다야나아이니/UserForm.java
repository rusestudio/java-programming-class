package labw6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserForm extends JFrame{
	
	public UserForm() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("회원가입");
		
		JPanel panel1 = new JPanel(new GridLayout(4,2,-150,5)); //center// grid is the one for inside
		
		 JLabel name = new JLabel("이름:");
		 panel1.add(name);
		 JTextField lname = new JTextField();
		 panel1.add(lname);
		 
		 JLabel sex = new JLabel("성별:");
		 panel1.add(sex);
		 
		 String gender[] = {"여자", "남자"};
		 JComboBox lsex = new JComboBox(gender); //dropdown
		 panel1.add(lsex);
		 
		 JLabel bday = new JLabel("생년월일:");
		 panel1.add(bday);
		 JTextField lbday = new JTextField();
		 panel1.add(lbday);
		 
		 JLabel phone = new JLabel("전화번호:");
		 panel1.add(phone);
		 
		 JPanel panelpink = new JPanel(new GridLayout(1,2,5,0)); //add panel pink have text field n button
		 JTextField phonetf = new JTextField();
		 panelpink.add(phonetf);
		 JButton button = new JButton("인증번호");
		panelpink.add(button);
		 panel1.add(panelpink);
		 
		 add(BorderLayout.NORTH,panel1);
		 
		
		 JPanel panel2 = new JPanel(new FlowLayout());//flow no gap
		 
		 JButton join = new JButton("Join");
		 panel2.add(join);
		 
		 JButton cancel = new JButton("Cancel");
		 panel2.add(cancel);
		 
		 add(BorderLayout.SOUTH,panel2);
		 
		 setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new UserForm();

	}

}
