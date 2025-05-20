package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print array value/length
		
		int[] s = new int[10]; //  length= 10 index
		
		for (int i = 0; i< s.length; i++) {
			s[i] = i;
			System.out.println(s[i]  + " ");
		}
		
		//for (int i = 0; i < s.length; i++) { //when length = 11; out from for loop // can also separate to show the level
		//	System.out.println(s[i]  + " ");
		//}
		

	}

}
