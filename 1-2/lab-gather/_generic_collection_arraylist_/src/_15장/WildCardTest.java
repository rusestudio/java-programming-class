package _15장;

import java.util.Arrays;
import java.util.List;

class MyList {
	public static void printList(List<?> list) { //unbounded wildcard can use with any type
		for (Object element : list)
			System.out.print(element + " ");
		System.out.println();
	}
	
	public static void addNumbers(List<? super Integer> list) {//lower wildcard only with integers
		for (int i=1; i<=10; i++) {
			list.add(i);
		}
	}
}


public class WildCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = Arrays.asList(1,2,3);
		List<String> ls = Arrays.asList("one", "two", "three");
		
		
		
		MyList.printList(li);
		MyList.printList(ls);
		
		MyList.addNumbers(li);
		//MyList.addNumbers(ls);
		
		

	}

}
