package genericcollection;

import java.util.List;

public class FindElement {
	
	public static <T>  int findIndex(List <T> list, T target) {
		
		for(int i =0; i <list.size(); i++) {
			if(list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num1 = List.of(1,2,3,4,5);
		List<String> str1 = List.of("red", "blue", "yellow");
		
		
		System.out.println("element:");
		System.out.println(num1);
		System.out.println(str1);
		
		int target1 = findIndex(num1, 5);
		System.out.println("target index: "+ target1);
		
		int target2 = findIndex(num1, 7);
		System.out.println("target index: "+ target2);
		
		int target4 = findIndex(str1, "yellow");
		System.out.println("target index: "+ target4);
		
		int target5 = findIndex(str1, "black");
		System.out.println("target index: "+ target5);
		
		

	}

}
