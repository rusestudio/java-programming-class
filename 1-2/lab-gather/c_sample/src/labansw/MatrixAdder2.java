package labansw;
import java.util.Scanner;

public class MatrixAdder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int row=0;
		int col=0;
		
		System.out.print("행 크기 입력:");
		row = input.nextInt();
		
		System.out.print("열 크기 입력:");
		col = input.nextInt();
		
		int [][] matrix1 = new int[row][col];
		int [][] matrix2 = new int[row][col];
		int [][] result = new int [row][col];
		
		int[] row_sum = new int [row];
		int[] col_sum = new int [col];
		int total =0;
		
		System.out.println("첫 번째 2차원 행렬 값 입력:");
		
		for(int i = 0; i<row; i++) {
			for(int j =0; j< col; j++) {
				matrix1[i][j]= input.nextInt();
			}
		}
		
        System.out.println("두 번째 2차원 행렬 값 입력:");
		
		for(int i = 0; i<row; i++) {
			for(int j =0; j< col; j++) {
				matrix2[i][j]= input.nextInt();
			}
		}   
		
		//행렬 합
		for(int i = 0; i<row; i++) {
			for(int j =0; j< col; j++) {
				result[i][j] = matrix1[i][j]+ matrix2[i][j];
				total += result[i][j];
			}
		}   
		//행 합
				for(int i = 0; i<row; i++) {
					for(int j =0; j< col; j++) {
						row_sum[i] += result[i][j];
					}
				}   
		
				//열 합
				for(int j = 0; j<col; j++) {
					for(int i =0; i< row; i++) {
						col_sum[j] += result[i][j];
					}
				}   
				
	    System.out.println("row sum, col sum, all sum");
		for(int i = 0; i<row; i++) {
			for(int j =0; j< col; j++) {
				System.out.print(result[i][j]+ " ");
			}
			
			System.out.print("\t|\t"+ row_sum[i]);
			System.out.println();
		}   
		System.out.println();
		for(int i = 0; i<col ; i++) {
			System.out.print(col_sum[i]+ " ");
		}
				
		System.out.print("\t|\t" + total);

	}

}
