package switchcase;
import java.util.Scanner;

class alphavowelcheck {
    public static void checkCharacter(char input) {
        boolean isVowel = false;
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }
        if (isVowel) {
            System.out.println(input + " is a vowel");
        } else {
            if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
                System.out.println(input + " is a consonant");
            else
                System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input;

        System.out.println("Please enter a character: ");
        input = scan.next().charAt(0);
        scan.close();

        checkCharacter(input);
    }
}