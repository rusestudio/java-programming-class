package midtermans;

public class BoxVolume extends Box {
    public BoxVolume() {}

    public BoxVolume(int length, int width, int depth) {
        super(length, width, depth);
    }

    @Override
    public int compareTo(Box other) {
        return Integer.compare(this.volume(), other.volume());
    }
}