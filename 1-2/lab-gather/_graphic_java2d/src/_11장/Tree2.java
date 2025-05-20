package _11장;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Tree2 extends JFrame {
    private Random random = new Random(); // Random number generator

    public Tree2() {
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return; // Stop recursion when depth reaches 0

        // Randomize branch length (between 7 and 12 for variation)
        double branchLength = (7 + random.nextDouble() * 5) * depth;

        // Calculate the end point of the branch
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * branchLength);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * branchLength);

        // Draw the branch
        g.drawLine(x1, y1, x2, y2);

        // Randomize angles for the left and right branches
        double leftAngle = angle - (15 + random.nextInt(15));  // Between 15° and 30° left
        double rightAngle = angle + (15 + random.nextInt(15)); // Between 15° and 30° right

        // Recursively draw the left and right branches
        drawTree(g, x2, y2, leftAngle, depth - 1);
        drawTree(g, x2, y2, rightAngle, depth - 1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

        // Start drawing the tree
        drawTree(g, 400, 600, -90, 10); // Start at the bottom center with an upward angle
    }

    public static void main(String[] args) {
        new Tree2();
    }
}
