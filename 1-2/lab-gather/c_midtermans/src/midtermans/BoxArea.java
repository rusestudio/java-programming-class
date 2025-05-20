package midtermans;

public class BoxArea extends Box {
    public BoxArea() {}

    public BoxArea(int length, int width, int depth) {
        super(length, width, depth);
    }

    @Override
    public int compareTo(Box other) {
        return Integer.compare(this.surfaceArea(), other.surfaceArea());
    }
}