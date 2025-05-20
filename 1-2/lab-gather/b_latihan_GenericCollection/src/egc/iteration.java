package egc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class iteration {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add random number to list
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			int num = random.nextInt(10);
            list.add(num);;
		}
		
		//1.iterate use for loop
		System.out.println("for loop:");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		
		//2. iterate use for loop enchance
		System.out.println("for enchance:");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//3. iterate use iterator
		System.out.println("iterator");
		Iterator<Integer> it = list.iterator();
		 while (it.hasNext()) {
			 System.out.print(it.next()+ " ");
		 }
		
		
		

	}

}
