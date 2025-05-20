package _11장;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Panel7 extends JPanel{
	Font f1,f2,f3,f4,f5;
	
	public Panel7() {
		f1 = new Font("Serif",Font.PLAIN,30);
		f2 = new Font("SansSerif",Font.BOLD,30);
		f3 = new Font("Monospaced",Font.ITALIC,30);
		f4 = new Font("Dialog",Font.BOLD|Font.ITALIC,30);
		f5 = new Font("DialogInput",Font.BOLD,30);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setFont(f1);
		g.drawString("Serif 30 plain", 10, 50);
		
		g.setFont(f2);
		g.drawString("sanserif 30 bold", 10, 80);
		
		g.setFont(f3);
		g.drawString("monospcaed 30 italic", 10, 110);
		
		g.setFont(f4);
		g.drawString("dialog 30 bold+ italic", 10, 140);
		
		g.setFont(f5);
		g.drawString("dialoginput 30 bold", 10, 170);
	}
} //end of panel

public class Fonttype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       JFrame font = new JFrame();
		
       font.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
       font.add(new Panel7()); //add panel that painted
       font.setSize(500,300);
       font.setTitle("font test");
       font.setVisible(true);

	}

}
