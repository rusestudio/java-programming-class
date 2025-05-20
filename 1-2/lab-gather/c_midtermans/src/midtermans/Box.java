package midtermans;

//write an abstract Box class with three integer types fields length, width, depth and two methods surfaceArea() and volume() to find the surface area and volume respectively.
//additionally, the Box class must cotain a default constructor, a constructor that can initialize all fields, and getter and setter methods for each field.
//the Box class must implement the Comparable interface, but compareTo(...) must be left undefined, i.e, an abstract method.
//Implement two subclasses of Box:BoxArea and BoxVolume.
//These two subclasses do not add anything other than implementing the inherited abstract method compareTo(...) as follows:
//-The BoxArea class defines compareTo(...) to compare surface areas.
//-The BoxVolume class defines compareTo(...) to compare volumes.
//Write a Util class that has only the following method to determine whether the elements of an array x of Comparable type of size n are in strictly ascensing order.
//public static boolean orderedUp(Comparable[] x, int n) {}
//write a test calss that contains main() method that prompts the user for numeric data items for five boxes.
//create 2 arrays, a BoxArea type array and a BoxVolume type array to store the data of each of the fine input boxes
//the test class should print whether the boxes in each are in correct ascending order based on the appropriate compareTo(...) method. 
//it should work well for all types of input data, including sorted arrays in ascending or descending order, and unsorted arrays.


public abstract class Box implements Comparable<Box> {
    protected int length;
    protected int width;
    protected int depth;

    public Box() {}

    public Box(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public int surfaceArea() {
        return 2 * (length * width + length * depth + width * depth);
    }

    public int volume() {
        return length * width * depth;
    }

    // Getters and Setters
    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getDepth() { return depth; }
    public void setDepth(int depth) { this.depth = depth; }

    // Abstract method
    @Override
    public abstract int compareTo(Box other);
}