package anonymous;

interface Polygon {
	   public void display();
	}

	class AnonymousDemo {
	   public void createClass() {

	      // anonymous class implementing interface
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

public class anyinterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousDemo an = new AnonymousDemo();
	      an.createClass();

	}

}
