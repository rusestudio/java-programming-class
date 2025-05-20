package _15장;

class Comparableclass {
	public static <T extends Comparable<T>> T getMax(T[] a) {
		if (a == null || a.length ==0)
			return null;
		T largest = a[0];
		for (int i =1; i < a.length; i++)
			if (largest.compareTo(a[i]) < 0)
					largest = a[i];
        return largest;
	}
}

public class ComparableT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String[] list = { "xyz", "abc", "def"};
		String max  = Comparableclass.getMax(list);
		System.out.println(max);
	
	}

}
