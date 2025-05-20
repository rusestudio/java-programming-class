package week11;

public class Box {
	int apple;
	int orange;
	int count;
	
	Box(int a, int o, int c){
		apple = a;
		orange = o;
		count = c;
	}
	
	Box compare(Box box1, Box box2) {
       if(box1.count> box2.count) {
    	   return box1;
       } else {
    	   return box2;
       }
	}
}
