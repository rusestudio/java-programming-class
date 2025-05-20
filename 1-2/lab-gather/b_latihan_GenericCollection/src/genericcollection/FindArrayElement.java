package genericcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindArrayElement {
	
	public static  <T> List <T> filterList(List<T> originalList, Predicate<T> predicate){
		
		List<T> filteredList = new ArrayList<>();
		
		for(T element : originalList) {
			if(predicate.test(element)) {
				filteredList.add(element);
			}
		}
		return filteredList;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> num1 = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("original list: " + num1);
		
		List <Integer> evenNum = filterList(num1, n -> n % 2==0);
		System.out.println("even number: " + evenNum);
		
		List <Integer> oddNum = filterList(num1, n -> n % 2!=0);
		System.out.println("odd number: " + oddNum);
		
		List <String> string = List.of("red", "green", "blue");
		System.out.println("original list: " + string);
		
		List <String> startwithr = filterList(string,color -> color.startsWith("r"));
		System.out.println("color start with 'r': " + startwithr);
		
		List <String> wordlengthmorethan4 = filterList(string, color -> color.length()>4);
		System.out.println("color length more than 4: " + wordlengthmorethan4);

	}

}
