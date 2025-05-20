package _15장;

import java.util.HashMap;
import java.util.Map;

class Student{
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Student> st = new HashMap<String, Student>();
		
		st.put("2024",  new Student(20011, "anna"));
		st.put("2023",  new Student(20012, "abu"));
		st.put("2022",  new Student(20013, "ali"));
		
		System.out.print(st);
		
		st.remove("2023");
		
		st.put("2022", new Student(20013, "amat"));
		
		System.out.println(st.get("2002"));
		
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key= " + key + ", value=" + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
