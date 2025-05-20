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
		
		//Key: Student ID (id)
		//Value: Corresponding Student object.
		//Use Case: To quickly look up a student by their ID.
		Map<String, Student> studentMap = new HashMap<>();
		
		//Key: Department name (department)
		//Value: List of Student objects belonging to that department.
		//Use Case: To group students by department for queries.
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

				Student newStudent = new Student(id, name, department, gpa);//make new student

				// 학생 데이터 구조에 저장
				studentMap.put(id, newStudent); //studentMap using put() for fast lookup by ID.
				
				//computeIfAbsent: Checks if the department exists in the map.
				//If it doesn't exist, it creates a new ArrayList and associates it with the department.
				//Then, it adds the new student to that list.
				//This ensures the department is created only once and avoids manual checks.
				departmentMap.computeIfAbsent(department, k -> new ArrayList<>()).add(newStudent);
				

				System.out.println(name + " 학생이 추가되었습니다.");
				break;

			case 1: // 학번으로 학생 조회
				System.out.print("학번: ");
				String searchId = input.nextLine();

				// 해당 학번 학생의 정보 출력
				Student student = studentMap.get(searchId); //search by id
				
				if (student != null) {
					System.out.println(student); //when found student print info tostring
				} else {
					System.out.println("해당 학번의 학생을 찾을 수 않습니다.");
				}
				break;

			case 2: // 학과별 학생 조회
				System.out.print("학과: ");
				String searchDept = input.nextLine();

				// 해당 학과 학생들의 정보 출력
				//Retrieves a list of students in the given department from departmentMap.
				List<Student> studentsInDept = departmentMap.get(searchDept);
				
				
				if (studentsInDept != null && !studentsInDept.isEmpty()) {
					studentsInDept.forEach(System.out::println);
					//studentsInDept.toString();
					
				} else {
					System.out.println("해당 학과에 등록된 학생이 없습니다.");
				}
				break;

			case 3: //성적 상위 3명 조회
				PriorityQueue<Student> topStudentsQueue = new PriorityQueue<>( //use prioqueue
						(s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()) // GPA descending
						);
				//PriorityQueue<Student>:
				//A min-heap where the smallest GPA is at the root.

				//Adds all student objects from studentMap to the queue.
				topStudentsQueue.addAll(studentMap.values()); 

				int count = 0;
				while (!topStudentsQueue.isEmpty() && count < 3) {				
					//poll(): Retrieves and removes the student with the highest GPA.
					//Loops up to 3 times (or until the queue is empty).
					System.out.println(topStudentsQueue.poll());
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
