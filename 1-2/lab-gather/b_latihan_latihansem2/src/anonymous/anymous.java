package anonymous;

interface RemoteControl{
	public void turnOn();
	public void turnOff();
}

public class anymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Anonymous class for Fan
        RemoteControl fan = new RemoteControl() {
            public void turnOn() {
                System.out.println("Fan is turning on");
            }
            public void turnOff() {
                System.out.println("Fan is turning off");
            }
        };

        // Anonymous class for Light
        RemoteControl light = new RemoteControl() {
            public void turnOn() {
                System.out.println("Light is turning on");
            }
            public void turnOff() {
                System.out.println("Light is turning off");
            }
        };

        // Calling the methods for each device
        fan.turnOn();
        fan.turnOff();
        
        light.turnOn();
        light.turnOff();
	}

}
