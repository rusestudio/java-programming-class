package _8장;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame1 extends JFrame{
	
	 public Frame1() {
		 setSize(300, 200);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("MyFrame");
		 
		 setLayout(new FlowLayout());// 배치 관리자 설정!
		 JButton button = new JButton("버튼");  // 버튼 컴포넌트 생성 및 추가
		this.add(button);
		 setVisible(true);
		 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame1 f = new Frame1();

	}

}
