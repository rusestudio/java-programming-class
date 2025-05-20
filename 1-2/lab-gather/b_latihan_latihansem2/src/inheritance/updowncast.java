package inheritance;

class Shapeu {
	
	public void draw() {
        System.out.println("Drawing a shape");
    }
	
}

class Rectangleu extends Shapeu {
	
	 public void draw() {
	        System.out.println("Drawing a rectangle");
	    }

	    public void rectangleSpecificMethod() {
	        System.out.println("Rectangle-specific method");
	    }
	
}

class Circleu extends Shapeu {
	
	public void draw() {
        System.out.println("Drawing a circle");
    }
    
}


public class updowncast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Upcasting: Rectangle to Shape
        Shapeu shape1 = new Rectangleu();  // Implicit upcasting
        shape1.draw();  // Calls the Rectangle's draw method because it's a Rectangle object

        // Upcasting: Circle to Shape
        Shapeu shape2 = new Circleu();  // Implicit upcasting
        shape2.draw();  // Calls the Circle's draw method because it's a Circle object

        // Downcasting: Shape to Rectangle
        if (shape1 instanceof Rectangleu) {
            Rectangleu rect = (Rectangleu) shape1;  // Explicit downcasting
            rect.rectangleSpecificMethod();  // Now we can call methods specific to Rectangle
        }

        // Trying an invalid downcast (will throw ClassCastException)
        try {
            if (shape2 instanceof Rectangleu) {
                Rectangleu rect2 = (Rectangleu) shape2;  // This will fail
                rect2.rectangleSpecificMethod();
            }
        } catch (ClassCastException e) {
            System.out.println("Error: Invalid downcast.");

	}
	}
}
