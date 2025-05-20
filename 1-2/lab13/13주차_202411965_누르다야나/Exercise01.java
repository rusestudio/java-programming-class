//help me to complete the TODO: method for generic methods.
//for reverse() you cannot use Collection.reverse() 
//for sort() method you cannot use Collection.sort(). u need to use bubble sort method and 
//make it in ascending order.

package labw13;


class MyArrayAlg {
	//TODO: getMin generic method
	public static <T extends Comparable<T>> T getMin(T[] arr) {
        T min = arr[0]; // initialize min with first element of array
        
        for (T e : arr) {
            if (e.compareTo(min) < 0) {
                min = e;
            }
        }
        return min;
	}
	
	//TODO: contains generic method
	public static <T> boolean contains(T[] arr, T target) {
		
        for (T e : arr) {
        		if (e.equals(target)) {
                return true;           }
        }
		return false;
		
	}
	
	
	//TODO: reverse generic method
	public static <T> void reverse(T[] arr) {
		    int left = 0;
		    int right = arr.length - 1;
		    
		    while (left < right) {
		        // Swap elements
		        T temp = arr[left];
		        arr[left] = arr[right];
		        arr[right] = temp;
		        
		        // Move towards the center
		        left++;
		        right--;
		    }
	}
	
	
	//TODO: sort bubble generic method
	public static <T extends Comparable<T>> void sort(T[] arr) {
		
		for(T e : arr) {
			for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
		}
		
	}
	
	
	
	
	public static <T> void printArray(T[] arr) {
		
		for (T e : arr) {
            System.out.print(e + " ");
        }
		System.out.println();
	}
}


public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] iArray = {5, 16, 10, 8, 9 };
		Double[] dArray = {1.5, 6.6, 7.4, 3.3, 1.5};
		Character[] cArray = {'J', 'A','V','A'};
		String[] sArray = {"Java","Programming", "Python", "C"};
		
		System.out.print("Min: ");
		System.out.print(MyArrayAlg.getMin(iArray)+ " ");
		System.out.print(MyArrayAlg.getMin(dArray)+ " ");
		System.out.print(MyArrayAlg.getMin(cArray)+ " ");
		System.out.println(MyArrayAlg.getMin(sArray)+ "\n");
		
		System.out.print("Contains: ");
		System.out.print(MyArrayAlg.contains(iArray, 8)+ " ");
		System.out.print(MyArrayAlg.contains(dArray, 5.5)+ " ");
		System.out.print(MyArrayAlg.contains(cArray, 'A')+ " ");
		System.out.println(MyArrayAlg.contains(sArray, "C++")+ "\n");
		
		System.out.print("Reverse: ");
		System.out.println();
		MyArrayAlg.reverse(iArray);
		MyArrayAlg.reverse(dArray);
		MyArrayAlg.reverse(cArray);
		MyArrayAlg.reverse(sArray);
		MyArrayAlg.printArray(iArray);
		MyArrayAlg.printArray(dArray);
		MyArrayAlg.printArray(cArray);
		MyArrayAlg.printArray(sArray);
		System.out.println();
		
		System.out.print("Sort: ");
		System.out.println();
		MyArrayAlg.sort(iArray);
		MyArrayAlg.sort(dArray);
		MyArrayAlg.sort(cArray);
		MyArrayAlg.sort(sArray);
		MyArrayAlg.printArray(iArray);
		MyArrayAlg.printArray(dArray);
		MyArrayAlg.printArray(cArray);
		MyArrayAlg.printArray(sArray);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
