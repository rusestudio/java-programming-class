package _5장;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 = " + proverb.length());
		
		s1 = proverb.concat(" never Bites!");
		s2 = proverb.replace('B','b');
		s3 = proverb.substring(2,5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//concatenation
		String subject = "Money";
		String other = " has no value if it is  not used";
		String sentence = subject + other;
		
		System.out.println(sentence);
		
		//return value into char
		int x = 20;
		System.out.println("결과값은 " + x);
	    String answer = "The answer is " + 100;
	    
	    System.out.println(answer);
	    
	    //return char into value
	    //use wrapper class parse...();
	    int i = Integer.parseInt("123");
	    double d = Double.parseDouble("3.1231233244");
	    
	    System.out.println(i);
	    System.out.println(d);
		
		

	}

}
