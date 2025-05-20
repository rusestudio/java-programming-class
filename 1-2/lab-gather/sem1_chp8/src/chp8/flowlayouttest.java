package chp8;
import java.awt.FlowLayout;
import javax.swing.*;

public class flowlayouttest extends JFrame{
	JPanel p1;

	public flowlayouttest() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
		p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true); // 프레임을 화면에 표시한다.
		}
		

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flowlayouttest  buttonlayout= new flowlayouttest();
	}

}
