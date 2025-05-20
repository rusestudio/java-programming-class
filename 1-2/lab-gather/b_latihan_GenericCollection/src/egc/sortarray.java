package egc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class sortarray {
	
	public static <T extends Comparable<T>> List<T> sortarraydown(List<T> a) {
		for (int i = 0; i < a.size()-1; i++) {
			for (int j = 0; j < a.size()-1-i; j++) {
				if (a.get(j).compareTo(a.get(j + 1)) < 0){
					T temp = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j+1, temp);
				}
			}
		}
		return a;	
	}
	
	public static <T extends Comparable<T>> List<T> sortarrayup(List<T> a) {
		for (int i = 0; i < a.size()-1; i++) {
			for (int j = 0; j < a.size()-1-i; j++) {
				if (a.get(j).compareTo(a.get(j + 1)) > 0){
					T temp = a.get(j);
					a.set(j, a.get(j + 1));
					a.set(j+1, temp);
				}
			}
		}
		return a;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		Random ran = new Random();
		
		for(int i =0; i<10; i ++) {
			list1.add(ran.nextInt(10));
		}
		
		System.out.println("Before sorting : " + list1);
		
		sortarraydown(list1);
		
		System.out.println("After sorting down: " + list1);
		
		sortarrayup(list1);
		
		System.out.println("After sorting up: " + list1);

	}

}
