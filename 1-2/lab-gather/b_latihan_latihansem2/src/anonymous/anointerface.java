package anonymous;

interface Greeting{
	public void sayHello();
}

public class anointerface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an anonymous class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                // Overriding the sayHello method to print "Hello, World!"
                System.out.println("Hello, World!");
            }
        };

        // Calling the sayHello method of the anonymous class
        greeting.sayHello();

	}

}
