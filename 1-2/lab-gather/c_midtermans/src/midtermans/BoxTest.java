package midtermans;

import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoxArea[] boxAreas = new BoxArea[5];
        BoxVolume[] boxVolumes = new BoxVolume[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter length, width, and depth for box " + (i + 1) + ":");
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int depth = scanner.nextInt();

            boxAreas[i] = new BoxArea(length, width, depth);
            boxVolumes[i] = new BoxVolume(length, width, depth);
        }

        System.out.println("Boxes in ascending order based on surface area: " + 
                           Util.orderedUp(boxAreas, boxAreas.length));
        System.out.println("Boxes in ascending order based on volume: " + 
                           Util.orderedUp(boxVolumes, boxVolumes.length));

        scanner.close();
    }
}