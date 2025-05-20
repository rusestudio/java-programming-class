package graphiclatihan;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleAnimation extends JFrame {
    private AnimationCanvas canvas;

    public CircleAnimation() {
        setTitle("Circle Animation");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new AnimationCanvas();
        add(canvas);

        Timer timer3 = new Timer(10, e -> canvas.updatePosition());
        timer3.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleAnimation();
    }
}

class AnimationCanvas extends JPanel {
    private int x = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillOval(x, getHeight() / 2 - 25, 50, 50);
    }

    public void updatePosition() {
        x += 2;
        if (x > getWidth()) {
            x = -50;
        }
        repaint();
    }
}