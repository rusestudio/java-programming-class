package interfaceee;

interface sort{
	void sort(int[] arr);
}

class bubblesort implements sort {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length; //get array length
		
		for(int i=0; i<n-1; i++) { //outer loop for number of pass
			for(int j=0; j< n-i-1;j++) { // Inner loop for comparisons and swaps
				if(arr[j]>arr[j+1]) {
					int temp = arr[j]; // Swap arr[j] and arr[j+1]
					arr[j] = arr[j+1];
					arr[j + 1]= temp;
				}
			}
			
		}
		
	}

	
	
}

class selectionsort implements sort {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length; //get array length
		
		for(int i=0; i<n-1;i++) {// Outer loop for the current element
			int minIndex =i;
			for(int j=i+1; j<n; j++) { // Inner loop to find the minimum element in the unsorted part of the array
				if(arr[j]< arr[minIndex]) {
					minIndex =j;
				}
			}
			int temp = arr[i];  // Swap arr[i] and arr[minIndex]
			arr[i]= arr[minIndex];
			arr[minIndex]= temp;
		}
	}
}

public class SortTesttasencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {4,2,0,3,1,6,8}; //create array
		
		sort bubblesort = new bubblesort();
		bubblesort.sort(arr);
		System.out.print("Bubble Sort: ");
		for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	
        
        sort selectionsort = new selectionsort();
        selectionsort.sort(arr);
        System.out.print("Selection Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
		
}
