package _9장;


class Television implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv turn on");	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv turn off");
	}
	
}

public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television t = new Television();
		t.turnOn();
		t.turnOff();

	}

}
