package week10;

public class Student2 {
	private int math;
    private int english;
    private int science;
    private int computerScience;
    private double avg;
    private int total;

    public Student2(int math, int english, int science, int computerScience) {
    	this.math=math;
    	this.english=english;
    	this.science= science;
    	this.computerScience= computerScience;
        this.total= getTotal();
        this.avg = calculateAverage();
    }

    public double getAvg() {
    	avg= (total/4);
    	return avg;

    }

    public int getTotal() {
       total= math+english+science+computerScience;
       return total;
    }

    public void printInfo() {
    	System.out.println("수학 점수:"+ math);
    	System.out.println("영어 점수:"+ english);
    	System.out.println("과학 점수:"+ science);
    	System.out.println("검퓨터과학 점수:"+ computerScience);
    	System.out.println("총 점수:"+ total);
    	System.out.println("평균 점수:"+ avg);
        
    }

    private double calculateAverage() {
    	avg= (total/4.0);
    	return avg;
    }

    // 현재 객체의 평균이 다른 객체의 평균보다 크다면 1을 반환
    // 그렇지 않다면 -1을 반환
    // 같다면 0을 반환
    public int compareTo(Student2 otherStudent) {
		return computerScience;
        
    }
}
