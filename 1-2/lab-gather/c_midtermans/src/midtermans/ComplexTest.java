package midtermans;

import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = getIntegerInput(scanner, "Enter the real part (integer): ");
        int y = getIntegerInput(scanner, "Enter the imaginary part (integer): ");

        IntegerComplex complex = new IntegerComplex(x, y);
        int multiplications = 0;

        while (complex.distance() < 10 && multiplications < 5) {
            complex = complex.multiply(complex);
            multiplications++;
        }

        System.out.println("Final distance from origin: " + complex.distance());
        System.out.println("Number of multiplications performed: " + multiplications);

        scanner.close();
    }

    private static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}