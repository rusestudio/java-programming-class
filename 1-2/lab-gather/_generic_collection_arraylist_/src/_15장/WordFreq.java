package _15장;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String[] sample = {"i", "love", "you", "soo", "much", "love"};
		
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq==null) ? 1 : freq + 1);
		}
		System.out.println(m.size()+ " - words count");
		System.out.println(m.containsKey("love"));
		System.out.println(m.isEmpty());
		System.out.println(m);

	}

}
