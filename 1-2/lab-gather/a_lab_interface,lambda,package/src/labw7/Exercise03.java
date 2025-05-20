package labw7;


interface Check{
	public boolean is(int a);
}

interface FuncA {
	public int calc(int a);
}

interface FuncAB{
	public int calc(int a, int b);
}

interface FuncABC {
	public double calc(int a, int b, int c);
}

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncAB add = (a,b) -> a+b;
		FuncA sqrt =(a) -> a*a;
		FuncABC avg = (a,b,c) -> (a+b+c)/3;
		Check even = (a) -> a%2==0 ;
		Check odd = (a) -> a%2==0 ;
		FuncAB max =(a,b) -> a > b ? a : b;
		FuncA absval= (a) -> Math.abs(a);
		FuncA bit = (a) -> ~a;
		FuncAB xor = (a,b) -> a^b;
		FuncAB power = (a,b) -> (int) Math.pow(a, b);
		
		
		System.out.println("덧셈 결과: "+ add.calc(5, 6));
		System.out.println("5의 제곰: "+ sqrt.calc(5));
		System.out.println("5, 10, 15의 평균: "+ avg.calc(5, 10, 15));
		System.out.println("5는 짝수인가요? "+ even.is(5));
		System.out.println("6는 짝수인가요? "+ odd.is(6));
		System.out.println("5와 6의 최댓값: "+ max.calc(5, 6));
		System.out.println("-5의 절댓값: "+ absval.calc(-5));
		System.out.println("5의 비트 반전: "+ bit.calc(5));
		System.out.println("5 XOR 8: "+ xor.calc(5,8));
		System.out.println("2의 10제곱: "+ power.calc(2, 10));
		

	}

}
