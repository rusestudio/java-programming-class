package hello2chp5;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television [] tv = new Television[10]; // call the class tht made put variable name/object name (tv)
		
		for(int i = 0; i < tv.length; i++) { //use array too declare the object
			tv[i] = new Television();
			tv[i].channel = i;
			tv[i].volume = i;
			tv[i].onOff = true;
		}
		for(int i = 0; i < tv.length; i++) {
		System.out.println("tv channel is " + 
				tv[i].channel + " and tv volume is "+ tv[i].volume);
		}
		
		//tv.channel =7;  //use variable plus the data in class and put value
		//tv.volume = 9;
		//tv.(refer the class)channel(channel data field)
		//tv.onOff = true;
		
		//System.out.println("tv channel is " + 
		//tv.channel + " and tv volume is "+ tv.volume);
		
		
       Television mytv = new Television(); // call the class tht made put variable name/object name (tv)
		
		mytv.channel =7;  //use variable plus the data in class and put value
		mytv.volume = 10;
		mytv.onOff = true;
		
		System.out.println("tv channel is " + 
		mytv.channel + " and tv volume is "+ mytv.volume);
		
        Television yourtv = new Television(); // call the class tht made put variable name/object name (tv)
		
		yourtv.channel =9;  //use variable plus the data in class and put value
		yourtv.volume = 12;
		yourtv.onOff = true;
		
		System.out.println("tv channel is " + 
		yourtv.channel + " and tv volume is "+ yourtv.volume);
		
	}

}
