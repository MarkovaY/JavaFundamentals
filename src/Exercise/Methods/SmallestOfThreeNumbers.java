package src.Exercise.Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(number1, number2, number3));
    }

    public static int getSmallestNumber(int a, int b, int c) {

        int result = 0;

        if (a <= b && a <= c) {
            result = a;
        } else if (b <= a && b <= c) {
            result = b;
        } else {
            result = c;
        }
        return result;
    }
}