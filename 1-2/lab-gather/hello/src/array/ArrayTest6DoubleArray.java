package array;

public class ArrayTest6DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] array = {
				{10,20,30,40}, //3*4 
				{50,60,70,80},
				{90,100,110,120}
		};
		
		for (int r = 0; r < array.length; r++) { //array for row, for each row value
			for(int c = 0; c<array[r].length; c++) {  //array for coloum, for each coluom value
				System.out.println(r + "행"+ c + "열:" + array[r][c]);
			}
		}
	}

}
