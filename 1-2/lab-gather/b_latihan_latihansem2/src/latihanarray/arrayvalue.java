package latihanarray;

public class arrayvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,5,7,8,0};
		
		for(int i=0; i<array.length;i++) {
			if(array[i]==5) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
		} 
	}

}
