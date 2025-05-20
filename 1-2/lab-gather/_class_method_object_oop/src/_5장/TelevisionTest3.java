package _5장;

public class TelevisionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television3 myTv = new Television3();
		
		myTv.channel= 7;
		myTv.volume =9;
		myTv.onOff= true;
		
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");

	}

}
