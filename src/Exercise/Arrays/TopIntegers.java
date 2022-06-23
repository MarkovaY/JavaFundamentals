package src.Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isNotBigger = true;
        int currentNumber;
        for (int i = 0; i < numbersArr.length; i++) {
            currentNumber = numbersArr[i];

            if (i == numbersArr.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }

            for (int j = i + 1; j < numbersArr.length; j++) {
                int numRightPosition = numbersArr[j];

                if (currentNumber > numRightPosition) {
                    isNotBigger = false;
                } else {
                    isNotBigger = true;
                    break;
                }
            }
            if (!isNotBigger) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}