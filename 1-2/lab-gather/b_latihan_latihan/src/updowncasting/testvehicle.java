package updowncasting;

public class testvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vc = new Car();
        Car car = (Car) vc; //downcast  //converts a parent reference(vc) to its child object(car)
        System.out.print(vc.id + ", " + vc.getId() + ", ");
        System.out.print(car.id + ", " + car.getId());
        
        //vc.id= 120 //print parent class id
        //vc.getId()= 80 //print child class id(100) - getid (20) //sbb downcast
        
        //car.id= 100 //print child class id
        //car.getId()= 80 //print child class id(100) - getid (20)
	}

}
