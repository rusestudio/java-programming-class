package labansw;
import java.util.Scanner;

public class MatrixMultiplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int m =0;
        int n = 0;
        int p = 0;
        
        System.out.println("m,n,p 입력:");
        m = input.nextInt();
        n = input.nextInt();
        p = input.nextInt();
        
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][p];
        int[][] result = new int[m][p];
        
        System.out.println("A 행렬 값 입력:"); 
        for(int i = 0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		matrixA[i][j]= input.nextInt();
        	}
        }
        
        System.out.println("B 행렬 값 입력:"); 
        for(int i = 0; i<n; i++) {
        	for(int j=0; j<p; j++) {
        		matrixB[i][j]= input.nextInt();
        	}
        }
        
        for(int i =0; i<m; i++ ) {
        	for (int j=0; j<p; j++) {
        		int sum = 0;
        		for(int k=0; k<n; k++) {
        			sum += matrixA[i][k]*matrixB[k][j];
        		}
        		
        		result[i][j] = sum;
        	}
        }
		
        System.out.println("A와 B 곱셈 (c=ab)");
        for(int i =0 ; i<m; i++) {
        	for(int j=0; j<p; j++) {
        		System.out.print(result[i][j] + " ");
        	}
        	
        	System.out.println();
        }
		
		
	}

}
