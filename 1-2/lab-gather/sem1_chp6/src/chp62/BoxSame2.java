package chp62;

public class BoxSame2 {
	
	int width,length,height;
	
	
	BoxSame2(int w, int l, int h){
		width =w;
		length =l;
		height = h;
		
	}

	//pass by reference method
	boolean isSameBox(BoxSame2 obj) {
		if ((obj.width == width) && (obj.length == length) && (obj.height == height))
		return true;
		else
			return false;
	}
}
