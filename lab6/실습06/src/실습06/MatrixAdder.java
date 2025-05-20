package 실습06;
import java.util.Scanner;

public class MatrixAdder {

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
				matrixC[i][j]= matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println("두 행렬의 합을 출력(C= A+B):");

		for (int i = 0; i < row; i ++) {
			for(int j = 0;j < col; j++) {
				System.out.print(matrixC[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
