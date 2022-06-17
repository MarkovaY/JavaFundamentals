package src.Lab.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;

        for (int number : numbersArr) {
            if (number % 2 == 0) {
                sumEven += number;
            }
        }
        System.out.println(sumEven);
    }
}