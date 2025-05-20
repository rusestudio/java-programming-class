package _5장;

public class TelevisionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television1 myTv = new Television1();
		
		myTv.channel =7;
		myTv.volume = 10;
		myTv.onOff= true;
		
		Television1 yourTv = new Television1();
		
		yourTv.channel =9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		 
		
		System.out.println("텔레비전의 채널은" + myTv.channel + " 이고 볼륨은 " 
				+ myTv.volume+ "입니다.");
		
		System.out.println("텔레비전의 채널은" + yourTv.channel + " 이고 볼륨은 " 
				+ yourTv.volume+ "입니다.");
		

	}

}
