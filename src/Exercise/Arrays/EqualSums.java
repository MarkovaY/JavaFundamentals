package src.Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index <= array.length - 1; index++) {
            int currentElement = array[index];

            int sumLeft = 0;
            int sumRight = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                sumLeft += array[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= array.length - 1; rightIndex++) {
                sumRight += array[rightIndex];
            }

            if (sumLeft == sumRight) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}