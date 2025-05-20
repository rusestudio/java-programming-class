package week10;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학생 객체 생성 및 초기화
		Student2 student1 = new Student2(80, 90, 85, 95);
		Student2 student2 = new Student2(75, 85, 90, 88);

		// 학생 정보 출력
		System.out.println("학생 1 정보:");
		student1.printInfo();
		System.out.println();

		System.out.println("학생 2 정보:");
		student2.printInfo();
		System.out.println();

		// 학생 성적 비교
		int comparisonResult = student1.compareTo(student2);
		if (comparisonResult > 0) {
			System.out.println("학생 1의 평균 점수가 더 높습니다.");
		}
		else if (comparisonResult < 0) {
			System.out.println("학생 2의 평균 점수가 더 높습니다.");
		}
		else {
			System.out.println("두 학생의 평균 점수가 동일합니다.");
		}


	}
}