package hello2chp5;

public class tvt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tv2 myTv = new tv2();
		myTv.channel =7;
		myTv.volume =9;
		myTv.onOff= true;
		myTv.print();
		
		int ch =  myTv.getChannel();
		System.out.println("현재 채널은 " + ch + " 입니다");
		
		tv2 myTv2 = new tv2();
		
		myTv2.setChannel(11);
		int ch2 = myTv2.getChannel();
		System.out.println("현재 채널 " + ch2 + " 입니다");
		
		
		tv2 yourTv = new tv2();
		yourTv.channel =9;
		yourTv.volume =12;
		yourTv.onOff= true;
		yourTv.print();
		
	}

}
