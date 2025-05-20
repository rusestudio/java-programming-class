package labw10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawShape extends JFrame { //do not use implement
	
	private JButton btriangle;
	private JButton bcircle;
	private JButton brectangle;
	private JButton reset;
	
	
	public DrawShape() {
		setTitle("도형 그림판");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawPanel panel = new DrawPanel();
		add(panel, BorderLayout.CENTER);
		
		JPanel btnPanel = new JPanel(new GridLayout(1,4));
		
		//TODO: 도형 버튼, reset button
		brectangle = new JButton("사각형");
		brectangle.addActionListener(e -> panel.setShape(1));//call draw panel which include the mouseaction use lamda
		btnPanel.add(brectangle);
		
		bcircle = new JButton("원");
		 bcircle.addActionListener(e -> panel.setShape(2));///call draw panel which include the mouseaction use lamda
		btnPanel.add(bcircle);
		
		btriangle = new JButton("삼각형");
		btriangle.addActionListener(e -> panel.setShape(3)); //call draw panel which include the mouseaction use lamda
		btnPanel.add(btriangle);
		
		reset = new JButton("Reset");
		reset.addActionListener(e -> panel.clearShapes());//call draw panel which include the mouseaction use lamda
		btnPanel.add(reset);
		
		add(btnPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new DrawShape();
	}

}

class Shape{
	int x,y,type;
	Color color;
	
	public Shape(int x,int y,int type) {
		this.x=x;
		this.y =y;
		this.type = type;
		
		//TODO: random color 생성하여 color 저장
		color = new Color((int)(Math.random()*256), //random color for shape everytime draw
				(int)(Math.random()*256),
				(int)(Math.random()*256));
	}
}

class DrawPanel extends JPanel {
	
	private ArrayList<Shape> shapes = new ArrayList<>();
	private int currentShape =0; //current shape type
	
	public DrawPanel() {
		//TODO: 마우스 이벤트 처리
		addMouseListener(new MouseAdapter() { //useanonycalss
            @Override
            public void mouseClicked(MouseEvent e) {
                if (currentShape != 0) {
                    shapes.add(new Shape(e.getX(), e.getY(), currentShape));
                    repaint();
                }
            }
        });
		}
	
	
	public void setShape(int type) {
		//TODO:현재 도형 타입 설정하는 함수
		 this.currentShape = type;
	}
	
	public void clearShapes() {
		//TODO:clear all draw on screen
		shapes.clear();
        repaint();
	}
	
	protected void paintComponent(Graphics g) {
		//TODO:draw the shape
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;

       //draw shape
        for (Shape shape : shapes) {
            g2d.setColor(shape.color);
            switch (shape.type) {
                case 1: //draw rec
                    g2d.fillRect(shape.x - 25, shape.y - 25, 50, 50);
                    break;
                case 2: //draw circe
                    g2d.fillOval(shape.x - 25, shape.y - 25, 50, 50);
                    break;
                case 3: //draw tri
                    int[] xPoints = {shape.x, shape.x - 25, shape.x + 25};
                    int[] yPoints = {shape.y - 25, shape.y + 25, shape.y + 25};
                    g2d.fillPolygon(xPoints, yPoints, 3);
                    break;
            }
        }
	}
}















