package _9장;
import javax.swing.Timer;

public class CallBackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer t = new Timer(1000, event-> System.out.println("beep"));
		t.start();
		
		for (int i = 0; i < 60; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
