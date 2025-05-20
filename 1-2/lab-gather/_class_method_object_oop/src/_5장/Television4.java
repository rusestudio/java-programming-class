package _5장;

public class Television4 {
	
	int channel;
	int volume;
	boolean onOff;
	
	void print4() {
		System.out.println("재널은" + channel + "이고 볼륨은 " + volume+ "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}

}
