package 실습09;
import java.util.Scanner;

public class NameSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String name= "";
		
		System.out.print("이름을 입력하세요: ");
		name = input.nextLine(); // to get all character inc space
		
	    if (name.contains(" ")==true) {
	    	//name.indexOF("name") //index 
	    	System.out.println("성은:" + name.substring(0,name.indexOf(" "))); //print from 0 till space
	    	//System.out.println(name.indexOf(" ")); //index 1
	    	
	    	System.out.println("이름은:" + name.substring(name.indexOf(" ")+1)); //print from after space till the end
	    } else {
	    	System.out.println("공백이 없습니다.");
	    }
	    
		//index- print number character in a word
		//contain- check if the character in the word -boolean
		//substring - print the num chareacter from where to where
		
		//if name have no space, print(no space)
		//if have space , print (성+ first substring. + name+ the rest)
	}
	

}
