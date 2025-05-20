package Q2;

public class BoxVolume extends Box {

	public BoxVolume(int length, int width, int depth) {
		super(length, width, depth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		BoxVolume otherboxvol = (BoxVolume) other;

		if (this.volume() < otherboxvol.volume())
			return -1;
		else if (this.volume() > otherboxvol.volume())
			return 1;
		else
		    return 0;
	}

}
