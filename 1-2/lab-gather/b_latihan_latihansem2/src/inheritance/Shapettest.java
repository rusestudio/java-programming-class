package inheritance;

abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}

class Circle extends Shape {  // Should extend Shape, not Shapettest
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("draw circle");
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    protected double getRadius() {
        return radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void draw() {
        System.out.println("draw cylinder");
    }

    public double calculateArea() {
        double circleArea = super.calculateArea();
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * circleArea + sideArea;
    }
}

public class Shapettest {
    public static void main(String[] args) {
        // Create a Shape reference pointing to a Circle object with radius 7.0
        Shape circle = new Circle(7.0);  // Should be Shape, not Shapettest
        // Create a Shape reference pointing to a Cylinder object with radius 4.0 and height 9.0
        Shape cylinder = new Cylinder(4.0, 9.0);  // Should be Shape, not Shapettest

        // Call the drawShapeAndCalculateArea method with the circle object
        drawShapeAndCalculateArea(circle);
        // Call the drawShapeAndCalculateArea method with the cylinder object
        drawShapeAndCalculateArea(cylinder);
    }

    // Static method to draw the shape and calculate its area
    public static void drawShapeAndCalculateArea(Shape shape) {  // Should take Shape, not Shapettest
        // Call the draw method of the shape object
        shape.draw();
        // Call the calculateArea method of the shape object and store the result in area
        double area = shape.calculateArea();
        // Print the area of the shape to the console
        System.out.println("Area: " + area);
    }
}
