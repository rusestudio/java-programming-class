package _6장;

public class Television {
	
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int c, int v, boolean o) {
		channel =c;
		volume = v;
		onOff= o;
	}
	
	void printtv() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television myTv = new Television(7,10,true);
		myTv.printtv();
		
		Television yourTv = new Television(11,20,true);
		yourTv.printtv();
		
		
	}

}
