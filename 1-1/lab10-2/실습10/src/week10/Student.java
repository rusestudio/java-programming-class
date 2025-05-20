package week10;

public class Student {
	
	private int math;
	private int english;
	private int computer_science;
	private double avg;
	
	public double getAvg() {
		return avg;
	}
	
	Student(int math,int english, int computer_science){
		this.math= math;
		this.english=math;
		this.computer_science= computer_science;
		this.avg= (math+english+computer_science)/3;
	}
	
}
