package src.Exercise.Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];

        for (int row = 1; row <= n; row++) {
            String numbers = scanner.nextLine();
            int numOne = Integer.parseInt(numbers.split(" ")[0]);
            int numTwo = Integer.parseInt(numbers.split(" ")[1]);

            if (row % 2 == 0) {
                arrOne[row - 1] = numTwo;
                arrTwo[row - 1] = numOne;
            } else {
                arrOne[row - 1] = numOne;
                arrTwo[row - 1] = numTwo;
            }
        }
        for (int number : arrOne) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number : arrTwo) {
            System.out.print(number + " ");
        }
    }
}