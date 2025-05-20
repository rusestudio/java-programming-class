package _3_4_장_sort_search;

public class Binary_search {

	public static int bsearch(int[] x , int n, int key)  {
		 // x는 n개의 정수가정렬된배열이다. 키는정수값을가진다.
		 // x는 오름차순으로정렬되어있다.
		
		int low = 0;        // 배열의 최소인덱스
		int  high = n - 1;   // 최대 인덱스
		int  mid;            		// 중앙 인덱스

		while (high >= low)  {
			mid  = (high + low) / 2;  

			if (key == x[mid]) // 중앙 인덱스계산
				return mid;    
			if (key < x[mid])  // 키를 발견-- 종료
				high = mid - 1;    // x[mid]에서 x[high]까지 제외
			else
				low = mid + 1;   // x[low]에서 x[mid]까지 제외
		}
		return -1;  // 키를 발견하지못함
	}

}
