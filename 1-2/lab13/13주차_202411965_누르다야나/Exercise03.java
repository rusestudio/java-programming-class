package labw13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//TODO: 학생 데이터 구조 선언/정의
		Map<String, Student> studentMap = new HashMap<>();
		Map<String, List<Student>> departmentMap = new HashMap<>();


		Scanner input = new Scanner(System.in);

		System.out.println("======menu======");
		System.out.println("0. 학생 추가");
		System.out.println("1. 학번으로 조회");
		System.out.println("2. 학과별 조회");
		System.out.println("3. 성적 상위 3명 조회");
		System.out.println("4. 종료");
		System.out.println("================");

		while(true) {

			System.out.print("메뉴를 선택하세요:");
			int choice = input.nextInt();
			input.nextLine();

			switch(choice) {
			case 0: // 학생 추가
				System.out.print("학번: ");
				String id = input.nextLine();

				// 동일한 학번이 존재하는지 확인
				if (studentMap.containsKey(id)) {
					System.out.println("해당 학번 학생이 이미 존재합니다.");
					break;
				}

				System.out.print("이름: ");
				String name = input.nextLine();
				System.out.print("학과: ");
				String department = input.nextLine();
				System.out.print("성적: ");
				double gpa = input.nextDouble();

				Student newStudent = new Student(id, name, department, gpa);

				// 학생 데이터 구조에 저장
				studentMap.put(id, newStudent);
				departmentMap.computeIfAbsent(department, k -> new ArrayList<>()).add(newStudent);

				System.out.println(name + " 학생이 추가되었습니다.");
				break;

			case 1: // 학번으로 학생 조회
				System.out.print("학번: ");
				String searchId = input.nextLine();

				// 해당 학번 학생의 정보 출력
				Student student = studentMap.get(searchId);
				if (student != null) {
					System.out.println(student);
					//when found student print info like below
				} else {
					System.out.println("해당 학번의 학생을 찾을 수 않습니다.");
				}
				break;

			case 2: // 학과별 학생 조회
				System.out.print("학과: ");
				String searchDept = input.nextLine();

				// 해당 학과 학생들의 정보 출력
				List<Student> studentsInDept = departmentMap.get(searchDept);
				if (studentsInDept != null && !studentsInDept.isEmpty()) {
					studentsInDept.forEach(System.out::println);
					//when found student print info like below
					//studentsInDept.toString();
					
				} else {
					System.out.println("해당 학과에 등록된 학생이 없습니다.");
				}
				break;

			case 3: //성적 상위 3명 조회
				PriorityQueue<Student> topStudentsQueue = new PriorityQueue<>( //use prioqueue
						(s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()) // GPA descending
						);

				topStudentsQueue.addAll(studentMap.values());

				int count = 0;
				while (!topStudentsQueue.isEmpty() && count < 3) {
					System.out.println(topStudentsQueue.poll());
					////when found student print info like below based on top gpa to low
					//topStudentsQueue.toString();
					count++;
				}
				break;


			case 4: //종료
				System.out.println("프로그램 종료.");
				input.close();
				return;    
			default:
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");

			}
			System.out.println();



		}



	}

}
