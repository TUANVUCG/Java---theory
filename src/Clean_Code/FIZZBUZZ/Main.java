package Clean_Code.FIZZBUZZ;

import java.util.Scanner;

public class Main implements CleanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MESSAGE_INPUT);
        int number = scanner.nextInt();
        if(isEven(number)){
            System.out.println(MESSAGE_EVEN);
        }else {
            System.out.println(MESSAGE_ODD);
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
