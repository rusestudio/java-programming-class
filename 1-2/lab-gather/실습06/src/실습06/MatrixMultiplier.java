package 실습06;
import java.util.Scanner;

public class MatrixMultiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int m =0;
		int n = 0;
		int p =0;
		int row=0;
		int col=0;
		
		System.out.print("m,n,p을 입력:");
		m = input.nextInt();
		n = input.nextInt();
		p = input.nextInt();
		
		int[][] matrixA = new int[m][n];
		int[][] matrixB = new int[n][p];
		int[][] matrixC = new int[m][p]; // to multiply
		
		System.out.print("A 행렬의 요소 값을 입력:"); //input row
		for (int i = 0; i < m; i ++) {
			for(int j = 0;j < n; j++) {
				matrixA[i][j] = input.nextInt();
			}
		}
		
		System.out.print("B 행렬의 요소 값을 입력:"); //input col
		for (int i = 0; i < n; i ++) {
			for(int j = 0;j < p; j++) {
				matrixB[i][j] = input.nextInt();
			}
		}
		
		//to multiply
		for (int i = 0; i < m; i ++) {
			for(int j = 0;j < p; j++) {
				int sum = 0;
				for(int k =0; k<n ; k++) {
					sum += matrixA[i][k]*matrixB[k][j];
					//Ai*bi+Aj*Bi=Ci
					//Ai*bi+Aj*bj=Cj
				}
				matrixC[i][j] = sum;
				System.out.print("A와 B의 곱셈(C=AB): "+ matrixC[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
