package sample2.w10;

import java.util.Random;
import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기는? ");
		int row = sc.nextInt();
		System.out.print("열의 크기는? ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(0, 50);
			}
		}
		printMatrix(arr);
		System.out.println();
		printMatrix(transpose(arr));
		sc.close();
	}
	public static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static int[][] transpose (int[][] array) {
		int row = array.length;
		int col = array[0].length;
		int[][] trans = new int[col][row];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				trans[j][i] = array[i][j];
			}
		}
		return trans;
	}
}
