package _9장;

public interface Comparable2 {
    int compareTo(Object other);
}

class Rectangle2 implements Comparable2 {
    int x;
    int y;

    public Rectangle2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Implementing the compareTo method
    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Rectangle2)) {
            throw new ClassCastException("Invalid object");
        }
        Rectangle2 otherRectangle = (Rectangle2) other;
        
        // You can compare by area or any other criteria
        int thisArea = this.x * this.y;
        int otherArea = otherRectangle.x * otherRectangle.y;
        
        return Integer.compare(thisArea, otherArea);
    }

    public Rectangle2 findLargest(Rectangle2 object1, Rectangle2 object2) {
        if (object1.compareTo(object2) > 0)
            return object1;
        else 
            return object2;
    }

    @Override
    public String toString() {
        return "Rectangle(" + x + ", " + y + ")";
    }
}

class RectangleTest1 {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(100, 30);
        Rectangle2 r2 = new Rectangle2(200, 10);

        int result = r1.compareTo(r2);

        if (result > 0)
            System.out.println(r1 + "가 더 큽니다.");
        else if (result == 0)
            System.out.println("같습니다");
        else
            System.out.println(r2 + "가 더 큽니다.");
    }
}
