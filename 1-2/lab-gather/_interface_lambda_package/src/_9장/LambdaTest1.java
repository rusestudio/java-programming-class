package _9장;

interface MyInterface2 { // 함수 인터페이스
void sayHello();
}

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface2 hello = () -> System.out.println("Hello Lambda!");
		hello.sayHello();
	}

}
