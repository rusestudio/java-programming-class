package _15장;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		String[] sample = {"단어", "중복", "구절", "중복"};
		
		for(String a : sample)
			if (!s.add(a))
				System.out.println( "중복된 단어: " +  a);
		
		System.out.println("집합 크기:"+ s.size() + " , 중복되지 않은 단어: " + s);
 
	}

}
