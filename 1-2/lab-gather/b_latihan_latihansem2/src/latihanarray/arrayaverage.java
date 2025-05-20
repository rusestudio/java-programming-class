package latihanarray;

public class arrayaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10,10,10,10,10};
		int sum=0;
		
		for(int i =0; i<array.length; i++) {
			sum = sum+array[i];
		}
		System.out.println("average:" + sum/array.length);

	}

}
