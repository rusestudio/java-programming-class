package 실습06;
import java.util.Scanner;

public class MatrixAdder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		int row=0;
		int col = 0;
		
		System.out.print("행 크기 입력:");
		row = input.nextInt();
		
		System.out.print("열 크기 입력:");
		col = input.nextInt();
		
		int[][] matrixA = new int[row][col];
		int[][] matrixB = new int[row][col];
		int[][] matrixC = new int[row][col];
		
		System.out.print("첫 번째 2차원 행렬의 요소 값을 입력:");
		for (int i = 0; i < row; i ++) {
			for(int j = 0;j < col; j++) {
				matrixA[i][j] = input.nextInt();
			}
		}
		
		System.out.print("두 번째 2차원 행렬의 요소 값을 입력:");
		for (int i = 0; i < row; i ++) {
			for(int j = 0;j < col; j++) {
				matrixB[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < row; i ++) {
			for(int j = 0;j < col; j++) {
				matrixC[i][j]= matrixA[i][j] + matrixB[i][j]; // to add
			}
		}
		////
        int total=0;
		// to add all total
		for (int i = 0; i < row; i ++) {
			for(int j = 0;j < col; j++) {
				total= total + matrixC[i][j];// total all ij pluss =37
			}
		}
		
		System.out.println("행의 합, 열의 합, 종합이 추가된 행렬의 합을 출력:"); // to print result

		for (int i = 0; i < row; i ++) {
			int sum = 0;
			for(int j = 0;j < col; j++) {
				System.out.print(matrixC[i][j]+" "); // print matrix
				sum += matrixC[i][j];
			}
			System.out.print("\t|\t"+sum); // print matrix
			System.out.println();
		}
			    
		//to add all matrix by col
		int maxLength = 0;
	    for (int i = 0; i < matrixC.length; i++) {
	        if (maxLength < matrixC[i].length)
	            maxLength = matrixC[i].length;
	    }

	    for (int i = 0; i < maxLength; i++) {
	        int sum = 0;
	        for (int j = 0; j < matrixC.length; j++) {
	            if (i < matrixC[j].length)
	                sum += matrixC[j][i];
	        }
	        System.out.print(sum + " ");//12 25
	    }
	    
		System.out.print("\t|\t" +total);//37
		
	}


}
