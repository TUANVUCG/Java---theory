package Clean_Code.FIZZBUZZ;

import java.util.Scanner;

public class Fizzbuzz {
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";
    public static final String FIZZBUZZ = "FIZZBUZZ";
    public static final String NODIVISIBLE3AND5 = "không chia hết cho 3 và 5";

    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số : ");
        int number = sc.nextInt();
        if (isDivisibleBy3(number)) {
            if (isDivisibleBy5(number)) {
                System.out.println(FIZZBUZZ);
            } else {
                System.out.println(FIZZ);
            }
        } else if (isDivisibleBy5(number)) {
            System.out.println(BUZZ);
        } else {
            System.out.println(number + " " + NODIVISIBLE3AND5);
        }
    }
}
