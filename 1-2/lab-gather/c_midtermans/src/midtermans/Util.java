package midtermans;

public class Util {
    public static boolean orderedUp(Comparable[] x, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (x[i].compareTo(x[i + 1]) >= 0) {
                return false;
            }
        }
        return true;
    }
}