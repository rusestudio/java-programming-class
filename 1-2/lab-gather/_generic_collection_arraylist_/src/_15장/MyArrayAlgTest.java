package _15장;

class MyArrayAlg {
	public static <T> T getLast(T[] a) {
		return a[a.length -1];
	}
}

public class MyArrayAlgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] language = {"c++", "C#", "java"};
		String last = MyArrayAlg.getLast(language);
		System.out.println(last);

	}

}
