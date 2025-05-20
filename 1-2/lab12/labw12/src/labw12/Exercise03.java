package labw12;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise03 {
    private static final Logger logger = logger.getLogger(Exercise03.class.getName()); // get logger for this class

    public static void main(String[] args) throws IOException {
        // Setup logging

    	Handler handler = new FileHandler("logging.txt"); //save logger in logging
    	logger.addHandler(handler);
    	logger.setLevel(Level.INFO);

        Scanner input = new Scanner(System.in);
        int[] result = new int[5];
        int idx = 0;

        try (FileWriter writer = new FileWriter("results.txt")) { //save results to file
            while (true) {
                try {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    int n1 = Integer.parseInt(input.nextLine());
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    int n2 = Integer.parseInt(input.nextLine());
                    result[idx] = n1 % n2;
                    System.out.println("나머지 연산 결과: " + result[idx]);
                    
                    // Save result to file
                    String resultStr = String.format("첫 번째 숫자:%d, 두번째 숫자:%d, 나머지:%d%n", n1, n2, result[idx]);
                    writer.write(resultStr);
                    // Log normal calculation
                    logger.info("연산 성공: "+ resultStr); //info level
                    
                    idx++;
                    System.out.print("\n계속하려면 y를 입력하세요: ");
                    if (!input.nextLine().toLowerCase().equals("y")) break;
                    System.out.println();
                    
                } catch (NumberFormatException e) {
                    System.err.println("\n예외 발생:숫자 형식이 잘못되었습니다. 올바른 정수를 입력해주세요.");
                    System.out.println("\n다시 입력해주세요.");
                    logger.warning("NumberFormatException 발생"); //warming level
                } catch (ArithmeticException e) {
                    System.err.println("\n예외 발생:0으로 나눌 수 없습니다. 두 번째 숫자는 0이 아닌 값을 입력해주세요.");
                    System.out.println("\n다시 입력해주세요.");
                    logger.warning("ArithmeticException 발생"); //warning level
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("\n예외 발생:최대 5개 결과만 저장할 수 있습니다. 프로그램을 종료.");
                    logger.severe("ArrayIndexOutOfBoundsException 발생"); //severse level
                    break;
                }
            }
            
        } catch (IOException e) {
            System.err.println("파일 쓰기 오류: IOException");
            logger.severe("파일 쓰기 오류: IOException");
        } 
        handler.flush(); // force to write to file
        handler.close(); // close file handler
        System.out.println("프로그램 종료");
    }
}