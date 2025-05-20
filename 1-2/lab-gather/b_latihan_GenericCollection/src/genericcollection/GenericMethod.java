package genericcollection;

public class GenericMethod {
	
	
	public static <T> boolean compare_element(T[] array1, T[] array2 ) {
		
		if (array1.length != array2.length) {
			return false;
		}
		
		for(int i =0; i< array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static <T> void printElement(T[] array1) {
		for(int i =0; i< array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] num = {0,2,0,3};
		Integer[] num2 = {0,2,0,3};
		Integer[] num3 = {1,3,4,2};
		Integer[] num4 = {1,3,2,4};
		
		String[] string = {"java", "c"};
		String[] string2 = {"java", "c++"};
		String[] string3 = {"c++", "java"};
		String[] string4 = {"java", "c"};
		
		System.out.println("Original arrays:");
	    printElement(num);
	    printElement(num2);
	    printElement(num3);
	    printElement(num4);
		
	    printElement(string);
	    printElement(string2);
	    printElement(string3);
	    printElement(string4);
		
		System.out.println("Compare Array:");
		System.out.println("num, num2: " + compare_element(num,num2));
		System.out.println("num3, num4: " + compare_element(num3,num4));
		System.out.println("num2, num4: " + compare_element(num2, num4));
		
		System.out.println("s, s2: " + compare_element(string, string2));
		System.out.println("s, s4: " + compare_element(string, string4));
		System.out.println("s3, s: " + compare_element(string3, string));
		
		
		
		
		
		
	}

}
