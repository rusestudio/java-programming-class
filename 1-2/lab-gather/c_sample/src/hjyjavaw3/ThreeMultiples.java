package hjyjavaw3;

public class ThreeMultiples { //Q2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("i를 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");
	      int i = 0;
	      int sum = 0;
	      
	      for(i=0; i<=100; i++){
	         if(i%3==0) {   //i increase by3 and i plus3 when whole num
	            sum = sum + i;
	         }
	      }
	      
	      System.out.println("1 이상 100 이하 3의 배수들의 합 = " + sum);
	      
	      System.out.println("");
	      
	      System.out.println("i를 3씩 증가시키면서 i를 더하는 방식으로 계산");
	      sum = 0;   
	      for(i=0; i<=100; i+=3) { //i increase by 3 and i plus 3
	         sum = sum + i;
	      }
	      System.out.println("1 이상 100 이하 3의 배수들의 합 = " + sum);
	   }

	

}
