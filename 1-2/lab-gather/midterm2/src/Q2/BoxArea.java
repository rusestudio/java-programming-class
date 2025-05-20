package Q2;

public class BoxArea extends Box{

	public BoxArea(int length, int width, int depth) {
		super(length, width, depth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		BoxArea otherboxarea = (BoxArea) other;

		if (this.surfaceArea() < otherboxarea.surfaceArea())
			return -1;
		else if (this.surfaceArea() > otherboxarea.surfaceArea())
			return 1;
		else
		    return 0;
	}

}
