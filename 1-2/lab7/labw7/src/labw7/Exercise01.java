package labw7;

import java.util.Arrays;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("Computer", 300, 4.0);
		Product p2 = new Product("Computer", 300, 4.5);
		Product p3 = new Product("Smartphone", 100, 4.7);
		
		System.out.println(p1.compareTo(p3)); //compare rating not price 1 big
		System.out.println(p1.compareTo(p2)); // 
		System.out.println(p2.compareTo(p3));//1 big
		
		Product[] products = {p1,p2,p3};
		Arrays.sort(products);
		
		for(Product product: products) {
			System.out.println(product);
		}

	}

}
