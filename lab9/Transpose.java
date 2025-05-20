package week9;

import java.util.*;

public class Transpose {

	public static void main(String[] args) {
		int row = 0;
		int col = 0;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// 행과 열의 크기를 입력
		
		
		// 2차원 배열 만들고, 난수로 채움
		
		
		// 2차원 배열을 출력
		printMatrix(matrix);
		System.out.println();
		
		// 전치행렬 구하기
		int[][] tMatrix;
		tMatrix = transpose(matrix);
		
		// 전치행렬을 출력
		printMatrix(tMatrix);
		
	}
	/**
	 * 주어진 배열을 출력
	 * @param matrix 주어진 배열
	 */
	public static void printMatrix(int[][] matrix) {
		
	}
	/**
	 * 주어진 정수 배열의 전치행렬을 구함
	 * @param matrix 주어진 행렬
	 * @return 전치행렬
	 */
	public static int[][] transpose(int[][] matrix){
		
	}
}
