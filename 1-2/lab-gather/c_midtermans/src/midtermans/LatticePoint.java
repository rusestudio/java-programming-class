package midtermans;

//write a LatticePoint class that represents the grid points of the graph.
//the latticepoint class must define the following fields and methods:
//x and y fields that store 2 integers.
//constructor: a default constructor and two-argument constructor thst initializes the x and y fields.
//getter and setter methods are for each field
//latticepoit add(LatticePoint p) method that expresses the addition rule (a,b)+(c,d)=(a+c,b+d) of two lattice points.
//double distance(LatticePoint p) method, which returns the distance between two lattice points.
//the distance between the point (a,b) and the point (c,d) is defined as √(a-c)^2 +  √(b-d)^2.
//overload the double distance() method without arguments so that the p.distance() call returns the distance between the origin(0,0) and the grid point p.

//Design an IntegerComplex class that extends the LatticePoint class. Each IntegerComplex object represents a complex number in two integer coordinates.
//IntegerComplex inherits addition and distance methods from LatticePoint, but needs to add a multiplication method.

// write a test that contains a main() method that takes as input the real part(an integer x) and imaginary part(an integer y) of a complex number x+yi.
//if a non-integer value  is entered, you will be prompted to re-enter the value until an integer is entered.
//Multiple the input complex number by itself up to five times.
//When the distance between the lattice point representing the complex number in the intermediate result of the multiplication and the origin(0,0) becomes 10 or more, the multiplication repetition is stopped.
//After completing the multiplication repetition, output the distance from the origin to the lattice point representing the resulting complex number and the number multiplication performed.
// the addition, multiplication, and distance of two complex numbers a+bi and c+di are as follows(a,b,c,d are integers):
//Addition:(a+bi)+(c+di)=(a+c)+(b+d)i
//Multiplication:(a+bi)*(c+di)=(ac-bd)+(ad+bc)i
//distance: √(a-c)^2 +  √(b-d)^2.

public class LatticePoint {
    private int x;
    private int y;

    public LatticePoint() {
        this(0, 0);
    }

    public LatticePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public LatticePoint add(LatticePoint p) {
        return new LatticePoint(this.x + p.x, this.y + p.y);
    }

    public double distance(LatticePoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}