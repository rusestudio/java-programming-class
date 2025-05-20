package labw7;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Delivery walkingDelivery = new Walking();
		Delivery bicycleDelivery = new Bicycle();
		Delivery motorbikeDelivery = new Motorbike();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("거기를 입력하세요(단위: km): ");
		double distance = input.nextDouble();
		
		if(distance <=2) {
			walkingDelivery.startDelivery(distance);
		}else if(distance <= 5) {
			bicycleDelivery.startDelivery(distance);
		}else {
			motorbikeDelivery.startDelivery(distance);
		}
		
		input.close();

	}

}
