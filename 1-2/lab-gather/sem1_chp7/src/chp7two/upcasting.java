package chp7two;

class upcasting {
		upcasting() { }
		}

class B extends upcasting { // B는 A의 자식 클래스!!
		B() { }
		}
		
		
 class TypeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        upcasting A = new B();   //cannot upcating if  b is not child class
	}

}
