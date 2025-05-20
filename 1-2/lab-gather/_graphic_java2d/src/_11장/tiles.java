package _11장;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tiles extends JFrame implements ActionListener {
	
	private int pieces=4;
	private int totalPieces = pieces*pieces;
	private int[] piecesNumber;
	private BufferedImage img;
	
	public tiles() {
		 setTitle("image draw test");
		 try {
			 img = ImageIO.read(new File("imgs/img4.jpg"));
		 }catch(IOException e) {
			 System.out.println(e.getMessage());
			 System.exit(0);
		 }
		 
		 piecesNumber = new int[totalPieces];
		 for(int i=0; i<totalPieces; i++) {
			 piecesNumber[i]=i;
		 }
		 
		 add(new Panel9(),BorderLayout.CENTER);
		 
		 JButton button = new JButton("DIVIDE");
		 button.addActionListener(this);
		 add(button,BorderLayout.SOUTH);
		 setSize(img.getWidth(),img.getHeight());
		 setVisible(true);
	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		for(int i =0; i< totalPieces; i++) {
			ri = rand.nextInt(totalPieces);
			int tmp = piecesNumber[i];
			piecesNumber[i]= piecesNumber[ri];
			piecesNumber[ri]= tmp;
		}
	}

	class Panel9 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int pieceWidth= img.getWidth()/ pieces;
			int pieceHeight= img.getHeight()/ pieces;

			for(int x=0;x<pieces;x++) {
				int sx = x*pieceWidth;
				for(int y=0; y<pieces; y++) {
					int sy=y*pieceHeight;
					int number = piecesNumber[x*pieces+y];
					int dx = (number/pieces)*pieceWidth;
					int dy = (number%pieces)*pieceHeight;
					g.drawImage(img, dx, dy, dx+pieceWidth,dy+pieceHeight,
							sx, sy, sx+pieceWidth, sy+pieceHeight, null);
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new tiles();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		divide();
		repaint();
	}

}
