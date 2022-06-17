package src.Lab.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int numbers : numbersArr) {
            if (numbers % 2 == 0) {
                sumEven += numbers;
            } else {
                sumOdd += numbers;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}