package labw14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Exercise03 {

	private static final String FILE_PATH = "resources/students.csv";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Map<String, Student> studentMap = new HashMap<>();
		Map<String, List<Student>> departmentMap = new HashMap<>();

		loadStudentsFromFile(studentMap, departmentMap);

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

				Student student = new Student(id, name, department, gpa);
				studentMap.put(id, student);
				departmentMap.putIfAbsent(department, new ArrayList<>());
				departmentMap.get(department).add(student);
				addStudentToFile(student);
				System.out.println(name + " 학생이 추가되었습니다.");
				break;

			case 1: // 학번으로 학생 조회
				System.out.print("학번: ");
				String searchId = input.nextLine();
				Student stu = studentMap.get(searchId); //search by id			
				if (stu != null) {
					System.out.println(stu); //when found student print info tostring
				} else {
					System.out.println("해당 학번의 학생을 찾을 수 않습니다.");
				}
				break;

			case 2: // 학과별 학생 조회
				System.out.print("학과: ");
				String searchDept = input.nextLine();
				List<Student> deptStudents = departmentMap.get(searchDept);						
				if (deptStudents != null && !deptStudents.isEmpty()) {
					for(Student s : deptStudents) {
						System.out.println(s); //when found student print info tostring
					}
				} else {
					System.out.println("해당 학과에 등록된 학생이 없습니다.");
				}
				break;

			case 3: //성적 상위 3명 조회
				PriorityQueue<Student> maxHeap = new PriorityQueue<>( //use prioqueue
						(s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa())
						);// GPA descending						);
				maxHeap.addAll(studentMap.values()); 

				for(int i =0; i< 3 && !maxHeap.isEmpty(); i++) {
					System.out.println(maxHeap.remove()); //poll() removes and returns the head of this queue.
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
		private static void loadStudentsFromFile(Map<String, Student> studentMap, Map<String, List<Student>> departmentMap) {
			try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
				String line;
				while ((line = reader.readLine()) != null) {
					String[] parts = line.split(",");
					if (parts.length == 4) {
						Student student = new Student(parts[0].trim(), parts[1].trim(), parts[2].trim(), Double.parseDouble(parts[3].trim()));
						studentMap.put(student.getId(), student);
						departmentMap.putIfAbsent(student.getDepartment(), new ArrayList<>());
						departmentMap.get(student.getDepartment()).add(student);	
					}			
				}
				System.out.println("students.csv 파일 로드 완료!");
			} catch (FileNotFoundException e) {
				System.out.println("students.csv 파일이 존재하지 않아 새로 생성됩니다");
			} catch (IOException e) {
				System.out.println("파일 읽기 중 오류가 발생했습니다.");
			}
		}

		private static void addStudentToFile(Student student) {
			try (FileWriter writer = new FileWriter(FILE_PATH, true);
					BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
				bufferedWriter.write(String.format("%s,%s,%s,%.2f%n", 
						student.getId(), student.getName(), student.getDepartment(), student.getGpa()));
			} catch (IOException e) {
				System.out.println("파일에 학생 정보를 추가하는 중 오류가 발생했습니다.");
			}


		}

	}

