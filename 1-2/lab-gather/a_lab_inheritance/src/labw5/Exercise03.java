package labw5;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		User[] users = new User[3];
		users[0] = new Administrator("김백호", "admin01", "1234");
		users[1] = new Student("서태용", "student01", "0000");
		users[2] = new Professor("송태섭", "professor01", "1111");
		
		System.out.println("아이디를 입력하세요:");
		String id = input.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String pwd = input.nextLine();
		
		User loggedIn = null;
		 for (int i = 0; i < users.length; i++) {
	            if (users[i].login(id, pwd)) {
	                loggedIn = users[i]; 
	                break;
	            }
	        }

		if(loggedIn != null) {
			loggedIn.printRole();
			 System.out.println("로그인 성공: '" + loggedIn.name + "'님 로그인");
	            loggedIn.printRole();
	            
	           
	            if (loggedIn instanceof Administrator) {
	                ((Administrator) loggedIn).manage(); 
	            } else if (loggedIn instanceof Student) {
	                ((Student) loggedIn).submit();
	            } else if (loggedIn instanceof Professor) {
	                ((Professor) loggedIn).grading(); 
	            }
	        } else {
	            
	            System.out.println("로그인 실패: 잘못된 아이디 또는 비밀번호입니다.");
	        }

	        input.close();

	}

}

