package chp8;
import java.awt.*;
import javax.swing.*;

class MyFramefl extends JFrame {
	
	public MyFramefl() {
		 setTitle("FlowLayoutTest");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 JPanel panel;
		 
		 // 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
		 // 패널은 디폴트로 FlowLayout이므로 사실은 불필요
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		 
		 // 패널에 버튼을 생성하여 추가
		panel.add(new JButton("Button1"));
		 panel.add(new JButton("Button2"));
		 panel.add(new JButton("Button3"));
		 panel.add(new JButton("B4"));
		 panel.add(new JButton("Long Button5"));
		 add(panel);
		 pack();
		 setVisible(true);
		 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFramefl flowlayout = new MyFramefl();
	}

}

