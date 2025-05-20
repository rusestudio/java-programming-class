package _15장;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sample = {"i", "walk", "the", "line"};
		
		List<String> list = Arrays.asList(sample); //change array to list 
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
        Integer[] number = {70,50,60,10,20};
		
		List<Integer> list2 = Arrays.asList(number); //change array to list 
		
		Collections.sort(list2);
		System.out.println(list2);
		
		Collections.reverse(list2);
		System.out.println(list2);

	}

}
