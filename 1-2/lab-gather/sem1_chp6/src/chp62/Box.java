package chp62;

public class Box {
	
	int width,length,height;
	int volume;
	
	Box(int w, int l, int h){
		width =w;
		length =l;
		height = h;
		volume = w*l*h;
	}

	//return object
	Box whosLargest(Box box1, Box box2) { //pass by reference
		if (box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
	
	//return by method
	Box whosLargest(Box box) {
		if (volume > box.volume) //this.volume
			return this;
		else
			return box;
	}
	
	//pass by reference method
	boolean isSameBox(Box obj) {
		if ((obj.width == width) && (obj.length == length) && (obj.height == length))
		return true;
		else
			return false;
	}
	
	
	
	
	
	
}
