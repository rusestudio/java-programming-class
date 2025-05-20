package midtermans;

public class IntegerComplex extends LatticePoint {
    public IntegerComplex(int real, int imaginary) {
        super(real, imaginary);
    }

    public IntegerComplex multiply(IntegerComplex other) {
        int newReal = this.getX() * other.getX() - this.getY() * other.getY();
        int newImaginary = this.getX() * other.getY() + this.getY() * other.getX();
        return new IntegerComplex(newReal, newImaginary);
    }
}