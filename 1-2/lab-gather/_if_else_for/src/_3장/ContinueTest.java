package _3장;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "no news is good news";
		int n=0;
		
		for (int i=0; i < s.length(); i++) {
			//n 이 나오는 회수를 센다.
			if(s.charAt(i) != 'n')
				continue;
			//n의 개수를 하나 증가한다.
			n++;
		}
		System.out.print("문장에서 발견된 n의 개수: " + n );

	}

}
