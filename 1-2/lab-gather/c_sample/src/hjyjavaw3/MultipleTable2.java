package hjyjavaw3;

public class MultipleTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 1;

	        for (int j = 1; j <= 9; j++) {
	            System.out.print(i + "x" + j + "=" + i * j + "\t");
	            if (j == 9) {
	                System.out.println();
	                i++;
	                if (i>9) break;
	                j = 0; // j를 초기화
	            }
	        }
	}

}
