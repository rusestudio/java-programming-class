package latihanarray;

public class test {

	public static void main(String[] args) {
		int numbers[] = new int[10]; 
		// {0, 10, 20, 30, 40, 50, 60, 70, 80, 90}
		
		int numbers2[] = {5, 7 ,9 ,1234, 657, 1234};
		for(int i = 0; i < 10; i++) {
			numbers[i] = i*10;
		}
		
		for(int h : numbers2) { 
			System.out.println(h);	
		}

	}

}
