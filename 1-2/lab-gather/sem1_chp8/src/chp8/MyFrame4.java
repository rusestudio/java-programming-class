package chp8;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame4 extends JFrame{
	public MyFrame4() {
		 setSize(300, 200);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setTitle("MyFrame");
		 setLayout(new FlowLayout()); // 배치 관리자 설정!
		 JButton button = new JButton("버튼"); // 버튼 컴포넌트 생성 및 추가
		 this.add(button);
		 setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame4 f = new MyFrame4();
	}

}
