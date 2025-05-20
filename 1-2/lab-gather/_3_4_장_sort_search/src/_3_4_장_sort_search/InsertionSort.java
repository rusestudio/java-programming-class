package _3_4_장_sort_search;
import java.util.Scanner;

public class InsertionSort {
	
	// 정렬된 값x[0], x[1], ..., x[i-1] 사이의 적절한 위치에 x[i]를 배치
	public static void insert(int[] x, int i)  {
		int temp = x[i];    // 값 저장
		int j = i- 1;
		
		while ( j >= 0 && temp < x[j])  {  // temp를 배치해야 할 곳 결정 >/< can change for asending or decending
			x[j + 1] = x[j];     // 오른쪽으로 위치이동
			j--;
		}
		x[j + 1] = temp; // 올바른 위치에temp(즉, 원래의 x[i])를 배치
	}
	
	// n은 x 배열에 저장된데이터의개수
	public static void insertionSort(int[] x, int n)  {
		for (int i = 1; i < n; i++)
			insert(x, i); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int  size;    // 데이터의개수
		
		System.out.print("Enter the number of data: ");
		size = input.nextInt();
		
		int [] numbers = new int[size];
		System.out.print("Enter " + size + " integers: ");
		
		// 데이터 읽기
		for (int i = 0; i < size; i++)
			numbers[i] = input.nextInt();
		System.out.println();
		
		insertionSort(numbers, size);
		
		System.out.print("Sorted: ");
		for (int i = 0; i < size; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

	}

}
