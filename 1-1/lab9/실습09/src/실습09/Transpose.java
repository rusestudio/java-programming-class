package 실습09;

import java.util.*;

public class Transpose {

	public static void main(String[] args) {
		int row = 0;
		int col = 0;

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		// 행과 열의 크기를 입력
		System.out.print("행 크기 입력:");
		row = input.nextInt();

		System.out.print("열 크기 입력:");
		col = input.nextInt();

		// 2차원 배열 만들고, 난수로 채움
		//fill with random number 0>50
		int[][] matrix = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j]=random.nextInt(50); //assign random num to 2d array
			}
		}


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
		int row = 0;
		int col = 0;
		for (int i = 0; i < matrix.length; i++) { //row
			for (int j = 0; j < matrix[0].length; j++) { //col
				System.out.print(matrix[i][j] + " "); //to print matrix random

			}
			System.out.println();
		}
	}
	/**
	 * 주어진 정수 배열의 전치행렬을 구함
	 * @param matrix 주어진 행렬
	 * @return 전치행렬
	 */
	public static int[][] transpose(int[][] matrix){
		int[][] arr = new int[matrix[0].length][matrix.length];//2d declare
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]= matrix[j][i];
			}
		}
		return arr;

	}
}
