package _15장;

class swapclass{
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] language = { "C++", "C#", "Java"};
		
		swapclass.swap(language, 1,2);
		
		for(String value : language) {
			System.out.println(value);
		}

	}

}
