package 실습05;
import java.util.Scanner;

public class ArraySwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] array = {1, 2, 3, 4, 5}; 
		
		System.out.print("횟수를 적어주세요: ");
		int swaparray = input.nextInt(); // get number
				
		
		for(int i = 0; i < swaparray; i++) {  //input array number
			int index1 = input.nextInt()-1;
			int index2 = input.nextInt()-1;
			

			int temp = array[index1]; // 0 index change with 4index in array
	        array[index1] = array[index2];
	        array[index2] = temp;
			
		}

        System.out.println("숫자가 바뀐 결과를 출력합나다");
        
        for (int i = 0; i < array.length; i++) {  // print changes array
            System.out.print(array[i] + " ");
        }
    }
		

	}


