package src.Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int startNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int factoriel = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factoriel *= i;
            }
            sum += factoriel;
            number = number / 10;
        }
        if (sum == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}