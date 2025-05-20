package array;

public class GetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		
		int minimum;
		minimum = s[0];
		
		for (int i =1; i < s.length; i++) {
			if (s[i] < minimum) // to get max change to >
				minimum = s[i];
		}
		
		System.out.print("최소값은 " + minimum + " 입니다");
		
	}

}
