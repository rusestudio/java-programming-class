package justprac;

public class test {
 
	public static void main (String[] args) {
		ChildClass c= new ChildClass(); //print=1
		c.print(); // to print child class id, need to override method in childclass
	}
}
class ParentClass {
	int id = 1;
	void print() {
		System.out.println(id);
	}
}
class ChildClass extends ParentClass {
	int id=2;
}