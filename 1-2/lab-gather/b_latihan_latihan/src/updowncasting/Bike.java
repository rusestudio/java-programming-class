package updowncasting;

//parent class
 class Bike {
	//parent method
	void run() {
		System.out.println("running");
	}
 }
//child class
 class Splendor extends Bike{
	//child method
	void run() {
		System.out.println("running safely with 60km");
	}
}
	
