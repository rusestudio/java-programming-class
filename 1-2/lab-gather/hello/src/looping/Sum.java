package looping;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for(int i = 1; i<=10; i++)
			sum += i;
		System.out.printf("1부터 10까지의 전수의 합 = %d", sum);
		//System.out.print("1부터 10까지의 전수의 합 =" +sum);
	}

}
