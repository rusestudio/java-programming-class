package _5장;

public class TelevisionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television2 myTv = new Television2();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true; 
		myTv.print2();
		
		Television2 yourTv = new Television2();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print2();
		
	}

}
